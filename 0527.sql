-- 예제 2
select d.deptno, d.dname, l.city
    from dept d, locations l
    where d.loc_code = l.loc_code(+); --dept : 기준 테이블, locations : 데이터가 부족한 테이블(+)
    
    
-- 124p
-- 예제 3
select d.deptno, d.dname, l.city
    from dept d, locations l
    where d.loc_code(+) = l.loc_code; -- Right Outer Join
    
-- 예제 4
select d.deptno, d.dname, l.city
    from dept d, locations l
    where d.loc_code(+) = l.loc_code(+); -- 오라클에서는 Full Outer Join이 없기 때문에 오류 발생
    
-- 예제 5
select e.ename, e.sal, e.deptno, d.deptno, d.dname  
    from emp e, dept d 
    where e.deptno(+) = d.deptno and e.sal > 2000; -- and e.sal > 2000이 없을 경우 Right Outer Join이 되지만, 
    -- and e.sal > 2000을 붙인 경우 Outer Join이 되지 않는다. (논리적 오류 발생)
    
-- 예제 6
select e.ename, e.sal, e.deptno, d.deptno, d.dname  
    from emp e, dept d 
    where e.deptno(+) = d.deptno and e.sal(+) > 2000; -- 논리적 오류 해결 (outer join이 적용됨)
    
    
-- 127p    
-- 예제 1
select e.empno 사원번호, e.ename 사원이름, m.empno, m.ename from emp e, emp m where e.mgr = m.empno order by 1;

-- CrossJoin
select e.ename, d.dname from emp e CROSS JOIN dept d; --카타시안 곱 발생
-- CROSS JOIN 없이 실행해도 동일한 결과 출력
select * from emp;
select * from dept;



-- Natural Join
-- 예제 1
select e.ename, deptno, d.dname from emp e natural join dept d; 
-- 두 개의 테이블에서 공통으로 가지고 있는 컬럼은 deptno
-- natural join에서는 e.이나 d.처럼 테이블명을 작성하지 않고 공통컬럼을 select한다. (테이블 명을 붙일 경우 오류 발생)

-- 예제 2
select d.deptno, d.dname, loc_code, l.city from dept d NATURAL JOIN locations l where d.deptno in (10,30);
-- 공통 코드 : loc_code

-- 예제 3
select e.ename, e.sal, deptno, d.dname, l.city from emp e NATURAL JOIN dept d NATURAL JOIN locations l order by 1;



-- USING JOIN
-- 예제 1
select e.ename, deptno, d.dname from emp e join dept d using(deptno) order by e.ename desc; --공통된 컬럼 deptno를 명시해서 JOIN하겠다. (EQ조인)

-- 예제 2
select d.deptno, d.dname, loc_code, l.city from dept d JOIN locations l USING(loc_code) where d.deptno in (10,30); --공통된 컬럼을 명시하여 JOIN

-- 예제 3
select e.ename, d.dname, l.city from emp e join dept d using(deptno) join locations l using(loc_code);



-- ON JOIN
-- 예제 1
select e.ename 사원명, e.sal 사원급여, m.ename 매니저명, m.sal 매니저급여 from emp e join emp m on (e.mgr = m.empno);

-- 예제 2
select e.ename, e.sal, s.grade from emp e join salgrade s 
    on(e.sal between s.losal and s.hisal) order by e.sal desc;

-- 예제 3
select e.ename, d.dname, l.city from emp e join dept d on (e.deptno = d.deptno) JOIN locations l on (d.loc_code = l.loc_code)
    where e.ename not like '%A%';

-- OUTER JOIN
-- 예제 1
select d.dname, d.loc_code, l.loc_code, l.city from dept d left outer join locations l on (d.loc_code = l.loc_code);

-- 예제 2
select d.dname, d.loc_code, l.loc_code, l.city from dept d right outer join locations l on (d.loc_code = l.loc_code);

-- 예제 3
select d.dname, d.loc_code, l.loc_code, l.city from dept d full outer join locations l on(d.loc_code = l.loc_code);

-- 예제 4
select e.ename, e.sal, e.deptno, d.deptno, d.dname from emp e right outer join dept d on e.deptno = d.deptno and e.sal > 2000;
