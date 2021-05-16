DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE IF NOT EXISTS Fresher;

USE Fresher;

-- -----------------------------------
-- Exercise 1:Design a table
-- -----------------------------------

DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee(
	TraineeID			INT UNSIGNED KEY AUTO_INCREMENT,
	Full_Name			VARCHAR(50),
	Birth_Date			DATE,
	Gender				ENUM('Male', 'Female', 'Unknow'),
	ET_IQ				TINYINT UNSIGNED,
	ET_Gmath			TINYINT UNSIGNED,
	ET_English			TINYINT UNSIGNED,
	Traning_Class		VARCHAR(50),
	Evaluation_Notes	VARCHAR(50)
);

-- thêm trường VTI_Account với điều kiện not null & unique
ALTER TABLE Trainee
ADD COLUMN VTI_Account VARCHAR(100) NOT NULL UNIQUE;

-- --------------------------------------
-- Exercise 2: Data Types
-- --------------------------------------
