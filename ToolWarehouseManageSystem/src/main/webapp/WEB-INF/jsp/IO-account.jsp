<%--
  Created by IntelliJ IDEA.
  User: 李-元海
  Date: 2017/9/26
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>出入库台帐</title>
    <meta name="description" content="Restyling jQuery UI Widgets and Elements"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-fonts.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace.min.css" id="main-ace-style"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-fileupload.min.css"/>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-part2.min.css"/>
    <![endif]-->
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-ie.min.css"/>
    <![endif]-->
    <script src="${pageContext.request.contextPath}/js/ace-extra.min.js"></script>
    <!--[if lte IE 8]>
    <script src="${pageContext.request.contextPath}/js/html5shiv.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/respond.min.js"></script>
    <![endif]-->
</head>

<%--分页--%>
<script >
    function queryPage(pageNum){
        document.getElementById("pageNumId").value=pageNum;
        var f1=document.getElementById("searchAccount");
        f1.submit( );
    }
</script>

<body class="no-skin">
<%--包含顶部菜单栏--%>
<%@include file="top.jsp" %>

<div class="main-container" id="main-container">
    <%--包含左侧菜单栏--%>
    <%@include file="menu.jsp" %>
    <div class="main-content">
        <!-- #section:basics/content.breadcrumbs -->
        <div class="breadcrumbs" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="${pageContext.request.contextPath}/index">系统首页</a>
                </li>
                <li>
                    <a href="javascript:void(0)">出入库台帐</a>
                </li>
            </ul><!-- /.breadcrumb -->
        </div>

        <div class="page-content">
            <!-- /section:settings.box -->
            <div class="page-content-area">


                <div class="row" style="padding-top: 10px;">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->

                        <div class="row">
                            <div class="col-xs-12">
                                <form id="searchAccount" action="${pageContext.request.contextPath}/searchAccount" enctype="multipart/form-data" method="post">
                                    <input id="pageNumId" name="pageNum" type="hidden" value="1"/>
                                    <div class="table-header" style="font-size: x-large;">
                                        出入库台帐管理
                                    </div>
                                    <div style="padding-bottom: 10px;padding-top: 10px;text-align: center;display:block;">
                                        <label style="font-size: large;padding-bottom: 5px;padding-left: 20px;">查询出入库台帐：</label>
                                        <select name="conditions" style="height: 35px;margin-left: 10px;" required="">
                                            <option value="">请选择查询条件
                                            </option>
                                            <option value="tID" <c:if test="${conditions=='tID'}">selected="selected"</c:if>>按工装编号查询
                                            </option>
                                            <option value="tModel" <c:if test="${conditions=='tModel'}">selected="selected"</c:if>>按工装型号查询
                                            </option>
                                            <option value="borrowTime" <c:if test="${conditions=='borrowTime'}">selected="selected"</c:if>>按借取时间查询
                                            </option>
                                            <option value="returnTime" <c:if test="${conditions=='returnTime'}">selected="selected"</c:if>>按借取时间查询
                                            </option>
                                            <option value="pName" <c:if test="${conditions=='pName'}">selected="selected"</c:if>>按员工姓名查询
                                            </option>
                                        </select>
                                        <span class="input-icon">
                                            <input type="text"
                                                   placeholder="请输入关键字 ..."
                                                   class="nav-search-input"
                                                   name="keywords" value="${keywords}"
                                                   autocomplete="on"/>
                                            <i class="ace-icon fa fa-search nav-search-icon"></i>
                                            </span>
                                        <input type="submit" value="搜索"
                                               class="btn btn-sm btn-primary"
                                               id="searchUser"/>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <div class="fileupload fileupload-new"
                                             data-provides="fileupload"
                                             style="display: inline-block;">
                                             <span class="btn-file btn btn-primary" style="font-size: small;height: 35px;">
                                                 <span class="fileupload-new ">导入台帐信息</span>
                                                 <span class="fileupload-exists">更改文件</span>
                                                 <input type="file" name="file">
                                             </span>
                                            <span class="fileupload-preview"></span>
                                            <a href="#"
                                               class="close fileupload-exists"
                                               data-dismiss="fileupload"
                                               style="float: none">x</a>
                                            <input type="button" onclick="importAccount()"
                                                   class="btn btn-sm btn-primary"
                                                   value="确认上传">
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">

                                    <table id="sample-table-2"
                                           class="table table-striped table-bordered table-hover">
                                        <thead>
                                        <tr>
                                            <th class="center">
                                                <label class="position-relative">
                                                    <input id="checkall" type="checkbox" class="ace"/>
                                                    <span class="lbl"></span>
                                                </label>
                                                <a id="delChecked"  style="color: red;" onclick="return delChecked()">删除所选</a>
                                            </th>
                                            <th class="center">工装编号</th>
                                            <th class="center">工装名称</th>
                                            <th class="center">工装型号</th>
                                            <th class="center">版本号</th>
                                            <th class="center">借取班组</th>
                                            <th class="center">借取人</th>
                                            <th class="center">借取时间</th>
                                            <th class="center">归还时间</th>
                                            <th class="center">操作</th>
                                        </tr>
                                        </thead>

                                        <tbody class="center">
                                        <c:forEach var="account" items="${accounts}">
                                            <%--<input name="fileIDs" value="${userList.getId()}" type="hidden">--%>

                                            <tr>
                                                <td class="center" width="100px;">
                                                    <label class="position-relative">
                                                        <input name="ids" type="checkbox" class="ace" value="${account.getId()}"/>
                                                        <span class="lbl"></span>
                                                    </label>
                                                </td>
                                                <td>${account.getTid()}</td>
                                                <td>${account.getTname()}</td>
                                                <td>${account.getTmodel()}</td>
                                                <td>${account.getVersionnum()}</td>
                                                <td>${account.getTeam()}</td>
                                                <td>${account.getPname()}</td>
                                                <td>${account.getBorrowtime()}</td>
                                                <td>${account.getReturntime()}</td>
                                                <td>
                                                    <a href="${pageContext.request.contextPath}/deleteAccount?id=${account.getId()}" type="button" role="button" class="btn btn-xs btn-danger" onclick="return isDelete()">
                                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>

                                    <div class="modal-footer no-margin-top">
                                        <table><jsp:include page="page.jsp"></jsp:include></table>
                                    </div>

                                </div>


                            </div>
                        </div>

                        <!-- PAGE CONTENT ENDS -->
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content-area -->
        </div><!-- /.page-content -->
    </div><!-- /.main-content -->

</div>

<!-- basic scripts -->
<script src="${pageContext.request.contextPath}/js/typeahead.jquery.min.js"></script>
<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='${pageContext.request.contextPath}/js/jquery.min.js'>" + "<" + "/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='${pageContext.request.contextPath}/js/jquery1x.min.js'>" + "<" + "/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if ('ontouchstart' in document.documentElement) document.write("<script src='${pageContext.request.contextPath}/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->

<!-- ace scripts -->
<script src="${pageContext.request.contextPath}/js/ace-elements.min.js"></script>
<script src="${pageContext.request.contextPath}/js/ace.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-fileupload.js"></script>

<%--自定义JS--%>
<script>
    //提交到批量导入进行处理
    function importAccount(){
        var roleID = "${userInfo.getRoleid()}";
        if(roleID == 1){
            document.getElementById('searchAccount').action = "${pageContext.request.contextPath}/importAccounts";
            $("#searchAccount").submit();
        }else{
            alert("您的管理权限不够，请联系管理员！");
            return false;
        }

    }

    function isDelete() {
        var roleID = "${userInfo.getRoleid()}";
        if(roleID == 1){
            if(confirm("您确定要删除吗?")==true){
                return true;
            }else
                return false;
        }else{
            alert("您的管理权限不够，请联系管理员！");
            return false;
        }
    }

    //弹窗提示框
    function alertMsg() {
        if("${msg}".length>0){
            alert("${msg}");
        }
    }
    window.onload=alertMsg;

    //全选
    $("#checkall").click(function(){
        $("input[name='ids']").each(function(){
            if (this.checked) {
                this.checked = false;
            }
            else {
                this.checked = true;
            }
        });
    })

    //批量删除
    function delChecked(){
        var checkID = [];
        var roleID = "${userInfo.getRoleid()}";
        if(roleID == 1){
            $("input[name='ids']:checked").each(function(i){//把所有被选中的复选框的值存入数组
                checkID[i] =$(this).val();
            });

            if (checkID.length!=0){
                if (confirm("您确认要删除选中的内容吗？")==false)
                    return false;
                else
                    $.ajax({
                        url:'${pageContext.request.contextPath}/delCheckedAccount',
                        type:'post',
                        data:{
                            checkID:checkID.join(",")
                        },
                        success:function (data) {
                            if(data.success){
                                alert(data.msg);
                            }
                            window.location.href="${pageContext.request.contextPath}/searchAccount";
                        }
                    })
            }
            else{
                alert("请选择您要删除的内容!");
                return false;
            }
        }else{
            alert("您的管理权限不够，请联系管理员！");
            return false;
        }
    }

</script>
</body>
</html>
