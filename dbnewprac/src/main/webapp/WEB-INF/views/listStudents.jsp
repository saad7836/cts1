<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${liststud }
 <table border="5px">
	   <tr>
	      <th>EID:</th>
	      <th>NAME:</th>
	      <th>AGE:</th>
	   </tr>
	   <c:forEach var="t" items="${liststud}">
	   <tr>
	     <td>${t.emp_id}</td>
	     <td>${t.name}</td>
	     <td>${t.age}</td>
	   </tr>
	   </c:forEach>
	</table>
</body>
</html>
