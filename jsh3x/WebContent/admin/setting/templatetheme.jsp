<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="magi">
<title>模板 &middot; jshoper</title>
</head>

<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
	<!-- header 包含头部导航-->
	<%@include file="/admin/header.jsp"%>
	<!-- end header -->
	<div id="navigation" class="navbar">
		<div class="navbar-innert">
			<a class="brand" href="#"><img
				src="<%=basePath%>admin/ui/assets/img/logo.png" width="175"
				height="30" alt=""></a> <a class="brand" href="#">模板主题</a> <a
				class="brand2">编辑模板主题</a>
		</div>

	</div>
	<div class="container-fluid containerb">

		<div class="row-fluid">

			<div class="span2">
				<!-- 引入左侧导航 -->
				<%@include file="/admin/left.jsp"%>
			</div>

			<div id="mainlogic" class="span10">
				<div class="alert alert-success">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>说明</strong> 请根据需要编辑模板主题信息
				</div>
				<div id="alerterror" style="display: none;"
					class="alert alert-error">
					<a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>
				</div>
				<div class="line-dotted"></div>
				<div class="btn-group">
					<button id="btnback" type="button" class="btn btn-success">返回</button>
				</div>
				<!-- 开始显示form表单 -->
				<div class="form-actions">
					<div class="form-inline">
						<span class="label label-required">主题名称: </span> <input
							id="themename" name="themename" type="text" value=""
							class="small" /> <span class="label label-info">主题名称只能由数字和字母组成</span>
					</div>
					<div class="form-inline">
						<span class="label label-required">说明:</span> <input id="note"
							name="note" type="text" class="small" />
					</div>
					<div class="form-inline">
						<span class="label label-required">标示:</span> <input id="sign"
							name="sign" type="text" value="" /> <span
							class="label label-info">标示必须是全局唯一的，系统通过标示来寻找静态化数据和模板主题的关系，标示只能由数字和字母组成</span>
					</div>

					<div class="form-inline">
						<span class="label label-required">启用:</span> <label>是</label> <input
							id="status" name="status" type="checkbox" checked="checked" />
					</div>
					<div class="form-inline">
						<label class="label label-submit"></label> <input type="hidden"
							id="ttid" name="ttid" value="" /> <input class="btn btn-success"
							type="button" id="submit" name="submit" value="提交" /> <input
							class="btn btn-success" type="button" id="modify" name="modify"
							value="更新" style="display: none;" />

					</div>
				</div>
			</div>

		</div>

	</div>

	<script type="text/javascript"
		src="<%=basePath%>admin/js/setting/templatethemementjs.js"></script>

	<%@include file="/admin/footer.jsp"%>

</body>
</html>

