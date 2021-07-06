<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>学生实习就业信息统计</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link rel="stylesheet" href="../lib/layui-v2.6.3/css/layui.css" media="all">
		<link rel="stylesheet" href="../lib/font-awesome-4.7.0/css/font-awesome.min.css" media="all">
		<link rel="stylesheet" href="../css/public.css" media="all">
		<style>
			.top-panel {
				border: 1px solid #eceff9;
				border-radius: 5px;
				text-align: center;
			}

			.top-panel>.layui-card-body {
				height: 60px;
			}

			.top-panel-number {
				line-height: 60px;
				font-size: 30px;
				border-right: 1px solid #eceff9;
			}

			.top-panel-tips {
				line-height: 30px;
				font-size: 12px
			}
		</style>
	</head>
	<body>
		<!--<div class="layuimini-container">-->
		<div class="layuimini-main">

			<div class="layui-row layui-col-space15">
				<div class="layui-col-xs12 layui-col-md3">

					<div class="layui-card top-panel">
						<div class="layui-card-header">班级总人数</div>
						<div class="layui-card-body">
							<div class="layui-row layui-col-space5">
								<div class="layui-col-xs8 layui-col-md8 top-panel-number">
									${studentCount.allCount}
								</div>
								<div class="layui-col-xs4 layui-col-md4 top-panel-tips">
									<a style="color: #1aa094">截止目前</a><br />
									<a style="color: #bd3004">最新数据</a>
								</div>
							</div>
						</div>
					</div>

				</div>
				<div class="layui-col-xs12 layui-col-md3">

					<div class="layui-card top-panel">
						<div class="layui-card-header">考研考公人数</div>
						<div class="layui-card-body">
							<div class="layui-row layui-col-space5">
								<div class="layui-col-xs8 layui-col-md8 top-panel-number">
									${studentCount.entrance + studentCount.kaoGong}
								</div>
								<div class="layui-col-xs4 layui-col-md4 top-panel-tips">
									<a style="color: #1aa094">截止目前</a><br />
									<a style="color: #bd3004">最新数据</a>
								</div>
							</div>
						</div>
					</div>

				</div>
				<div class="layui-col-xs12 layui-col-md3">

					<div class="layui-card top-panel">
						<div class="layui-card-header">实习就业人数</div>
						<div class="layui-card-body">
							<div class="layui-row layui-col-space5">
								<div class="layui-col-xs8 layui-col-md8 top-panel-number">
									${studentCount.internship}
								</div>
								<div class="layui-col-xs4 layui-col-md4 top-panel-tips">
									<a style="color: #1aa094">截止目前</a><br />
									<a style="color: #bd3004">最新数据</a>
								</div>
							</div>
						</div>
					</div>

				</div>
				<div class="layui-col-xs12 layui-col-md3">

					<div class="layui-card top-panel">
						<div class="layui-card-header">待定人数</div>
						<div class="layui-card-body">
							<div class="layui-row layui-col-space5">
								<div class="layui-col-xs8 layui-col-md8 top-panel-number">
									${studentCount.others}
								</div>
								<div class="layui-col-xs4 layui-col-md4 top-panel-tips">
									<a style="color: #1aa094">截止目前</a><br />
									<a style="color: #bd3004">最新数据</a>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>

			<div class="layui-row layui-col-space15">
				<div class="layui-col-xs12 layui-col-md9">
					<div id="echarts-records" style="background-color:#ffffff;min-height:400px;padding: 10px"></div>
				</div>
				<div class="layui-col-xs12 layui-col-md3">
					<div id="echarts-pies" style="background-color:#ffffff;min-height:400px;padding: 10px"></div>
				</div>
			</div>

		</div>
		<!--</div>-->
		<script src=".././lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
		<script src=".././lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
		<script src=".././js/api.js?t=1" charset="UTF-8"></script>
		<script src="../js/lay-config.js?v=1.0.4" charset="utf-8"></script>
		<script>
			layui.use(['layer', 'echarts'], function() {
						var $ = layui.jquery,
							layer = layui.layer,
							echarts = layui.echarts;

						getStudentCount();
						/**
						 * 报表功能
						 */
						var echartsRecords = echarts.init(document.getElementById('echarts-records'), 'walden');

						var optionRecords = {
							xAxis: {
								type: 'category',
								data: ['考公', '考研', '实习', '待定']
							},
							yAxis: {
								type: 'value'
							},
							series: [{
									data: ['${studentCount.kaoGong}', 
												'${studentCount.entrance}',
												'${studentCount.internship}', 
												{
													value: '${studentCount.others}',
													itemStyle: {
														color: '#a90000'
													}
												}],
										type: 'bar'
									}],
							tooltip:{
								trigger: 'axis',
								formatter:function(params){
														return params[0].name + "人数有："+params[0].value
													}
							}
							};
							echartsRecords.setOption(optionRecords);


							/**
							 * 玫瑰图表
							 */
							var echartsPies = echarts.init(document.getElementById('echarts-pies'), 'walden');
							var optionPies = {
								title: {
									text: '前四实习地点分布',
									left: 'center'
								},
								tooltip: {
									trigger: 'item',
									formatter: '{a} <br/>{b} : {c} ({d}%)'
								},
								series: [{
									name: '实习情况',
									type: 'pie',
									radius: '55%',
									center: ['50%', '60%'],
									roseType: 'radius',
									data: [{
											value: 88,
											name: '成都'
										},
										{
											value: 80,
											name: '宜宾'
										},
										{
											value: 50,
											name: '重庆'
										},
										{
											value: 22,
											name: '其它'
										}
									],
									emphasis: {
										itemStyle: {
											shadowBlur: 10,
											shadowOffsetX: 0,
											shadowColor: 'rgba(0, 0, 0, 0.5)'
										}
									}
								}]
							};
							echartsPies.setOption(optionPies);

							// echarts 窗口缩放自适应
							window.onresize = function() {
								echartsRecords.resize();
							}

						});

					function getStudentCount() {
						getNotData("/api/home?method=getStudentCount").then(result => {
							console.log(result)
						})
					}
		</script>
	</body>
</html>
