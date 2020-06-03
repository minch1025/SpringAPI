<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dashboard</title>
</head>
<body>
<p>dashboard 입니다.</p>
${list[0].id}
<c:foreach var="test" items="list">
${test.id}

</c:foreach>
</body>
</html>