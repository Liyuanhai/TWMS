<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'page.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>

	<c:if test="${pageInfo.total >0}">
	当前${pageInfo.pageNum}/${pageInfo.pages}页&nbsp;&nbsp;&nbsp;
	<c:choose>
			<c:when test="${pageInfo.pageNum == 1 && pageInfo.total >10}">首页&nbsp;上一页&nbsp;<a
					href="javascript:queryPage('${pageInfo.pageNum+1 }')">下一页</a>&nbsp;<a
					href="javascript:queryPage('${pageInfo.pages}')">末页</a>
			</c:when>
			<c:when
				test="${pageInfo.total <= 10  && pageInfo.pages>0 }">首页&nbsp;上一页&nbsp;下一页&nbsp;末页
   		</c:when>
			<c:when
				test="${pageInfo.pageNum ==pageInfo.pages  && pageInfo.pages>0 }">
				<a href="javascript:queryPage('1')">首页</a>&nbsp;<a
					href="javascript:queryPage('${pageInfo.pageNum-1 }')">上一页</a>&nbsp;下一页&nbsp;末页
   		</c:when>
			<c:otherwise>
				<a href="javascript:queryPage('1')">首页</a>&nbsp;<a
					href="javascript:queryPage('${pageInfo.pageNum-1 }')">上一页</a>&nbsp;<a
					href="javascript:queryPage('${pageInfo.pageNum+1 }')">下一页</a>&nbsp;<a
					href="javascript:queryPage('${pageInfo.pages}')">末页</a>
			</c:otherwise>
		</c:choose>
			 &nbsp;&nbsp;跳转到<select onchange="queryPage(this.value)"><c:forEach
				begin="1" end="${pageInfo.pages}" var="num">
				<option value="${num}"
					<c:if test="${pageInfo.pageNum == num}">selected</c:if>>${num}
			</c:forEach>
		</select>页
		&nbsp;&nbsp;每页${10}条/总记录${pageInfo.total}条
</c:if>
</body>
</html>
