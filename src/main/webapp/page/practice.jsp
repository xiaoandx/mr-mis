<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:if test="${loginUser.rid != 1} ">
		<c:redirect url="index.jsp#/page/403.html"></c:redirect>
	</c:if>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>实习信息列表</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link rel="stylesheet" href="../lib/layui-v2.6.3/css/layui.css" media="all">
		<link rel="stylesheet" href="../css/public.css" media="all">
	</head>
	<body>
		<div class="layuimini-container">
			<div class="layuimini-main">

				<fieldset class="table-search-fieldset">
					<legend>搜索信息</legend>
					<div style="margin: 10px 10px 10px 10px">
						<form class="layui-form layui-form-pane" action="">
							<div class="layui-form-item">
								<div class="layui-inline">
									<label class="layui-form-label">学生姓名</label>
									<div class="layui-input-inline">
										<input type="text" name="username" autocomplete="off" class="layui-input" placeholder="准确输入">
									</div>
								</div>
								<div class="layui-inline">
									<label class="layui-form-label">学号</label>
									<div class="layui-input-inline">
										<input type="text" name="sid" autocomplete="off" class="layui-input" placeholder="准确输入">
									</div>
								</div>
								<div class="layui-inline">
									<button type="submit" class="layui-btn layui-btn-primary" lay-submit
										lay-filter="data-search-btn"><i class="layui-icon"></i> 搜 索</button>
								</div>
							</div>
						</form>
					</div>
				</fieldset>

				<script type="text/html" id="toolbarDemo">
					<div class="layui-btn-container">
						<button class="layui-btn layui-btn-normal layui-btn-sm data-add-btn" lay-event="add"> 添加 </button>
						<button class="layui-btn layui-btn-sm layui-btn-danger data-delete-btn" lay-event="delete"> 删除 </button>
						<button class="layui-btn layui-btn-sm" style="background-color: #10A9FF;" id="importExcel">
							<i class="layui-icon"></i>导入新的学生数据
						</button>
						<button class="layui-btn layui-btn-sm layui-btn-disabled" style="background-color: #ffffff;" id="importExcel" datafld="">
							<i style="color: #000000;">导入新数据前，请先导出现有的数据模板，清空数据后加入新的学生信息</i>
						</button>
						 
					</div>
				</script>

				<table class="layui-hide" id="currentTableId" lay-filter="currentTableFilter"></table>

				<!-- 			<script type="text/html" id="textsss">
					<span class="layui-badge layui-bg-blue"></span>
				</script> -->

				<script type="text/html" id="currentTableBar">
					<a class="layui-btn layui-btn-normal layui-btn-xs data-count-edit" lay-event="edit">编辑</a>
					<a class="layui-btn layui-btn-xs layui-btn-danger data-count-delete" lay-event="delete">删除</a>
				</script>

			</div>
		</div>
		<script src=".././lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
		<script src=".././lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
		<script src=".././js/api.js?t=1" charset="UTF-8"></script>
		<script>
			layui.config({
				base: '../lib/layui_exts/'
			}).extend({
				excel: 'excel'
			});					
			layui.use(['form', 'table', 'excel', 'upload'], function() {
				var $ = layui.jquery,
					form = layui.form,
					table = layui.table,
					upload = layui.upload,
					excel = layui.excel;

				table.render({
					elem: '#currentTableId',
					url: '/api/practice?method=findAllPracticeToPage',
					toolbar: '#toolbarDemo',
					defaultToolbar: ['filter', 'exports', 'print', {
						title: '提示',
						layEvent: 'LAYTABLE_TIPS',
						icon: 'layui-icon-tips'
					}],
					cols: [
						[{
								type: "checkbox",
								width: 50
							},
							{
								field: 'sid',
								width: 110,
								title: '学号',
								sort: true
							},
							{
								field: 'sname',
								width: 100,
								title: '姓名'
							},
							{
								field: 'status',
								width: 110,
								title: '实习状态',
								align: "center",
								templet: function(d) {
									if (d.status == 1) {
										return '<span class="layui-badge layui-bg-blue">考公</span>';
									}
									if (d.status == 2) {
										return '<span class="layui-badge layui-bg-red">考研</span>';
									}
									if (d.status == 3) {
										return '<span class="layui-badge-rim layui-bg-orange">实习</span>';
									} else {
										return '<span class="layui-badge layui-bg-gray">待定</span>';
									}
								}
							},
							{
								field: 'isleaving',
								width: 120,
								title: '是否离校',
								align: "center",
								templet: function(d) {
									if (d.isleaving == 1) {
										return '<span class="layui-badge-rim layui-bg-orange">离校</span>';
									} else {
										return '<span class="layui-badge layui-bg-gray">在校</span>';
									}
								}
							},
							{
								field: 'companyname',
								title: '公司名称',
								width: 200
							},
							{
								field: 'companyplace',
								width: 200,
								title: '公司地点'
							},
							{
								field: 'contactinformation',
								width: 120,
								align: "center",
								title: '公司联系方式'
							},
							{
								field: 'salary',
								width: 100,
								align: "center",
								title: '实习薪资'
							},
							{
								title: '操作',
								minWidth: 80,
								toolbar: '#currentTableBar',
								align: "center"
							}
						]
					],
					limits: [5, 15, 20, 25, 50, 100],
					limit: 5,
					page: true,
					skin: 'line',
					request: {
					  pageName: 'page',
					}
				});

				// 监听搜索操作
				form.on('submit(data-search-btn)', function(data) {
					if(data.field.username == '' && data.field.sid == ''){
						layer.alert('搜索内容为空,请填写搜索信息', {
						  icon: 5
						})
						location.reload();
						return false;
					}else{
						var result = JSON.stringify(data.field);
						var path = "/api/practice?method=search&page=1&limit=5";
						if(data.field.username != ''){
							path += ("&sname=" + data.field.username);
						}
						if(data.field.sid != ''){
							path += ("&sid="+parseInt(data.field.sid));
						}
						searchPractice(path,table);
						return false;
					}
				});

				/**
				 * toolbar监听事件
				 */
				var deletePracticeTrs = new Array();
				table.on('toolbar(currentTableFilter)', function(obj) {
					if (obj.event === 'add') { // 监听添加操作
						var index = layer.open({
							title: '添加用户',
							type: 2,
							shade: 0.2,
							maxmin: true,
							shadeClose: true,
							area: ['60%', '100%'],
							content: '../page/table/practice-add.jsp',
						});
						$(window).on("resize", function() {
							layer.full(index);
						});
					} else if (obj.event === 'delete') { // 监听删除操作
						var checkStatus = table.checkStatus('currentTableId'),
							data = checkStatus.data;
						layer.confirm('真的删除行么', function(index) {
							for(var i = 0;i<data.length;i++){
								var path = "/api/practice?method=deleteInternShipById&sid=" + data[i].sid
								deletePracticeById(path);
							}
							for(var i=0;i<deletePracticeTrs.length;i++){
								deletePracticeTrs[i].del()
							}
							layer.close(index);
						});
					}
				});

				//监听表格复选框选择
				table.on('checkbox(currentTableFilter)', function(obj) {
					deletePracticeTrs[deletePracticeTrs.length] = obj;
				});
				
				//单个用户的操作
				table.on('tool(currentTableFilter)', function(obj) {
					var data = obj.data;
					var jsonOb = JSON.stringify(data);
					var dataOb = JSON.parse(jsonOb);
					if (obj.event === 'edit') {
						var index = layer.open({
							title: '编辑用户',
							type: 2,
							shade: 0.2,
							maxmin: true,
							shadeClose: true,
							area: ['100%', '100%'],
							content: '../page/table/practice-edit.jsp?sid=' + dataOb.sid,
						});
						$(window).on("resize", function() {
							layer.full(index);
						});
						return false;
						
					} else if (obj.event === 'delete') {
						layer.confirm('真的删除行么', function(index) {
							console.log("delete sid"+dataOb.sid)
							var path = "/api/practice?method=deleteInternShipById&sid=" + dataOb.sid
							deletePracticeById(path);
							obj.del();
							layer.close(index);
						});
					}
				});
				
				//上传文件
				upload.render({
					//绑定元素
					elem: '#fimportExcel',
					//上传接口（PS:这里不用传递整个 excel）
					url: '',
					//选择文件后不自动上传
					auto: false,
					accept: 'file',
					exts: 'xls|xlsx|xlsm|xlt|xltx|csv',
					choose: function(obj) {
						var files = obj.pushFile()
						var fileArr = Object.values(files) 
						for (var index in files) {
							if (files.hasOwnProperty(index)) {
								delete files[index]
							}
						}
						uploadExcel(fileArr,excel) 
					}
				})
			});
			
			/**
			 * 上传excel的处理函数，传入文件对象数组
			 * @param  {[type]} files [description]
			 * @return {[type]}       [description]
			 */
			function uploadExcel(files,excel) {
				console.log(excel)
				try {
					excel.importExcel(files, {
						// 读取数据的同时梳理数据
						fields: {
							"sid": "A",
							"sname": "B",
							"status": "C",
							"isleaving": "D",
							"companyname": "E",
							"companyplace": "F",
							"contactinformation": "G",
							"salary": "H"
						}
					}, function(data) {
						$.each(data, function(index, obj) {
							$.each(obj.Sheet1, function(index, object) {
								var islea = (object.isleaving == "在校")?0:1;
								var sta = (object.status == "考研")?1:(object.status == "考公")?2:(object.status == "实习")?3:4;
								var newStuInfo ={
									"sid": parseInt(object.sid),
									"sname": object.sname,
									"status": sta,
									"isleaving": islea,
									"companyname": object.companyname,
									"companyplace": object.companyplace,
									"contactinformation": object.contactinformation.toString(),
									"salary": object.salary.toString()
								}
								var sid = object.sid;
								if (sid == '' ||sid == "学号") { } else {
									layer.load(1);
									setTimeout(function(){
									  layer.closeAll('loading');
									}, 3000);
									insertPractice(newStuInfo);
									location.reload();
								}
							})
						});
					})
				} catch (e) {
					layer.alert(e.message)
				}
			}

			/**
			 * @Description: 删除指定用户Byid
			 * author: WEI.ZHOU
			 * @param: 			删除url
			 * @date: 2021-6-11 12:30:42 ?F10: PM?
			 * @version: v1.0.0
			 */
			function deletePracticeById(path) {
				postNotData(path).then(result => {
				})
			}
			
			function insertPractice(data){
				postHasData("/api/practice?method=insertPractice",data).then(result => {
				})
			}
			
			function searchPractice(path,table){
				//执行搜索重载
				table.render({
					elem: '#currentTableId',
					url: path,
					toolbar: '#toolbarDemo',
					defaultToolbar: ['filter', 'exports', 'print', {
						title: '提示',
						layEvent: 'LAYTABLE_TIPS',
						icon: 'layui-icon-tips'
					}],
					cols: [
						[{
								type: "checkbox",
								width: 50
							},
							{
								field: 'sid',
								width: 110,
								title: '学号',
								sort: true
							},
							{
								field: 'sname',
								width: 80,
								title: '姓名'
							},
							{
								field: 'status',
								width: 110,
								title: '实习状态',
								align: "center",
								templet: function(d) {
									if (d.status == 1) {
										return '<span class="layui-badge layui-bg-blue">考公</span>';
									}
									if (d.status == 2) {
										return '<span class="layui-badge layui-bg-red">考研</span>';
									}
									if (d.status == 3) {
										return '<span class="layui-badge-rim layui-bg-orange">实习</span>';
									} else {
										return '<span class="layui-badge layui-bg-gray">待定</span>';
									}
								}
							},
							{
								field: 'isleaving',
								width: 120,
								title: '是否离校',
								align: "center",
								templet: function(d) {
									if (d.isleaving == 1) {
										return '<span class="layui-badge-rim layui-bg-orange">离校</span>';
									} else {
										return '<span class="layui-badge layui-bg-gray">在校</span>';
									}
								}
							},
							{
								field: 'companyname',
								title: '公司名称',
								width: 200
							},
							{
								field: 'companyplace',
								width: 200,
								title: '公司地点'
							},
							{
								field: 'contactinformation',
								width: 120,
								align: "center",
								title: '公司联系方式'
							},
							{
								field: 'salary',
								width: 100,
								align: "center",
								title: '实习薪资'
							},
							{
								title: '操作',
								minWidth: 80,
								toolbar: '#currentTableBar',
								align: "center"
							}
						]
					],
					limits: [5, 15, 20, 25, 50, 100],
					limit: 5,
					page: true,
					skin: 'line',
					request: {
					  pageName: 'page',
					}
				});
			}
		</script>

	</body>
</html>
