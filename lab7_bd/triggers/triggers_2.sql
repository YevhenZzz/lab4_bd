USE family;

DELIMITER //
DROP trigger IF EXISTS family_tree; //
create trigger family_tree
before insert
on family_tree for each row
begin
	if (new.credit_card_number NOT RLIKE '^[1-9][1-9][1-9][1-9]-[1-9][1-9][1-9][1-9]-[1-9][1-9][1-9][1-9]-[1-9][1-9][1-9][1-9]$')
	then 
		signal sqlstate '45000' set message_text = 'Employee: Trying to insert a error value in table';
	end if;
end// 

-- INSERT INTO `employee` (`id`, `surname`, `name`, `middle_name`, `id_number`, `passport_number`, `seniority`, `birthday`, `position_id`, `pharmacy_id`) VALUES (DEFAULT, 'Дунай', 'Іван', 'Сергійович', 5423623, 'K 54332', 1, '05.12.1965', '1', '1');

-- INSERT INTO `employee` (`id`, `surname`, `name`, `middle_name`, `id_number`, `passport_number`, `seniority`, `birthday`, `position_id`, `pharmacy_id`) VALUES (DEFAULT, 'Дунай', 'Іван', 'Сергійович', 5423623, 'BK 543326', 1, '05.12.1965', '1', '1');
