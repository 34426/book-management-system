<%@ page contentType="text/html; charset=UTF-8"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="org.apache.commons.lang.StringUtils"%>
<%@page import="java.util.*"%>
<%@page import="net.jeeshop.services.front.news.bean.News"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<!-- <html class="no-js"> -->
<html>
<head>
<%@ include file="/resource/common_html_meat.jsp"%>
<%@ include file="/resource/common_css.jsp"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/resource/jcrop/css/jquery.Jcrop.css"  type="text/css">

<style type="text/css">
/* Apply these styles only when #preview-pane has
   been placed within the Jcrop widget */
.preview-pane {
  display: block;
  position: absolute; 
/*   z-index: 2000; */
/*   top: 10px; */
/*   right: -280px; */
/* 	width:200px; */
  padding: 6px;
  border: 1px rgba(0,0,0,.4) solid;
  background-color: white;

  -webkit-border-radius: 6px;
  -moz-border-radius: 6px;
  border-radius: 6px;

  -webkit-box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.2);
  -moz-box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.2);
  box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.2);
}

.mainImage{
	max-width: 400px;max-height: 400px;
}
</style>
</head>

<body>
	<%@ include file="/indexMenu.jsp"%>
<div id="wrap" style="margin-top: 0px;">
	<div class="container" style="margin-top: 0px;padding-top: 0px;">
		<div class="row">
			<div class="col-xs-3" style="min-height: 300px;border: 0px solid red;">
				<%@ include file="userLeft.jsp"%>
			</div>
			
			<div class="col-xs-9" style="border: 0px solid red;">
				<div class="row">
					<div class="col-xs-6" style="border: 0px solid red;">
						<s:form role="form" cssClass="form-inline" action="webAccount!uploadPic.action" theme="simple" 
								enctype="multipart/form-data" method="post" onsubmit="return submit222();">   
						  <div class="form-group">
						    <label for="headImg">????????????</label>
						    <input  name="headImg" type="file" id="headImg" style="border: 0px solid red;"/>
						  </div>
						  
						  <div class="form-group">
						      <s:submit type="submit" method="login" cssClass="btn btn-success btn-sm" value="????????????"/>
						  </div>
						</s:form>
					</div>
					<div class="col-xs-6" style="border: 0px solid red;">
						<form action="webAccount!cutPic.action" method="post" onsubmit="return checkCoords();">
							<input type="submit" value="??????" class="btn btn-info btn-sm"/><br>
							<div style="display: none;">
								??????
								x:<input name="operateImage.x" id="x"/>
								y:<input name="operateImage.y" id="y"/>
								w:<input name="operateImage.width" id="width"/>
								h:<input name="operateImage.height" id="height"/>
								
								boundx:<input id="boundx"/>
								boundy:<input id="boundy"/>
							</div>
						</form>
					</div>
				</div>
				
				<div class="row">
					<div class="alert alert-info">
						<s:if test="#session.errorMsg==null">
							??????????????????????????????????????????????????????
						</s:if>
						<s:else>
							<s:property value="#session.errorMsg" />
						</s:else>
					</div>
						
					<div class="col-xs-8" style="border: 0px solid red;">
						<div id="preview-pane" class="preview-pane">
					    	<div style="overflow:hidden; border:0px solid gray;width:400px;height:400px;">
								<s:if test="#session.imgFileName!=null and #session.imgFileName!=''">
									<img name="imgFileName" id="target" class="mainImage" src="<%=request.getContextPath() %>/<s:property value="#session.imgFileName"/>"/>
								</s:if>
								<s:else>
									??????????????????
								</s:else>
					    	</div>
					    </div>
					</div>
					<div class="col-xs-4" style="border: 0px solid red;">
						<div id="preview-pane" class="preview-pane">
					    	<div style="overflow:hidden; border:0px solid gray;width:210px;height:210px;">
					    		<s:if test="#session.cutPicPath!=null and #session.cutPicPath!=''">
								    <img id="preview" src="<%=request.getContextPath() %><s:property value="#session.cutPicPath"/>"/>
					    		</s:if>
						    </div>
					    </div>
					</div>
				</div>
				
			</div>
		</div>
	</div>
</div>
<%@ include file="/foot.jsp"%>
<%@ include file="/resource/common_js.jsp"%>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/jcrop/js/jquery.Jcrop.min.js"></script>
<script type="text/javascript">
	$(function() {
		
	});
	
	function search(){
		var _key = $.trim($("#key").val());
		if(_key==''){
			return false;
		}
		$("#searchForm").submit();
	}
	function checkCoords()
	{
		if (parseInt(jQuery('#width').val())>0) return true;
		alert('??????????????????????????????????????????');
		return false;
	};
</script>
<script type="text/javascript">
    var x;
	var y;
	var width;
	var height;
	
	
	$(function(){
		var xsize = $("#preview").width();
	    var ysize = $("#preview").height();
		var jcrop_api, boundx, boundy;
		//???????????????????????????
		$('#target').Jcrop({
			onChange: updatePreview,
			//onSelect: updatePreview,
			allowSelect:false,
			allowResize:false,
			bgFade:true,
			aspectRatio: xsize/ysize,  
			setSelect: [ 40, 40, 250, 250 ] //left,top,      
		},function(){
			// Use the API to get the real image size
			var bounds = this.getBounds();
			boundx = bounds[0];
			boundy = bounds[1];
			// Store the API in the jcrop_api variable
			jcrop_api = this;
		});
		//??????????????????????????????????????????????????????
		function updatePreview(c){
			if (parseInt(c.w) > 0){	
				$('#preview').css({
					width: Math.round(xsize / c.w * boundx) + 'px',
					height: Math.round(ysize /c.h * boundy) + 'px',
					marginLeft: '-' + Math.round(xsize / c.w * c.x) + 'px',
					marginTop: '-' + Math.round(ysize / c.h * c.y) + 'px'
				});   
				$('#width').val(c.w);  //c.w ??????????????????
				$('#height').val(c.h); //c.h ??????????????????
				$('#x').val(c.x);  //c.x ????????????????????????????????????????????????????????????x??????
				$('#y').val(c.y);  //c.y ?????????????????????y??????
				    
				$('#boundx').val(boundx);  //c.y ?????????????????????y??????
				$('#boundy').val(boundy);  //c.y ?????????????????????y??????
			}
		  };
	});
</script>
</body>
</html>
