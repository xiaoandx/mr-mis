<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>实习就业登记系统登录</title>
		<meta name="keywords" content="实习就业登记系统登录">
		<meta name="description" content="实习就业登记系统登录">
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta http-equiv="Access-Control-Allow-Origin" content="*">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="format-detection" content="telephone=no">
		<link rel="icon" href="images/favicon.ico">
		<link rel="stylesheet" href="../lib/layui-v2.6.3/css/layui.css" media="all">
		<link rel="stylesheet" href="../css/layuimini.css?v=2.0.4.2" media="all">
		<link rel="stylesheet" href="../css/themes/default.css" media="all">
		<link rel="stylesheet" href="../lib/font-awesome-4.7.0/css/font-awesome.min.css" media="all">
		<!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
		<style id="layuimini-bg-color">
		</style>
	</head>
	<body class="layui-layout-body layuimini-all">
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header header">
				<div class="layui-logo layuimini-logo"></div>

				<div class="layuimini-header-content">
					<a>
						<div class="layuimini-tool"><i title="展开" class="fa fa-outdent" data-side-fold="1"></i></div>
					</a>

					<!--电脑端头部菜单-->
					<ul
						class="layui-nav layui-layout-left layuimini-header-menu layuimini-menu-header-pc layuimini-pc-show">
					</ul>

					<!--手机端头部菜单-->
					<ul class="layui-nav layui-layout-left layuimini-header-menu layuimini-mobile-show">
						<li class="layui-nav-item">
							<a href="javascript:;"><i class="fa fa-list-ul"></i> 选择模块</a>
							<dl class="layui-nav-child layuimini-menu-header-mobile">
							</dl>
						</li>
					</ul>

					<ul class="layui-nav layui-layout-right">

						<li class="layui-nav-item" lay-unselect>
							<a href="javascript:;" data-refresh="刷新"><i class="fa fa-refresh"></i></a>
						</li>
						<li class="layui-nav-item" lay-unselect>
							<a href="javascript:;" data-clear="清理" class="layuimini-clear"><i
									class="fa fa-trash-o"></i></a>
						</li>
						<li class="layui-nav-item mobile layui-hide-xs" lay-unselect>
							<a href="javascript:;" data-check-screen="full"><i class="fa fa-arrows-alt"></i></a>
						</li>
						<li class="layui-nav-item layuimini-setting">
							<a href="javascript:;">${loginUser.rid==1 ? "老师" : "学生"}</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="javascript:;" layuimini-content-href="page/user-password.jsp"
										data-title="修改密码" data-icon="fa fa-gears">修改密码</a>
								</dd>
								<dd>
									<hr>
								</dd>
								<dd>
									<a href="javascript:;" class="login-out">退出登录</a>
								</dd>
							</dl>
						</li>
						<li class="layui-nav-item layuimini-select-bgcolor" lay-unselect>
							<a href="javascript:;" data-bgcolor="更换主题"><i class="fa fa-ellipsis-v"></i></a>
						</li>
					</ul>
				</div>
			</div>

			<!--无限极左侧菜单-->
			<div class="layui-side layui-bg-black layuimini-menu-left">
			</div>

			<!--初始化加载层-->
			<div class="layuimini-loader">
				<div class="layuimini-loader-inner"></div>
			</div>

			<!--手机端遮罩层-->
			<div class="layuimini-make"></div>

			<!-- 移动导航 -->
			<div class="layuimini-site-mobile"><i class="layui-icon"></i></div>

			<div class="layui-body">

				<div class="layuimini-tab layui-tab-rollTool layui-tab" lay-filter="layuiminiTab" lay-allowclose="true">
					<ul class="layui-tab-title">
						<li class="layui-this" id="layuiminiHomeTabId" lay-id=""></li>
					</ul>
					<div class="layui-tab-control">
						<li class="layuimini-tab-roll-left layui-icon layui-icon-left"></li>
						<li class="layuimini-tab-roll-right layui-icon layui-icon-right"></li>
						<li class="layui-tab-tool layui-icon layui-icon-down">
							<ul class="layui-nav close-box">
								<li class="layui-nav-item">
									<a href="javascript:;"><span class="layui-nav-more"></span></a>
									<dl class="layui-nav-child">
										<dd><a href="javascript:;" layuimini-tab-close="current">关 闭 当 前</a></dd>
										<dd><a href="javascript:;" layuimini-tab-close="other">关 闭 其 他</a></dd>
										<dd><a href="javascript:;" layuimini-tab-close="all">关 闭 全 部</a></dd>
									</dl>
								</li>
							</ul>
						</li>
					</div>
					<div class="layui-tab-content">
						<div id="layuiminiHomeTabIframe" class="layui-tab-item layui-show"></div>
					</div>

				</div>

			</div>
		</div>
		<script src="../lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
		<script src="../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
		<script src="../js/api.js" charset="UTF-8"></script>
		<script src="../js/lay-config.js?v=2.0.0" charset="utf-8"></script>
		<script>
			layui.use(['jquery', 'layer', 'miniAdmin', 'miniTongji'], function() {

				var $ = layui.jquery,
					layer = layui.layer,
					miniAdmin = layui.miniAdmin,
					miniTongji = layui.miniTongji;

				var path = "";
				if ('${loginUser.rid}' == '') {
					layer.msg('没有登录无法访问，前往登录界面登录！');
					setTimeout(function() {
						window.location = 'login.jsp';
					}, 1000)
					return false;
				} else {
					path = "/api/home?method=getMenu&rid=" + '${loginUser.rid}';
				}

				var options = {
					iniUrl: path, // 初始化接口
					clearUrl: "api/clear.json", // 缓存清理接口
					urlHashLocation: true, // 是否打开hash定位
					bgColorDefault: false, // 主题默认配置
					multiModule: true, // 是否开启多模块
					menuChildOpen: false, // 是否默认展开菜单
					loadingTime: 0, // 初始化加载时间
					pageAnim: true, // iframe窗口动画
					maxTabNum: 20, // 最大的tab打开数量
				};

				miniAdmin.render(options);

				// 百度统计代码，只统计指定域名
				miniTongji.render({
					specific: true,
					domains: [
						'xiaoandx.club',
						'xiaoandx.club',
						'xiaoandx.club'
					],
				});

				$('.login-out').on("click", function() {
					outLogin()
					layer.msg('退出登录成功', function() {
						window.location = 'login.jsp';
					});
				});

				reurl()
			});

			function outLogin() {
				getNotData("/login?method=outLogin").then(result => {
					console.log(result);
				})
			}

			/**
			  * @Description: 刷新页面
			  * author: WEI.ZHOU
			  * @date: 2021-6-10 5:12:21 ?F10: PM?
			  * @version: v1.0.0
			  */
			function reurl() {
				url = location.href; //把当前页面的地址赋给变量 url
				var times = url.split("?"); //分切变量 url 分隔符号为 "?"
				if (times[times.length - 1] != 1) { //如果?后的值不等于1表示没有刷新
					url += "?1"; //把变量 url 的值加入 ?1
					setTimeout(function() {
						self.location.replace(url); //刷新页面
					}, 1000)
				}
			}
			// onload = reurl;
		</script>
	</body>
</html>
