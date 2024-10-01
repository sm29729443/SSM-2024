CREATE DATABASE spring_tx;

use spring_tx;

CREATE TABLE `account`
(
    `id`       int(0)                                                        NOT NULL AUTO_INCREMENT COMMENT '用戶id',
    `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用戶名',
    `age`      int(0)                                                        NULL DEFAULT NULL COMMENT '年齡',
    `balance`  decimal(10, 2)                                                NULL DEFAULT NULL COMMENT '餘額',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 4
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = DYNAMIC;

INSERT INTO `account` VALUES (1, 'zhangsan', 18, 10000.00),
                             (2, 'lisi', 20, 10000.00),
                             (3, 'wangwu', 16, 10000.00);

CREATE TABLE `book`
(
    `id`       int(0)                                                        NOT NULL AUTO_INCREMENT COMMENT '書id',
    `bookName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '書名',
    `stock`      int(0)                                                        NULL DEFAULT NULL COMMENT '庫存',
    `price`  decimal(10, 2)                                                NULL DEFAULT NULL COMMENT '價格',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 4
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = DYNAMIC;

INSERT INTO `book` VALUES (1, '劍指Java', 100, 100.00),
                          (2, '劍指大數據', 100, 100.00),
                          (3, '劍指Offer', 100, 100.00);

DESC book;