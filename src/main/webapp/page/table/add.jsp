<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:if test="${loginUser.rid != 1} ">
		<c:redirect url="index.jsp#/page/403.html"></c:redirect>
	</c:if>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>添加学生信息</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link rel="stylesheet" href="../../lib/layui-v2.6.3/css/layui.css" media="all">
		<link rel="stylesheet" href="../../css/public.css" media="all">
		<style>
			body {
				background-color: #ffffff;
			}
		</style>
	</head>
	<body>
		<div class="layui-form layuimini-form" lay-filter="frome">
			<div class="layui-form-item">
				<label class="layui-form-label required">学生姓名</label>
				<div class="layui-input-block">
					<input type="text" name="username" lay-verify="required" lay-reqtext="学生姓名不能为空"
						placeholder="请输入学生姓名" value="" class="layui-input">
					<tip>用户名不可修改</tip>
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label required">性别</label>
				<div class="layui-input-block">
					<input type="radio" name="sex" value="男" title="男" checked="" >
					<input type="radio" name="sex" value="女" title="女" >
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label required">学号</label>
				<div class="layui-input-block">
					<input type="number" name="sid" lay-verify="required" lay-reqtext="学号不能为空" placeholder="请输入学号"
						value="" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label required">手机</label>
				<div class="layui-input-block">
					<input type="number" name="cellphone" lay-verify="required|phone" autocomplete="off" lay-reqtext="手机不能为空" placeholder="请输入手机"
						value="" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label required">家庭地址</label>
				<div class="layui-input-block">
					<input type="text" name="city" lay-verify="required" lay-reqtext="家庭地址不能为空" placeholder="请输入家庭地址"
						value="" class="layui-input">
				</div>
			</div>
		
			<div class="layui-form-item">
				<label class="layui-form-label required">寝室号</label>
				<div class="layui-input-block">
					<input type="text" name="dormid" lay-verify="required" lay-reqtext="寝室号不能为空" placeholder="请输入寝室号"
						value="" class="layui-input">
				</div>
			</div>
		
			<div class="layui-form-item">
				<label class="layui-form-label required">出身年月</label>
				<div class="layui-input-block">
					<input type="text" name="birthdata" lay-verify="required" lay-reqtext="出身年月不能为空"
						placeholder="请输入出身年月" value="" class="layui-input">
					<tip>格式为：1998年10月12日</tip>
				</div>
			</div>
		
			<div class="layui-form-item">
				<label class="layui-form-label required">班级</label>
				<div class="layui-input-block">
					<input type="text" name="classid" lay-verify="required" lay-reqtext="班级不能为空" placeholder="请输入班级"
						value="" class="layui-input">
						<tip>格式为：2018.9</tip>
				</div>
			</div>
		
			<div class="layui-form-item">
				<label class="layui-form-label required">就业状态</label>
				<div class="layui-input-block">
					<input type="radio" name="status" value="1" title="考公">
					<input type="radio" name="status" value="2" title="考研">
					<input type="radio" name="status" value="3" title="实习">
					<input type="radio" name="status" value="4" title="待定">
				</div>
			</div>
		
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn layui-btn-normal" lay-submit lay-filter="saveBtn">确认保存</button>
				</div>
			</div>
		</div>
		<script src="../../lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
		<script src="../../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
		<script src="../../js/api.js?t=1" charset="UTF-8"></script>
		<script>
			layui.use(['form'], function() {
				var form = layui.form,
					layer = layui.layer,
					$ = layui.$;

				//监听提交
				form.on('submit(saveBtn)', function(data) {
					
					var newStuInfo ={
						"username":data.field.username,
						"sid":parseInt(data.field.sid),
						"sex":data.field.sex,
						"city":data.field.city,
						"classid":data.field.classid,
						"cellphone":data.field.cellphone,
						"dormid":data.field.dormid,
						"birthdata":data.field.birthdata,
						"status":parseInt(data.field.status)
					}
					insertStuInfo(newStuInfo);
					var index = layer.alert(("添加学生成功"), {
						title: '添加状态'
					}, function() {
						layer.close(index);
						var iframeIndex = parent.layer.getFrameIndex(window.name);
						parent.layer.close(iframeIndex);
						parent.location.reload();
					});
					return false;
				});

			});
			
			function insertStuInfo(data){
				postHasData("/api/stud?method=insertStuInfo",data).then(result => {
				})
			}
		</script>
	</body>
</html>
