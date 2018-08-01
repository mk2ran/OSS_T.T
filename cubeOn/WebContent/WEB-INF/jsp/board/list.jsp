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
						color="#FFFFFF">제목</font></th>
					<th style="width: 100px; text-align: center;"><font
						color="#FFFFFF">등록일</font></th>
					<th style="width: 100px; text-align: center;"><font
					color="#FFFFFF">상세보기</font></th>
					<th style="width: 100px; text-align: center;"><font
						color="#FFFFFF">삭제</font></th>
				</tr>
				<c:if test="${ !empty listBoard}">
					<c:forEach items="${ listBoard }" var="board"
						varStatus="status">
						<tr>
							<td style="text-align: center; width: 35px;"><c:out
									value="${ status.count }" /></td>
							<td style="text-align: center; width: 100px;"><c:out
									value="${ board.title }" /></td>
							<td style="text-align: center; width: 100px;"><c:out
									value="${ board.registration }" /></td>
							<td style="text-align: center;">
								<a href="<c:url value="/board/view/${board.boardNo}" /> ">
										<input type="button" value="상세보기" />
								</a>
							</td>
							<td style="text-align: center;">
								<a href="<c:url value="/board/remove/${board.boardNo}" /> ">
										<input type="button" value="삭제" />
								</a>
							</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${ empty listBoard}">
				<tr>
					<td colspan="4" style="text-align: center">
						<c:out value="게시물이 없습니다." />
					</td>
				</tr>
				</c:if>
			</thead>
		</table>
		<a href="/board/add">
			<input type="button" value="등록" />
		</a>
	</div>
</body>
</html>