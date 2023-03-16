-- 코드를 입력하세요
-- max(price)를 사용해서 가장 큰 값을 조회한다.
# SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
# from FOOD_PRODUCT
# order by PRICE desc
# limit 0, 1;

SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
from FOOD_PRODUCT
where price = (select max(price) from FOOD_PRODUCT);