
CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE students (
student_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
dept VARCHAR(30),
mark1 INT,
mark2 INT,
mark3 INT
);
INSERT INTO students (name, dept, mark1, mark2, mark3) VALUES
('Amit', 'CSE', 85, 78, 92),
('Riya', 'ECE', 90, 88, 84),
('Karan', 'IT', 70, 65, 72);
SELECT
student_id,
name,
dept,
(mark1 + mark2 + mark3) AS total_marks,
(mark1 + mark2 + mark3)/3 AS average
FROM students;
SELECT name, dept, (mark1+mark2+mark3)/3 AS avg_marks
FROM students
ORDER BY avg_marks DESC
LIMIT 1;
SELECT dept, AVG((mark1+mark2+mark3)/3) AS dept_avg
FROM students
GROUP BY dept;