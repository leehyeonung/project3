<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원탈퇴화면입니다.

<form action="/mem/delete?mem_num=${ses.mem_num}" method="post" >
<button type="submit">삭제</button>
</form>
</body>
</html>