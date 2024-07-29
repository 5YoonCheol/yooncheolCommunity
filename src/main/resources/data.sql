-- 사용자 데이터 삽입
INSERT INTO YOONCHEOL_COMMUNITY.TB_USER (user_id, password) VALUES ('testuser', 'password');
INSERT INTO YOONCHEOL_COMMUNITY.TB_USER (user_id, password) VALUES ('admin', '1234');

-- 샘플 데이터 삽입
INSERT INTO YOONCHEOL_COMMUNITY.TB_BOARD (TITLE, CONTENT, WRITER) VALUES
                                            ('첫 번째 게시글', '첫 번째 게시글 내용입니다.', '관리자'),
                                            ('두 번째 게시글', '두 번째 게시글 내용입니다.', '사용자1');