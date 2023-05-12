-- 코드를 입력하세요
-- 틀린 답안 : max(price)를 사용해서 가장 큰 값을 조회한다.
--          : max(price)를 사용해 가장 높은 가격을 조회할 수는 있으나, 그에 매칭되는 다른 값이 아닌 맨 위의 값이 조회된다.
--          : max(price)를 사용하고 싶다면 where절에서 서브쿼리를 사용하자.
--          : 그게 아니라면 정렬과 limit를 사용해 맨 위의 것 하나만 가져오자.
SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
from FOOD_PRODUCT
order by PRICE desc
limit 1;

# SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
# from FOOD_PRODUCT
# where price = (select max(price) from FOOD_PRODUCT);