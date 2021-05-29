-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
-- trước 1 năm trước

DROP TRIGGER IF EXISTS Group_before_1year;
DELIMITER $$
CREATE TRIGGER Group_before_1year
BEFORE INSERT ON `Group` 
FOR EACH ROW
		BEGIN
			DECLARE v_create DATETIME;
            SET v_create = DATE_SUB(NOW(), INTERVAL 1 YEAR);
			IF NEW.`CreateDate` < v_create THEN
            SIGNAL SQLSTATE '12345' -- ĐIỀU KIỆN LUÔN ĐÚNG
            SET MESSAGE_TEXT  = 'Khong the tao moi group do ngay tao khong hop le';
            END IF;
		
		END $$
DELIMITER ;
INSERT INTO `testingsystem3`.`group` (`GroupID`, `GroupName`, `CreatorID`, `CreateDate`) 
VALUES ('12', 'Hellloooooo123', '12', '2018-04-10 00:00:00');

/* Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
"Sale" cannot add more user" */

DROP TRIGGER IF EXISTS check_insert_to_Sale;
DELIMITER $$
CREATE TRIGGER check_insert_to_Sale
BEFORE INSERT ON `Account` 
FOR EACH ROW
		BEGIN
			DECLARE v_DepartmentID MEDIUMINT;
            SELECT DepartmentID INTO v_DepartmentID FROM Department WHERE DepartmentName = 'Sale';
            
			IF NEW.departmentID = v_DepartmentID THEN
            SIGNAL SQLSTATE '12345' 
            SET MESSAGE_TEXT  = 'Khong the nhan them nguwoi';
            END IF;
		
		END $$
DELIMITER ;

INSERT INTO `testingsystem3`.`account` (`AccountID`, `Email`, `Username`, `FullName`, `DepartmentID`, `PositionID`, `CreateDate`) 
VALUES ('255', 'Anhhkjdkjckj', 'eref', 'dgdddfg', '8', '4', '2020-12-03 00:00:00');

-- Question 3: Cấu hình 1 group có nhiều nhất là 18 user

DROP TRIGGER IF EXISTS Check_Group_user;
DELIMITER $$
CREATE TRIGGER Check_Group_user
BEFORE INSERT ON `Groupaccount` 
FOR EACH ROW
		BEGIN
			DECLARE v_CountAcc MEDIUMINT;
			SELECT  COUNT(AccountID) INTO v_CountAcc
            FROM groupaccount 
            GROUP BY groupID HAVING groupID = NEW.groupID;
            IF v_CountAcc > 18 THEN
            SIGNAL SQLSTATE '12345' 
            SET MESSAGE_TEXT  = 'Nhom nay da co 18 acc, Khong the nhan them nguoi';
            END IF;
      		
		END $$
DELIMITER ;

INSERT INTO `testingsystem3`.`groupaccount` (`GroupID`, `AccountID`, `JoinDate`) 
VALUES ('1', '19', '2020-05-11 00:00:00');
INSERT INTO `testingsystem3`.`groupaccount` (`GroupID`, `AccountID`, `JoinDate`) VALUES ('2', '5', '2020-05-11 00:00:00');
INSERT INTO `testingsystem3`.`groupaccount` (`GroupID`, `AccountID`, `JoinDate`) VALUES ('1', '8', '2020-05-11 00:00:00');


-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 20 Question

DROP TRIGGER IF EXISTS Exam_question_config;
DELIMITER $$
CREATE TRIGGER Exam_question_config
BEFORE INSERT ON `examquestion`
FOR EACH ROW
	BEGIN	
		DECLARE v_count_question MEDIUMINT UNSIGNED;
        
        SELECT COUNT(QuestionID) INTO v_count_question
        FROM examquestion 
        GROUP BY examID 
        HAVING examID = NEW.examID;
        
        IF v_count_question >= 20 THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = ' Cannot add question to this Exam';
        END IF;
		
	END $$
DELIMITER ;

INSERT INTO `testingsystem3`.`examquestion` (`ExamID`, `QuestionID`) VALUES ('10', '256');

/* Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
tin liên quan tới user đó */

DROP TRIGGER IF EXISTS check_email_user;
DELIMITER $$
CREATE TRIGGER check_email_user 
BEFORE DELETE ON `account`
FOR EACH ROW
BEGIN
	DECLARE v_accountID MEDIUMINT UNSIGNED;
	SELECT AccountID INTO v_accountID
    FROM `Account` WHERE Email = OLD.Email;
    
	IF 
		OLD.Email = 'admin@gmail.com' THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = " This is Admin's account, cannot delete";
	ELSE 
		DELETE FROM exam WHERE CreatorID = v_accountID;
        DELETE FROM `Group` WHERE CreatorID = v_accountID;
        DELETE FROM `Groupaccount` WHERE AccountID = v_accountID;
        DELETE FROM `Question` WHERE CreatorID = v_accountID;
    END IF;
    
END $$
DELIMITER ;

DELETE FROM `account`
WHERE Email = 'admin@gmail.com'; -- Khi xoa hien loi Error Code: 1644.  This is Admin's account, cannot delete

DELETE FROM `account`
WHERE AccountID = 2;

/* Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
vào departmentID thì sẽ được phân vào phòng ban "waiting Department" */

DROP TRIGGER IF EXISTS Waiting_Department;
DELIMITER $$
CREATE TRIGGER Waiting_Department
BEFORE INSERT ON `account`
FOR EACH ROW
BEGIN
	DECLARE v_DepartmentID  MEDIUMINT UNSIGNED;
	SELECT DepartmentID INTO v_DepartmentID 
    FROM department 
    WHERE DepartmentName = 'Waiting Department';
    
	IF NEW.DepartmentID IS NULL THEN
    SET NEW.DepartmentID = v_DepartmentID;
    END IF;
    
END $$
DELIMITER ;

INSERT INTO `testingsystem3`.`account` (`AccountID`, `Email`, `Username`, `FullName`, `PositionID`, `CreateDate`)
VALUES ('256', 'loan.dao@gmail.com', 'ThanhLoan', 'Dao Thi Thanh Loan', '2', '2020-12-03 00:00:00');

/* Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
question, trong đó có tối đa 2 đáp án đúng. */
-- ??????????????

DROP TRIGGER IF EXISTS Check_question_answer;
DELIMITER $$
CREATE TRIGGER Check_question_answer
BEFORE INSERT ON `Answer`
FOR EACH ROW
BEGIN
	DECLARE v_answer_no MEDIUMINT UNSIGNED;
    DECLARE v_Rightanswer_no MEDIUMINT UNSIGNED;
    
	SELECT COUNT(AnswerID) INTO v_answer_no
	FROM answer WHERE QuestionID = NEW.QuestionID
	GROUP BY QuestionID;
    
    SELECT COUNT(AnswerID) INTO v_Rightanswer_no
	FROM answer 
    WHERE (QuestionID = NEW.QuestionID AND isCorrect =1)
	GROUP BY QuestionID;
    
    IF v_answer_no >=4 OR ( v_answer_no <4 AND v_Rightanswer_no >=2 AND NEW.isCorrect =1) THEN
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT = 'Khong the them do ko dung cau hinh';
    END IF;

END $$
DELIMITER ;

INSERT INTO `testingsystem3`.`answer` (`AnswerID`, `Content`, `QuestionID`, `isCorrect`) 
VALUES ('259', 'Answers VTI 259', '9', b'0');

/* Question 8: Viết trigger sửa lại dữ liệu cho đúng:
Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database */

-- ko thay field Gender?


/*Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày */

DROP TRIGGER IF EXISTS check_examDate;

DELIMITER $$
CREATE TRIGGER check_examDate
BEFORE DELETE ON `Exam`
FOR EACH ROW
BEGIN 
		IF OLD.CreateDate >= DATE_SUB(NOW(), INTERVAL 2 DAY) THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = ' Cannot delete this exam because it was created 2 days ago';
        END IF;
        
END $$
DELIMITER ;

DELETE FROM Exam WHERE ExamID = 12;

/* Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các
question khi question đó chưa nằm trong exam nào */

DROP TRIGGER IF EXISTS check_question_update;
DELIMITER $$
CREATE TRIGGER check_question_update
BEFORE UPDATE ON `Question`
FOR EACH ROW
BEGIN
	IF OLD.QuestionID NOT IN	(SELECT q.QuestionID 
								FROM question q
								LEFT JOIN examquestion e ON q.QuestionID = e.QuestionID
								WHERE e.QuestionID IS NULL)
    THEN
    SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = "Can not update because the question is already in exam";
	END IF;
        
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS check_question_delete;
DELIMITER $$
CREATE TRIGGER check_question_delete
BEFORE DELETE ON `Question`
FOR EACH ROW
BEGIN
	
    IF OLD.QuestionID NOT IN	(SELECT q.QuestionID 
								FROM question q
								LEFT JOIN examquestion e ON q.QuestionID = e.QuestionID
								WHERE e.QuestionID IS NULL)
    THEN
    SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = "Can not delete because the question is already in exam";
	END IF;
        
END $$
DELIMITER ;

UPDATE question 
SET Content = 'Question VTI 00002'
WHERE QuestionID = 2;

DELETE FROM question
WHERE QuestionID = 2;

/* Question 12: Lấy ra thông tin exam trong đó:
Duration <= 30 thì sẽ đổi thành giá trị "Short time"
30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
Duration > 60 thì sẽ đổi thành giá trị "Long time" */

SELECT 
	ExamID, 
    `Code`, 
    Title, 
    CategoryID, 
	CASE 
		WHEN Duration <=30 THEN "Short time"
		WHEN 30 < Duration <= 60 THEN "Medium time"
		ELSE "Long time"
		END AS Duration,
	CreatorID, 
    CreateDate
FROM exam;

/* Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
là the_number_user_amount và mang giá trị được quy định như sau:
	Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
	Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
	Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher */
    
WITH cte_Q12 AS (
SELECT g.GroupID, COUNT(ga.AccountID) AS So_account
FROM `Group` g
LEFT JOIN groupaccount ga ON g.GroupID = ga.GroupID
GROUP BY g.GroupID)
SELECT 
	*,
	CASE 
			WHEN So_account <= 5 THEN 'Few'
			WHEN So_account BETWEEN 6 AND 20 THEN 'Normal'
			ELSE 'higher'
	END AS the_number_user_amount
FROM cte_Q12;
    
/* Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
không có user thì sẽ thay đổi giá trị 0 thành "Không có User" */

SELECT d.*, 
	CASE 
		WHEN count(AccountID) = 0 THEN 'khong co user'
		ELSE count(AccountID)
	END AS User_number
FROM department d
LEFT JOIN `account` a ON d.DepartmentID = a.DepartmentID 
GROUP BY d.DepartmentID;

