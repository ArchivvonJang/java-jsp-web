CREATE TABLE m1board(
	no 		NUMBER PRIMARY KEY,
	title 	VARCHAR2(100) NOT NULL,
	name 	VARCHAR2(30) NOT NULL,
	password VARCHAR2(30) NOT NULL,
	content VARCHAR2(4000) NOT NULL,
	writeday DATE DEFAULT SYSDATE,
	readcount NUMBER DEFAULT 0
);

CREATE SEQUENCE m1board_seq	NOCACHE;

SELECT * FROM m1board;

DELETE FROM m1board WHERE no = 6;