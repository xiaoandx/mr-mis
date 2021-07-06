<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>修改密码</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="../lib/font-awesome-4.7.0/css/font-awesome.min.css" media="all">
    <link rel="stylesheet" href="../css/public.css" media="all">
    <style>
        .layui-form-item .layui-input-company {width: auto;padding-right: 10px;line-height: 38px;}
    </style>
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">

        <div class="layui-form layuimini-form">
            <div class="layui-form-item">
                <label class="layui-form-label required">旧的密码</label>
                <div class="layui-input-block">
                    <input type="password" name="oldPassword" lay-verify="required" lay-reqtext="旧的密码不能为空" placeholder="请输入旧的密码"  value="" class="layui-input">
                    <tip>填写自己账号的旧的密码。</tip>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label required">新的密码</label>
                <div class="layui-input-block">
                    <input type="password" name="newPassword" lay-verify="required" lay-reqtext="新的密码不能为空" placeholder="请输入新的密码"  value="" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label required">新的密码</label>
                <div class="layui-input-block">
                    <input type="password" name="againPassword" lay-verify="required" lay-reqtext="新的密码不能为空" placeholder="请输入新的密码"  value="" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn layui-btn-normal" lay-submit lay-filter="saveBtn">确认保存</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script src=".././lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
<script src=".././lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script src=".././js/api.js?t=1" charset="UTF-8"></script>
<script src="../js/lay-config.js?v=1.0.4" charset="utf-8"></script>
<script>
	var rest = {};
    layui.use(['form','miniTab'], function () {
        var form = layui.form,
            layer = layui.layer,
            miniTab = layui.miniTab;

        //监听提交
        form.on('submit(saveBtn)', function (data) {
						var update = {
							"uid":'${loginUser.uid}',
							"oldPassword":data.field.oldPassword,
							"newPassword":data.field.newPassword,
							"againPassword":data.field.againPassword
						}
						if(data.field.newPassword != data.field.againPassword){
							layer.msg("确认密码错误！");
							return false;
						}
						updatePassword(update,miniTab);
						return false;
        });
    });
		
		function updatePassword(data,t){
			postHasData("/api/home?method=updatePassword",data).then(result => {
				rest = result;
				var msg = (result.status == 0)? "修改密码成功" : "密码修改失败";
				var index = layer.alert(msg, {
				    title: '修改密码结果'
				}, function () {
				    layer.close(index);
				    t.deleteCurrentByIframe();
				});
				return true;
			});
		}
</script>
</body>
</html>