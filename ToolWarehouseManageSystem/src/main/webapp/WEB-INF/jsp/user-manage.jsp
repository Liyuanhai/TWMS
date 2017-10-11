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

                                <div class="table-header" style="font-size: x-large;">
                                    用户信息管理
                                </div>
                                <div style="padding-bottom: 10px;padding-top: 10px;text-align: center">
                                    <label style="font-size: large;padding-bottom: 5px;padding-left: 20px;">查询用户：</label>
                                    <select class="" id="form-field-select-1" style="height: 35px;margin-left: 10px;">
                                        <option value="pname">请选择查询条件
                                        </option>
                                        <option value="pname">按姓名查找
                                        </option>
                                        <option value="pid">按员工编号查找
                                        </option>
                                    </select>
                                    <span class="input-icon">
                                                            <input type="text" placeholder="请输入关键字 ..." required=""
                                                                   class="nav-search-input" id="nav-search-input"
                                                                   autocomplete="off"/>
                                                            <i class="ace-icon fa fa-search nav-search-icon"></i>
                                                            </span>
                                    <input type="submit" value="搜索"
                                           class="btn btn-sm btn-primary"
                                           id="searchUser"/>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <%--弹窗按钮--%>
                                    <a href="#addUser" role="button" class="btn btn-sm btn-primary" data-toggle="modal">添加用户</a>
                                </div>
                                <div class="table-responsive">
                                    <table id="sample-table-2" class="table table-striped table-bordered table-hover">
                                        <thead >
                                        <tr >
                                            <th class="center">
                                                <label class="position-relative">
                                                    <input type="checkbox" class="ace"/>
                                                    <span class="lbl"></span>
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
                                                        <input type="checkbox" class="ace"/>
                                                        <span class="lbl"></span>
                                                    </label>
                                                </td>
                                                <td>${users.getPid()}</td>
                                                <td>${users.getPname()}</td>
                                                <td>${users.getSex()}</td>
                                                <td>${users.getTeam()}</td>
                                                <td>${users.getRoleid()}</td>
                                                <td>${users.getPwd()}</td>
                                                <td>
                                                    <%--弹窗按钮--%>
                                                    <a href="#editUser" role="button" class="btn btn-xs btn-info" data-toggle="modal">
                                                        <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    </a>

                                                    <a href="" role="button" class="btn btn-xs btn-danger" data-toggle="modal">
                                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>

                                    <div class="modal-footer no-margin-top">

                                        <ul class="pagination pull-right no-margin">
                                            <li class="prev disabled">
                                                <a href="#">
                                                    <i class="ace-icon fa fa-angle-double-left"></i>
                                                </a>
                                            </li>

                                            <li class="active">
                                                <a href="#">1</a>
                                            </li>

                                            <li>
                                                <a href="#">2</a>
                                            </li>

                                            <li>
                                                <a href="#">3</a>
                                            </li>

                                            <li class="next">
                                                <a href="#">
                                                    <i class="ace-icon fa fa-angle-double-right"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>

                                </div>


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
                                        <form id="insertUser" class="form-horizontal" role="form" method="post" enctype="multipart/form-data" action="/twms/insertUser">
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
                                                        <select class="form-control" style="width: 135px;" name="team">
                                                            <option value="变频一班">请选择所属班组</option>
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
                                                    <button class="btn btn-info" type="button">
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
                        <div id="editUser" class="modal fade" tabindex="-1">
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
                                        <form class="form-horizontal" role="form">
                                            <!-- #section:elements.form -->
                                            <div class="form-group" style="padding-top: 10px;padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right"> 编号：</label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="pid" placeholder="请输入用户编号" class="col-xs-10 col-sm-5" required=""/>
                                                </div>
                                            </div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">姓名： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="pname" placeholder="输入用户姓名" class=" col-xs-10 col-sm-5" required=""/>
                                                </div>
                                            </div>

                                            <!-- /section:elements.form -->
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
                                                        <input name="sex" type="radio" class="ace" />
                                                        <span class="lbl"> 男</span>
                                                    </label>
                                                    &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                                                    <label>
                                                        <input name="sex" type="radio" class="ace" />
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
                                                        <select class="form-control" style="width: 135px;" name="team">
                                                            <option value="变频一班">请选择所属班组</option>
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
                                                        <select class="form-control" style="width: 135px;" name="roleid">
                                                            <option value="3">请选择用户角色</option>
                                                            <option value="3">普通员工</option>
                                                            <option value="2">仓库管理员</option>
                                                            <option value="1">超级管理员</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="clearfix form-actions">
                                                <div class="col-md-offset-3 col-md-9" style="margin-left: 100px;">
                                                    <button class="btn btn-info" type="button">
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
<script>
    //提交到批量导入进行处理
    function importUsers(){
        document.getElementById('insertUser').action = "/twms/importUsers";
        $("#insertUser").submit();
    }
</script>
</body>
</html>
