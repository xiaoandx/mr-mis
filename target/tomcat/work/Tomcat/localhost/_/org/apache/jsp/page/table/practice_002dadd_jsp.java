/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-07-02 04:19:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.page.table;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class practice_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.release();
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
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<title>添加学生信息</title>\r\n");
      out.write("\t\t<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../../lib/layui-v2.6.3/css/layui.css\" media=\"all\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../../css/public.css\" media=\"all\">\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\tbody {\r\n");
      out.write("\t\t\t\tbackground-color: #ffffff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"layui-form layuimini-form\" lay-filter=\"frome\">\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label required\">学号</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"number\" name=\"sid\" lay-verify=\"required\" lay-reqtext=\"学号不能为空\" placeholder=\"请输入学号\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"\" class=\"layui-input\" >\r\n");
      out.write("\t\t\t\t\t<tip>学号不可修改</tip>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label required\">学生姓名</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"sname\" lay-verify=\"required\" lay-reqtext=\"学生姓名不能为空\" placeholder=\"请输入学生姓名\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label required\">就业状态</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"1\" title=\"考公\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"2\" title=\"考研\" checked=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"3\" title=\"实习\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"4\" title=\"待定\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label required\">是否离校</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"isleaving\" value=\"1\" title=\"离校\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"isleaving\" value=\"0\" title=\"在校\" checked=\"\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">公司名称</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"companyname\" lay-reqtext=\"公司名称不能为空\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"请输入公司名称\" value=\"\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">公司地址</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"companyplace\" lay-reqtext=\"公司地址不能为空\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"请输入公司地址\" value=\"\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">公司联系</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"contactinformation\" lay-reqtext=\"公司联系方式不能为空\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"请输入公司联系方式\" value=\"\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">实习薪资</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"salary\" lay-reqtext=\"实习薪资不能为空\" placeholder=\"请输入实习薪资\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t\t<tip>格式为：5400</tip>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<button class=\"layui-btn layui-btn-normal\" lay-submit lay-filter=\"saveBtn\">确认保存</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script src=\"../../lib/jquery-3.4.1/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../../lib/layui-v2.6.3/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\"../../js/api.js?t=1\" charset=\"UTF-8\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tlayui.use(['form'], function() {\r\n");
      out.write("\t\t\t\tvar form = layui.form,\r\n");
      out.write("\t\t\t\t\tlayer = layui.layer,\r\n");
      out.write("\t\t\t\t\t$ = layui.$;\r\n");
      out.write("\t\t\t\t//监听提交\r\n");
      out.write("\t\t\t\tform.on('submit(saveBtn)', function(data) {\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar newStuInfo ={\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\"sid\": parseInt(data.field.sid),\r\n");
      out.write("\t\t\t\t\t\t\"sname\": data.field.sname,\r\n");
      out.write("\t\t\t\t\t\t\"status\": parseInt(data.field.status),\r\n");
      out.write("\t\t\t\t\t\t\"isleaving\": parseInt(data.field.isleaving),\r\n");
      out.write("\t\t\t\t\t\t\"companyname\": data.field.companyname,\r\n");
      out.write("\t\t\t\t\t\t\"companyplace\": data.field.companyplace,\r\n");
      out.write("\t\t\t\t\t\t\"contactinformation\": data.field.contactinformation,\r\n");
      out.write("\t\t\t\t\t\t\"salary\": data.field.salary\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tinsertStuInfo(newStuInfo);\r\n");
      out.write("\t\t\t\t\tvar index = layer.alert((\"添加学生成功\"), {\r\n");
      out.write("\t\t\t\t\t\ttitle: '添加状态'\r\n");
      out.write("\t\t\t\t\t}, function() {\r\n");
      out.write("\t\t\t\t\t\tlayer.close(index);\r\n");
      out.write("\t\t\t\t\t\tvar iframeIndex = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("\t\t\t\t\t\tparent.layer.close(iframeIndex);\r\n");
      out.write("\t\t\t\t\t\tparent.location.reload();\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction insertStuInfo(data){\r\n");
      out.write("\t\t\t\tpostHasData(\"/api/practice?method=insertPractice\",data).then(result => {\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /page/table/practice-add.jsp(3,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.rid != 1} ", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fredirect_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fredirect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_005fredirect_005f0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_005fredirect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fredirect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /page/table/practice-add.jsp(4,2) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fredirect_005f0.setUrl("index.jsp#/page/403.html");
    int _jspx_eval_c_005fredirect_005f0 = _jspx_th_c_005fredirect_005f0.doStartTag();
    if (_jspx_th_c_005fredirect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
    return false;
  }
}
