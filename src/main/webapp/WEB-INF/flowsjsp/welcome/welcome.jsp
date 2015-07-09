<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Inscripcion Vehicular de Vehiculos de Mercancias</title>
    <style>
	.error {
	color: #ff0000;
	font-weight: bold;
	}
	</style>

</head>
<body>
<div class="logo-header">
			<a href="http://localhost:8080/projvehimerc/spring/index"
				class="logolink" tabindex="1">Oracle</a>
		</div>
<img src="${pageContext.request.contextPath}/resources/img/alerta-gif1.gif" alt="anotherimage" />
		
<h2>Welcome to Court Reservation System</h2>
Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />.
${pageContext.request.userPrincipal.name}
${user.username}
${message} 
<c:choose>
<c:when test="${empty user}">
<table>
<tr>
  <td>Jill</td>
  <td>Smith</td> 
</tr>
<tr>
  <td>${user.username}</td>
  <td>${user.enabled}</td>
  <td>${pageContext.request.userPrincipal.name}</td>
</tr>

</table>
</c:when>
<c:otherwise>
        var1 is NOT empty or null.
    </c:otherwise>
</c:choose>

</body>
</html>