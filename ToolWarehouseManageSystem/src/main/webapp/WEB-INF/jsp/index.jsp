<%--
  Created by IntelliJ IDEA.
  User: 李-元海
  Date: 2017/9/22
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <title>工装管理系统首页</title>

    <meta name="description" content="This is page-header (.page-header &gt; h1)" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace.min.css" id="main-ace-style" />
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-part2.min.css" />
    <![endif]-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-skins.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-rtl.min.css" />
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-ie.min.css" />
    <![endif]-->
    <!--[if lte IE 8]>
    <script src="${pageContext.request.contextPath}/js/html5shiv.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="no-skin">
<%--包含顶部菜单栏--%>
<%@include file="top.jsp"%>

<div class="main-container" id="main-container">
    <%--包含左侧菜单栏--%>
    <%@include file="menu.jsp"%>
    <div class="main-content">
        <!-- #section:basics/content.breadcrumbs -->
        <div class="breadcrumbs" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="${pageContext.request.contextPath}/index">系统首页</a>
                </li>
            </ul><!-- /.breadcrumb -->
        </div>

        <div class="page-content">
            <!-- /section:settings.box -->
            <div class="page-content-area">

                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <div class="alert alert-block alert-info">
                            <button type="button" class="close" data-dismiss="alert">
                                <i class="ace-icon fa fa-times"></i>
                            </button>

                            <i class="ace-icon fa fa-check green"></i>

                            <strong class="green">Tips：</strong>
                            这是工装管理系统的系统首页！<br>
                        </div>
                        <div class="alert alert-block alert-info">
                            <button type="button" class="close" data-dismiss="alert">
                                <i class="ace-icon fa fa-times"></i>
                            </button>

                            <i class="ace-icon fa fa-check green"></i>

                            <strong class="green">各类数据表模板下载：</strong>
                            <br>
                            <br>
                            <c:url value="/downFile" var="downurl1">
                                <c:param name="filePath" value="E:/twms/formwork/用户信息表.xls"></c:param>
                            </c:url>
                            &nbsp;&nbsp;&nbsp;&nbsp;<a href="${downurl1}" >用户信息表</a>
                            <br>
                            <c:url value="/downFile" var="downurl2">
                                <c:param name="filePath" value="E:/twms/formwork/工装信息表.xls"></c:param>
                            </c:url>
                            &nbsp;&nbsp;&nbsp;&nbsp;<a href="${downurl2}" >工装信息表</a>
                            <br>
                            <c:url value="/downFile" var="downurl3">
                                <c:param name="filePath" value="E:/twms/formwork/仓库信息表.xls"></c:param>
                            </c:url>
                            &nbsp;&nbsp;&nbsp;&nbsp;<a href="${downurl3}" >仓库信息表</a>
                            <br>
                            <c:url value="/downFile" var="downurl4">
                                <c:param name="filePath" value="E:/twms/formwork/出入库台帐表.xls"></c:param>
                            </c:url>
                            &nbsp;&nbsp;&nbsp;&nbsp;<a href="${downurl4}" >出入库台帐表</a>

                        </div>
                        <!-- PAGE CONTENT ENDS -->
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content-area -->
        </div><!-- /.page-content -->
    </div><!-- /.main-content -->

</div>
<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='${pageContext.request.contextPath}/js/jquery.min.js'>"+"<"+"/script>");
</script>
<!-- <![endif]-->
<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='${pageContext.request.contextPath}/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if('ontouchstart' in document.documentElement) document.write("<script src='${pageContext.request.contextPath}/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<!--[if lte IE 8]>
<script src="${pageContext.request.contextPath}/js/excanvas.min.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath}/js/jquery-ui.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.ui.touch-punch.min.js"></script>
<script src="${pageContext.request.contextPath}/js/ace-elements.min.js"></script>
<script src="${pageContext.request.contextPath}/js/ace.min.js"></script>
</body>
</html>