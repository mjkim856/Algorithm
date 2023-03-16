-- 코드를 입력하세요
-- 조건 : 2022년 10월 작성된 게시글 (댓글까지인가 ... ? )
-- 정렬: 댓글 작성일(USED_GOODS_REPLY - CREATED_DATE) 기준 오름차순, 댓글 작성일 같다면 제목(USED_GOODS_BOARD - TITLE) 기준 오름차순
-- 조건과 BETWEEN ON 에서 헷갈렸던 문제.
-- 1. BETWEEN ON에서 '' 빠트리지 말기
-- 2. %Y = 2022, %m = 01, %d = 01, %e = 1(날짜), %H(24시), %h(12시), %I = 01(12시), %l = 1(12시), %p = AM, PM
--    %S %s = 초, %T = hh:mm:ss, %i = 분
--    %H:%i:%s ==> 23:41:54
--    %Y-%m-%d %T ==> 2021-03-30 12:00:00
-- 3. 문제 조건이 헷갈림. 그래서 날짜 기준은 게시글인가 댓글인가? 에 대한 의문. 정렬 기준도, 조회하는 것도 댓글이라 댓글로 상정하고 풀었는데 알고 보니 게시글 기준이었다. 

SELECT B.TITLE,	B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
from USED_GOODS_REPLY R JOIN USED_GOODS_BOARD B ON R.BOARD_ID = B.BOARD_ID
where B.CREATED_DATE BETWEEN '2022-10-01' AND '2022-10-31'
order bY R.CREATED_DATE, B.TITLE;
