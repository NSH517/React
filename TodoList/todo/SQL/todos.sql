-- Active: 1767840807398@@127.0.0.1@3306@aloha
CREATE TABLE `todos` (
    `no` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT 'PK',
    `id` VARCHAR(64) NOT NULL COMMENT 'UK',
    `name` TEXT NOT NULL COMMENT '할일',
    `status` BOOLEAN NOT NULL DEFAULT false COMMENT '상태',
    `seq` INT NOT NULL DEFAULT 0 COMMENT '순서',
    `created_at` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '등록일자',
    `updated_at` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일자'
);

-- 샘플 데이터

TRUNCATE todos;

INSERT INTO `todos` ( id, name, status )
VALUES 
( UUID(), '할 일 샘플 데이터', true),
( UUID(), '할 일 샘플 데이터', false),
( UUID(), '할 일 샘플 데이터', false),
( UUID(), '할 일 샘플 데이터', false),
( UUID(), '할 일 샘플 데이터', true)
;

-- 샘플 데이터  100건
INSERT INTO todos ( id, name, status )
SELECT
    UUID(),
    CONCAT('할 일 샘플 데이터', T.num),
    IF(t.num % 2 = 0, true, false)
FROM (
    SELECT @row := @row + 1 AS num
    FROM information_schema.tables, (SELECT @row := 0) r
    LIMIT 100
) t; 

SELECT * FROM todos;