
-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesmans;

-- Show data of salesman from Paris
SELECT * FROM salesmans WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesmans WHERE salesman_name='Paul Adam';