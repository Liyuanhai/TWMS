<%@ page import="com.gree.twms.pojo.User" %><%--
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
    <title>用户管理</title>
    <meta name="description" content="Restyling jQuery UI Widgets and Elements"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <link rel="stylesheet" href="/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="/css/ace-fonts.css"/>
    <link rel="stylesheet" href="/css/ace.min.css" id="main-ace-style"/>
    <link rel="stylesheet" href="/css/bootstrap-fileupload.min.css"/>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="/css/ace-part2.min.css"/>
    <![endif]-->
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="/css/ace-ie.min.css"/>
    <![endif]-->
    <script src="/js/ace-extra.min.js"></script>
    <!--[if lte IE 8]>
    <script src="/js/html5shiv.min.js"></script>
    <script src="/js/respond.min.js"></script>

    <![endif]-->
</head>

<%--分页--%>
<script >
    function queryPage(pageNum){
    document.getElementById("pageNumId").value=pageNum;
    var f1=document.getElementById("searchUser");
    f1.submit( );
    }
</script>

<body class="no-skin">
<%
    int ID=0;
%>
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
                    <a href="/twms/index">系统首页</a>
                </li>
                <li>
                    <a href="javascript:void(0)">用户管理</a>
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
                                <form id="searchUser" action="/twms/searchUser" method="post">
                                    <input id="pageNumId" name="pageNum" type="hidden" value="1"/>
                                    <div class="table-header" style="font-size: x-large;">
                                        用户信息管理
                                    </div>
                                    <div style="padding-bottom: 10px;padding-top: 10px;text-align: center">
                                        <label style="font-size: large;padding-bottom: 5px;padding-left: 20px;">查询用户：</label>
                                        <select name="conditions" style="height: 35px;margin-left: 10px;">
                                            <option value="pName">请选择查询条件
                                            </option>
                                            <option value="pName" <%=request.getAttribute("conditions").equals("pName")?"selected":""%>>按姓名查找
                                            </option>
                                            <option value="pID" <%=request.getAttribute("conditions").equals("pID")?"selected":""%>>按员工编号查找
                                            </option>
                                        </select>
                                        <span class="input-icon">
                                                                <input type="text" placeholder="请输入关键字 ..." required=""
                                                                       class="nav-search-input" value="${keywords}" name="keywords"
                                                                       autocomplete="off"/>
                                                                <i class="ace-icon fa fa-search nav-search-icon"></i>
                                                                </span>
                                        <input type="submit" value="搜索" class="btn btn-sm btn-primary"/>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <%--弹窗按钮--%>
                                        <a href="#addUser" role="button" class="btn btn-sm btn-primary" data-toggle="modal">添加用户</a>
                                    </div>
                                </form>
                                <form id="userList" method="post" action="/twms/delChecked">
                                    <div class="table-responsive">
                                    <table id="sample-table-2" class="table table-striped table-bordered table-hover">
                                        <thead >
                                        <tr >
                                            <th class="center" width="100px;">
                                                <label class="position-relative">
                                                    <input id="checkall" type="checkbox" class="ace"/>
                                                    <span class="lbl"></span>
                                                    <a id="delChecked"  style="color: red;" onclick="return delChecked()">删除所选</a>
                                                </label>
                                            </th>
                                            <th class="center">编号</th>
                                            <th class="center">姓名</th>
                                            <th class="center">性别</th>
                                            <th class="center">班组</th>
                                            <th class="center">角色</th>
                                            <th class="center">密码</th>
                                            <th class="center">操作</th>
                                        </tr>
                                        </thead>

                                        <tbody class="center">
                                        <%--foreach循环显示用户列表--%>
                                        <c:forEach var="users" items="${users}">
                                            <%--<input name="fileIDs" value="${userList.getId()}" type="hidden">--%>

                                            <tr>
                                                <td class="center">
                                                    <label class="position-relative">
                                                        <input name="ids" type="checkbox" class="ace" value="${users.getPid()}"/>
                                                        <span class="lbl"></span>
                                                    </label>
                                                </td>
                                                <td>${users.getPid()}</td>
                                                <td>${users.getPname()}</td>
                                                <td>${users.getSex()}</td>
                                                <td>${users.getTeam()}</td>
                                                <td><c:choose>
                                                    <c:when test="${users.getRoleid()==1}">超级管理员</c:when>
                                                    <c:when test="${users.getRoleid()==2}">仓库管理员</c:when>
                                                    <c:when test="${users.getRoleid()==3}">普通员工</c:when>
                                                    <c:otherwise></c:otherwise>
                                                </c:choose></td>
                                                <td>${users.getPwd()}</td>
                                                <td>
                                                    <%--弹窗按钮--%>
                                                    <a href="#editUser<%=++ID%>" role="button" class="btn btn-xs btn-info" data-toggle="modal">
                                                        <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    </a>

                                                    <a href="/twms/deleteUser?pid=${users.getPid()}" type="button" role="button" class="btn btn-xs btn-danger" onclick="return isDelete()">
                                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                    </a>
                                                    <div id="editUser<%=ID%>" class="modal fade" tabindex="-1">
                                                        <div class="modal-dialog">
                                                            <div class="modal-content">
                                                                <div class="modal-header no-padding">
                                                                    <div class="table-header">
                                                                        <button type="button" class="close" data-dismiss="modal"
                                                                                aria-hidden="true">
                                                                            <span class="white">&times;</span>
                                                                        </button>
                                                                        修改用户信息
                                                                    </div>
                                                                </div>

                                                                <div class="modal-body">
                                                                    <form class="form-horizontal" role="form" method="post" action="/twms/editUser">
                                                                        <!-- #section:elements.form -->
                                                                        <div class="form-group" style="padding-top: 10px;padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right"> 编号：</label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" name="pid" placeholder="请输入用户编号" class="col-xs-10 col-sm-5" required="" value="${users.getPid()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right">姓名： </label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" name="pname" placeholder="输入用户姓名" class=" col-xs-10 col-sm-5" required="" value="${users.getPname()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <!-- /section:elements.form -->
                                                                        <div class="space-4"></div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right" >密码： </label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" name="pwd" placeholder="输入用户密码" class="col-xs-10 col-sm-5" required="" value="${users.getPwd()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="space-4"></div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right">性别： </label>

                                                                            <div class="radio " >
                                                                                <label>
                                                                                    <input name="sex" type="radio" class="ace" value="男" <c:if test="${users.getSex()=='男'}"> checked="checked"</c:if> />
                                                                                    <span class="lbl"> 男</span>
                                                                                </label>
                                                                                &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                                                                                <label>
                                                                                    <input name="sex" type="radio" class="ace" value="女" <c:if test="${users.getSex()=='女'}"> checked="checked"</c:if> />
                                                                                    <span class="lbl"> 女</span>
                                                                                </label>
                                                                            </div>
                                                                        </div>

                                                                        <div class="space-4"></div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right">班组：</label>

                                                                            <div class="col-sm-9">
                                                                                <!-- #section:plugins/bootstrap.typeahead-js -->
                                                                                <div class="pos-rel">
                                                                                    <select class="form-control" style="width: 135px;" name="team" required="">
                                                                                        <option value="">请选择所属班组</option>
                                                                                        <option value="变频一班" <c:if test="${users.getTeam()=='变频一班'}"> selected="selected"</c:if>>变频一班</option>
                                                                                        <option value="变频二班" <c:if test="${users.getTeam()=='变频二班'}"> selected="selected"</c:if>>变频二班</option>
                                                                                        <option value="变频三班" <c:if test="${users.getTeam()=='变频三班'}"> selected="selected"</c:if>>变频三班</option>
                                                                                        <option value="变频五班" <c:if test="${users.getTeam()=='变频五班'}"> selected="selected"</c:if>>变频五班</option>
                                                                                        <option value="变频六班" <c:if test="${users.getTeam()=='变频六班'}"> selected="selected"</c:if>>变频六班</option>
                                                                                        <option value="变频八班" <c:if test="${users.getTeam()=='变频八班'}"> selected="selected"</c:if>>变频八班</option>
                                                                                        <option value="主板一班" <c:if test="${users.getTeam()=='主板一班'}"> selected="selected"</c:if>>主板一班</option>
                                                                                        <option value="主板二班" <c:if test="${users.getTeam()=='主板二班'}"> selected="selected"</c:if>>主板二班</option>
                                                                                        <option value="主板三班" <c:if test="${users.getTeam()=='主板三班'}"> selected="selected"</c:if>>主板三班</option>
                                                                                        <option value="主板五班" <c:if test="${users.getTeam()=='主板五班'}"> selected="selected"</c:if>>主板五班</option>
                                                                                        <option value="主板六班" <c:if test="${users.getTeam()=='主板六班'}"> selected="selected"</c:if>>主板六班</option>
                                                                                        <option value="主板八班" <c:if test="${users.getTeam()=='主板八班'}"> selected="selected"</c:if>>主板八班</option>
                                                                                        <option value="显示器一班" <c:if test="${users.getTeam()=='显示器一班'}"> selected="selected"</c:if>>显示器一班</option>
                                                                                        <option value="显示器二班" <c:if test="${users.getTeam()=='显示器二班'}"> selected="selected"</c:if>>显示器二班</option>
                                                                                        <option value="显示器三班" <c:if test="${users.getTeam()=='显示器三班'}"> selected="selected"</c:if>>显示器三班</option>
                                                                                        <option value="显示器五班" <c:if test="${users.getTeam()=='显示器五班'}"> selected="selected"</c:if>>显示器五班</option>
                                                                                    </select>
                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right">角色：</label>

                                                                            <div class="col-sm-9">
                                                                                <!-- #section:plugins/bootstrap.typeahead-js -->
                                                                                <div class="pos-rel">
                                                                                    <select class="form-control" style="width: 135px;" name="roleid" required="">
                                                                                        <option value="" >请选择用户角色</option>
                                                                                        <option value="3"   <c:if test="${users.getRoleid()==3}"> selected="selected"</c:if>>普通员工</option>
                                                                                        <option value="2" <c:if test="${users.getRoleid()==2}"> selected="selected"</c:if>>仓库管理员</option>
                                                                                        <option value="1" <c:if test="${users.getRoleid()==1}"> selected="selected"</c:if>>超级管理员</option>
                                                                                    </select>
                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                        <div class="clearfix form-actions">
                                                                            <div class="col-md-offset-3 col-md-9" style="margin-left: 100px;">
                                                                                <button class="btn btn-info" type="submit">
                                                                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                                                                    修改
                                                                                </button>

                                                                                &nbsp; &nbsp; &nbsp;
                                                                                <button class="btn btn-danger bigger-110"
                                                                                        data-dismiss="modal">
                                                                                    <i class="ace-icon fa fa-times"></i>
                                                                                    关闭
                                                                                </button>
                                                                            </div>
                                                                        </div>
                                                                    </form>
                                                                </div>
                                                            </div><!-- /.modal-content -->
                                                        </div><!-- /.modal-dialog -->
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>

                                    <div class="modal-footer no-margin-top">
                                        <table><jsp:include page="page.jsp"></jsp:include></table>
                                    </div>
                                </div>
                                </form>
                            </div>
                        </div>

                        <div id="addUser" class="modal fade" tabindex="-1">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header no-padding">
                                        <div class="table-header">
                                            <button type="button" class="close" data-dismiss="modal"
                                                    aria-hidden="true">
                                                <span class="white">&times;</span>
                                            </button>
                                            添加用户
                                        </div>
                                    </div>

                                    <div class="modal-body">
                                        <form id="userManage" class="form-horizontal" role="form" method="post" enctype="multipart/form-data" action="/twms/insertUser">
                                            <!-- #section:elements.form -->
                                            <div class="form-group" style="padding-top: 10px;padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right"> 编号：</label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="pid" placeholder="请输入用户编号" class="col-xs-10 col-sm-5" required=""/>
                                                </div>
                                            </div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right" >姓名： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="pname" placeholder="输入用户姓名" class=" col-xs-10 col-sm-5" required=""/>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right" >密码： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="pwd" placeholder="输入用户密码" class="col-xs-10 col-sm-5" required=""/>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">性别： </label>

                                                <div class="radio" >
                                                    <label>
                                                        <input name="sex" type="radio" class="ace" value="男" />
                                                        <span class="lbl"> 男</span>
                                                    </label>
                                                    &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                                                    <label>
                                                    <input name="sex" type="radio" class="ace" value="女" />
                                                    <span class="lbl"> 女</span>
                                                    </label>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">班组：</label>

                                                <div class="col-sm-9">
                                                    <!-- #section:plugins/bootstrap.typeahead-js -->
                                                    <div class="pos-rel">
                                                        <select class="form-control" style="width: 135px;" name="team" required="">
                                                            <option value="">请选择所属班组</option>
                                                            <option value="变频一班">变频一班</option>
                                                            <option value="变频二班">变频二班</option>
                                                            <option value="变频三班">变频三班</option>
                                                            <option value="变频五班">变频五班</option>
                                                            <option value="变频六班">变频六班</option>
                                                            <option value="变频八班">变频八班</option>
                                                            <option value="主板一班">主板一班</option>
                                                            <option value="主板二班">主板二班</option>
                                                            <option value="主板三班">主板三班</option>
                                                            <option value="主板五班">主板五班</option>
                                                            <option value="主板六班">主板六班</option>
                                                            <option value="主板八班">主板八班</option>
                                                            <option value="显示器一班">显示器一班</option>
                                                            <option value="显示器二班">显示器二班</option>
                                                            <option value="显示器三班">显示器三班</option>
                                                            <option value="显示器五班">显示器五班</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">角色：</label>

                                                <div class="col-sm-9">
                                                    <!-- #section:plugins/bootstrap.typeahead-js -->
                                                    <div class="pos-rel">
                                                        <select class="form-control" style="width: 135px;" name="roleid" required="">
                                                            <option value="">请选择用户角色</option>
                                                            <option value="3">普通员工</option>
                                                            <option value="2">仓库管理员</option>
                                                            <option value="1">超级管理员</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">批量导入：</label>

                                                <div class="col-sm-9">
                                                    <div class="pos-rel">
                                                        <div class="fileupload fileupload-new" data-provides="fileupload" style="display: block;">
                                                             <span class="btn btn-file btn-primary" style="height: 35px;font-size: small;">
                                                                 <span class="fileupload-new ">选择文件</span>
                                                                 <span class="fileupload-exists">更改文件</span>
                                                                 <input type="file" name="file">
                                                             </span>
                                                            <span class="fileupload-preview"></span>
                                                            <a href="#"
                                                               class="close fileupload-exists"
                                                               data-dismiss="fileupload"
                                                               style="float: none">x</a>
                                                            <input type="button" class="btn btn-sm btn-primary" onclick="importUsers()" value="确认上传">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="clearfix form-actions">
                                                <div class="col-md-offset-3 col-md-9" style="margin-left: 100px;">
                                                    <button class="btn btn-info" type="submit">
                                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                                        提交
                                                    </button>

                                                    &nbsp; &nbsp; &nbsp;
                                                    <button class="btn" type="reset">
                                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                                        重置
                                                    </button>

                                                    &nbsp; &nbsp; &nbsp;
                                                    <button class="btn btn-danger bigger-110"
                                                            data-dismiss="modal">
                                                        <i class="ace-icon fa fa-times"></i>
                                                        关闭
                                                    </button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal-dialog -->
                        </div>
                        <!-- PAGE CONTENT ENDS -->
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content-area -->
        </div><!-- /.page-content -->
    </div><!-- /.main-content -->

</div>

<!-- basic scripts -->
<script src="/js/typeahead.jquery.min.js"></script>
<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='/js/jquery.min.js'>" + "<" + "/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='/js/jquery1x.min.js'>" + "<" + "/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if ('ontouchstart' in document.documentElement) document.write("<script src='/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<script src="/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->

<!-- ace scripts -->
<script src="/js/ace-elements.min.js"></script>
<script src="/js/ace.min.js"></script>
<script src="/js/bootstrap-fileupload.js"></script>
<script type="text/javascript">
    jQuery(function($) {

        $(".tbl-search").click(function(){
            $(".table-responsive").slideDown("fast");
        })

        var oTable1 =
            $('#sample-table-2')
                .dataTable( {
                    bAutoWidth: false,
                    bInfo:flase,
                    "aoColumns": [
                        { "bSortable": false },
                        null,
                        null,
                        null,
                        null,
                        null,
                        { "bSortable": false },
                        null,
                        { "bSortable": false }
                    ],
                    "aaSorting": [],
                } );

        $(document).on('click', 'th input:checkbox' , function(){
            var that = this;
            $(this).closest('table').find('tr > td:first-child input:checkbox')
                .each(function(){
                    this.checked = that.checked;
                    $(this).closest('tr').toggleClass('selected');
                });
        });
    })

</script>
<%--自定义JS--%>
<script>
    //提交到批量导入进行处理
    function importUsers(){
        document.getElementById('userManage').action = "/twms/importUsers";
        $("#userManage").submit();
    }

    function isDelete() {
        if(confirm("您确定要删除吗?")==true){
            return true;
        }else
            return false;
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
        var Checkbox=false;
        $("input[name='ids']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){
            if (confirm("您确认要删除选中的内容吗？")==false)
                return false;
            else
                $("#userList").submit();
        }
        else{
            alert("请选择您要删除的内容!");
            return false;
        }
    }
</script>
</body>
</html>
