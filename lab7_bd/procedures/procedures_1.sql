USE family;

DROP PROCEDURE IF EXISTS family_values;

DELIMITER #

CREATE PROCEDURE values(
IN id int,
IN name nvarchar(45),
IN approximate_price int,
IN max_price int,
IN min_price int,
IN catalog_code int)
BEGIN
INSERT INTO family(id, name, approximate_price, max_price, min_price, catalog_code) 
VALUES (id, name, approximate_price, max_price, min_price, catalog_code);
END 


DELIMITER ;

CALL family_values('default', 'Bently',80000,90000,50000,0);

SELECT * FROM family;