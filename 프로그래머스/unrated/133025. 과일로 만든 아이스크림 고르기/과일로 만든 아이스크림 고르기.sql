-- 코드를 입력하세요

SELECT F.FLAVOR
from FIRST_HALF F, ICECREAM_INFO I
where F.FLAVOR = I.FLAVOR
and F.TOTAL_ORDER > 3000
and I.INGREDIENT_TYPE = 'fruit_based'
order by TOTAL_ORDER desc;