-- cmd
C:\Users\hn30709>sqlplus
Enter user-name: system
Enter password:

Connected to:
Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production

SQL> create user mirimtest identified by mirim123;
User created.

SQL> GRANT CONNECT, RESOURCE TO MIRIMTEST;
Grant succeeded.

-- sqlplus (서버계정접속)
create user mirimtemp identified by mirim1234;
GRANT CONNECT, RESOURCE TO MIRIMTEMP;
