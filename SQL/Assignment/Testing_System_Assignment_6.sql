USE Testingsystem3;


DROP PROCEDURE IF EXISTS get_Department_Name_by_ID;
DELIMITER $$
CREATE PROCEDURE get_Department_Name_by_ID(IN in_id MEDIUMINT)
	BEGIN
			SELECT DepartmentName
            FROM department
            WHERE DepartmentID =  in_id;    
            END $$

DELIMITER ;
CALL get_Department_Name_by_ID(3);


-- Exercise 1: Tiếp tục với Database Testing System
/*Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
account thuộc phòng ban đó */

DROP PROCEDURE IF EXISTS get_Department_account;
DELIMITER $$
CREATE PROCEDURE get_Department_account (IN in_DepartmentName VARCHAR(50))
BEGIN
	SELECT a.*, d.DepartmentName
	FROM `account` a
	JOIN department d ON a.DepartmentID = d.DepartmentID
	WHERE d.DepartmentName = in_DepartmentName;
	END$$
DELIMITER ;

Call get_Department_account('Accounting');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group

DELIMITER $$
CREATE PROCEDURE get_account_number_by_group ()
BEGIN
	SELECT GroupID, 
    (SELECT groupName FROM `group` where groupID = ga.groupID) AS Group_Name,
    COUNT(*) AS SL FROM groupaccount ga 
	GROUP BY GroupID;
END$$
DELIMITER ;

CALL get_account_number_by_group ();

/* Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
trong tháng hiện tại */

DELIMITER $$
CREATE PROCEDURE get_SLQuestionByTypeQuystion_curmonth ()
BEGIN
	
    SELECT TypeID, COUNT(*) AS Socauhoi
    FROM question
    WHERE month(CreateDate) = month(curdate())
	GROUP BY typeID;
    
END$$
DELIMITER ;

CALL get_SLQuestionByTypeQuystion_curmonth ();

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS get_TypeID_by_max_question;
DELIMITER $$
CREATE PROCEDURE get_TypeID_by_max_question(OUT out_typeID MEDIUMINT)
BEGIN
SELECT TypeID INTO out_typeID
FROM question
GROUP BY TypeID HAVING COUNT(*) =
									(SELECT MAX(SL) 
									FROM
									(SELECT typeID, COUNT(*) AS SL
									FROM question
									GROUP BY TypeID) AS COUNT_SL);
   
END$$
DELIMITER ;

SET @id = 0;
CALL get_TypeID_by_max_question(@id);
SELECT @id;

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
SELECT * FROM typequestion WHERE TypeID = @id;


/* Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
chuỗi của người dùng nhập vào */

DROP PROCEDURE IF EXISTS Get_group_or_user;

DELIMITER $$
CREATE PROCEDURE Get_group_or_user ( IN var_string VARCHAR(50))
BEGIN
	SELECT g.GroupID, g.GroupName, a.username
	FROM `group` g
	LEFT JOIN groupaccount ga ON g.GroupID =ga.GroupID
	RIGHT JOIN `account` a ON a.AccountID = ga.AccountID
	WHERE g.GroupName LIKE CONCAT('%',var_string,'%') OR a.username LIKE CONCAT('%',var_string,'%');
END $$
DELIMITER ;

CALL Get_group_or_user ('sa');

-- Cach 2
DROP PROCEDURE IF EXISTS sp_get_name_or_group;

DELIMITER $$
CREATE PROCEDURE sp_get_name_or_group (IN var_string VARCHAR(50))
BEGIN

	SELECT GroupName
	FROM `group` WHERE GroupName LIKE CONCAT('%',var_string,'%')
	UNION 
	SELECT username 
	FROM `account` WHERE Username LIKE CONCAT('%',var_string,'%');

END $$
DELIMITER ;

CALL sp_get_name_or_group ('sa');

/* Question 7: Viết 1 store cho phép người dùng nhập vào thông tin 
fullName, email và
trong store sẽ tự động gán:
username sẽ giống email nhưng bỏ phần @..mail đi
positionID: sẽ có default là developer
departmentID: sẽ được cho vào 1 phòng chờ
Sau đó in ra kết quả tạo thành công */

DROP PROCEDURE IF EXISTS Insert_Account_by_Email;

DELIMITER $$
CREATE PROCEDURE Insert_Account_by_Email ( IN in_fullname VARCHAR(50), IN in_email VARCHAR(50))
BEGIN
	DECLARE v_username 		VARCHAR(50) DEFAULT SUBSTRING_INDEX(in_email, '@',1);
    DECLARE v_DepartmentID 	MEDIUMINT UNSIGNED DEFAULT 11;
    DECLARE v_PositionID  	MEDIUMINT UNSIGNED DEFAULT 1;
	DECLARE v_CreateDate 	DATETIME DEFAULT NOW();

	INSERT INTO `account` ( Email, Username, FullName, DepartmentID, PositionID, CreateDate)
	VALUES 
	(in_email, v_username, in_fullname, v_DepartmentID, v_PositionID, v_CreateDate);
    
    SELECT * FROM `account` 
    ORDER BY accountID DESC;

END $$

DELIMITER ;

CALL Insert_Account_by_Email ( 'nguyen Van A', 'nguyen.vanA@gmail.com');

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

DROP PROCEDURE IF EXISTS Get_max_length_content_by_typequetion;
DELIMITER $$
CREATE PROCEDURE Get_max_length_content_by_typequetion ( IN in_type_question ENUM('Essay', 'Multiple-choice'))
BEGIN 

		DECLARE v_typeID TINYINT UNSIGNED;
		SELECT typeID INTO v_typeID 
		FROM typequestion WHERE TypeName = in_type_question; 

		SELECT QuestionID, Content AS Max_length_content, typeID
		FROM question
		GROUP BY Content
		HAVING length(Content) = ( SELECT MAX(Length(Content)) FROM question
									WHERE typeID = v_typeID) 
			   AND typeID = v_typeID;
END $$
DELIMITER ;

CALL Get_max_length_content_by_typequetion('essay');
CALL Get_max_length_content_by_typequetion('multiple-choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID

DELIMITER $$
CREATE PROCEDURE Delete_exam_byID ( IN in_examID TINYINT)
BEGIN
	DELETE FROM exam WHERE examID = in_examID;
END $$
DELIMITER ;

CALL Delete_exam_byID(1);

-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
-- chuyển về phòng ban default là phòng ban chờ việc

DELIMITER $$
CREATE PROCEDURE Delete_department_by_name ( IN in_departmentName VARCHAR(50))
BEGIN
		
	DECLARE v_departmentID MEDIUMINT UNSIGNED;
		SELECT departmentID INTO v_departmentID 
		FROM Department WHERE DepartmentName = in_departmentName;
	-- chuyen thong tin account ve phong ban 11
	UPDATE `account`
	SET DepartmentID = 11
	WHERE DepartmentID = v_departmentID ;
	-- xoa phong ban ng dung nhap
	DELETE FROM department
	WHERE DepartmentName = in_departmentName ;

END $$
DELIMITER ;

CALL Delete_department_by_name ('Sale');

-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay







