<#import "/manage/tpl/htmlBase.ftl" as html>
<@html.htmlBase checkLogin=false jsFiles=["system/login.js"]>
<style>
	.td_right{text-align: right;}
</style>
<script type="text/javascript">
	$(function() {
		 $("#username").focus();
	});
</script>
</head>
<body>


<form action="${basepath}/manage/user" id="form" method="post">
		<table class="table table-bordered">
			<tr>
				<td colspan="2" style="background-color: #dff0d8;text-align: center;">
					<strong>卖家申请</strong>
				</td>
			</tr>
			<tr style="display:none;">
				<th>id</th>
				<td><input type="hidden" name="id" value="${e.id!""}" />
				
				     <input type="hidden" name="rid" value="8" />
				     <input type="hidden" name="status" value="y" />
				</td>
			</tr>
			<tr>
				<th class="td_right">帐号</th>
				<td style="text-align: left;">
                        <input type="text" name="username" id="username"  data-rule="帐号:required;username;length[4~20];remote[unique]">
				</td>
			</tr>
			<tr>
				<th class="td_right">昵称</th>
				<td style="text-align: left;">
				<input type="text" name="nickname" value="${e.nickname!""}" id="nickname"  data-rule="昵称:required;nickname;length[2~20];remote[unique, id]"/>
					</td>
			</tr>

                <tr>
                    <th class="td_right">密码</th>
                    <td style="text-align: left;"><input type="password" name="password" data-rule="密码:password;length[6~20];"
                                                              id="password" />
                    </td>
                </tr>
                <tr>
                    <th class="td_right">确认密码</th>
                    <td style="text-align: left;"><input type="password" name="newpassword2" data-rule="确认密码:match(password)"
                                                              id="newpassword2" />
                    </td>
                </tr>
			
           
			<tr >
				<td colspan="2" style="text-align: center;">
						<button method="register" class="btn btn-success">
							<i class="icon-ok icon-white"></i>注册
						</button>
				</td>
			</tr>
		</table>
</form>
</@html.htmlBase>