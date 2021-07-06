<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>修改学生信息</title>
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
					<input type="radio" name="sex" value="男" title="男" checked="" disabled="">
					<input type="radio" name="sex" value="女" title="女" disabled="">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label required">学号</label>
				<div class="layui-input-block">
					<input type="number" name="sid" lay-verify="required" lay-reqtext="学号不能为空" placeholder="请输入学号"
						value="" class="layui-input" disabled="">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label required">手机</label>
				<div class="layui-input-block">
					<input type="number" name="cellphone" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机"
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
			/**
			 * 获取编辑页面传递的用户id
			 */
			var studenInfo = {};
			// window.studenInfo = {}
			var test = "";
			var thisURL = decodeURI(document.URL); // 获取当前页面的 url, 用decodeURI() 解码
			var getVal = thisURL.split('?')[1].split("=")[1];
			var path = "/api/stud?method=findStuInfoById&id=" + getVal;
			getNotData(path).then(result => {
				setCookie("studenInfo=", JSON.stringify(result), 0.001);
				test = getCookie("studenInfo");
				studenInfo = JSON.parse(test);
			})
			
			layui.use(['form'], function() {
				var form = layui.form,
					layer = layui.layer,
					$ = layui.$;
					
				form.val("frome", {
					"username": studenInfo.username,
					"sex": studenInfo.sex,
					"sid": studenInfo.sid,
					"cellphone": studenInfo.cellphone,
					"city": studenInfo.city,
					"dormid": studenInfo.dormid,
					"birthdata": studenInfo.birthdata,
					"status": studenInfo.status,
					"classid": studenInfo.classid
				});

				//监听提交
				form.on('submit(saveBtn)', function(data) {
					data.field.id = studenInfo.id;
					data.field.sid = parseInt(data.field.sid);
					data.field.status = parseInt(data.field.status);
					console.log(data.field)
					updateInfo(data.field);
				});

			});

			function getCookie(cname) {
				var name = cname + "=";
				var ca = document.cookie.split(';');
				for (var i = 0; i < ca.length; i++) {
					var c = ca[i].trim();
					if (c.indexOf(name) == 0) {
						return c.substring(name.length, c.length);
					}
				}
				return "";
			}

			function setCookie(cname, cvalue, exdays) {
				var d = new Date();
				d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
				var expires = "expires=" + d.toGMTString();
				document.cookie = cname + "" + cvalue + "; " + expires;
			}
			
			function updateInfo(data){
				postHasData("/api/stud?method=updateStuInfoById",data).then(result => {
					console.log(result);
					var index = layer.alert(result.message, {
						title: '修改结果'
					}, function() {
						// 关闭弹出层
						layer.close(index);
						var iframeIndex = parent.layer.getFrameIndex(window.name);
						parent.layer.close(iframeIndex);
						parent.location.reload();
					});
					return false;
				})
			}
		</script>
	</body>
</html>
