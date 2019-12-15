DELIMITER $$
CREATE
 TRIGGER my_trigger BEFORE INSERT
    ON sex
    FOR EACH ROW BEGIN
  INSERT INTO logs(time) VALUE(NOW());
 END$$
DELIMITER ;


INSERT INTO sex (id,male,female) VALUES (default,1 ,0);