-- 코드를 입력하세요
SELECT USER_ID,	PRODUCT_ID
from ONLINE_SALE 
group by USER_ID, PRODUCT_ID
having count(USER_ID) > 1
order by user_id asc, PRODUCT_ID desc;