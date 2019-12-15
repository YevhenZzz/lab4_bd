USE family;
DROP TABLE IF EXISTS `new_table`;

DELIMITER //
DROP PROCEDURE IF EXISTS dynamicCreateTable; //
CREATE PROCEDURE dynamicCreateTable ()
BEGIN

	-- DECLARE new_table VARCHAR(100) DEFAULT CONCAT('new_table');
	-- SET @createTable = CONCAT("CREATE TABLE ", "new_table", "(id int, name int, number_of_house int)", "SELECT * FROM family");
    
    SET @createTable = CONCAT("CREATE TABLE ", "new_table", "(id int, name int, approximate_price int, max_price int, min_price int, catalog_code int)");
    
	PREPARE createStmt FROM @createTable;
	EXECUTE createStmt;
	DEALLOCATE PREPARE createStmt;
    
END//

CALL dynamicCreateTable(); //