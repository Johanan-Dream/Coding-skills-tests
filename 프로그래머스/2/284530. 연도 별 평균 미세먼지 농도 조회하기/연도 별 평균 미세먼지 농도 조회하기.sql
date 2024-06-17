-- 수원 지역의 연도 별 평균 미세먼지 오염도와 평균 초미세먼지 오염도
-- 컬럼명은 각각 PM10, PM2.5
-- 연도를 기준으로 오름차순
-- **ROUND (, x) 지정한 숫자까지 소숫점을 표시하고 그 다음 소수점을 반올림
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
