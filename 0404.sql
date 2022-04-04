-- 61p 예제7 
SELECT TRIM(LEADING 'A' FROM 'AABDCADD') 결과1, -- 문자열의 결과물에서 왼쪽에 있는 A를 제거
    TRIM('A' FROM 'AABDCADD') 결과2, -- 문자열의 결과물에서 양쪽에 있는 A를 제거
    TRIM(TRAILING 'D' FROM 'AABDCADD') 결과3 from DUAL; -- 문자열의 결과물에서 오른쪽에 있는 D를 제거
-- BDCADD	BDCADD	AABDCA



SELECT empno, ename, 
    TRANSLATE(ename,'ABCDEFGHIFKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz') u_lower 
    from emp where deptno = 10;
-- 대문자를 소문자로 변경

SELECT empno, ename, LOWER(ename) u_lower from emp where deptno=10; --결과동일


-- 63p 예제1 ~ 예제5
SELECT ROUND(4567.678) 결과1,
    ROUND(4567.678,0) 결과2,
    ROUND(4567.678,2) 결과3,
    ROUND(4567.678,-2) 결과4
    from dual; --반올림 결과 출력
-- 4568	4568	4567.68	4600

SELECT TRUNC(4567.678) 결과1,
    TRUNC(4567.678,0) 결과2,
    TRUNC(4567.678,2) 결과3,
    TRUNC(4567.678,-2) 결과4
    from dual; --버림 결과 출력
-- 4567	4567	4567.67	4500

SELECT POWER(2,10) 결과1, --2의 10승
    CEIL (3.7) 결과2,     -- 소수점 이하 첫째 자리 올림
    FLOOR(3.7) 결과3 from dual; -- 소수점 이하 첫째 자리 내림
-- 1024	4	3

SELECT sal, mod(sal,30) from emp where deptno = 10;
-- sal을 30으로 나눈 나머지 출력

SELECT ename, sal, sign(sal-2975) from emp where deptno = 20;
-- 2975보다 작으면 -1. 같으면 0. 크면 1 출력



-- 65p 이론+예제1 ~ 예제3
SELECT sysdate from dual; --현재 날짜 출력 22/04/04
SELECT systimestamp from dual; --현재 날짜와 시간 출력 22/04/04 10:00:42.931000000 +09:00

SELECT value from nls_session_parameters where parameter='NLS_DATE_FORMAT'; --ORACLE 날짜형식 조회 (RR/MM/DD)

SELECT ename, hiredate, hiredate+3, hiredate+5/24 from emp where deptno = 30;

ALTER SESSION SET NLS_DATE_FORMAT='YYYY-MM-DD HH24:MI:SS.'; --ORACLE 날짜 형식 변경
SELECT value from nls_session_parameters where parameter='NLS_DATE_FORMAT'; --YYYY-MM-DD HH24:MI:SS.
ALTER SESSION SET NLS_DATE_FORMAT='YY/MM/DD'; --ORACLE 날짜 형식 변경

SELECT ename,hiredate,sysdate,sysdate-hiredate "TOTAL DAYS", 
    TRUNC((sysdate-hiredate)/7,0) Weeks, 
    ROUND(mod((sysdate-hiredate),7),0) Days 
    from emp order by sysdate-hiredate desc;


SELECT EXTRACT(day from sysdate) 일자, 
    EXTRACT(month from sysdate) 월, 
    extract(year from sysdate) 년도 
    from dual; --datetime 필드값 추출
