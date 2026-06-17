--Activity 4

-- Add the grade column
ALTER TABLE salesmans ADD grade int;

-- Update the values in the grade column
UPDATE salesmans SET grade=100;

-- Display data
SELECT * FROM salesmans;