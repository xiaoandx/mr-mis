/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-06-26 07:38:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<title>实习就业登记系统登录</title>\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"实习就业登记系统登录\">\r\n");
      out.write("\t\t<meta name=\"description\" content=\"实习就业登记系统登录\">\r\n");
      out.write("\t\t<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t\t<meta http-equiv=\"Access-Control-Allow-Origin\" content=\"*\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t\t<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"images/favicon.ico\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../lib/layui-v2.6.3/css/layui.css\" media=\"all\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/layuimini.css?v=2.0.4.2\" media=\"all\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/themes/default.css\" media=\"all\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../lib/font-awesome-4.7.0/css/font-awesome.min.css\" media=\"all\">\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/html5shiv/r29/html5.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\t\t<style id=\"layuimini-bg-color\">\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"layui-layout-body layuimini-all\">\r\n");
      out.write("\t\t<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\t\t\t<div class=\"layui-header header\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-logo layuimini-logo\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"layuimini-header-content\">\r\n");
      out.write("\t\t\t\t\t<a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layuimini-tool\"><i title=\"展开\" class=\"fa fa-outdent\" data-side-fold=\"1\"></i></div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--电脑端头部菜单-->\r\n");
      out.write("\t\t\t\t\t<ul\r\n");
      out.write("\t\t\t\t\t\tclass=\"layui-nav layui-layout-left layuimini-header-menu layuimini-menu-header-pc layuimini-pc-show\">\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--手机端头部菜单-->\r\n");
      out.write("\t\t\t\t\t<ul class=\"layui-nav layui-layout-left layuimini-header-menu layuimini-mobile-show\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\"><i class=\"fa fa-list-ul\"></i> 选择模块</a>\r\n");
      out.write("\t\t\t\t\t\t\t<dl class=\"layui-nav-child layuimini-menu-header-mobile\">\r\n");
      out.write("\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\" lay-unselect>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" data-refresh=\"刷新\"><i class=\"fa fa-refresh\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\" lay-unselect>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" data-clear=\"清理\" class=\"layuimini-clear\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-trash-o\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item mobile layui-hide-xs\" lay-unselect>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" data-check-screen=\"full\"><i class=\"fa fa-arrows-alt\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item layuimini-setting\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.rid==1 ? \"老师\" : \"学生\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\" layuimini-content-href=\"page/user-password.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-title=\"修改密码\" data-icon=\"fa fa-gears\">修改密码</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"login-out\">退出登录</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item layuimini-select-bgcolor\" lay-unselect>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" data-bgcolor=\"更换主题\"><i class=\"fa fa-ellipsis-v\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--无限极左侧菜单-->\r\n");
      out.write("\t\t\t<div class=\"layui-side layui-bg-black layuimini-menu-left\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--初始化加载层-->\r\n");
      out.write("\t\t\t<div class=\"layuimini-loader\">\r\n");
      out.write("\t\t\t\t<div class=\"layuimini-loader-inner\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--手机端遮罩层-->\r\n");
      out.write("\t\t\t<div class=\"layuimini-make\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 移动导航 -->\r\n");
      out.write("\t\t\t<div class=\"layuimini-site-mobile\"><i class=\"layui-icon\"></i></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"layui-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"layuimini-tab layui-tab-rollTool layui-tab\" lay-filter=\"layuiminiTab\" lay-allowclose=\"true\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"layui-tab-title\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-this\" id=\"layuiminiHomeTabId\" lay-id=\"\"></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-tab-control\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layuimini-tab-roll-left layui-icon layui-icon-left\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layuimini-tab-roll-right layui-icon layui-icon-right\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-tab-tool layui-icon layui-icon-down\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"layui-nav close-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\"><span class=\"layui-nav-more\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<dd><a href=\"javascript:;\" layuimini-tab-close=\"current\">关 闭 当 前</a></dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<dd><a href=\"javascript:;\" layuimini-tab-close=\"other\">关 闭 其 他</a></dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<dd><a href=\"javascript:;\" layuimini-tab-close=\"all\">关 闭 全 部</a></dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-tab-content\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"layuiminiHomeTabIframe\" class=\"layui-tab-item layui-show\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script src=\"../lib/jquery-3.4.1/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../lib/layui-v2.6.3/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\"../js/api.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("\t\t<script src=\"../js/lay-config.js?v=2.0.0\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tlayui.use(['jquery', 'layer', 'miniAdmin', 'miniTongji'], function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar $ = layui.jquery,\r\n");
      out.write("\t\t\t\t\tlayer = layui.layer,\r\n");
      out.write("\t\t\t\t\tminiAdmin = layui.miniAdmin,\r\n");
      out.write("\t\t\t\t\tminiTongji = layui.miniTongji;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar path = \"\";\r\n");
      out.write("\t\t\t\tif ('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.rid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("' == '') {\r\n");
      out.write("\t\t\t\t\tlayer.msg('没有登录无法访问，前往登录界面登录！');\r\n");
      out.write("\t\t\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t\t\twindow.location = 'login.jsp';\r\n");
      out.write("\t\t\t\t\t}, 1000)\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tpath = \"/api/home?method=getMenu&rid=\" + '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.rid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar options = {\r\n");
      out.write("\t\t\t\t\tiniUrl: path, // 初始化接口\r\n");
      out.write("\t\t\t\t\tclearUrl: \"api/clear.json\", // 缓存清理接口\r\n");
      out.write("\t\t\t\t\turlHashLocation: true, // 是否打开hash定位\r\n");
      out.write("\t\t\t\t\tbgColorDefault: false, // 主题默认配置\r\n");
      out.write("\t\t\t\t\tmultiModule: true, // 是否开启多模块\r\n");
      out.write("\t\t\t\t\tmenuChildOpen: false, // 是否默认展开菜单\r\n");
      out.write("\t\t\t\t\tloadingTime: 0, // 初始化加载时间\r\n");
      out.write("\t\t\t\t\tpageAnim: true, // iframe窗口动画\r\n");
      out.write("\t\t\t\t\tmaxTabNum: 20, // 最大的tab打开数量\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tminiAdmin.render(options);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 百度统计代码，只统计指定域名\r\n");
      out.write("\t\t\t\tminiTongji.render({\r\n");
      out.write("\t\t\t\t\tspecific: true,\r\n");
      out.write("\t\t\t\t\tdomains: [\r\n");
      out.write("\t\t\t\t\t\t'xiaoandx.club',\r\n");
      out.write("\t\t\t\t\t\t'xiaoandx.club',\r\n");
      out.write("\t\t\t\t\t\t'xiaoandx.club'\r\n");
      out.write("\t\t\t\t\t],\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$('.login-out').on(\"click\", function() {\r\n");
      out.write("\t\t\t\t\toutLogin()\r\n");
      out.write("\t\t\t\t\tlayer.msg('退出登录成功', function() {\r\n");
      out.write("\t\t\t\t\t\twindow.location = 'login.jsp';\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treurl()\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction outLogin() {\r\n");
      out.write("\t\t\t\tgetNotData(\"/login?method=outLogin\").then(result => {\r\n");
      out.write("\t\t\t\t\tconsole.log(result);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t  * @Description: 刷新页面\r\n");
      out.write("\t\t\t  * author: WEI.ZHOU\r\n");
      out.write("\t\t\t  * @date: 2021-6-10 5:12:21 ?F10: PM?\r\n");
      out.write("\t\t\t  * @version: v1.0.0\r\n");
      out.write("\t\t\t  */\r\n");
      out.write("\t\t\tfunction reurl() {\r\n");
      out.write("\t\t\t\turl = location.href; //把当前页面的地址赋给变量 url\r\n");
      out.write("\t\t\t\tvar times = url.split(\"?\"); //分切变量 url 分隔符号为 \"?\"\r\n");
      out.write("\t\t\t\tif (times[times.length - 1] != 1) { //如果?后的值不等于1表示没有刷新\r\n");
      out.write("\t\t\t\t\turl += \"?1\"; //把变量 url 的值加入 ?1\r\n");
      out.write("\t\t\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t\t\tself.location.replace(url); //刷新页面\r\n");
      out.write("\t\t\t\t\t}, 1000)\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t// onload = reurl;\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}