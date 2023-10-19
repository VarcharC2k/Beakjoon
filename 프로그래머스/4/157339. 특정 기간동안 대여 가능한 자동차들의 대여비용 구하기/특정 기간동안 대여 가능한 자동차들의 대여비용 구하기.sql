SELECT cr.CAR_ID, cr.CAR_TYPE, ROUND((cr.DAILY_FEE - (cr.DAILY_FEE * (cd.DISCOUNT_RATE / 100))) * 30,0) FEE
FROM CAR_RENTAL_COMPANY_CAR cr
INNER JOIN (
    SELECT CAR_ID, SUM(
        CASE WHEN START_DATE BETWEEN '2022-11-01' AND '2022-11-30'
        THEN 1
        WHEN END_DATE BETWEEN '2022-11-01' AND '2022-11-30'
        THEN 1
        WHEN '2022-11-01' BETWEEN START_DATE AND END_DATE
        THEN 1
        ELSE 0
        END 
        ) UseChk
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY ch
    GROUP BY CAR_ID
    HAVING UseChk = 0
    ) ch ON ch.CAR_ID = cr.CAR_ID
INNER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN cd ON cd.CAR_TYPE = cr.CAR_TYPE
    AND cd.DURATION_TYPE LIKE '30%'
WHERE ROUND((cr.DAILY_FEE - (cr.DAILY_FEE * (cd.DISCOUNT_RATE / 100))) * 30,0) BETWEEN 500000 AND 2000000
AND cr.CAR_TYPE IN ('세단','SUV')
ORDER BY FEE DESC, cr.CAR_TYPE ASC, CAR_ID DESC