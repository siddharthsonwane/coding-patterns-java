1. 🔹 Find 2nd Highest Salary
SELECT MAX(salary)
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);

2. 🔹 Find Nth Highest Salary (Using DENSE_RANK)
SELECT salary
FROM (
    SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) rnk
    FROM employees
)
WHERE rnk = 3;

3. 🔹 Remove Duplicate Records
DELETE FROM employees e
WHERE ROWID > (
    SELECT MIN(ROWID)
    FROM employees
    WHERE email = e.email
);

4. 🔹 Fetch Duplicate Records
SELECT email, COUNT(*)
FROM employees
GROUP BY email
HAVING COUNT(*) > 1;

5. 🔹 Top 5 Highest Salaries
SELECT *
FROM employees
ORDER BY salary DESC
FETCH FIRST 5 ROWS ONLY;

6. 🔹 Pagination (Offset + Fetch)
SELECT *
FROM employees
ORDER BY employee_id
OFFSET 10 ROWS FETCH NEXT 5 ROWS ONLY;

7. 🔹 Employees Joined in Last 30 Days
SELECT *
FROM employees
WHERE hire_date >= SYSDATE - 30;

8. 🔹 Find Employees Without Department
SELECT *
FROM employees
WHERE department_id IS NULL;

9. 🔹 INNER JOIN Example
SELECT e.name, d.department_name
FROM employees e
JOIN departments d
ON e.department_id = d.department_id;

10. 🔹 LEFT JOIN (Find Missing Matches)
SELECT e.name
FROM employees e
LEFT JOIN departments d
ON e.department_id = d.department_id
WHERE d.department_id IS NULL;

11. 🔹 SELF JOIN (Manager-Employee)
SELECT e.name AS employee, m.name AS manager
FROM employees e
LEFT JOIN employees m
ON e.manager_id = m.employee_id;

12. 🔹 CASE Statement
SELECT name,
       CASE
           WHEN salary > 10000 THEN 'High'
           WHEN salary BETWEEN 5000 AND 10000 THEN 'Medium'
           ELSE 'Low'
       END salary_category
FROM employees;

13. 🔹 Group By with Aggregation
SELECT department_id, AVG(salary)
FROM employees
GROUP BY department_id;

14. 🔹 HAVING Clause
SELECT department_id, COUNT(*)
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 5;

15. 🔹 Subquery Example
SELECT *
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

16. 🔹 Correlated Subquery
SELECT e1.name, e1.salary
FROM employees e1
WHERE salary > (
    SELECT AVG(salary)
    FROM employees e2
    WHERE e1.department_id = e2.department_id
);

17. 🔹 Find Gaps in Sequence
SELECT employee_id + 1 AS missing_id
FROM employees
WHERE employee_id + 1 NOT IN (SELECT employee_id FROM employees);

18. 🔹 Pivot Query
SELECT *
FROM (
    SELECT department_id, salary
    FROM employees
)
PIVOT (
    AVG(salary)
    FOR department_id IN (10, 20, 30)
);

19. 🔹 Merge (Upsert)
MERGE INTO employees e
USING new_employees n
ON (e.id = n.id)
WHEN MATCHED THEN
    UPDATE SET e.salary = n.salary
WHEN NOT MATCHED THEN
    INSERT (id, name, salary)
    VALUES (n.id, n.name, n.salary);

20. 🔹 Hierarchical Query (CONNECT BY)
SELECT employee_id, manager_id, LEVEL
FROM employees
START WITH manager_id IS NULL
CONNECT BY PRIOR employee_id = manager_id;