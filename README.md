SNS고도화
* **개인프로젝트**

##### <div align = "center" logoColor="green"> "로그인/회원가입, 게시글 CRUD, 댓글, 좋아요, 알림, 권한 기능이 있는 토이 프로젝트" </div>


> * 배포주소 https://sns-project95.herokuapp.com
    
<br>

## ✏ 개요 설명
<div align="center">
 <img src="https://img.shields.io/badge/SpringBoot-6DB33F.svg?logo=Spring-Boot&logoColor=white" />
 <img src="https://img.shields.io/badge/SpringSecurity-6DB33F.svg?logo=Spring-Security&logoColor=white" />
 <img src="https://img.shields.io/badge/postgres-3776AB.svg?logo=postgres&logoColor=white" />
 <img src="https://img.shields.io/badge/heroku-2496ED.svg?logo=heroku&logoColor=white" />
 <img src="https://img.shields.io/badge/Redis-FF9900.svg?logo=Redis-EC2&logoColor=white" />
</div>

* **에디터** : Intellij Ultimate
* **개발 툴** : SpringBoot 2.6.5
* **자바** : JAVA 11
* **배포** : heroku
* **데이터베이스** : postgres
* **필수 라이브러리** : SpringBoot Web, MySQL, Spring Data JPA, Lombok, Spring Security

<br>

## 🎨 진행과정

-  회원가입과 로그인  
-  게시글 CRUD 구현
-  댓글 기능 구현
-  좋아요 기능 구현
-  게시글 CRUD, 알람, 좋아요, 댓글 테스트 코드
-  admin 권한 (Role 역할) 구현 및 ADMIN 권한 부여


<br>

## 🎯 ENDPOINT


|API 종류|HTTP|URI|API 설명|
|:-----:|:------------------:|:-----------------------------:|:-----------------------------:|
| `users` | POST | /api/v1/users/join | 회원가입기능 |
| `users` | POST | /api/v1/users/login | 로그인기능 |
| `posts` | POST | /api/v1/posts | 글작성기능 |
| `posts` | PUT | /api/v1/posts/{id} | 글수정기능 |
| `posts` | DELETE | /api/v1/posts/{id} | 글삭제기능 |
| `posts` | GET | /api/v1/posts/{id} | 글조회기능 |
| `posts` | GET | /api/v1/posts/my | 글전체조회 |
| `comment` | POST | /api/v1/posts/{id}/comment | 댓글작성기능 |
| `comment` | GET | /api/v1/posts/{id}/comment | 댓글조회기능 |
| `alarm` | GET | /api/v1/users/alarm | 알람 |
| `good` | POST | /api/v1/posts/{id}/likes | 좋아요+취소기능 |

<br>



## 🚀 ERD

![entityManagerFactory(EntityManagerFactoryBuilder)](https://github.com/Kim-Ji-Yeong/sns/assets/81270199/43737722-218b-4403-9e6c-abdbe9f4704d)
