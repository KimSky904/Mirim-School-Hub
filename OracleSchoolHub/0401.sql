select empno, ename, job, deptno,sal, hiredate from emp order by 4; --4번째 컬럼 asc
select empno, ename, job, deptno,sal, hiredate from emp order by 4,5 desc; --4번째 컬럼은 asc, 5번째 컬럼은 desc
select empno, ename,sal, sal*12 ANN_SAL from emp order by ANN_SAL; --별명이 ANN_SAL인 컬럼 정렬
select DISTINCT deptno, job from emp order by job; --부서별로 정렬


--DISTONCT를 사용할 경우 select문에 있는 컬럼만 사용할 수 있음
select DISTINCT job, sal+comm from emp order by sal; --select문에 sal이 없으므로 오류 발생
select DISTINCT empno, ename from emp order by sal; 

select empno, ename from emp order by sal; --DISTINCT를 사용하지 않으면 emp테이블의 모든 컬럼을 정렬기준으로 사용할 수 있음

select DISTINCT job, sal+comm from emp order by 2;



-- 함수(54p ~)
select empno, ename, job, LOWER(job), INITCAP(job) from emp where deptno = 10;
select empno, ename, job, CONCAT(empno,ename) ename1, CONCAT(ename,empno) e_empno, CONCAT(ename,job) e_job from emp;
-- CONCAT(ename,job)은 ename과 job을 연결해서 하나의 컬럼을 생성한다.

select empno, ename,job,sal,deptno from emp 
where SUBSTR(ename,1,1)>'K' AND SUBSTR(ename,1,1)<'Y' ORDER BY ename; -- ename 앞에서 첫번째 문자 1개를 반환
   

select empno, ename,length(ename),sal,length(sal) from emp where deptno = 20;


-- INSTR
select ename, instr(ename,'L') e_null, 
    instr(ename,'L',1,1)e_11,  --문자열 데이터에서 1번째 값에서 L을 검색하여 첫 L이 나오는 위치를 반환
    instr(ename,'L',1,2) e_12, 
    instr(ename,'L',4,1) e_41 --문자열 데이터에서 4번째 값에서 L을 검색하여 첫 L이 나오는 위치를 반환
    from emp order by ename;


-- ORACLE에서는 한글 한 글자가 3byte이다.
select parameter,value from nls_database_parameters where parameter = 'NLS_CHARACTERSET';

-- SUBSTRB
select SUBSTRB('I am here with you',5,3) 결과1, -- 문자열의 5번째 위치부터 3byte 출력
    SUBSTR('나 여기 있어',5,3) 결과2,  -- SUBSTR 사용하여 '여기' 출력
    SUBSTRB('나 여기 있어',5,3) 결과3, -- 한글이 3byte를 차지하므로 '여'만 출력
    SUBSTRB('나 여기 있어',5,4) 결과4, -- '여'
    SUBSTRB('나 여기 있어',5,5) 결과5, -- '여'
    SUBSTRB('나 여기 있어',5,6) 결과6  --'여기' (6byte)
    from dual; 
-- dual : ORACLE에서 제공하는 가상테이블
-- 영문자는 한 글자가 1byte이기 때문에 SUBSTR을 사용해도 문제없음 (공백도 1byte)

select ename,SUBSTR(ename,1,3), --ename문자열 데이터에서 첫번째 위치부터 3개의 문자열 반환
    substr(ename,3), --3번째부터 끝까지 출력
    substr(ename,-3,2) from emp; --오른쪽을 기준으로 하여 3번째 위치부터 2개의 문자열 반환
-- SMITH	SMI	ITH	IT
-- ALLEN	ALL	LEN	LE



-- 59p
select ename, LpAD(ename,15,'*'), sal, lpad(sal,10,'$') from emp where deptno = 10;
-- **********CLARK	2450	$$$$$$2450
select ename, Rpad(ename,15,'*'), sal, Rpad(sal,10,'$') from emp where deptno = 10;
-- CLARK**********	2450	2450$$$$$$


-- RTRIM / LTRIM
select ename, job, LTRIM(job,'A'), sal, LTRIM(sal,1) from emp where deptno = 20;
-- job 가장 왼쪽에 'A'문자가 있으면 삭제, 급여 데이터 가장 왼쪽에 숫자 1이 있으면 삭제-연속해서 있을 경우에도 계속해서 삭제된다. (1125 -> 25)
select ename, job, RTRIM(job,'T'), sal, RTRIM(sal,0) from emp where deptno = 20;
-- job 가장 오른쪽에 'T'문자가 있으면 삭제, 급여 데이터 가장 오른쪽에 숫자 0이 있으면 삭제-연속해서 있을 경우에도 계속해서 삭제된다. (14200 -> 142)

-- REPLACE
select ename, REPLACE(ename,'SC','*?') 변경결과 from emp where deptno = 20;
-- ename데이터중 'SC'문자열이 포함되어있으면 '*?'으로 변경하여 반환

-- TRANSLATE
select TRANSLATE(ename,'SC','*?') 변경결과 from emp where deptno = 20; --S가 들어간것은 *로, C는 ?로 변경

-- REPLACE vs TRANSLATE
-- REPLACE는 문자열 전체 비교 후 모두 같은 경우에만 변경 ('ABC' -> 'ACC'에는 변경 X)
-- TRANSLATE는 문자열 데이터를 각 글자와 변경 ('ABC' -> 'A'(1)와 'C'(3)에서 변경)
