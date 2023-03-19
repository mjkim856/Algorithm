-- 코드를 입력하세요
-- 조건 : 아이디, 이름, 날짜 조회 
-- 정렬 : 아이디 순

SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') AS '날짜'
FROM ANIMAL_INS;