-- 수원 지역의 연도 별 평균 미세먼지 오염도와 평균 초미세먼지 오염도
-- 컬럼명은 각각 PM10, PM2.5
-- 연도를 기준으로 오름차순
-- 조회 결과는 맞는데 제출 후 채점하기 하면 틀리다고 나옴 --> 다시 확인하기
SELECT 
YEAR(YM) AS 'YEAR',
ROUND(AVG(PM_VAL1), 2) AS 'PM10',
ROUND(AVG(PM_VAL2), 2) AS 'PM2.5'
FROM 
AIR_POLLUTION 
WHERE
LOCATION2 = '수원'
GROUP BY YEAR
ORDER BY YEAR