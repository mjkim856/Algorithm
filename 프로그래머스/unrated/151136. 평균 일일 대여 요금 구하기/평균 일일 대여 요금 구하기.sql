-- 코드를 입력하세요
-- 조건 : CAR_TYPE이 SUV인 자동차의 평균 일일 대여 요금 조회
--     : 소수 첫번째 자리에서 반올림, 컬럼명은 AVERAGE_FEE 
SELECT ROUND(AVG(DAILY_FEE))
from CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = 'SUV';