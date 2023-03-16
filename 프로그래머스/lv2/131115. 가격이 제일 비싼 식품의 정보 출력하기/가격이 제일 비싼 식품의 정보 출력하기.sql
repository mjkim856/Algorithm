-- 코드를 입력하세요
-- max(price)를 사용해서 가장 큰 값을 조회한다.
SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, price
from FOOD_PRODUCT
order by price desc
limit 0, 1;