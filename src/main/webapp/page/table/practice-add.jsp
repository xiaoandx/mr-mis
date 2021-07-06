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
				<label class="layui-form-label required">学号</label>
				<div class="layui-input-block">
					<input type="number" name="sid" lay-verify="required" lay-reqtext="学号不能为空" placeholder="请输入学号"
						value="" class="layui-input" >
					<tip>学号不可修改</tip>
				</div>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label required">学生姓名</label>
				<div class="layui-input-block">
					<input type="text" name="sname" lay-verify="required" lay-reqtext="学生姓名不能为空" placeholder="请输入学生姓名"
						value="" class="layui-input">
				</div>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label required">就业状态</label>
				<div class="layui-input-block">
					<input type="radio" name="status" value="1" title="考公">
					<input type="radio" name="status" value="2" title="考研" checked="">
					<input type="radio" name="status" value="3" title="实习">
					<input type="radio" name="status" value="4" title="待定">
				</div>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label required">是否离校</label>
				<div class="layui-input-block">
					<input type="radio" name="isleaving" value="1" title="离校">
					<input type="radio" name="isleaving" value="0" title="在校" checked="">
				</div>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">公司名称</label>
				<div class="layui-input-block">
					<input type="text" name="companyname" lay-reqtext="公司名称不能为空"
						placeholder="请输入公司名称" value="" class="layui-input">
				</div>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">公司地址</label>
				<div class="layui-input-block">
					<input type="text" name="companyplace" lay-reqtext="公司地址不能为空"
						placeholder="请输入公司地址" value="" class="layui-input">
				</div>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">公司联系</label>
				<div class="layui-input-block">
					<input type="text" name="contactinformation" lay-reqtext="公司联系方式不能为空"
						placeholder="请输入公司联系方式" value="" class="layui-input">
				</div>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">实习薪资</label>
				<div class="layui-input-block">
					<input type="text" name="salary" lay-reqtext="实习薪资不能为空" placeholder="请输入实习薪资"
						value="" class="layui-input">
					<tip>格式为：5400</tip>
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
						"sid": parseInt(data.field.sid),
						"sname": data.field.sname,
						"status": parseInt(data.field.status),
						"isleaving": parseInt(data.field.isleaving),
						"companyname": data.field.companyname,
						"companyplace": data.field.companyplace,
						"contactinformation": data.field.contactinformation,
						"salary": data.field.salary
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
				postHasData("/api/practice?method=insertPractice",data).then(result => {
				})
			}
		</script>
	</body>
</html>
