<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<br/>
	<div class="container">
		<form action="update" method="POST">
		<input type="hidden" name="bno" value="${board.bno}"/>
			<div class="form-group">
				<label for="title">제목</label> 
				<input type="text" class="form-control" id="title" placeholder="Enter title" name="title" value="${board.title}">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea class="form-control" rows="5" name="content">${board.content}</textarea>
			</div>
			<div class="form-group">
				<label for="writer">작성자</label> 
				<input type="text" class="form-control" id="writer" placeholder="Enter writer" name="writer" value="${board.writer}"readonly="readonly">
			</div>
			<button type="submit" class="btn btn-primary">수정</button>
			<button type="reset" class="btn btn-warning">취소</button>
			<button type="button" class="btn btn-success" onclick="location.href='list'">목록보기</button>
			<input type="button" class="btn btn-danger"value="삭제" onclick="location.href='delete?bno=${board.bno}'">
		</form>
	</div>

</body>
</html>