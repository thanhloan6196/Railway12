DROP DATABASE IF EXISTS fresher;
CREATE DATABASE fresher;
USE Fresher;


-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
DROP TABLE IF EXISTS trainee;
CREATE TABLE trainee (
  TraineeID 		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  Full_Name 		VARCHAR(50),
  Birth_Date 		DATE ,
  Gender 			ENUM('M','F','Unknow'),
  ET_IQ 			TINYINT UNSIGNED,
  ET_Gmath 			TINYINT UNSIGNED,
  ET_English 		TINYINT UNSIGNED,
  Traning_Class 	VARCHAR(50),
  Evaluation_Notes 	VARCHAR(50),
  CHECK (ET_IQ <=20),
  CHECK (ET_Gmath <=20),
  CHECK (ET_English <=50)
  );
 
 -- Question 2: Thêm ít nhất 10 bản ghi vào table
 
 INSERT INTO trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Traning_Class, Evaluation_Notes)
 VALUES
	( 'Nguyen Van A', '1996-01-01', 'M', '19', '18', '45', 'VTI001', 'DHBKHN'),
	( 'Nguyen Van B', '1996-10-01', 'M', '19', '18', '35', 'VTI001', 'DHBKHN'),
	( 'Tran Van An', '1997-12-10', 'M', '20', '16', '50', 'VTI004', 'DHBKHN'),
	( 'Dao Thanh Loan', '1996-06-01', 'F', '20', '20', '50', 'VTI003', 'DHKTQD'),
	('Nguyen Van C', '1995-01-01', 'M', '19', '19', '45', 'VTI003', 'DHBKHN'),
	( 'Do Van Troi', '1996-12-12', 'M', '19', '18', '35', 'VTI001', 'DHKDCN'),
	( 'Phung Thanh Do', '1998-1-10', 'M', '20', '16', '50', 'VTI004', 'DHBKHN'),
	( 'Vu Phuong Linh', '1994-08-09', 'F', '17', '19', '40', 'VTI003', 'DHKHXHNV'),
	( 'Tran Thanh Tam', '1998-10-10', 'F', '15', '16', '50', 'VTI004', 'DHKHXHNV'),
	( 'Vu Phuong Linh', '1994-08-09', 'F', '17', '19', '40', 'VTI003', 'DHKHXHNV');
    
-- Question 3: Insert 1 bản ghi mà có điểm ET_IQ =30. Sau đó xem kết quả.
 INSERT INTO trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Traning_Class, Evaluation_Notes)
 VALUES
	( 'Dao Tien Nam', '1999-06-12', 'M', '30', '18', '50', 'VTI001', 'DHBKHN');
    
    
/* Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,
và sắp xếp theo ngày sinh. Điểm ET_IQ >=12, ET_Gmath>=12, ET_English>=20 */

SELECT *
FROM trainee
WHERE ET_IQ >=12 AND ET_Gmath>=12 AND ET_English>=20
ORDER BY Birth_Date ASC ;

/* Question 5: Viết lệnh để lấy ra thông tin thực tập sinh có tên bắt đầu bằng chữ N và kết thúc
bằng chữ C */

SELECT * 
FROM trainee
WHERE Full_Name LIKE 'N%C';

-- Question 6: Viết lệnh để lấy ra thông tin thực tập sinh mà tên có ký thự thứ 2 là chữ G
SELECT * 
FROM trainee
WHERE Full_Name LIKE '_g%';

/* Question 7: Viết lệnh để lấy ra thông tin thực tập sinh mà tên có 10 ký tự và ký tự cuối cùng
là C */

SELECT * 
FROM trainee
WHERE Full_Name LIKE '%c' AND length(Full_Name) = 10;

/* Question 8: Viết lệnh để lấy ra Fullname của các thực tập sinh trong lớp, lọc bỏ các tên trùng
nhau */
SELECT DISTINCT Full_Name 
FROM trainee;

/* Question 9: Viết lệnh để lấy ra Fullname của các thực tập sinh trong lớp, sắp xếp các tên này
theo thứ tự từ A-Z. */
SELECT Full_Name 
FROM trainee
ORDER BY Full_Name ASC;

-- Question 10: Viết lệnh để lấy ra thông tin thực tập sinh có tên dài nhất

SELECT *
FROM trainee
WHERE LENGTH(Full_Name) = ( SELECT MAX(LENGTH(Full_Name)) FROM trainee);

-- Question 11: Viết lệnh để lấy ra ID, Fullname và Ngày sinh thực tập sinh có tên dài nhất
SELECT TraineeID, Full_Name, Birth_Date
FROM trainee
WHERE LENGTH(Full_Name) = ( SELECT MAX(LENGTH(Full_Name)) FROM trainee);

-- Question 12: Viết lệnh để lấy ra Tên, và điểm IQ, Gmath, English thực tập sinh có tên dài nhất
SELECT Full_Name, ET_IQ, ET_Gmath, ET_English
FROM trainee
WHERE LENGTH(Full_Name) = ( SELECT MAX(LENGTH(Full_Name)) FROM trainee);

-- Question 13 Lấy ra 5 thực tập sinh có tuổi nhỏ nhất
SELECT *
FROM trainee
ORDER BY Birth_Date DESC
LIMIT 5;

/* Question 14: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là
những người thỏa mãn số điểm như sau:
• ET_IQ + ET_Gmath>=20
• ET_IQ>=8
• ET_Gmath>=8
• ET_English>=18 */

SELECT *
FROM trainee
WHERE (ET_IQ + ET_Gmath>=20) AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English>=18;

-- Question 15: Xóa thực tập sinh có TraineeID = 5
DELETE FROM trainee
WHERE TraineeID = 5;

-- Question 16: Xóa thực tập sinh có tổng điểm ET_IQ, ET_Gmath <=15
DELETE FROM trainee
WHERE ET_IQ + ET_Gmath <=15;

-- Question 17: Xóa thực tập sinh quá 30 tuổi.
SELECT *, (year(curdate()) - year(Birth_Date)) AS Tuoi
FROM Trainee;

DELETE FROM trainee
WHERE year(curdate()) - year(Birth_Date) > 30;

/* Question 18: Thực tập sinh có TraineeID = 3 được chuyển sang lớp " VTI003". Hãy cập nhật
thông tin vào database. */

UPDATE trainee
SET Traning_Class = 'VTI003' 
WHERE TraineeID = 3;

/* 
Question 19: Do có sự nhầm lẫn khi nhập liệu nên thông tin của học sinh số 10 đang bị sai,
hãy cập nhật lại tên thành “LeVanA”, điểm ET_IQ =10, điểm ET_Gmath =15, điểm
ET_English = 30. */

SELECT * FROM Trainee;
UPDATE Trainee
SET 
	Full_Name = 'LeVanA',
	ET_IQ =10,
	ET_Gmath =15,
	ET_English = 30
WHERE TraineeID = 10;

-- Question 20: Đếm xem trong lớp VTI001 có bao nhiêu thực tập sinh.
SELECT Traning_Class, COUNT(*) AS SoThucTapSinh
FROM Trainee
WHERE Traning_Class = 'VTI001'
GROUP BY Traning_Class;

-- Question 21: Đếm xem trong lớp VTI001 có bao nhiêu thực tập sinh.

SELECT Traning_Class, COUNT(*) AS SoThucTapSinh
FROM Trainee
WHERE Traning_Class = 'VTI001'
GROUP BY Traning_Class;

-- Question 22: Đếm tổng số thực tập sinh trong lớp VTI001 và VTI003 có bao nhiêu thực tập sinh.
SELECT COUNT(Traning_Class)
FROM Trainee
WHERE Traning_Class IN ('VTI001', 'VTI003');

-- Question 23: Lấy ra số lượng các thực tập sinh theo giới tính: Male, Female, Unknown.
SELECT Gender, COUNT(Gender) AS SoLuong
FROM Trainee
GROUP BY Gender;

-- Question 24: Lấy ra lớp có lớn hơn 5 thực tập viên
SELECT Traning_Class, COUNT(Traning_Class)
FROM Trainee
GROUP BY Traning_Class
HAVING COUNT(Traning_Class) > 5 ;

-- Question 25: Lấy ra lớp có nho hơn hoac bang 5 thực tập viên
SELECT Traning_Class, COUNT(Traning_Class)
FROM Trainee
GROUP BY Traning_Class
HAVING COUNT(Traning_Class) <= 5 ;

-- Question 26: Lấy ra trường có ít hơn 4 thực tập viên tham gia khóa học
SELECT Evaluation_Notes, COUNT(Evaluation_Notes)
FROM Trainee
GROUP BY Evaluation_Notes
HAVING COUNT(Evaluation_Notes) < 4;

/* Question 27: Bước 1: Lấy ra danh sách thông tin ID, Fullname, lớp thực tập viên có lớp
'VTI001'
Bước 2: Lấy ra danh sách thông tin ID, Fullname, lớp thực tập viên có lớp 'VTI002'
Bước 3: Sử dụng UNION để nối 2 kết quả ở bước 1 và 2 */

SELECT TraineeID, Full_Name, Traning_Class
FROM Trainee
WHERE Traning_Class = 'VTI001'
UNION
SELECT TraineeID, Full_Name, Traning_Class
FROM Trainee
WHERE Traning_Class = 'VTI002';




