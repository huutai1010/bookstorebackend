USE todo

CREATE TABLE `task_item` (
                             `id` bigint NOT NULL,
                             `is_done` bit(1) NOT NULL,
                             `title` varchar(255) NOT NULL,
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `task_item` VALUES (2, true, 'Redis');
INSERT INTO `task_item` VALUES (3, true, 'MySQL');
