DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;

USE Testing_System_Assignment_1;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department (
	DepartmentID		MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DepartmentName		NVARCHAR(50) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position` (
	PositionID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	PositionName 		ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
    AccountID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email 				VARCHAR(100) NOT NULL UNIQUE KEY,
    Username 			NVARCHAR(50) NOT NULL UNIQUE KEY,
    FullName 			NVARCHAR(50) NOT NULL,
    DepartmentID 		MEDIUMINT UNSIGNED NOT NULL,
    PositionID 			MEDIUMINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW(),
    FOREIGN KEY (DepartmentID)  REFERENCES Department(DepartmentID),
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group` (
    GroupID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName 			NVARCHAR(50) NOT NULL,
    CreatorID 			MEDIUMINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW()
);

DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount(
   GroupID 				MEDIUMINT UNSIGNED,
   AccountID 			MEDIUMINT UNSIGNED,
   JoinDate 			DATETIME DEFAULT NOW(),
   PRIMARY KEY (GroupID, AccountID),
   FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
   FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID)
);

DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion (
    TypeID 				MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TypeName 			ENUM('Essay', 'Multiple-Choice') NOT NULL
);

DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion (
    CategoryID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName 		NVARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS Question;
CREATE TABLE Question (
    QuestionID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 			NVARCHAR(100),
    CategoryID 			MEDIUMINT UNSIGNED NOT NULL,
    TypeID 				MEDIUMINT UNSIGNED NOT NULL,
    CreatorID 			MEDIUMINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW(),
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY (TypeID) REFERENCES  TypeQuestion(TypeID),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer (
    AnswerID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 			NVARCHAR(100) NOT NULL ,
    QuestionID 			MEDIUMINT UNSIGNED NOT NULL,
    isCorrect 			BIT,
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam (
    ExamID 				MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code` 				CHAR(50) NOT NULL,
    Title 				NVARCHAR(50) NOT NULL,
    CategoryID 			MEDIUMINT UNSIGNED NOT NULL,
    Duration 			TIME NOT NULL,
    CreatorID 			MEDIUMINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW(),
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY (CreatorID ) REFERENCES `Account`(AccountID)
);

DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE ExamQuestion(
	QuestionID 			 MEDIUMINT UNSIGNED NOT NULL,
	ExamID				 MEDIUMINT UNSIGNED NOT NULL,
    PRIMARY KEY (QuestionID, ExamID),
    FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);


-- insert data

INSERT INTO Department(DepartmentName)
VALUES 	('DEV'),
		('Sale'),
		('MKT');

INSERT INTO `Position`(PositionName)
VALUES 	('Dev'),
		('Test'),
		('Scrum Master'),
        ('PM');
        
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID)
VALUES	('thanhpc@gmail.com', 'thanhvc', 'Vu Cong Thanh', 1, 1),
		('thanhpc2@gmail.com', 'thanhvc2', 'Vu Cong Thanh2', 1, 2),
        ('Nguyenvana@gmail.com', 'NguyenvanA', 'Nguyen Van A', 2, 3),
        ('Hang.pham@gmail.com', 'Phamhang', 'Pham Thuy Hang', 3, 4),
        ('daoloan6196@gmail.com', 'LoanDao', 'Dao Thi Thanh Loan', 2, 4),
        ('baoquyen123@gmail.cpm', 'Baoquyen', ' Nguyen Bao Quyen', 3, 4),
        ('phuonglinhvu@gmail.com', 'Vuphuonglinh', 'Vu Phuong Linh', 3, 2),
        ('duy.nguyen@gmail.com', 'duynguyen', 'Nguyen Van Duy', 3, 3),
        ('nam.dao@gmail.com', 'namdao', 'Dao Tien Nam', 3, 2),
        ('hieu.nguyen@gmail.com', 'nguyenvanhieu', 'Nguyen Van Hieu', 1, 4);

INSERT INTO  `Group` (GroupName, CreatorID)  
VALUES	('Group_1', 1),
		('Group_2', 2),
        ('Group_3', 3),
		('Group_4', 10),
        ('Group_5', 4),
		('Group_6', 5);
        
INSERT INTO GroupAccount ( GroupID, AccountID)
VALUES	(1, 1),
		(1, 2),
        (1, 3),
        (1, 4),
        (1, 5),
        (1, 6),
        (1, 7),
        (1, 8),
        (1, 9),
        (1, 10),
        (3, 1),
		(3, 2),
        (3, 3),
        (3, 4),
        (3, 5),
        (3, 6),
        (3, 7),
        (3, 8),
        (3, 9),
        (3, 10),
        (4, 1),
		(4, 2),
        (4, 3),
        (4, 4),
        (4, 5),
        (4, 6),
        (4, 7),
        (4, 8),
        (4, 9),
        (4, 10),
		(5, 1),
		(5, 2),
        (5, 3),
        (5, 4),
        (5, 5),
        (5, 6),
        (5, 7),
        (5, 8),
        (5, 9),
        (5, 10),
        (6, 1),
		(6, 2),
        (6, 3),
        (6, 4),
        (6, 5),
        (6, 6),
        (6, 7),
        (6, 8),
        (6, 9),
        (6, 10);
        
   
