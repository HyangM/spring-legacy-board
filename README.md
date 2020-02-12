# 스프링 Legacy 게시판 만들기

## 1. 개발 환경
* SpringLegacy
* MyBatis
* MySQL
* JSP
* JUnit

## 2. 테이블
```sql
CREATE TABLE user(
	bno int(11) auto_increment primary key,
    title varchar(100) not null,
    content text not null,
    writer varchar(45),
    regdate datetime DEFAULT CURRENT_TIMESTAMP,
    readcount int(11)
) engine=InnoDB default charset=utf8;
```
