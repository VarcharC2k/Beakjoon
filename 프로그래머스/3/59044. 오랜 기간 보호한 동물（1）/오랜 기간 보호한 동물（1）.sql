-- 코드를 입력하세요
SELECT AI.NAME, AI.DATETIME
FROM ANIMAL_INS AI 
WHERE NOT EXISTS (SELECT ANIMAL_ID FROM ANIMAL_OUTS AO WHERE AI.ANIMAL_ID = AO.ANIMAL_ID)
ORDER BY DATETIME ASC
LIMIT 3