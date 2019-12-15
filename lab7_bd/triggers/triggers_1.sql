use family;

DELIMITER $$
DROP TRIGGER IF EXISTS employee_position_academic_status_degree_FK;
CREATE TRIGGER employee_position_academic_status_degree_FK
BEFORE INSERT
ON employee for each row
BEGIN 
  IF(new.position_id NOT IN (SELECT id FROM position) OR new.academic_status_id NOT IN (SELECT id FROM academic_status) OR new.degree_id NOT IN (SELECT id FROM degree))
    THEN SIGNAL SQLSTATE "45000"
    SET MESSAGE_TEXT = "Check Errоr For Insert: FOREIGN key failure";
  END IF;
END // 
DELIMITER ;

DELIMITER $$
DROP TRIGGER IF EXISTS discipline_form_of_reception_FK;
CREATE TRIGGER discipline_form_of_reception_FK
BEFORE INSERT
ON discipline for each row
BEGIN 
  IF(new.form_of_reception_id NOT IN (SELECT id FROM form_of_reception))
    THEN SIGNAL SQLSTATE "45000"
    SET MESSAGE_TEXT = "Check Errоr For Insert: FOREIGN key failure";
  END IF;
END // 
DELIMITER ;