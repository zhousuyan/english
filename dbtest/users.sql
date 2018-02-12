DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(32) NOT NULL,
  `age` INT(2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userName` (`userName`)
) 
