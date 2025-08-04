package com.shashikala.practice.streams;

public class Sql {
//    Select Employees with Salary > 50000
//   select * from employees where salary > 50000
//Table: employees(id, name, salary)
//
//🔸 Get the names of all employees earning more than 50000.
//    select name from employees where salary > 50000
//
//Find Employees from a Specific Department
//
//Table: employees(id, name, dept_id), departments(id, dept_name)
//🔸 Get names of employees who work in the "HR" department.
// select e.name from employees e join department d on e.dept_id=d.id and d.dept_name="HR";

//Count Total Records
//
//Table: orders(id, customer_id, amount)
//
//🔸 Find how many orders exist in the table.
// select count(*) from orders;

//Order by Salary Descending
//
//Table: employees(id, name, salary)
//
//🔸 List all employees ordered by salary from highest to lowest.
// select * from employees order by salary desc;

//Find Employees with NULL Manager
//
//Table: employees(id, name, manager_id)
//
//🔸 Find employees who do not have a manager assigned.
//  select * from employees where manager is null;

//🔸 Intermediate-Level SQL Questions
//Top N Salaries
//
//Table: employees(id, name, salary)
//
//🔸 Find the top 3 highest-paid employees.
//  select * from employees order by salary desc limit 3;


//Join and Filter
//
//Tables: employees(id, name, dept_id), departments(id, dept_name)
//
//🔸 List all employees with their department name, but only those in the "Finance" or "Marketing" departments.
//   select e.id, e.name, e.dept_id, d.dept_name from employee e join department d on e.dept_id=d.id where d.dept_name in ("Finance,"Marketing");

//Aggregate by Department
//
//Table: employees(id, name, dept_id, salary)
//
//🔸 Find the average salary for each department.
// select dept_id, AVG(salary) as average_salary from employee group by dept_id;


//Find Duplicate Email Addresses
//
//Table: users(id, email)
// SELECT email
//FROM users
//GROUP BY email
//HAVING COUNT(*) > 1;

//🔸 Find all emails that appear more than once.
//
//Second Highest Salary
//
//Table: employees(id, name, salary)
//
//🔸 Find the second highest salary in the company.
//  select salary from employees order by salary desc limit 1,1;


//🔹 Advanced-Level SQL Questions
//Rank Employees by Salary Within Each Department
//
//Table: employees(id, name, salary, dept_id)
//
//🔸 Assign a rank to employees based on salary within their department.
//
//Find Customers Who Never Ordered
//
//Tables: customers(id, name), orders(id, customer_id)
//
//🔸 List all customers who have never placed an order.
//  SELECT *
//FROM customers c
//LEFT JOIN orders o ON c.id = o.customer_id
//WHERE o.id IS NULL;


//Running Total of Orders
//
//Table: orders(id, order_date, amount)
//
//🔸 Get a running total of order amounts sorted by date.
//  select SUM(amount) from orders order by order_date;

//Find Gaps in a Sequence
//
//Table: ids(id)
//
//🔸 Find missing integers in the sequence of IDs.
//
//Find Most Ordered Product
//
//Table: orders(id, product_id)
//
//🔸 Return the product(s) with the highest number of orders.
    // select count(product_id) as total from orders group by product_id order by total limit 1;
}
