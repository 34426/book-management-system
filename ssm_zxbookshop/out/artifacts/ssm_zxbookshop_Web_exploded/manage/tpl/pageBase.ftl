<#import "htmlBase.ftl" as html />
<#import "menu.ftl" as menu />
<#--currentMenu:当前菜单项-->
<#macro pageBase currentMenu topMenu="" title="" jsFiles=[] cssFiles=[] staticJsFiles=[] staticCssFiles=[] checkLogin=true>
<@html.htmlBase title=title jsFiles=jsFiles cssFiles=cssFiles staticJsFiles=staticJsFiles staticCssFiles=staticCssFiles checkLogin=checkLogin>
<body>
    <div id="wrapper">
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${basepath}/manage/user/home">网上书店系统</a>
            </div>
            <ul class="nav navbar-top-links navbar-right">
                 <li><a href="${systemSetting().www}" target="_blank"><i class="glyphicon glyphicon-globe"></i> 访问站点</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> ${currentUser().nickname!currentUser().username} <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="${basepath}/manage/user/show?account=${currentUser().username}" target="_blank"><i class="fa fa-user fa-fw"></i> 用户信息</a>
                        </li>
                        <li><a href="${basepath}/manage/user/toChangePwd"><i class="fa fa-gear fa-fw"></i> 修改密码</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="${basepath}/manage/user/logout"><i class="fa fa-sign-out fa-fw"></i> 注销</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
                <@menu.menu menus=userMenus topMenu=topMenu currentMenu=currentMenu/>
        </nav>

        <div id="page-wrapper">
            
            <div class="row">
                <div class="col-lg-12">
                    <div class="navbar navbar-default">
                        <ol class="breadcrumb bootstrap-admin-breadcrumb">
                            <li>
                                <a href="${basepath}/manage/user/home">首页</a>
                            </li>
                            <li class="active">${currentMenu}</li>
                        </ol>
                    </div>
                </div>
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <#if message??>
                        <div class="alert alert-success alert-dismissable fade in" id="alert-success">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        ${message}
                        </div>
                    </#if>
                    <#if warning??>
                        <div class="alert alert-warning alert-dismissable fade in" id="alert-warning">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        ${warning}
                        </div>
                    </#if>
                    <#if errorMsg??>
                        <div class="alert alert-danger alert-dismissable fade in" id="alert-danger">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        ${errorMsg}
                        </div>
                    </#if>
                </div>
                <div class="col-lg-12">
                    <#nested />
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

</body>
</@html.htmlBase>
</#macro>