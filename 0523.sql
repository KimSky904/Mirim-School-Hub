DROP TABLE EMP;
DROP TABLE DEPT;
DROP TABLE LOCATIONS;
DROP TABLE SALGRADE;

CREATE TABLE DEPT(
    DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,
	DNAME VARCHAR2(14) ,
	LOC_CODE VARCHAR2(2) 
);
CREATE TABLE EMP(
    EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,
	ENAME VARCHAR2(10),
	JOB VARCHAR2(9),
	MGR NUMBER(4),
	HIREDATE DATE,
	SAL NUMBER(7,2),
	COMM NUMBER(7,2),
	DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT
);

CREATE TABLE SALGRADE( 
    GRADE NUMBER,
	LOSAL NUMBER,
	HISAL NUMBER 
);
CREATE TABLE LOCATIONS (
     LOC_CODE  CHAR(2) ,
     CITY      VARCHAR2(12)
) ;

-- DEPT테이블에 데이터 삽입
INSERT INTO DEPT VALUES(10,'ACCOUNTING','A1');
INSERT INTO DEPT VALUES(20,'RESEARCH','B1');
INSERT INTO DEPT VALUES(30,'SALES','C1');
INSERT INTO DEPT VALUES(40,'OPERATIONS','A1');
INSERT INTO DEPT VALUES(50,'INSA',NULL);

-- EMP테이블에 데이터 삽입
INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,to_date('20-2-1981','dd-mm-yyyy'),1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,to_date('22-2-1981','dd-mm-yyyy'),1250,500,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,to_date('28-9-1981','dd-mm-yyyy'),1250,1400,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,to_date('1-5-1981','dd-mm-yyyy'),2850,NULL,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,to_date('09-12-1982','dd-mm-yyyy'),3000,NULL,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,to_date('8-9-1981','dd-mm-yyyy'),1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,to_date('12-1-1983','dd-mm-yyyy'),1100,NULL,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,to_date('3-12-1981','dd-mm-yyyy'),950,NULL,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);

-- SALGRADE테이블에 데이터 삽입
INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);

-- LOCATIONS 테이블에 데이터 삽입
INSERT INTO LOCATIONS VALUES ('A1','SEOUL');
INSERT INTO LOCATIONS VALUES ('B1','DALLAS');
INSERT INTO LOCATIONS VALUES ('C1','CHICAGO');
INSERT INTO LOCATIONS VALUES ('D1','BOSTON');
commit;



-- locations의 행의 수 x emp x dept
select * from locations, emp, dept;

-- 카티시안 곱
select e.empno,e.ename, e.deptno, d.deptno, d.dname from  emp e, dept d;

-- eq(equal) join
select e.empno,e.ename, e.deptno, d.dname from  emp e, dept d
    where e.deptno = d.deptno order by d.deptno;
    
-- 예제 2    
select e.empno,e.ename, e.deptno, e.job, d.dname, d.loc_code from  emp e, dept d
    where e.deptno = d.deptno AND e.job = 'SALESMAN' order by d.deptno;    

-- 예제 3
select e.ename, d.dname, e.deptno, d.deptno, d.loc_code, c.loc_code, e.sal, c.city from  emp e, dept d, locations c
    where e.deptno = d.deptno AND d.loc_code = c.loc_code;

-- 예제 4
select e.ename, d.dname, e.deptno, d.deptno, d.loc_code, c.loc_code, e.sal, c.city from  emp e, dept d, locations c
    where e.deptno = d.deptno 
    AND d.loc_code = c.loc_code
    AND e.sal > 1500
    AND c.city = 'DALLAS';
    
    
-- non eq(not equal) join
select e.empno, e.ename, e.job, e.sal, s.grade, s.losal, s.hisal from  emp e, salgrade s
    where e.sal >= s.losal and e.sal <= s.hisal;

select e.empno, e.ename, e.job, e.sal, s.grade, s.losal, s.hisal from  emp e, salgrade s
    where e.sal between s.losal and s.hisal;    
    
-- outer join
select e.empno, e.ename, e.job, e.deptno, d.deptno, d.dname from dept d, emp e
    where d.deptno= e.deptno(+); --dept : 기준 테이블, emp : 데이터가 부족한 테이블(+)
    
-- 예제 2
select d.deptno, d.dname, l.city
    from dept d, locations l
    where d.loc_code = l.loc_code(+); --dept : 기준 테이블, locations : 데이터가 부족한 테이블(+)
