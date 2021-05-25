
-- Exercise 1: Join

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT a.AccountID, a.Username, a.FullName, a.DepartmentID, d.DepartmentName
FROM `account` a
JOIN department d
ON a.DepartmentID = d.DepartmentID
ORDER BY a.AccountID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010

SELECT *
FROM `account`
WHERE CreateDate > '2010-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer
SELECT a.AccountID, a.Username, a.FullName, a.PositionID, p.PositionName
FROM `account` a
JOIN `position` p
ON a.PositionID = p.PositionID
WHERE PositionName = 'Dev'
ORDER BY AccountID;

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT d.DepartmentName, count(*) AS SoNhanVien
FROM `account` a
JOIN department d
ON a.DepartmentID = d.DepartmentID
GROUP BY d.DepartmentName
HAVING SoNhanVien >3;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT q.QuestionID, q.Content, COUNT(*) AS SoLan
FROM examquestion e
JOIN question q ON e.QuestionID = q.QuestionID
GROUP BY q.QuestionID
HAVING COUNT(e.QuestionID)  =
								(SELECT MAX(countQuestion) 
								FROM 
								(SELECT QuestionID, COUNT(*) AS countQuestion
								FROM examquestion GROUP BY QuestionID) as maxCount);
     
-- Cach 2
DROP VIEW IF EXISTS SolanDungCauHoi;
CREATE VIEW SolanDungCauHoi AS
(SELECT e.QuestionID, q.content, COUNT(q.Content) AS Question_Frequency
FROM examquestion e
JOIN question q
ON e.QuestionID = q.QuestionID
GROUP BY q.content
ORDER BY Question_Frequency DESC);

SELECT *
FROM SolanDungCauHoi
WHERE Question_Frequency = (SELECT MAX(Question_Frequency) FROM SolanDungCauHoi);


-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT q.CategoryID, c.CategoryName, count(q.CategoryID) AS SoLanSuDung
FROM question q
JOIN categoryquestion c
ON q.CategoryID = c.CategoryID
GROUP BY q.CategoryID
ORDER BY q.CategoryID;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT q.QuestionID, q.Content, COUNT( q.QuestionID) AS SoLanSuDung
FROM question q
LEFT JOIN examquestion eq 
ON q.QuestionID = eq.QuestionID
GROUP BY q.QuestionID;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
DROP VIEW IF EXISTS AnswerNo_of_question;
CREATE VIEW AnswerNo_of_question AS
	(SELECT q.QuestionID, q.Content, a.AnswerID, COUNT(*) AS SoCauTraLoi
	FROM answer a
	JOIN question q
	ON a.QuestionID = q.QuestionID
	GROUP BY q.QuestionID
	ORDER BY SoCauTraLoi DESC);

SELECT * 
FROM AnswerNo_of_question
WHERE SoCauTraLoi = ( SELECT MAX(SoCauTraLoi) FROM AnswerNo_of_question);

-- Cach 2
SELECT q.QuestionID, q.Content, count(q.QuestionID) AS SL_Answer
FROM question q
JOIN answer a ON q.QuestionID = a.QuestionID
GROUP BY q.QuestionID
HAVING SL_Answer = (SELECT MAX(SoCauTraLoi) FROM
												(SELECT QuestionID, COUNT(*) AS SoCauTraLoi
												FROM answer 
												GROUP BY QuestionID) AS Answer_Statistic);


-- Question 9: Thống kê số lượng account trong mỗi group
SELECT GroupID, COUNT(AccountID) AS SoLuongAccount
FROM groupaccount
GROUP BY GroupID;

-- Question 10: Tìm chức vụ có ít người nhất
-- cach 1
DROP VIEW IF EXISTS ThongKe;
CREATE VIEW ThongKe AS
(SELECT d.DepartmentID, d.DepartmentName, COUNT(AccountID) AS Sonhanvien
FROM `account` a
JOIN department d
ON a.DepartmentID = d.DepartmentID
GROUP BY d.DepartmentID
ORDER BY Sonhanvien ASC);


SELECT *
FROM ThongKe
WHERE Sonhanvien = ( SELECT MIN(Sonhanvien) FROM ThongKe);

-- Cach 2
SELECT a.DepartmentID, d.DepartmentName, COUNT(*) AS SoNguoi
FROM `account` a
JOIN department d ON a.DepartmentID = d.DepartmentID
GROUP BY a.DepartmentID
HAVING SoNguoi = 
					(SELECT MIN(So_nguoi) 
					 FROM
						(SELECT DepartmentID, COUNT(*) AS So_nguoi
						FROM `account`
						GROUP BY DepartmentID) AS Chuc_vu);


-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM

SELECT d.DepartmentID, d.DepartmentName, p.PositionName, COUNT(p.PositionID) AS SL
FROM `account` a
JOIN department d ON a.DepartmentID = d.DepartmentID
JOIN `position` p ON a.PositionID = p.PositionID
GROUP BY a. DepartmentID, a.PositionID
ORDER BY DepartmentName;


/* Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản 
của	question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, … */
    
SELECT 	q.questionID, q.Content , q.CreatorID, 
		ac.FullName, 
		t.typeID, t.typeName,
        an.answerID,
        an.Content 
FROM question q
JOIN `account` ac 	ON q.CreatorID = ac.AccountID
JOIN typequestion t ON q.typeID = t.typeID
JOIN answer an 		ON q.questionID = an.questionID
ORDER BY QuestionID;

    
-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT TypeName, COUNT(*) AS SoLuong
FROM typequestion t
JOIN question q ON t.typeID = q.TypeID
GROUP BY TypeName;


-- Question 14:Lấy ra group không có account nào

SELECT *
FROM `group` g
LEFT JOIN groupaccount ga
ON g.GroupID = ga.GroupID
WHERE ga.GroupID IS NULL;

-- Question 15: Lấy ra group không có account nào
SELECT * 
FROM `Group` g
LEFT JOIN groupaccount ga
ON g.GroupID = ga.GroupID
WHERE ga.GroupID IS NULL;

-- Question 16: Lấy ra question không có answer nào
SELECT *
FROM question q
LEFT JOIN answer a
ON q.QuestionID = a.QuestionID
WHERE a.QuestionID IS NULL;

-- Exercise 2: Union
-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
SELECT * 
FROM groupaccount
WHERE groupID = 1;

-- b) Lấy các account thuộc nhóm thứ 2

SELECT * 
FROM groupaccount
WHERE groupID = 2;

-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
SELECT * 
FROM groupaccount
WHERE groupID = 1
UNION 
SELECT * 
FROM groupaccount
WHERE groupID = 2;

-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
SELECT GroupID, Count(*) AS SoThanhVien
FROM groupaccount
GROUP BY GroupID
HAVING SoThanhVien >5;

-- b) Lấy các group có nhỏ hơn 7 thành viên
SELECT GroupID, Count(*) AS SoThanhVien
FROM groupaccount
GROUP BY GroupID
HAVING SoThanhVien <7;

-- c) Ghép 2 kết quả từ câu a) và câu b)
SELECT GroupID, Count(*) AS SoThanhVien
FROM groupaccount
GROUP BY GroupID
HAVING SoThanhVien >5
UNION
SELECT GroupID, Count(*) AS SoThanhVien
FROM groupaccount
GROUP BY GroupID
HAVING SoThanhVien <7;


