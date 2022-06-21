CREATE DATABASE basic_queries;

use basic_queries;

CREATE TABLE Customers (
    CustomerID int NOT NULL PRIMARY KEY,
    CustomerName varchar(255) NOT NULL,
    ContactName varchar(255),
	Country varchar(255) DEFAULT 'India',
    Age int CHECK (Age>=18)
);

CREATE TABLE Employees (
	EmployeeID int NOT NULL UNIQUE,
	EmployeeName varchar(255),
	BirthDate DATE
);

CREATE TABLE Orders (
	OrderID int NOT NULL IDENTITY(1000,1) UNIQUE,
	OrderDate DATE,
	CustomerID int FOREIGN KEY REFERENCES Customers(CustomerID),
	EmployeeID int FOREIGN KEY REFERENCES Employees(EmployeeID)
);



INSERT INTO Customers VALUES (1, 'Cardinal', 'Tom B. Erichsen', 'USA', 19);
INSERT INTO Customers VALUES (2, 'Ajay', 'AKachhela', 'India', 20);
INSERT INTO Customers VALUES (3, 'Vipul', 'VDevnani', 'China', 21);
INSERT INTO Customers VALUES (4, 'Neeraj', 'NGwalani', 'Mexico', 22);
INSERT INTO Customers VALUES (5, 'Chandan', 'CPanjwani', 'USA', 23);
INSERT INTO Customers VALUES (6, 'Prem', 'PSeedani', 'China', 24);
INSERT INTO Customers VALUES (7, 'Kunal', 'KWadhwa', 'India', 22);
INSERT INTO Customers VALUES (8, 'Satyam', 'SPrithiani', 'Mexico', 22);
INSERT INTO Customers VALUES (9, 'Yash', 'YAsrani', 'Mexico', 19);
INSERT INTO Customers VALUES (10, 'Nachiket', 'NJoag', 'Germany', 21);

INSERT INTO Employees VALUES(2001, 'RahulTewari', '2000-01-06');
INSERT INTO Employees VALUES(2002, 'SPrithiani', '2002-04-07');
INSERT INTO Employees VALUES(2003, 'KWadhwa', '2001-05-08');
INSERT INTO Employees VALUES(2004, 'CPanjwani', '2003-06-09');
INSERT INTO Employees VALUES(2005, 'NGwalani', '2004-08-10');
INSERT INTO Employees VALUES(2006, 'Mayur', '2005-10-11');
INSERT INTO Employees VALUES(2007, 'Ashish', '2006-12-12');


INSERT INTO Orders VALUES('2021-02-23', 5, 2001);
INSERT INTO Orders VALUES('2021-06-24', 1, 2002);
INSERT INTO Orders VALUES('2021-09-15', 2, 2003);
INSERT INTO Orders VALUES('2022-03-15', 8, 2004);
INSERT INTO Orders VALUES('2022-05-25', 10, 2005);


SELECT * FROM Customers;

SELECT * FROM Orders;

SELECT DISTINCT Country FROM Customers;

SELECT * FROM Customers
WHERE Country='USA';

SELECT * FROM Customers
WHERE Country='USA' AND Age='19';

SELECT * FROM Customers
WHERE Country='China' OR Country='Germany';

SELECT * FROM Customers
WHERE NOT Country='China';

SELECT * FROM Customers
ORDER BY Country ASC, CustomerName DESC;

UPDATE Customers
SET ContactName = 'VipulDevnani', Country= 'India'
WHERE CustomerID = 3;

SELECT * FROM Customers;

INSERT INTO Customers VALUES (11, 'Anand', 'APal', 'Africa', 23);

SELECT * FROM Customers;

DELETE FROM Customers WHERE CustomerName='Anand';

SELECT * FROM Customers;

SELECT TOP 5 * FROM Customers;

SELECT * FROM Customers
WHERE CustomerName LIKE 'Ku%';

SELECT * FROM Customers
WHERE CustomerName LIKE '%ach%';

SELECT * FROM Customers
WHERE CustomerName LIKE '_jay';

SELECT * FROM Customers
WHERE Country LIKE '[uic]%';

SELECT * FROM Customers
WHERE Country IN ('Germany', 'Mexico', 'USA');

SELECT * FROM Customers 
WHERE Age BETWEEN 18 AND 22;

SELECT CustomerID AS ID, CustomerName AS CustomerList
FROM Customers;

SELECT Orders.OrderID, Orders.OrderDate, Customers.CustomerName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;

SELECT Customers.CustomerName, Orders.OrderID
FROM Customers
LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID
ORDER BY Customers.CustomerName;

SELECT Orders.OrderID, Employees.EmployeeName
FROM Orders
RIGHT JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID
ORDER BY Orders.OrderID;

SELECT Customers.CustomerName, Orders.OrderID
FROM Customers
FULL OUTER JOIN Orders ON Customers.CustomerID=Orders.CustomerID
ORDER BY Customers.CustomerName;


SELECT ContactName FROM Customers
UNION 
SELECT EmployeeName FROM Employees;

SELECT COUNT(CustomerID) as NoOfEmployees, Country
FROM Customers
GROUP BY Country;


SELECT COUNT(CustomerID) as NoOfEmployees, Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerID)>2;

SELECT * INTO CustomersBackup2022
FROM Customers;

select * from CustomersBackup2022;

CREATE TABLE Suppliers (
	SupplierName varchar(255),
	Country varchar(255),
	Age int
);

INSERT INTO Suppliers (SupplierName, Country, Age)
SELECT CustomerName, Country, Age FROM Customers;

SELECT * FROM Suppliers;

INSERT INTO Suppliers VALUES(NULL, 'Africa', 20);

SELECT Country FROM Suppliers Where SupplierName IS NULL;

SELECT Country FROM Suppliers Where SupplierName IS NOT NULL;

SELECT * FROM Customers where CustomerName='Kunal';

CREATE INDEX idx_customername
ON Customers (CustomerName);

DROP INDEX Customers.idx_customername;


CREATE VIEW India_Customers AS
SELECT CustomerName, ContactName
FROM Customers
WHERE Country = 'India';


SELECT * FROM India_Customers;

ALTER TABLE Employees ADD DOB varchar(255);

ALTER TABLE Employees
ALTER COLUMN DOB DATE;

ALTER TABLE Employees
DROP COLUMN DOB;

TRUNCATE TABLE Suppliers;

-- DROP TABLE Suppliers;

SELECT ISNULL(SupplierName, 'Demo') FROM Suppliers;


