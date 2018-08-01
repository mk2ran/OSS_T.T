<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="overflow: center" >
		<a href="/board/list">
			<input type="button" value="게시판 목록" />
		</a>
	</div>
	<div style="overflow: auto; width: 100%; height: 1000px;">
		<table style="width: 100%" border="1">
			<thead>
				<tr bgcolor="#4C4639">
					<th style="width: 40px; text-align: center;"><font
						color="#FFFFFF">번호</font></th>
					<th style="width: 100px; text-align: center;"><font
						color="#FFFFFF">아이디</font></th>
					<th style="width: 100px; text-align: center;"><font
						color="#FFFFFF">이름</font></th>
				</tr>
				<c:if test="${ !empty listMember}">
					<c:forEach items="${ listMember }" var="member"
						varStatus="status">
						<tr>
							<td style="text-align: center; width: 35px;"><c:out
									value="${ status.count }" /></td>
							<td style="text-align: center; width: 100px;"><c:out
									value="${ member.id }" /></td>
							<td style="text-align: center; width: 100px;"><c:out
									value="${ member.name }" /></td>
						</tr>
					</c:forEach>
				</c:if>
			</thead>
		</table>
	</div>
</body>
</html>