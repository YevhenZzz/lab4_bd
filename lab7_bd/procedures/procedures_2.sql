USE family;

DELIMITER $$
DROP PROCEDURE IF EXISTS family_values;
CREATE PROCEDURE family_values(IN max_price INT,IN num INT)
	BEGIN
		DECLARE number INT DEFAULT 0;
        DECLARE N INT DEFAULT 0;
			WHILE (number < num) DO 
				SET N = Rand()*100000;
                IF EXISTS(SELECT * FROM family_values WHERE max_price = '50000'+N) THEN 
					SET N = Rand()*100000; 
                END IF;
				INSERT INTO `family)values`(`max_price`)
				VALUES(concat(max_price,N));
				SET number  = number + 1; 
			END WHILE;
	END
//
DELIMITER ;
CALL family_values("max_price",10)

-- SELECT * FROM street