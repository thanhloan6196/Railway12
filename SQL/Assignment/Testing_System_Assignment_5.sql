-- Exercise 1: Tiếp tục với Database Testing System
-- (Sử dụng subquery hoặc CTE)

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale

CREATE OR REPLACE VIEW Account_Sale AS (
SELECT a.*, d.DepartmentName
FROM `account` a
JOIN department d ON a.DepartmentID = d.DepartmentID
WHERE DepartmentName = 'Sale');

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE OR REPLACE VIEW Group_Account_Statistic AS
SELECT AccountID, COUNT(*) AS So_Group
FROM `groupaccount`
GROUP BY AccountID
HAVING So_Group = ( 
					SELECT MAX(So_Group)
					FROM
						(SELECT COUNT(GroupID) AS So_Group
						FROM `groupaccount`
						GROUP BY AccountID) AS Thongke);


/* Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
được coi là quá dài) và xóa nó đi */

CREATE OR REPLACE VIEW Question_Content AS 
SELECT *
FROM question
WHERE length(Content) > 300;

DELETE FROM Question_Content
WHERE length(Content) > 300;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE OR REPLACE VIEW Number_Account_of_Department AS
SELECT d.DepartmentID, d.DepartmentName, COUNT(a.AccountID) AS SoNhanVien
FROM `account` a 
JOIN department d ON a.DepartmentID = d.DepartmentID
GROUP BY DepartmentID
HAVING SoNhanVien = 	(SELECT MAX(SoNhanVien) 
						FROM
							(SELECT COUNT(AccountID) AS SoNhanVien
							FROM `account` 
							GROUP BY DepartmentID) AS NumberAccountofDepartment
						);
                        

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE OR REPLACE VIEW question_Nguyen AS
SELECT q.* , a.FullName
FROM question q
JOIN `account` a ON q.CreatorID = a. AccountID
WHERE FullName LIKE 'nguyen%';

SELECT * 
FROM question_Nguyen;
