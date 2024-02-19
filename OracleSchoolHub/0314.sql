Microsoft Windows [Version 10.0.19043.1526]
(c) Microsoft Corporation. All rights reserved.
C:\Users\hn30709>sqlplus system/abc123
SQL*Plus: Release 11.2.0.2.0 Production on 월 3월 14 09:36:16 2022
Copyright (c) 1982, 2014, Oracle.  All rights reserved.
Connected to:
Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production


--계정 생성 및 권한 부여
SQL> show user    --현재 접속된 계정 확인 
USER is "SYSTEM"
SQL> create user dbtest identified by dbgood;  --dbtest : 계정, dbgood : 접속 비밀번호
User created.

SQL> conn dbtest
Enter password:
ERROR:
ORA-01017: invalid username/password; logon denied

SQL> show user   --logon denied된 경우 user가 ""로 변경되는 버그(문제점) 존재함
USER is ""

--system계정 접속
SQL> conn system/abc123
Connected.
SQL> show user
USER is "SYSTEM"

--dbtest계정에 대한 권한 부여
SQL> grant connect, resource, dba to dbtest;
Grant succeeded.

--dbtest계정 접속
SQL> show user
USER is "SYSTEM"
SQL> conn dbtest
Enter password:
Connected.
SQL> show user
USER is "DBTEST"



--table 생성
SQL> CREATE TABLE carTable (id INT, data VARCHAR2(20)); --2개의 컬럼 생성 (varchar2 : 가변형 문자TYPE)
Table created.

--데이터 삽입
SQL> insert INTO carTable VALUES(1000,'SM6');
1 row created.

SQL> insert INTO carTable VALUES(2000,'K7');
1 row created.

SQL> insert INTO carTable VALUES(3000,'GRANDEUR');
1 row created.

--데이터 조회
SQL> SELECT * FROM carTable; --'*' : wild card, 테이블의 모든 컬럼값 선택
        ID DATA
---------- ----------------------------------------
      1000 SM6
      2000 K7
      3000 GRANDEUR


--sqlplus 지원 INDEX (암기 필요 X)
SQL> HELP INDEX
Enter Help [topic] for help.
 @             COPY         PAUSE                    SHUTDOWN
 @@            DEFINE       PRINT                    SPOOL
 /             DEL          PROMPT                   SQLPLUS
 ACCEPT        DESCRIBE     QUIT                     START
 APPEND        DISCONNECT   RECOVER                  STARTUP
 ARCHIVE LOG   EDIT         REMARK                   STORE
 ATTRIBUTE     EXECUTE      REPFOOTER                TIMING
 BREAK         EXIT         REPHEADER                TTITLE
 BTITLE        GET          RESERVED WORDS (SQL)     UNDEFINE
 CHANGE        HELP         RESERVED WORDS (PL/SQL)  VARIABLE
 CLEAR         HOST         RUN                      WHENEVER OSERROR
 COLUMN        INPUT        SAVE                     WHENEVER SQLERROR
 COMPUTE       LIST         SET                      XQUERY
 CONNECT       PASSWORD     SHOW


SQL> RUN
  1* select * from carTable
        ID DATA
---------- ----------------------------------------
      1000 SM6
      2000 K7
      3000 GRANDEUR

SQL> del
SQL> RUN
SP2-0103: Nothing in SQL buffer to run.



--hr계정의 구조 변경
SQL> conn sys as sysdba --관리자 계정으로 hr에 대한 권한 변경
Enter password:
Connected.
SQL> show user
USER is "SYS"

SQL> alter user hr account unlock; --lock 해제
User altered.

SQL> GRANT connect,resource to hr;
Grant succeeded.

SQL> commit;
Commit complete.

SQL> alter user hr identified by abc123;  --비밀번호 변경
User altered.

SQL> conn hr
Enter password:
Connected.


SQL> show user
USER is "HR"

SQL> select * from employees;

-- datas 

107 rows selected.

SQL>
