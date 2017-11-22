<%--
  Created by IntelliJ IDEA.
  User: 李-元海
  Date: 2017/9/25
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="sidebar" class="sidebar responsive">

        <ul class="nav nav-list">

            <li class="">
                <a href="${pageContext.request.contextPath}/index">
                    <i class="menu-icon fa fa-home"></i>
                    <span class="menu-text"> 首&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;页 </span>
                </a>

                <b class="arrow"></b>
            </li>

            <li class="">
                <a href="${pageContext.request.contextPath}/searchUser">
                    <i class="menu-icon fa fa-users"></i>
                    <span class="menu-text"> 用户管理 </span>
                </a>

                <b class="arrow"></b>
            </li>

            <li class="">
                <a href="${pageContext.request.contextPath}/searchWarehouse">
                    <i class="menu-icon fa fa-inbox"></i>
                    <span class="menu-text"> 仓库管理 </span>
                </a>

                <b class="arrow"></b>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-pencil-square-o"></i>
                    <span class="menu-text"> 工装管理 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">
                    <li class="">
                        <a href="${pageContext.request.contextPath}/tool-review">
                            <i class="menu-icon fa fa-caret-right"></i>
                            工装评审
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/tool-repair">
                            <i class="menu-icon fa fa-caret-right"></i>
                            工装维修
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/version-update">
                            <i class="menu-icon fa fa-caret-right"></i>
                            版本升级
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/material-info">
                            <i class="menu-icon fa fa-caret-right"></i>
                            物料信息
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/searchTool">
                            <i class="menu-icon fa fa-caret-right"></i>
                            工装信息管理
                        </a>

                        <b class="arrow"></b>
                    </li>
                </ul>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-list-alt"></i>
                    <span class="menu-text"> 台帐管理 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">
                    <li class="">
                        <a href="${pageContext.request.contextPath}/searchAccount">
                            <i class="menu-icon fa fa-caret-right"></i>
                            出入库台帐
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/searchReview">
                            <i class="menu-icon fa fa-caret-right"></i>
                            评审表台帐
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/searchRepair">
                            <i class="menu-icon fa fa-caret-right"></i>
                            维修记录台帐
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/searchVersion">
                            <i class="menu-icon fa fa-caret-right"></i>
                            版本升级台帐
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/searchMaterial">
                            <i class="menu-icon fa fa-caret-right"></i>
                            物料信息台帐
                        </a>

                        <b class="arrow"></b>
                    </li>
                </ul>
            </li>

        </ul><!-- /.nav-list -->
    </div>