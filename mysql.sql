CREATE TABLE `demo`.`user` (
`no` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(255) NOT NULL,
`role` int(10) NOT NULL,
`c_no` varchar(200) NOT NULL,
`b_no` varchar(200) NULL DEFAULT NULL,
`tel` varchar(255) NULL DEFAULT NULL,
`account` varchar(255) NOT NULL,
`password` varchar(255) NOT NULL DEFAULT '123456',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
PRIMARY KEY (`no`)
)
ENGINE = InnoDB
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Dynamic
STATS_SAMPLE_PAGES = 0;
