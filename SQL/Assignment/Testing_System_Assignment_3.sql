USE testingsystem3;
-- Question 2: lấy ra tất cả các phòng ban

SELECT 
    *
FROM
    department;
    
-- Question 3: lấy ra id của phòng ban "Sale"
SELECT 
    DepartmentID
FROM
    department
WHERE
    DepartmentName = 'Sale';
    
-- Question 4: lấy ra thông tin account có full name dài nhất
-- Ko phải làm

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id= 3
-- Ko phải làm

-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT 
    GroupName
FROM
    `group`
WHERE
    CreateDate < '2019-12-20';

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời
SELECT QuestionID, COUNT(AnswerID) 
FROM answer
GROUP BY QuestionID
HAVING COUNT(AnswerID) >=4;


-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
SELECT 
    Title
FROM
    Exam
WHERE
    Duration >= 60
        AND CreateDate < '2019-12-20';

-- Question 9: Lấy ra 5 group được tạo gần đây nhất
SELECT 
    *
FROM
    `group`
ORDER BY CreateDate DESC
LIMIT 5;

-- Question 10: Đếm số nhân viên thuộc department có id = 2
SELECT departmentID, COUNT(AccountID) AS SoNhanVien
FROM `Account`
GROUP BY departmentID
HAVING departmentID = 2;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT FullName
FROM `Account`
WHERE FullName LIKE 'D%o';

-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE FROM exam 
WHERE
    CreateDate < '2019-12-20';


-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
DELETE FROM question
WHERE Content LIKE 'câu hỏi%';


/* Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và
 email thành loc.nguyenba@vti.com.vn */
UPDATE `Account` 
SET 
    FullName = 'Nguyễn Bá Lộc',
    Email = 'thành loc.nguyenba@vti.com.vn'
WHERE
    AccountID = 5;

-- Question 15: update account có id = 5 sẽ thuộc group có id = 4
UPDATE groupaccount
SET 
    groupID = 100
WHERE
    AccountID = 5;
    
  

