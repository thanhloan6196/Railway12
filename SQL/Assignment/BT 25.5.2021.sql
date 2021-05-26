DROP DATABASE IF EXISTS QuanLyNhanVien;
CREATE DATABASE QuanLyNhanVien;
USE QuanLyNhanVien;

-- Tao bang Department
DROP TABLE IF EXISTS department;
CREATE TABLE department (
	Department_Number	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Department_Name		VARCHAR(50)
);

-- Tao bang Employee_Table
DROP TABLE IF EXISTS Employee_Table ;
CREATE TABLE Employee_Table (
	Employee_Number		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Employee_Name		VARCHAR(50),
	Department_Number	TINYINT UNSIGNED, 
FOREIGN KEY(Department_Number) REFERENCES department(Department_Number) ON DELETE CASCADE
);

-- Tao bang Skill_Table 

DROP TABLE IF EXISTS Skill_Table ;
CREATE TABLE Skill_Table (
Skill_Number		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Skill_Name			VARCHAR(50) NOT NULL
);

-- Tao bang Employee_Skill_Table
DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table (
	Employee_Number			TINYINT UNSIGNED,
	Skill_Number			TINYINT UNSIGNED,
	`Date Registered`		DATETIME DEFAULT NOW(),
PRIMARY KEY(Employee_Number, Skill_Number),
FOREIGN KEY(Employee_Number) REFERENCES Employee_Table(Employee_Number),
FOREIGN KEY(Skill_Number) REFERENCES Skill_Table(Skill_Number)
);



-- Question 2: Thêm ít nhất 10 bản ghi vào table
INSERT INTO department (Department_Name)
VALUES 
 ('Engineering'),
 ('Product Management'),
 ('Business Development'),
 ('Legal'),
 ('Support'),
 ('Accounting'),
 ('Services'),
 ('Sale'),
 ('Training'),
 ('Human Resources');
 
 INSERT INTO Employee_Table(Employee_Name, Department_Number)
 VALUES
 ('Nguyen Van An', 1),
 ('Tran Van Huan', 2),
 ('Tran Thi Linh', 3),
 ('Nguyen Bao Quyen',3),
 ('Dao Thi Thanh Loan', 4),
 ('Vu Phuong Linh', 5),
 ('Tran Thi Ngoc Linh', 6),
 ('Nguyen Bao Quyen', 7),
 ('Ngyen Thi Huong', 8),
 ('Duong Bao Quyen', 9),
 ('Ngyen Thi Thu Huong', 10);
 
 INSERT INTO Skill_table (Skill_Name)
 VALUES 
 ('MySQL'),
 ('C#'),
 ('Java'),
 ('Python'),
 ('Javascript');
 
  
 INSERT INTO Employee_Skill_Table ( Employee_Number, Skill_Number)
 VALUES 
 (1, 1),
 (2, 1),
 (3, 2),
 (4, 3),
 (5, 4),
 (6, 4),
 (7, 5),
 (8, 5),
 (9, 2),
 (10,3);
 
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
-- Hướng dẫn: sử dụng UNION
SELECT e.*, s.Skill_Name
FROM employee_skill_table es
JOIN skill_table s ON es.Skill_Number = s.Skill_Number
JOIN employee_table e ON es.Employee_Number = e.Employee_Number
WHERE Skill_Name = 'Java';


 -- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT d.Department_Name, COUNT(*) AS SoNhanVien
FROM employee_table et
JOIN Department d ON et.Department_Number = d.Department_Number
GROUP BY d.Department_Name
HAVING SoNhanVien >3;

-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
-- Hướng dẫn: sử dụng GROUP BY

SELECT d.*, et.Employee_Name
FROM department d
JOIN employee_table et ON d.Department_Number = et.Department_Number
GROUP BY d.Department_Name, et.Employee_Name;

-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
-- Hướng dẫn: sử dụng DISTINCT

SELECT e.Employee_Number, e.Employee_Name, COUNT(*) AS skill_numbers
FROM employee_table e
JOIN employee_skill_table et ON e.Employee_Number = et.Employee_Number
GROUP BY Employee_Number
HAVING skill_numbers > 1;

