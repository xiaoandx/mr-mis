/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-06-25 12:00:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<title>??????????????????????????????</title>\r\n");
      out.write("\t\t<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../lib/layui-v2.6.3/css/layui.css\" media=\"all\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../lib/font-awesome-4.7.0/css/font-awesome.min.css\" media=\"all\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/public.css\" media=\"all\">\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t.top-panel {\r\n");
      out.write("\t\t\t\tborder: 1px solid #eceff9;\r\n");
      out.write("\t\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.top-panel>.layui-card-body {\r\n");
      out.write("\t\t\t\theight: 60px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.top-panel-number {\r\n");
      out.write("\t\t\t\tline-height: 60px;\r\n");
      out.write("\t\t\t\tfont-size: 30px;\r\n");
      out.write("\t\t\t\tborder-right: 1px solid #eceff9;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.top-panel-tips {\r\n");
      out.write("\t\t\t\tline-height: 30px;\r\n");
      out.write("\t\t\t\tfont-size: 12px\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!--<div class=\"layuimini-container\">-->\r\n");
      out.write("\t\t<div class=\"layuimini-main\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"layui-row layui-col-space15\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-col-xs12 layui-col-md3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card top-panel\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card-header\">???????????????</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-row layui-col-space5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layui-col-xs8 layui-col-md8 top-panel-number\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentCount.allCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layui-col-xs4 layui-col-md4 top-panel-tips\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color: #1aa094\">????????????</a><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color: #bd3004\">????????????</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-col-xs12 layui-col-md3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card top-panel\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card-header\">??????????????????</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-row layui-col-space5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layui-col-xs8 layui-col-md8 top-panel-number\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentCount.entrance + studentCount.kaoGong}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layui-col-xs4 layui-col-md4 top-panel-tips\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color: #1aa094\">????????????</a><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color: #bd3004\">????????????</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-col-xs12 layui-col-md3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card top-panel\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card-header\">??????????????????</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-row layui-col-space5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layui-col-xs8 layui-col-md8 top-panel-number\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentCount.internship}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layui-col-xs4 layui-col-md4 top-panel-tips\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color: #1aa094\">????????????</a><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color: #bd3004\">????????????</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-col-xs12 layui-col-md3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card top-panel\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card-header\">????????????</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-row layui-col-space5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layui-col-xs8 layui-col-md8 top-panel-number\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentCount.others}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layui-col-xs4 layui-col-md4 top-panel-tips\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color: #1aa094\">????????????</a><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color: #bd3004\">????????????</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"layui-row layui-col-space15\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-col-xs12 layui-col-md9\">\r\n");
      out.write("\t\t\t\t\t<div id=\"echarts-records\" style=\"background-color:#ffffff;min-height:400px;padding: 10px\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-col-xs12 layui-col-md3\">\r\n");
      out.write("\t\t\t\t\t<div id=\"echarts-pies\" style=\"background-color:#ffffff;min-height:400px;padding: 10px\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--</div>-->\r\n");
      out.write("\t\t<script src=\".././lib/jquery-3.4.1/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t\t<script src=\".././lib/layui-v2.6.3/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\".././js/api.js?t=1\" charset=\"UTF-8\"></script>\r\n");
      out.write("\t\t<script src=\"../js/lay-config.js?v=1.0.4\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tlayui.use(['layer', 'echarts'], function() {\r\n");
      out.write("\t\t\t\t\t\tvar $ = layui.jquery,\r\n");
      out.write("\t\t\t\t\t\t\tlayer = layui.layer,\r\n");
      out.write("\t\t\t\t\t\t\techarts = layui.echarts;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tgetStudentCount();\r\n");
      out.write("\t\t\t\t\t\t/**\r\n");
      out.write("\t\t\t\t\t\t * ????????????\r\n");
      out.write("\t\t\t\t\t\t */\r\n");
      out.write("\t\t\t\t\t\tvar echartsRecords = echarts.init(document.getElementById('echarts-records'), 'walden');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar optionRecords = {\r\n");
      out.write("\t\t\t\t\t\t\txAxis: {\r\n");
      out.write("\t\t\t\t\t\t\t\ttype: 'category',\r\n");
      out.write("\t\t\t\t\t\t\t\tdata: ['??????', '??????', '??????', '??????']\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tyAxis: {\r\n");
      out.write("\t\t\t\t\t\t\t\ttype: 'value'\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tseries: [{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata: ['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentCount.kaoGong}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("', \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentCount.entrance}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentCount.internship}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("', \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentCount.others}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\titemStyle: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolor: '#a90000'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}],\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype: 'bar'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}],\r\n");
      out.write("\t\t\t\t\t\t\ttooltip:{\r\n");
      out.write("\t\t\t\t\t\t\t\ttrigger: 'axis',\r\n");
      out.write("\t\t\t\t\t\t\t\tformatter:function(params){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn params[0].name + \"????????????\"+params[0].value\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t\t\techartsRecords.setOption(optionRecords);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t/**\r\n");
      out.write("\t\t\t\t\t\t\t * ????????????\r\n");
      out.write("\t\t\t\t\t\t\t */\r\n");
      out.write("\t\t\t\t\t\t\tvar echartsPies = echarts.init(document.getElementById('echarts-pies'), 'walden');\r\n");
      out.write("\t\t\t\t\t\t\tvar optionPies = {\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext: '????????????????????????',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tleft: 'center'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttooltip: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttrigger: 'item',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tformatter: '{a} <br/>{b} : {c} ({d}%)'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tseries: [{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname: '????????????',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype: 'pie',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tradius: '55%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcenter: ['50%', '60%'],\r\n");
      out.write("\t\t\t\t\t\t\t\t\troseType: 'radius',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata: [{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue: 88,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname: '??????'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue: 80,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname: '??????'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue: 50,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname: '??????'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue: 22,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname: '??????'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t],\r\n");
      out.write("\t\t\t\t\t\t\t\t\temphasis: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\titemStyle: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tshadowBlur: 10,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tshadowOffsetX: 0,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tshadowColor: 'rgba(0, 0, 0, 0.5)'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}]\r\n");
      out.write("\t\t\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t\t\techartsPies.setOption(optionPies);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t// echarts ?????????????????????\r\n");
      out.write("\t\t\t\t\t\t\twindow.onresize = function() {\r\n");
      out.write("\t\t\t\t\t\t\t\techartsRecords.resize();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tfunction getStudentCount() {\r\n");
      out.write("\t\t\t\t\t\tgetNotData(\"/api/home?method=getStudentCount\").then(result => {\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(result)\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\n");
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
