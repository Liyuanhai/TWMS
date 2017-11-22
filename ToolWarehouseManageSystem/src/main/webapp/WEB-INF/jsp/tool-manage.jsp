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
    <title>工装信息管理</title>
    <meta name="description" content="Restyling jQuery UI Widgets and Elements"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-fonts.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace.min.css" id="main-ace-style"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-fileupload.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/datepicker.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-timepicker.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/daterangepicker.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.css" />
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
        var f1=document.getElementById("searchTool");
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
                    <a href="javascript:void(0)">工装管理</a>
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
                                <form id="searchTool" action="${pageContext.request.contextPath}/searchTool" method="post">
                                    <input id="pageNumId" name="pageNum" type="hidden" value="1"/>
                                    <div class="table-header" style="font-size: x-large;">
                                        工装信息管理
                                    </div>
                                    <div style="padding-bottom: 10px;padding-top: 10px;text-align: center">
                                        <label style="font-size: large;padding-bottom: 5px;padding-left: 20px;">查询工装：</label>
                                        <select name="conditions" class="" id="form-field-select-1" style="height: 35px;margin-left: 10px;" required="">
                                            <option value="">请选择查询条件</option>
                                            <option value="tID" <c:if test="${conditions=='tID'}">selected="selected"</c:if>>按工装编号查找</option>
                                            <option value="tModel" <c:if test="${conditions=='tModel'}">selected="selected"</c:if>>按工装型号查找</option>
                                            <option value="makeTime" <c:if test="${conditions=='makeTime'}">selected="selected"</c:if>>按制作时间查找</option>
                                        </select>
                                        <span class="input-icon">
                                                                <input name="keywords" type="text" placeholder="请输入关键字 ..." required=""
                                                                       class="nav-search-input" value="${keywords}"
                                                                       autocomplete="on"/>
                                                                <i class="ace-icon fa fa-search nav-search-icon"></i>
                                                                </span>
                                        <input type="submit" value="搜索"
                                               class="btn btn-sm btn-primary"/>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <%--弹窗按钮--%>
                                        <a href="#addTool" role="button" class="btn btn-sm btn-primary" data-toggle="modal">添加工装</a>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="sample-table-2" class="table table-striped table-bordered table-hover">
                                        <thead >
                                        <tr >
                                            <th class="center" width="100px;">
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
                                            <th class="center">兼容版本</th>
                                            <th class="center">制作时间</th>
                                            <th class="center">操作</th>
                                        </tr>
                                        </thead>

                                        <tbody class="center">
                                        <c:forEach var="tool" items="${tools}">
                                            <%--<input name="fileIDs" value="${userList.getId()}" type="hidden">--%>

                                            <tr>
                                                <td class="center" width="100px;">
                                                    <label class="position-relative">
                                                        <input name="ids" type="checkbox" class="ace" value="${tool.getTid()}"/>
                                                        <span class="lbl"></span>
                                                    </label>
                                                </td>
                                                <td>${tool.getTid()}</td>
                                                <td>${tool.getTname()}</td>
                                                <td>${tool.getTmodel()}</td>
                                                <td>${tool.getVersionnum()}</td>
                                                <td>${tool.getCompatibility()}</td>
                                                <td>${tool.getMaketime()}</td>
                                                <td>
                                                        <%--弹窗按钮--%>
                                                    <a href="#editTool${tool.getTid()}" role="button" class="btn btn-xs btn-info" data-toggle="modal">
                                                        <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                    </a>

                                                    <a href="${pageContext.request.contextPath}/deleteTool?tID=${tool.getTid()}" type="button" role="button" class="btn btn-xs btn-danger" onclick="return isDelete()">
                                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                    </a>
                                                    <div id="editTool${tool.getTid()}" class="modal fade" tabindex="-1">
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
                                                                    <form id="editTool${tool.getTid()}" class="form-horizontal"  role="form" method="post" action="${pageContext.request.contextPath}/editTool">
                                                                        <!-- #section:elements.form -->
                                                                        <div class="form-group" style="padding-top: 10px;padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right"> 工装编号：</label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" readonly="readonly" name="tid" placeholder="" class="col-xs-10 col-sm-7" required="" value="${tool.getTid()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right" >工装名称： </label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" name="tname" placeholder="" class=" col-xs-10 col-sm-7" required="" value="${tool.getTname()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="space-4"></div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right" >工装型号： </label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" name="tmodel" placeholder="" class="col-xs-10 col-sm-7" required="" value="${tool.getTmodel()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="space-4"></div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right" >版本号： </label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" name="versionnum" placeholder="" class="col-xs-10 col-sm-7" required="" value="${tool.getVersionnum()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="space-4"></div>

                                                                        <div class="form-group" style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right" >兼容版本： </label>

                                                                            <div class="col-sm-9">
                                                                                <input type="text" name="compatibility" placeholder="" class="col-xs-10 col-sm-7" required="" value="${tool.getCompatibility()}"/>
                                                                            </div>
                                                                        </div>

                                                                        <div class="space-4"></div>

                                                                        <div class="form-group " style="padding-left: 120px;">
                                                                            <label class="col-sm-3 control-label no-padding-right">制作时间： </label>
                                                                            <div class=" col-sm-9">
                                                                                <input class=" date-picker col-xs-10 col-sm-7" name="maketime" type="text" data-date-format="yyyy-mm-dd" value="${tool.getMaketime()}"/>

                                                                            </div>
                                                                        </div>

                                                                        <div class="space-4"></div>

                                                                        <div class="clearfix form-actions">
                                                                            <div class="col-md-offset-3 col-md-9" style="margin-left: 80px;">
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


                            </div>
                        </div>

                        <div id="addTool" class="modal fade" tabindex="-1">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header no-padding">
                                        <div class="table-header">
                                            <button type="button" class="close" data-dismiss="modal"
                                                    aria-hidden="true">
                                                <span class="white">&times;</span>
                                            </button>
                                            添加工装信息
                                        </div>
                                    </div>

                                    <div class="modal-body">
                                        <form id="toolManage" class="form-horizontal" role="form" enctype="multipart/form-data" method="post" action="${pageContext.request.contextPath}/addTool">
                                            <!-- #section:elements.form -->
                                            <div class="form-group" style="padding-top: 10px;padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right"> 工装编号：</label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="tid" placeholder="" class="col-xs-10 col-sm-7" required=""/>
                                                </div>
                                            </div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right" >工装名称： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="tname" placeholder="" class=" col-xs-10 col-sm-7" required=""/>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right" >工装型号： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="tmodel" placeholder="" class="col-xs-10 col-sm-7" required=""/>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right" >版本号： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="versionnum" placeholder="" class="col-xs-10 col-sm-7" required=""/>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right" >兼容版本： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" name="compatibility" placeholder="" class="col-xs-10 col-sm-7" required=""/>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group " style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">制作时间： </label>
                                                <div class=" col-sm-9">
                                                    <input class=" date-picker col-xs-10 col-sm-7" name="maketime" type="text" data-date-format="yyyy-mm-dd" />

                                                </div>
                                            </div>

                                            <div class="space-4"></div>

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
                                                            <input type="button" class="btn btn-sm btn-primary" onclick="importTool()" value="确认上传"/>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="clearfix form-actions">
                                                <div class="col-md-offset-3 col-md-9" style="margin-left: 100px;">
                                                    <button class="btn btn-info" type="submit" onclick="return insertTool()">
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

<!-- page specific plugin scripts -->
<script src="${pageContext.request.contextPath}/js/bootstrap-fileupload.js"></script>
<!--[if lte IE 8]>
<script src="${pageContext.request.contextPath}/js/excanvas.min.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath}/js/jquery-ui.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.ui.touch-punch.min.js"></script>
<script src="${pageContext.request.contextPath}/js/chosen.jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/fuelux/fuelux.spinner.min.js"></script>
<script src="${pageContext.request.contextPath}/js/date-time/bootstrap-datepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/date-time/bootstrap-timepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/date-time/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/js/date-time/daterangepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/date-time/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-colorpicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.knob.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.autosize.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.inputlimiter.1.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.maskedinput.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-tag.min.js"></script>
<script src="${pageContext.request.contextPath}/js/typeahead.jquery.min.js"></script>

<!-- ace scripts -->
<script src="${pageContext.request.contextPath}/js/ace-elements.min.js"></script>
<script src="${pageContext.request.contextPath}/js/ace.min.js"></script>

<!-- inline scripts related to this page -->
<script type="text/javascript">
    jQuery(function($) {



        $('.chosen-select').chosen({allow_single_deselect:true});

        $(window)
            .off('resize.chosen')
            .on('resize.chosen', function() {
                $('.chosen-select').each(function() {
                    var $this = $(this);
                    $this.next().css({'width': $this.parent().width()});
                })
            }).trigger('resize.chosen');


        $('#chosen-multiple-style').on('click', function(e){
            var target = $(e.target).find('input[type=radio]');
            var which = parseInt(target.val());
            if(which == 2) $('#form-field-select-4').addClass('tag-input-style');
            else $('#form-field-select-4').removeClass('tag-input-style');
        });


        $('[data-rel=tooltip]').tooltip({container:'body'});
        $('[data-rel=popover]').popover({container:'body'});

        $('textarea[class*=autosize]').autosize({append: "\n"});
        $('textarea.limited').inputlimiter({
            remText: ' 还能再输入%n个字...',
            limitText: '最多只能输入 : %n 个字.'
        });

        $.mask.definitions['~']='[+-]';
        $('.input-mask-date').mask('99/99/9999');
        $('.input-mask-phone').mask('(999) 999-9999');
        $('.input-mask-eyescript').mask('~9.99 ~9.99 999');
        $(".input-mask-product").mask("a*-999-a999",{placeholder:" ",completed:function(){alert("You typed the following: "+this.val());}});



        $( "#input-size-slider" ).css('width','200px').slider({
            value:1,
            range: "min",
            min: 1,
            max: 8,
            step: 1,
            slide: function( event, ui ) {
                var sizing = ['', 'input-sm', 'input-lg', 'input-mini', 'input-small', 'input-medium', 'input-large', 'input-xlarge', 'input-xxlarge'];
                var val = parseInt(ui.value);
                $('#form-field-4').attr('class', sizing[val]).val('.'+sizing[val]);
            }
        });

        $( "#input-span-slider" ).slider({
            value:1,
            range: "min",
            min: 1,
            max: 12,
            step: 1,
            slide: function( event, ui ) {
                var val = parseInt(ui.value);
                $('#form-field-5').attr('class', 'col-xs-'+val).val('.col-xs-'+val);
            }
        });



        //"jQuery UI Slider"
        //range slider tooltip example
        $( "#slider-range" ).css('height','200px').slider({
            orientation: "vertical",
            range: true,
            min: 0,
            max: 100,
            values: [ 17, 67 ],
            slide: function( event, ui ) {
                var val = ui.values[$(ui.handle).index()-1] + "";

                if( !ui.handle.firstChild ) {
                    $("<div class='tooltip right in' style='display:none;left:16px;top:-6px;'><div class='tooltip-arrow'></div><div class='tooltip-inner'></div></div>")
                        .prependTo(ui.handle);
                }
                $(ui.handle.firstChild).show().children().eq(1).text(val);
            }
        }).find('a').on('blur', function(){
            $(this.firstChild).hide();
        });


        $( "#slider-range-max" ).slider({
            range: "max",
            min: 1,
            max: 10,
            value: 2
        });

        $( "#slider-eq > span" ).css({width:'90%', 'float':'left', margin:'15px'}).each(function() {
            // read initial values from markup and remove that
            var value = parseInt( $( this ).text(), 10 );
            $( this ).empty().slider({
                value: value,
                range: "min",
                animate: true

            });
        });

        $("#slider-eq > span.ui-slider-purple").slider('disable');//disable third item


        $('#id-input-file-1 , #id-input-file-2').ace_file_input({
            no_file:'No File ...',
            btn_choose:'Choose',
            btn_change:'Change',
            droppable:false,
            onchange:null,
            thumbnail:false //| true | large
            //whitelist:'gif|png|jpg|jpeg'
            //blacklist:'exe|php'
            //onchange:''
            //
        });
        //pre-show a file name, for example a previously selected file
        //$('#id-input-file-1').ace_file_input('show_file_list', ['myfile.txt'])


        $('#id-input-file-3').ace_file_input({
            style:'well',
            btn_choose:'Drop files here or click to choose',
            btn_change:null,
            no_icon:'ace-icon fa fa-cloud-upload',
            droppable:true,
            thumbnail:'small'//large | fit
            //,icon_remove:null//set null, to hide remove/reset button
            /**,before_change:function(files, dropped) {
						//Check an example below
						//or examples/file-upload.html
						return true;
					}*/
            /**,before_remove : function() {
						return true;
					}*/
            ,
            preview_error : function(filename, error_code) {
                //name of the file that failed
                //error_code values
                //1 = 'FILE_LOAD_FAILED',
                //2 = 'IMAGE_LOAD_FAILED',
                //3 = 'THUMBNAIL_FAILED'
                //alert(error_code);
            }

        }).on('change', function(){
            //console.log($(this).data('ace_input_files'));
            //console.log($(this).data('ace_input_method'));
        });


        //dynamically change allowed formats by changing allowExt && allowMime function
        $('#id-file-format').removeAttr('checked').on('change', function() {
            var whitelist_ext, whitelist_mime;
            var btn_choose
            var no_icon
            if(this.checked) {
                btn_choose = "Drop images here or click to choose";
                no_icon = "ace-icon fa fa-picture-o";

                whitelist_ext = ["jpeg", "jpg", "png", "gif" , "bmp"];
                whitelist_mime = ["image/jpg", "image/jpeg", "image/png", "image/gif", "image/bmp"];
            }
            else {
                btn_choose = "Drop files here or click to choose";
                no_icon = "ace-icon fa fa-cloud-upload";

                whitelist_ext = null;//all extensions are acceptable
                whitelist_mime = null;//all mimes are acceptable
            }
            var file_input = $('#id-input-file-3');
            file_input
                .ace_file_input('update_settings',
                    {
                        'btn_choose': btn_choose,
                        'no_icon': no_icon,
                        'allowExt': whitelist_ext,
                        'allowMime': whitelist_mime
                    })
            file_input.ace_file_input('reset_input');

            file_input
                .off('file.error.ace')
                .on('file.error.ace', function(e, info) {
                    //console.log(info.file_count);//number of selected files
                    //console.log(info.invalid_count);//number of invalid files
                    //console.log(info.error_list);//a list of errors in the following format

                    //info.error_count['ext']
                    //info.error_count['mime']
                    //info.error_count['size']

                    //info.error_list['ext']  = [list of file names with invalid extension]
                    //info.error_list['mime'] = [list of file names with invalid mimetype]
                    //info.error_list['size'] = [list of file names with invalid size]


                    /**
                     if( !info.dropped ) {
							//perhapse reset file field if files have been selected, and there are invalid files among them
							//when files are dropped, only valid files will be added to our file array
							e.preventDefault();//it will rest input
						}
                     */


                    //if files have been selected (not dropped), you can choose to reset input
                    //because browser keeps all selected files anyway and this cannot be changed
                    //we can only reset file field to become empty again
                    //on any case you still should check files with your server side script
                    //because any arbitrary file can be uploaded by user and it's not safe to rely on browser-side measures
                });

        });

        $('#spinner1').ace_spinner({value:0,min:0,max:200,step:10, btn_up_class:'btn-info' , btn_down_class:'btn-info'})
            .on('change', function(){
                //alert(this.value)
            });
        $('#spinner2').ace_spinner({value:0,min:0,max:10000,step:100, touch_spinner: true, icon_up:'ace-icon fa fa-caret-up', icon_down:'ace-icon fa fa-caret-down'});
        $('#spinner3').ace_spinner({value:0,min:-100,max:100,step:10, on_sides: true, icon_up:'ace-icon fa fa-plus smaller-75', icon_down:'ace-icon fa fa-minus smaller-75', btn_up_class:'btn-success' , btn_down_class:'btn-danger'});
        //$('#spinner1').ace_spinner('disable').ace_spinner('value', 11);
        //or
        //$('#spinner1').closest('.ace-spinner').spinner('disable').spinner('enable').spinner('value', 11);//disable, enable or change value
        //$('#spinner1').closest('.ace-spinner').spinner('value', 0);//reset to 0


        //datepicker plugin
        //link
        $('.date-picker').datepicker({
            autoclose: true,
            todayHighlight: true
        })
        //show datepicker when clicking on the icon
            .next().on(ace.click_event, function(){
            $(this).prev().focus();
        });

        //or change it into a date range picker
        $('.input-daterange').datepicker({autoclose:true});


        //to translate the daterange picker, please copy the "examples/daterange-fr.js" contents here before initialization
        $('input[name=date-range-picker]').daterangepicker({
            'applyClass' : 'btn-sm btn-success',
            'cancelClass' : 'btn-sm btn-default',
            locale: {
                applyLabel: 'Apply',
                cancelLabel: 'Cancel',
            }
        })
            .prev().on(ace.click_event, function(){
            $(this).next().focus();
        });


        $('#timepicker1').timepicker({
            minuteStep: 1,
            showSeconds: true,
            showMeridian: false
        }).next().on(ace.click_event, function(){
            $(this).prev().focus();
        });

        $('#date-timepicker1').datetimepicker().next().on(ace.click_event, function(){
            $(this).prev().focus();
        });


        $('#colorpicker1').colorpicker();

        $('#simple-colorpicker-1').ace_colorpicker();
        //$('#simple-colorpicker-1').ace_colorpicker('pick', 2);//select 2nd color
        //$('#simple-colorpicker-1').ace_colorpicker('pick', '#fbe983');//select #fbe983 color
        //var picker = $('#simple-colorpicker-1').data('ace_colorpicker')
        //picker.pick('red', true);//insert the color if it doesn't exist


        $(".knob").knob();


        var tag_input = $('#form-field-tags');
        try{
            tag_input.tag(
                {
                    placeholder:tag_input.attr('placeholder'),
                    //enable typeahead by specifying the source array
                    source: ace.vars['US_STATES'],//defined in ace.js >> ace.enable_search_ahead
                    /**
                     //or fetch data from database, fetch those that match "query"
                     source: function(query, process) {
						  $.ajax({url: 'remote_source.php?q='+encodeURIComponent(query)})
						  .done(function(result_items){
							process(result_items);
						  });
						}
                     */
                }
            )

            var $tag_obj = $('#form-field-tags').data('tag');
            $tag_obj.add('我是标签二');
        }
        catch(e) {
            //display a textarea for old IE, because it doesn't support this plugin or another one I tried!
            tag_input.after('<textarea id="'+tag_input.attr('id')+'" name="'+tag_input.attr('name')+'" rows="3">'+tag_input.val()+'</textarea>').remove();
            //$('#form-field-tags').autosize({append: "\n"});
        }


        //////////

        //typeahead.js
        //example taken from plugin's page at: https://twitter.github.io/typeahead.js/examples/
        var substringMatcher = function(strs) {
            return function findMatches(q, cb) {
                var matches, substringRegex;

                // an array that will be populated with substring matches
                matches = [];

                // regex used to determine if a string contains the substring `q`
                substrRegex = new RegExp(q, 'i');

                // iterate through the pool of strings and for any string that
                // contains the substring `q`, add it to the `matches` array
                $.each(strs, function(i, str) {
                    if (substrRegex.test(str)) {
                        // the typeahead jQuery plugin expects suggestions to a
                        // JavaScript object, refer to typeahead docs for more info
                        matches.push({ value: str });
                    }
                });

                cb(matches);
            }
        }

        $('input.typeahead').typeahead({
            hint: true,
            highlight: true,
            minLength: 1
        }, {
            name: 'states',
            displayKey: 'value',
            source: substringMatcher(ace.vars['US_STATES'])
        });



        /////////
        $('#modal-form input[type=file]').ace_file_input({
            style:'well',
            btn_choose:'Drop files here or click to choose',
            btn_change:null,
            no_icon:'ace-icon fa fa-cloud-upload',
            droppable:true,
            thumbnail:'large'
        })

        //chosen plugin inside a modal will have a zero width because the select element is originally hidden
        //and its width cannot be determined.
        //so we set the width after modal is show
        $('#modal-form').on('shown.bs.modal', function () {
            $(this).find('.chosen-container').each(function(){
                $(this).find('a:first-child').css('width' , '210px');
                $(this).find('.chosen-drop').css('width' , '210px');
                $(this).find('.chosen-search input').css('width' , '200px');
            });
        })
        /**
         //or you can activate the chosen plugin after modal is shown
         //this way select element becomes visible with dimensions and chosen works as expected
         $('#modal-form').on('shown', function () {
					$(this).find('.modal-chosen').chosen();
				})
         */

    });
</script>

<%--自定义JS--%>
<script>
    function insertTool() {
        var roleID = "${userInfo.getRoleid()}";
        if(roleID == 1 || roleID == 2){
            return true;
        }else{
            alert("您的管理权限不够，请联系管理员！");
            return false;
        }
    }
    //提交到批量导入进行处理
    function importTool(){
        var roleID = "${userInfo.getRoleid()}";
        if(roleID == 1 || roleID == 2){
            document.getElementById('toolManage').action = "${pageContext.request.contextPath}/importTools";
            $("#toolManage").submit();
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
                        url:'${pageContext.request.contextPath}/delCheckedTool',
                        type:'post',
                        data:{
                            checkID:checkID.join(",")
                        },
                        success:function (data) {
                            if(data.success){
                                alert(data.msg);
                            }
                            window.location.href="${pageContext.request.contextPath}/searchTool";
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
