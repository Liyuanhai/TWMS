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
    <title>仓库管理</title>
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
        var f1=document.getElementById("searchWarehouse");
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
                    <a href="/twms/index">系统首页</a>
                </li>
                <li>
                    <a href="javascript:void(0)">仓库管理</a>
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
                                <form id="searchWarehouse" action="/twms/searchWarehouse" method="post" enctype="multipart/form-data">
                                    <input id="pageNumId" name="pageNum" type="hidden" value="1"/>
                                    <div class="table-header" style="font-size: x-large;">
                                        仓库信息管理
                                    </div>
                                    <div style="padding-bottom: 10px;padding-top: 10px;text-align: center;display:block;">
                                        <label style="font-size: large;padding-bottom: 5px;padding-left: 20px;">查询库存：</label>
                                        <select class="" name="conditions" style="height: 35px;margin-left: 10px;" required="">
                                            <option value="">请选择查询条件
                                            </option>
                                            <option value="sID" <c:if test="${conditions=='sID'}">selected="selected"</c:if>>按货架编号查询
                                            </option>
                                            <option value="tID" <c:if test="${conditions=='tID'}">selected="selected"</c:if>>按工装编号查询
                                            </option>
                                        </select>
                                        <span class="input-icon">
                                            <input type="text" placeholder="请输入关键字 ..." class="nav-search-input"
                                                   name="keywords" autocomplete="on"  value="${keywords}"/>
                                            <i class="ace-icon fa fa-search nav-search-icon"></i>
                                            </span>
                                        <input type="submit" value="搜索"
                                               class="btn btn-sm btn-primary"/>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <div class="fileupload fileupload-new" data-provides="fileupload" style="display: inline-block;">
                                             <span class="btn-file btn btn-primary" style="font-size: small;height: 35px;">
                                                 <span class="fileupload-new ">导入库存信息</span>
                                                 <span class="fileupload-exists">更改文件</span>
                                                 <input type="file" name="file">
                                             </span>
                                            <span class="fileupload-preview"></span>
                                            <a href="#"
                                               class="close fileupload-exists"
                                               data-dismiss="fileupload"
                                               style="float: none">x</a>
                                            <input type="button" class="btn btn-sm btn-primary" value="确认上传" onclick="importWarehouse()" />
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
                                            <th class="center">货架编号</th>
                                            <th class="center">货架位置</th>
                                            <th class="center">工装编号</th>
                                            <th class="center">库存状态</th>
                                            <th class="center">操作</th>
                                        </tr>
                                        </thead>

                                        <tbody class="center">
                                        <c:forEach var="warehouse" items="${wh}">
                                            <tr>
                                                <td class="center" width="100px;">
                                                    <label class="position-relative">
                                                        <input name="ids" type="checkbox" class="ace" value="${warehouse.getSid()}"/>
                                                        <span class="lbl"></span>
                                                    </label>
                                                </td>
                                                <td>${warehouse.getSid()}</td>
                                                <td>${warehouse.getSite()}</td>
                                                <td>${warehouse.getTid()}</td>
                                                <td>${warehouse.getState()}</td>
                                                <td>
                                                        <%--弹窗按钮--%>
                                                    <a href="#editWarehouse${warehouse.getSid()}" role="button" class="btn btn-xs btn-info" data-toggle="modal">
                                                        <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    </a>

                                                    <a href="/twms/deleteWarehouse?sid=${warehouse.getSid()}" type="button" role="button" class="btn btn-xs btn-danger" onclick="return isDelete()">
                                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                    </a>
                                                    <div id="editWarehouse${warehouse.getSid()}" class="modal fade" tabindex="-1">
                                                        <div class="modal-dialog">
                                                            <div class="modal-content">
                                                                <div class="modal-header no-padding">
                                                                    <div class="table-header">
                                                                        <button type="button" class="close" data-dismiss="modal"
                                                                                aria-hidden="true">
                                                                            <span class="white">&times;</span>
                                                                        </button>
                                                                        修改库存状态信息
                                                                    </div>
                                                                </div>

                                                                <div class="modal-body">
                                                                    <form id="editWarehouse${warehouse.getSid()}" class="form-horizontal" role="form" method="post" action="/twms/editWarehouse">

                                                                        <div class="form-group" style="padding-top: 10px;padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right"> 货架编号：</label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" readonly="readonly" name="sid" class="col-xs-10 col-sm-5" required="" value="${warehouse.getSid()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right">工装编号： </label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" readonly="readonly" name="tid"  class=" col-xs-10 col-sm-5" required="" value="${warehouse.getTid()}"/>
                                                                            </div>
                                                                        </div>


                                                                        <div class="space-4"></div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right" >库存位置： </label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" readonly="readonly" name="site"  class="col-xs-10 col-sm-5" required="" value="${warehouse.getSite()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="space-4"></div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right">库存状态：</label>

                                                                            <div class="col-sm-9">

                                                                                <div class="pos-rel">
                                                                                    <select class="form-control" style="width: 135px;" name="state" required="">
                                                                                        <option value="" >请选择库存状态</option>
                                                                                        <option value="在库" <c:if test="${warehouse.getState()=='在库'}"> selected="selected"</c:if>>在库</option>
                                                                                        <option value="空库" <c:if test="${warehouse.getState()=='空库'}"> selected="selected"</c:if>>空库</option>
                                                                                        <option value="借出" <c:if test="${warehouse.getState()=='借出'}"> selected="selected"</c:if>>借出</option>
                                                                                        <option value="维修" <c:if test="${warehouse.getState()=='维修'}"> selected="selected"</c:if>>维修</option>
                                                                                        <option value="升级" <c:if test="${warehouse.getState()=='升级'}"> selected="selected"</c:if>>升级</option>
                                                                                    </select>
                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                        <div class="clearfix form-actions">
                                                                            <div class="col-md-offset-3 col-md-9" style="margin-left: 100px;">
                                                                                <button class="btn btn-info" type="submit" >
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
                                                            </div>
                                                        </div>
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

<%--自定义JS--%>
<script>
    //提交到批量导入进行处理
    function importWarehouse(){
        var roleID = "${userInfo.getRoleid()}";
        if(roleID == 1 || roleID == 2){
            document.getElementById('searchWarehouse').action = "/twms/importWarehouse";
            $("#searchWarehouse").submit();
        }else{
            alert("您的管理权限不够，请联系管理员！");
            return false;
        }

    }

    function isDelete() {
        var roleID = "${userInfo.getRoleid()}";
        if(roleID == 1 || roleID == 2){
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
        if(roleID == 1 || roleID == 2){
            $("input[name='ids']:checked").each(function(i){//把所有被选中的复选框的值存入数组
                checkID[i] =$(this).val();
            });
            if (checkID.length!=0){
                if (confirm("您确认要删除选中的内容吗？")==false)
                    return false;
                else
                    $.ajax({
                        url:'/twms/delCheckedWarehouse',
                        type:'post',
                        data:{
                            checkID:checkID.join(",")
                        },
                        success:function (data) {
                            if(data.success){
                                alert(data.msg);
                            }
                            window.location.href="/twms/searchWarehouse";
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
