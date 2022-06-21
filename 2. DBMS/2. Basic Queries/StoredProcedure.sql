use basic_queries;


CREATE PROCEDURE SelectAllCustomers @Country nvarchar(30)
AS
BEGIN
SELECT * FROM Customers WHERE Country = @Country
END
GO

EXEC SelectAllCustomers @Country = 'Mexico';

select * from Customers;