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
	<form id="form" action="/board/add" method="post"	style="padding-top: 3%; padding-bottom: 3%;">
					
		<table style="margin-left:15%;" >
			<thead>
					<tr>
	                 <th style="width: 100px; text-align: center; background-color:#4C4639">
	                 	<font color="#FFFFFF">제목</font>
	                 </th>
	                 <td>
	                 	<input type="text" name="title"/>
	                 </td>
	             </tr>
	              <tr>
	                   <th style="width: 100px; text-align: center; background-color:#4C4639">
	                  	<font color="#FFFFFF">내용</font>
	                  </th>
	                  <td>
	                     <textarea name="content" ></textarea>
	                  </td>
	              </tr>
			</thead>
		</table>
	
		<input type="submit" value="등록"  />
		
	</form>
</body>
</html>