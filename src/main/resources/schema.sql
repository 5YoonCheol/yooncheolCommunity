-- 스키마 생성 (선택 사항, 필요한 경우 사용)
CREATE SCHEMA IF NOT EXISTS YOONCHEOL_COMMUNITY;

-- 사용자 테이블 생성
CREATE TABLE IF NOT EXISTS YOONCHEOL_COMMUNITY.tb_user (
                                              user_no INT AUTO_INCREMENT PRIMARY KEY,
                                              user_id VARCHAR(10) NOT NULL UNIQUE,
                                              password VARCHAR(30) NOT NULL
);

-- 추가적인 테이블 생성 예시 (게시판 테이블 등)
/*CREATE TABLE IF NOT EXISTS YOONCHEOL_COMMUNITY.post (
                                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                              title VARCHAR(255) NOT NULL,
                                              content TEXT NOT NULL,
                                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);*/

-- 인덱스 생성 (선택 사항)
/*
CREATE INDEX IF NOT EXISTS idx_user_id ON YOONCHEOL_COMMUNITY.user(user_id);*/
