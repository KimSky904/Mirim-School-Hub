-- 65p 예제1 ~ 
SELECT sysdate from dual; --sysdate : oracle에서 제공하는 현재 날짜를 나타내는 컬럼
SELECT ename, hiredate, hiredate+3, hiredate+5/24 from emp where deptno = 30; 
--현재날짜에 3을 더한 결과를 날짜로 출력
--24로 나누면 시간이 더해진다. (1일이 24시간이기 때문)

SELECT ename, hiredate, sysdate, sysdate-hiredate "Total Days", 
    trunc((sysdate-hiredate)/7,0) Weeks, 
    round(mod((sysdate-hiredate),7),0) DAYS 
    from emp ORDER BY sysdate-hiredate desc;

SELECT extract(day from sysdate) 일자, --현재 날짜에서 일을 출력
    extract(month from sysdate) 월,    --현재 날짜에서 월을 출력
    extract(year from sysdate) 년도 from dual;  --현재 날짜에서 년도를 출력
    
SELECT SYSTIMESTAMP A,  --경도 0도의 그리니치 천문대를 기준으로 한 시각의 차이 (대한민국은 +9)
    EXTRACT(HOUR FROM SYSTIMESTAMP) B, --현재시간 -9(대한민국 기준)
    TO_CHAR(SYSTIMESTAMP,'HH24') C  --24시간 기준의 현재시간
    FROM dual;

SELECT SYSTIMESTAMP A,  
    TO_CHAR(SYSTIMESTAMP,'HH24') CH,  --24시간 기준의 현재시간
    EXTRACT(TIMEZONE_HOUR FROM SYSTIMESTAMP) etzh, --대한민국의 타임존은 9이다.
    EXTRACT(HOUR FROM SYSTIMESTAMP) eh, --현재 시간에서 대한민국의 타임존 9를 뺀 결과
    EXTRACT(HOUR FROM CAST(SYSTIMESTAMP AS TIMESTAMP)) ehc --SYSTIMESTAMP를 TIMESTAMP로 형변환하여 출력하면 현재 시간이 출력된다.
    FROM dual;


SELECT ename, hiredate, EXTRACT(YEAR FROM hiredate) "year",
    EXTRACT(DAY FROM hiredate) "day"
    from emp where deptno = 20;

-- 69p 예제1 ~
SELECT ename, hiredate, sysdate, 
    months_between(sysdate,hiredate) m_between, --현재 입사날짜 사이 개월 수
    trunc(months_between(sysdate,hiredate),0) t_between --현재 입사날짜 사이 개월 수를 소수점 이하 버림
    from emp where deptno = 10 
    order by months_between(sysdate,hiredate) desc;
    
SELECT ename, hiredate, 
    add_months(hiredate,5) a_month from emp --입사날짜에서 5개월을 더한 결과 반환
    where deptno in (10,30)  --주소번호가 10또는30인 사원
    order by hiredate desc; 

SELECT ename, hiredate, next_day(hiredate,6) n_6, --입사일자 이후의 금요일에 해당하는 날짜 출력
    next_day(hiredate,7) n_7 from emp -- ~ 토요일
    where deptno = 10
    order by hiredate desc;
    
SELECT empno, ename, hiredate, last_day(hiredate) l_last, --입사한 달의 마지막 날짜 출력
    last_day(hiredate) - hiredate l_day --입사한 달의 근무일 수
    from emp order by last_day(hiredate)-hiredate desc; 
    
    
SELECT to_char(sysdate,'YY/MM/DD HH24:MI:SS') normal, --오늘 날짜를 해당 형식으로 변환
    to_char(trunc(sysdate),'YY/MM/DD HH24:MI:SS') trunc, --시간 부분을 0으ㅗ 초기화
    to_char(round(sysdate),'YY/MM/DD HH24:MI:SS') round --오느 나짜의 시간 부분으 반오ㅣㅁ(12시 이상이면 1이씩 증가)
    from dual;
    
    
SELECT hiredate, ROUND(hiredate,'MONTH'), --입사이자의 이자가 15이상이면 반오ㅣㅁ 되고
    --입사이자의 워이 6워 이상이면 그 다음 연도 1워 1이이 추ㅕㄱ
    ROUND(hiredate,'YEAR') 
    from emp;    
    
SELECT hiredate, 
    TRUNC(hiredate,'MONTH'), --워으 기준으ㅗ 이(나)으 1ㅗ 변경
    TRUNC(hiredate,'YEAR')  --연도ㅡ 기준으ㅗ 워,이으 1워 1이ㅗ 변경
    from EMP WHERE deptno = 20;
    
    
    --> 시험범위
