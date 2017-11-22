<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="navbar" class="navbar navbar-default">
    <div class="navbar-container" id="navbar-container">

        <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler">
            <span class="sr-only">Toggle sidebar</span>

            <span class="icon-bar"></span>

            <span class="icon-bar"></span>

            <span class="icon-bar"></span>
        </button>

        <!-- /section:basics/sidebar.mobile.toggle -->
        <div class="navbar-header pull-left">
            <!-- #section:basics/navbar.layout.brand -->
            <a href="${pageContext.request.contextPath}/index" class="navbar-brand">
                <small>
                    <img src="${pageContext.request.contextPath}/avatars/logo.png" alt=""/>
                </small>
            </a>
        </div>

        <div class="navbar-buttons navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">

                <%--<li class="green">--%>
                    <%--<a data-toggle="dropdown" class="dropdown-toggle" href="#">--%>
                        <%--<i class="ace-icon fa fa-envelope icon-animated-vertical"></i>--%>
                        <%--<span class="badge badge-success">5</span>--%>
                    <%--</a>--%>

                   <%--</li>--%>

                <!-- #section:basics/navbar.user_menu -->
                <li class="light-blue">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        <img class="nav-user-photo" src="${pageContext.request.contextPath}/avatars/user.jpg" alt="用户头像"/>
                        <span class="user-info">
									欢迎您<br/>
									${userInfo.getPname()}
								</span>

                        <i class="ace-icon fa fa-caret-down"></i>
                    </a>

                    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="#chengePassword" role="button" data-toggle="modal">
                                <i class="ace-icon fa fa-user"></i>
                                修改密码
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="${pageContext.request.contextPath}/loginOut">
                                <i class="ace-icon fa fa-power-off"></i>
                                退出
                            </a>
                        </li>
                    </ul>
                </li>

                <!-- /section:basics/navbar.user_menu -->
            </ul>
        </div>

        <div id="chengePassword" class="modal fade" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header no-padding">
                        <div class="table-header">
                            <button type="button" class="close" data-dismiss="modal"
                                    aria-hidden="true">
                                <span class="white">&times;</span>
                            </button>
                            修改密码
                        </div>
                    </div>

                    <div class="modal-body">
                        <form id="editPwd" class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/editPassword">
                            <!-- #section:elements.form -->
                            <div class="form-group"
                                 style="padding-top: 10px;padding-left: 120px;">
                                <label class="col-sm-3 control-label no-padding-right"> 原密码：</label>

                                <div class="col-sm-9">
                                    <input type="password" id="oldPassword" required=""
                                           placeholder="请输入用户密码"
                                           class="col-xs-10 col-sm-5"/>
                                </div>
                            </div>

                            <div class="form-group" style="padding-left: 120px;">
                                <label class="col-sm-3 control-label no-padding-right">新密码： </label>

                                <div class="col-sm-9">
                                    <input type="password" id="newPassword1" required=""
                                           placeholder="输入新密码"
                                           class=" col-xs-10 col-sm-5"/>
                                </div>
                            </div>

                            <!-- /section:elements.form -->
                            <div class="space-4"></div>

                            <div class="form-group" style="padding-left: 120px;">
                                <label class="col-sm-3 control-label no-padding-right">新密码： </label>

                                <div class="col-sm-9">
                                    <input type="password" id="newPassword2" required=""
                                           placeholder="请再次确认新密码"
                                           class="col-xs-10 col-sm-5"/>
                                </div>
                            </div>

                            <div class="space-4"></div>

                            <div class="clearfix form-actions">
                                <div class="col-md-offset-3 col-md-9"
                                     style="margin-left: 150px;">
                                    <button class="btn btn-info" type="button" onclick="checkPassword()">
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
        <!-- /section:basics/navbar.dropdown -->
    </div><!-- /.navbar-container -->
</div>
<script>

    function checkPassword() {
        var p = document.getElementById("oldPassword");
        var p1 = document.getElementById("newPassword1");
        var p2 = document.getElementById("newPassword2");
        if(p.value == '') {
            alert("请输入原密码！");
        }else if(p1.value != '' && p2.value!=''){
            if(p1.value == p2.value){
                $.ajax({
                    url:'${pageContext.request.contextPath}/editPassword',
                    type:'post',
                    data:{
                        oldPassword:p.value,
                        newPassword:p1.value
                    },
                    success:function (data) {
                        if(data.success){
                            alert(data.msg);
                            window.location.reload();
                        }else {
                            alert(data.msg);
                        }
                    }
                })
            }else {
                alert("两次输入的新密码不相同，请重新输入！");
            }
        }else{
            alert("请输入新密码！");
        }
    }
</script>