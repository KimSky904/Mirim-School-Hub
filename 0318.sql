Microsoft Windows [Version 10.0.19043.1526]
(c) Microsoft Corporation. All rights reserved.

C:\Users\hn30709>sqlplus system/abc123

SQL*Plus: Release 11.2.0.2.0 Production on 금 3월 18 13:27:35 2022

Copyright (c) 1982, 2014, Oracle.  All rights reserved.


Connected to:
Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production

SQL> show user
USER is "SYSTEM"
SQL> conn dbtest
Enter password:
Connected.
SQL> show user
USER is "DBTEST"
SQL> select * from carTable;

        ID DATA
---------- ----------------------------------------
      1000 SM6
      2000 K7
      3000 GRANDEUR

SQL> RUN
  1* select * from carTable

        ID DATA
---------- ----------------------------------------
      1000 SM6
      2000 K7
      3000 GRANDEUR

SQL> LIST
  1* select * from carTable
SQL> conn hr
Enter password:
Connected.

SQL> SELECT first_name, last_name, email FROM employees;
-- 생략
107 rows selected.

SQL> CREATE user scott identified by tiger;
User created.

SQL> grant connect, resource to scott;
Grant succeeded.

SQL> commit; 
Commit complete. --계정 생성 완료



SQL> EXEc DBMS_XDB.SETLISTENERLOCALACCESS(FALSE); --원격 접속 풀어줌
PL/SQL procedure successfully completed.
