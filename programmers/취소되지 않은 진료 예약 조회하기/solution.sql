// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/132204#

-- 코드를 입력하세요
SELECT APNT_NO, PT_NAME, PA.PT_NO AS PT_NO,	AP.MCDP_CD AS MCDP_CD, DR_NAME, APNT_YMD
FROM APPOINTMENT AS AP JOIN DOCTOR AS DOC
ON AP.MDDR_ID = DOC.DR_ID
JOIN PATIENT AS PA
ON PA.PT_NO = AP.PT_NO
WHERE APNT_CNCL_YN = 'N'
AND DATE(APNT_YMD) = '2022-04-13'
ORDER BY APNT_YMD ASC