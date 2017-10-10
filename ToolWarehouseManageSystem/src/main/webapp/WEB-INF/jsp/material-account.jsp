<%--
  Created by IntelliJ IDEA.
  User: 李-元海
  Date: 2017/9/26
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>物料信息台帐</title>
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
                    <a href="#">物料信息台帐</a>
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
                                    物料信息台帐管理
                                </div>
                                <div style="padding-bottom: 10px;padding-top: 10px;text-align: center;display:block;">
                                    <label style="font-size: large;padding-bottom: 5px;padding-left: 20px;">查询物料信息：</label>
                                    <select class="" id="form-field-select-1"
                                            style="height: 35px;margin-left: 10px;">
                                        <option value="">请选择查询条件
                                        </option>
                                        <option value="AL">按工装名称查询
                                        </option>
                                        <option value="AK">按工装型号查询
                                        </option>
                                    </select>
                                    <span class="input-icon">
                                        <input type="text"
                                               placeholder="请输入关键字 ..."
                                               class="nav-search-input"
                                               id="nav-search-input"
                                               autocomplete="off"/>
                                        <i class="ace-icon fa fa-search nav-search-icon"></i>
                                        </span>
                                    <input type="submit" value="搜索"
                                           class="btn btn-sm btn-primary"
                                           id="searchUser"/>
                                </div>

                                <div class="table-responsive">

                                    <table id="sample-table-2"
                                           class="table table-striped table-bordered table-hover">
                                        <thead>
                                        <tr>
                                            <th class="center">
                                                <label class="position-relative">
                                                    <input type="checkbox" class="ace"/>
                                                    <span class="lbl"></span>
                                                </label>
                                            </th>

                                            <th class="center">工装名称</th>
                                            <th class="center">工装型号</th>
                                            <th class="center">制作人</th>
                                            <th class="center">制作时间</th>
                                            <th class="center">附件</th>
                                            <th class="center">备注</th>
                                            <th class="center">操作</th>
                                        </tr>
                                        </thead>

                                        <tbody class="center">
                                        <tr>
                                            <td class="center">
                                                <label class="position-relative">
                                                    <input type="checkbox" class="ace"/>
                                                    <span class="lbl"></span>
                                                </label>
                                            </td>

                                            <td>测试</td>
                                            <td>测试</td>
                                            <td>测试</td>
                                            <td>测试</td>
                                            <td>测试</td>
                                            <td>测试</td>

                                            <td>
                                                <%--弹窗按钮--%>
                                                <a href="#modal-table" role="button" class="btn btn-xs btn-danger" data-toggle="modal">
                                                <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                </a>
                                            </td>
                                        </tr>
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
                        </div><!-- PAGE CONTENT ENDS -->
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
</body>
</html>
