SELECT * FROM salesmans;

--Acitivity 5
-- Update the grade score of salesmen from Rome to 200.
UPDATE salesmans SET grade=200 WHERE salesman_city='Rome';

-- Update the grade score of James Hoog to 300.
UPDATE salesmans SET grade=300 WHERE salesman_name='James Hoog';

-- Update the name McLyon to Pierre.
UPDATE salesmans SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Display modified data
SELECT * FROM salesmans;