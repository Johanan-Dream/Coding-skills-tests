-- 코드를 작성해주세요
-- 월별 잡은 물고기의 수와 월을 출력하는 SQL문을 작성해주세요.
-- 잡은 물고기 수 컬럼명은 FISH_COUNT, 월 컬럼명은 MONTH로 해주세요.
-- 결과는 월을 기준으로 오름차순 정렬해주세요.
-- 단, 월은 숫자형태 (1~12) 로 출력하며 9 이하의 숫자는 두 자리로 출력하지 않습니다. 잡은 물고기가 없는 월은 출력하지 않습니다.
SELECT 
COUNT(ID) AS FISH_COUNT,
MONTH(TIME) AS MONTH
FROM 
FISH_INFO
GROUP BY MONTH(TIME)
ORDER BY MONTH ASC

-- MONTH 함수를 사용하지 않는 쿼리문을 작성해봄
SELECT 
COUNT(ID) AS FISH_COUNT,
CASE WHEN
SUBSTRING(TIME, 6, 1) = '0' THEN SUBSTRING(TIME, 7, 1)
ELSE SUBSTRING(TIME, 6, 2)
END AS MONTH
FROM 
FISH_INFO
GROUP BY MONTH
ORDER BY MONTH DESC -- 정렬 안되는 문제 발생 

-- 해결
-- MONTH가 문자여서 정렬이 제대로 실행되지 않았음 
-- CAST를 사용하여 SURSTRING 결과값을 정수로 변환하여 정렬함
SELECT 
COUNT(ID) AS FISH_COUNT,
CASE WHEN
SUBSTRING(TIME, 6, 1) = '0' THEN CAST(SUBSTRING(TIME, 7, 1) AS UNSIGNED)
ELSE CAST(SUBSTRING(TIME, 6, 2) AS UNSIGNED)
END AS MONTH
FROM 
FISH_INFO
GROUP BY MONTH
ORDER BY MONTH ASC
