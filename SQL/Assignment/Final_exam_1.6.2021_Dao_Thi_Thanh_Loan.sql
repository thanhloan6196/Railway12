
DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;

/* Tạo table với các ràng buộc và kiểu dữ liệu
Thêm ít nhất 3 bản ghi vào table */
DROP TABLE IF EXISTS Country;
CREATE TABLE Country(
	country_id  		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	country_name 		VARCHAR(50)
  );

DROP TABLE IF EXISTS Location;
CREATE TABLE Location(
	location_id  		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	street_address  	VARCHAR(100),
    postal_code			VARCHAR(50),
    country_id			TINYINT UNSIGNED,
FOREIGN KEY (country_id) REFERENCES Country(country_id) ON DELETE CASCADE
  );

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
	employee_id  		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	full_name		  	VARCHAR(50),
    email				VARCHAR(50),
    location_id			TINYINT UNSIGNED,
FOREIGN KEY (location_id) REFERENCES Location(location_id) ON DELETE CASCADE
  );
  
  -- insert vao bang Country
  INSERT INTO Country ( Country_name)
  VALUES 
  ('Viet Nam'),
  ('Trung Quoc'),
  ('Thai Lan'),
  ('Hoa Ky'),
  ('Singapore');
  
  -- insert vao bang Loacation
  
  INSERT INTO Location( street_address, postal_code, country_id)
  VALUES
  ('Ha Noi', '10000', 1),
  ('Hau Giang', '95000', 1),
  ('Hoa Binh', '36000', 1),
  ('Ho Chi Minh', '70000', 1),
  ('BangKok', '10100', 3),
  ('Beverly Hills', '90210', 4),
  ('Seattle', '98104', 4),
  ('Ang Mo Kio Avenue', '569933', 5),
  ('BeiJing', '100000', 2);
  
  --  insert vao bang Employee
  
  INSERT INTO employee (full_name, email, location_id)
  VALUES 
	('Nguyen Van An', 'nguyenvanan@gmail.com', 1),
	('Nguyen thuy hang', 'hang.nguyen@gmail.com', 1),
	('Nguyen Van Dung', 'Dung.nguyen@gmail.com', 1),
    ('Dao Thi Thanh Loan', 'Daoloan6196@gmail.com', 4),
    ('Tran Thi Hang', 'tranthihang@gmail.com', 4),
    ('Dao Thuy Hanh', 'Dothuyhanh@gmail.com', 5),
    ('Nguyen Viet Anh', 'nguyenvietanh@gmail.com', 6),
    ('Ha Van Tap', 'ha.tap@gmail.com', 8),
    ('Nguyen Thi Ngoc Anh', 'ngocanh.nguyen@gmail.com', 4),
    ('Achbjakjfl', 'afhfk.com', 5),
    ('Tom Hank', 'hankTomdjjdh@gmail.com', 6),
    ('Jenifer Aniston', 'JeniferAniston@gmail.com', 6),
    ('Ling Lung', 'ling.lung@gmail.com', 9),
    ('acha jhfdsimane', 'jhfdsimane@gmail.com', 8),
    ('Nguyen Van Hai', 'nguyenvanhai@gmail.com', 1),
    ('Vu Phuong Linh', 'VuPhuongLinh@gmail.com', 1),
    ('Dam Viet Thang', 'DamVietThang@gmail.com', 2);
    
    
-- =========================================================================
  /* 2. Viết lệnh để
a) Lấy tất cả các nhân viên thuộc Việt nam
b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang
làm việc. */

-- a) Lấy tất cả các nhân viên thuộc Việt nam

SELECT e.employee_id, e.full_name, c.country_name
FROM employee e 
JOIN location l ON e.location_id = l.location_id
JOIN country c ON l.country_id = c.country_id
WHERE country_name = 'Viet Nam';
  
-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
  
SELECT c.country_name
FROM employee e 
JOIN location l ON e.location_id = l.location_id
JOIN country c ON l.country_id = c.country_id
WHERE e.email = 'nn03@gmail.com';
  
-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc

SELECT c.country_name, l.location_id, COUNT(e.employee_id) AS SoNhanVien
FROM employee e 
RIGHT JOIN location l ON e.location_id = l.location_id
RIGHT JOIN country c ON l.country_id = c.country_id
GROUP BY c.country_name, l.location_id;

-- 3. Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa
-- 10 employee

DROP TRIGGER IF EXISTS check_insert_countryEmp;
DELIMITER $$
CREATE TRIGGER check_insert_countryEmp
BEFORE INSERT ON `Employee` 
FOR EACH ROW
BEGIN
	DECLARE v_employee_number MEDIUMINT UNSIGNED;
    DECLARE v_country_id TINYINT UNSIGNED;
    
    SELECT country_id INTO v_country_id
    FROM location WHERE location_id = NEW.location_id;
    
    SELECT COUNT(e.employee_id) INTO v_employee_number
	FROM employee e 
	JOIN location l ON e.location_id = l.location_id
	JOIN country c ON l.country_id = c.country_id
	WHERE c.country_id = v_country_id;
    
    IF v_employee_number >= 10 THEN 
    SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = ' Khong the insert vi moi quoc gia chi co toi da 10 employees ';
	END IF;
         
END $$
DELIMITER ;

-- vd:
INSERT INTO `thuctap`.`employee` (`employee_id`, `full_name`, `email`, `location_id`) 
VALUES ('20', 'Nguyen Ngoc Phuong Trinh', 'phuongtrinh.nguyen@gmail.com', '1');
-- Khi insert se bao loi do Viet Nam da co 10 employees

/* 4. Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở
location đó sẽ có location_id = null */

DROP TRIGGER IF EXISTS check_location;
DELIMITER $$
CREATE TRIGGER check_location
BEFORE DELETE ON `Location` 
FOR EACH ROW
BEGIN
	UPDATE 	employee 
    SET 
		location_id = NULL
	WHERE location_id = OLD.location_id;
         
END $$
DELIMITER ;

-- test trigger:
DELETE FROM location WHERE location_id = 9;














  
