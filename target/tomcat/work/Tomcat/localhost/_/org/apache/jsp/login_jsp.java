/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-07-02 04:13:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>后台管理-登陆</title>\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t\t<meta http-equiv=\"Access-Control-Allow-Origin\" content=\"*\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t\t<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"images/favicon.ico\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"./lib/layui-v2.6.3/css/layui.css\" media=\"all\">\r\n");
      out.write("\t\t<script src=\"https://cdn.staticfile.org/html5shiv/r29/html5.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t.main-body {\r\n");
      out.write("\t\t\t\ttop: 50%;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\t-webkit-transform: translate(-50%, -50%);\r\n");
      out.write("\t\t\t\t-moz-transform: translate(-50%, -50%);\r\n");
      out.write("\t\t\t\t-ms-transform: translate(-50%, -50%);\r\n");
      out.write("\t\t\t\t-o-transform: translate(-50%, -50%);\r\n");
      out.write("\t\t\t\ttransform: translate(-50%, -50%);\r\n");
      out.write("\t\t\t\toverflow: hidden;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item input {\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\twidth: 227px;\r\n");
      out.write("\t\t\t\theight: 22px;\r\n");
      out.write("\t\t\t\tpadding: 0;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\tborder: 0;\r\n");
      out.write("\t\t\t\toutline: 0;\r\n");
      out.write("\t\t\t\tfont-size: 14px;\r\n");
      out.write("\t\t\t\tletter-spacing: 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item .icon-1 {\r\n");
      out.write("\t\t\t\tbackground: url(./images/icon-login.png) no-repeat 1px 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item .icon-2 {\r\n");
      out.write("\t\t\t\tbackground: url(./images/icon-login.png) no-repeat -54px 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item .icon-3 {\r\n");
      out.write("\t\t\t\tbackground: url(./images/icon-login.png) no-repeat -106px 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item .icon-4 {\r\n");
      out.write("\t\t\t\tbackground: url(./images/icon-login.png) no-repeat 0 -43px;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\tright: -10px;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item .icon-5 {\r\n");
      out.write("\t\t\t\tbackground: url(../images/icon-login.png) no-repeat -55px -43px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item .icon-6 {\r\n");
      out.write("\t\t\t\tbackground: url(../images/icon-login.png) no-repeat 0 -93px;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\tright: -10px;\r\n");
      out.write("\t\t\t\tmargin-top: 8px;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .tip .icon-nocheck {\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\twidth: 10px;\r\n");
      out.write("\t\t\t\theight: 10px;\r\n");
      out.write("\t\t\t\tborder-radius: 2px;\r\n");
      out.write("\t\t\t\tborder: solid 1px #9abcda;\r\n");
      out.write("\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t\ttop: 2px;\r\n");
      out.write("\t\t\t\tmargin: 1px 8px 1px 1px;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .tip .icon-check {\r\n");
      out.write("\t\t\t\tmargin: 0 7px 0 0;\r\n");
      out.write("\t\t\t\twidth: 14px;\r\n");
      out.write("\t\t\t\theight: 14px;\r\n");
      out.write("\t\t\t\tborder: none;\r\n");
      out.write("\t\t\t\tbackground: url(./images/icon-login.png) no-repeat -111px -48px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item .icon {\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\twidth: 33px;\r\n");
      out.write("\t\t\t\theight: 22px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item {\r\n");
      out.write("\t\t\t\twidth: 288px;\r\n");
      out.write("\t\t\t\theight: 35px;\r\n");
      out.write("\t\t\t\tborder-bottom: 1px solid #dae1e6;\r\n");
      out.write("\t\t\t\tmargin-bottom: 35px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main {\r\n");
      out.write("\t\t\t\twidth: 428px;\r\n");
      out.write("\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t\tfloat: left;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-top {\r\n");
      out.write("\t\t\t\theight: 117px;\r\n");
      out.write("\t\t\t\tbackground-color: #689d7f;\r\n");
      out.write("\t\t\t\tborder-radius: 12px 12px 0 0;\r\n");
      out.write("\t\t\t\tfont-family: SourceHanSansCN-Regular;\r\n");
      out.write("\t\t\t\tfont-size: 30px;\r\n");
      out.write("\t\t\t\tfont-weight: 600;\r\n");
      out.write("\t\t\t\tfont-stretch: normal;\r\n");
      out.write("\t\t\t\tletter-spacing: 0;\r\n");
      out.write("\t\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\t\tline-height: 117px;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\toverflow: hidden;\r\n");
      out.write("\t\t\t\t-webkit-transform: rotate(0);\r\n");
      out.write("\t\t\t\t-moz-transform: rotate(0);\r\n");
      out.write("\t\t\t\t-ms-transform: rotate(0);\r\n");
      out.write("\t\t\t\t-o-transform: rotate(0);\r\n");
      out.write("\t\t\t\ttransform: rotate(0);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-top .bg1 {\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\twidth: 74px;\r\n");
      out.write("\t\t\t\theight: 74px;\r\n");
      out.write("\t\t\t\tbackground: #fff;\r\n");
      out.write("\t\t\t\topacity: .1;\r\n");
      out.write("\t\t\t\tborder-radius: 0 74px 0 0;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\tleft: 0;\r\n");
      out.write("\t\t\t\ttop: 43px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-top .bg2 {\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\twidth: 94px;\r\n");
      out.write("\t\t\t\theight: 94px;\r\n");
      out.write("\t\t\t\tbackground: #fff;\r\n");
      out.write("\t\t\t\topacity: .1;\r\n");
      out.write("\t\t\t\tborder-radius: 50%;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\tright: -16px;\r\n");
      out.write("\t\t\t\ttop: -16px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom {\r\n");
      out.write("\t\t\t\twidth: 428px;\r\n");
      out.write("\t\t\t\tbackground: #fff;\r\n");
      out.write("\t\t\t\tborder-radius: 0 0 12px 12px;\r\n");
      out.write("\t\t\t\tpadding-bottom: 53px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center {\r\n");
      out.write("\t\t\t\twidth: 288px;\r\n");
      out.write("\t\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\t\tpadding-top: 40px;\r\n");
      out.write("\t\t\t\tpadding-bottom: 15px;\r\n");
      out.write("\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .tip {\r\n");
      out.write("\t\t\t\tclear: both;\r\n");
      out.write("\t\t\t\theight: 16px;\r\n");
      out.write("\t\t\t\tline-height: 16px;\r\n");
      out.write("\t\t\t\twidth: 288px;\r\n");
      out.write("\t\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tbody {\r\n");
      out.write("\t\t\t\tbackground: url(./images/loginbg.jpg) 0% 0% / cover no-repeat;\r\n");
      out.write("\t\t\t\tposition: static;\r\n");
      out.write("\t\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput::-webkit-input-placeholder {\r\n");
      out.write("\t\t\t\tcolor: #a6aebf;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput::-moz-placeholder {\r\n");
      out.write("\t\t\t\t/* Mozilla Firefox 19+ */\r\n");
      out.write("\t\t\t\tcolor: #a6aebf;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput:-moz-placeholder {\r\n");
      out.write("\t\t\t\t/* Mozilla Firefox 4 to 18 */\r\n");
      out.write("\t\t\t\tcolor: #a6aebf;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput:-ms-input-placeholder {\r\n");
      out.write("\t\t\t\t/* Internet Explorer 10-11 */\r\n");
      out.write("\t\t\t\tcolor: #a6aebf;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput:-webkit-autofill {\r\n");
      out.write("\t\t\t\t/* 取消Chrome记住密码的背景颜色 */\r\n");
      out.write("\t\t\t\t-webkit-box-shadow: 0 0 0 1000px white inset !important;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\thtml {\r\n");
      out.write("\t\t\t\theight: 100%;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .tip {\r\n");
      out.write("\t\t\t\tclear: both;\r\n");
      out.write("\t\t\t\theight: 16px;\r\n");
      out.write("\t\t\t\tline-height: 16px;\r\n");
      out.write("\t\t\t\twidth: 288px;\r\n");
      out.write("\t\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .tip .login-tip {\r\n");
      out.write("\t\t\t\tfont-family: MicrosoftYaHei;\r\n");
      out.write("\t\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\t\tfont-weight: 400;\r\n");
      out.write("\t\t\t\tfont-stretch: normal;\r\n");
      out.write("\t\t\t\tletter-spacing: 0;\r\n");
      out.write("\t\t\t\tcolor: #9abcda;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .tip .forget-password {\r\n");
      out.write("\t\t\t\tfont-stretch: normal;\r\n");
      out.write("\t\t\t\tletter-spacing: 0;\r\n");
      out.write("\t\t\t\tcolor: #1391ff;\r\n");
      out.write("\t\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\tright: 62px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .login-btn {\r\n");
      out.write("\t\t\t\twidth: 288px;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\tbackground-color: #689d7f;\r\n");
      out.write("\t\t\t\tborder-radius: 16px;\r\n");
      out.write("\t\t\t\tmargin: 24px auto 0;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tline-height: 40px;\r\n");
      out.write("\t\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\t\tfont-size: 14px;\r\n");
      out.write("\t\t\t\tletter-spacing: 0;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t\tborder: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.login-main .login-bottom .center .item .validateImg {\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\tright: 1px;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t\theight: 36px;\r\n");
      out.write("\t\t\t\tborder: 1px solid #e6e6e6;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.footer {\r\n");
      out.write("\t\t\t\tleft: 0;\r\n");
      out.write("\t\t\t\tbottom: 0;\r\n");
      out.write("\t\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\t\twidth: 100%;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tline-height: 30px;\r\n");
      out.write("\t\t\t\tpadding-bottom: 10px;\r\n");
      out.write("\t\t\t\ttext-shadow: #000 0.1em 0.1em 0.1em;\r\n");
      out.write("\t\t\t\tfont-size: 14px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.padding-5 {\r\n");
      out.write("\t\t\t\tpadding: 5px !important;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.footer a,\r\n");
      out.write("\t\t\t.footer span {\r\n");
      out.write("\t\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t@media screen and (max-width:428px) {\r\n");
      out.write("\t\t\t\t.login-main {\r\n");
      out.write("\t\t\t\t\twidth: 360px !important;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t.login-main .login-top {\r\n");
      out.write("\t\t\t\t\twidth: 360px !important;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t.login-main .login-bottom {\r\n");
      out.write("\t\t\t\t\twidth: 360px !important;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"main-body\">\r\n");
      out.write("\t\t\t<div class=\"login-main\">\r\n");
      out.write("\t\t\t\t<div class=\"login-top\">\r\n");
      out.write("\t\t\t\t\t<span>实习就业登记系统登录</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"bg1\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"bg2\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<form class=\"layui-form login-bottom\">\r\n");
      out.write("\t\t\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon icon-2\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入登录账号\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"24\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon icon-3\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" lay-verify=\"required\" placeholder=\"请输入登录密码\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"20\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"bind-password icon icon-4\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"validatePanel\" class=\"item\" style=\"width: 137px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"captcha\" placeholder=\"请输入验证码\" maxlength=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<img id=\"refreshCaptcha\" class=\"validateImg\" src=\"login?method=getCaptchar\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"refresh()\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tip\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-nocheck\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"login-tip\">保持2天登录</span>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:\" class=\"forget-password\">忘记密码？</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-form-item\" style=\"text-align:center; width:100%;height:100%;margin:0px;\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"login-btn\" lay-submit=\"\" lay-filter=\"login\">立即登录</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t©版权所有 2020-2021 WEI.ZHOU<span class=\"padding-5\">|</span><a target=\"_blank\" href=\"http://www.xiaoandx.club\">\r\n");
      out.write("\t\t\t\t实现就业信息管理</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script src=\"./lib/jquery-3.4.1/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"./lib/layui-v2.6.3/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\"./js/api.js?t=2\" charset=\"UTF-8\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"./js/MD5Util.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 用户登录对象：保持用户输入的登录信息 */\r\n");
      out.write("\t\tvar logins = {};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 登录状态结果：记录登录响应数据 */\r\n");
      out.write("\t\tvar rest = {};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t * @Description:\tlayui登录表单事件控制\r\n");
      out.write("\t\t\t * author: WEI.ZHOU\r\n");
      out.write("\t\t\t * @date: 2021-6-7 13:38:11\r\n");
      out.write("\t\t\t * @version: v1.0.0\r\n");
      out.write("\t\t\t */\r\n");
      out.write("\t\t\tlayui.use(['form', 'jquery'], function() {\r\n");
      out.write("\t\t\t\tvar $ = layui.jquery,\r\n");
      out.write("\t\t\t\t\tform = layui.form,\r\n");
      out.write("\t\t\t\t\tlayer = layui.layer;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 登录过期的时候，跳出ifram框架\r\n");
      out.write("\t\t\t\tif (top.location != self.location) top.location = self.location;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$('.bind-password').on('click', function() {\r\n");
      out.write("\t\t\t\t\tif ($(this).hasClass('icon-5')) {\r\n");
      out.write("\t\t\t\t\t\t$(this).removeClass('icon-5');\r\n");
      out.write("\t\t\t\t\t\t$(\"input[name='password']\").attr('type', 'password');\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$(this).addClass('icon-5');\r\n");
      out.write("\t\t\t\t\t\t$(\"input[name='password']\").attr('type', 'text');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$('.icon-nocheck').on('click', function() {\r\n");
      out.write("\t\t\t\t\tif ($(this).hasClass('icon-check')) {\r\n");
      out.write("\t\t\t\t\t\t$(this).removeClass('icon-check');\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$(this).addClass('icon-check');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$('.forget-password').on('click', function(){\r\n");
      out.write("\t\t\t\t\tlayer.open({\r\n");
      out.write("\t\t\t\t\t\ttitle: '忘记密码温馨提示',\r\n");
      out.write("\t\t\t\t\t  type: 1,\r\n");
      out.write("\t\t\t\t\t  area: ['400px', '140px'],\r\n");
      out.write("\t\t\t\t\t  shadeClose: true, \r\n");
      out.write("\t\t\t\t\t  content: '\\<\\div style=\"font-size:18px;padding:20px;\">忘记密码，请联系带班老师进行密码初始化\\<\\/div>'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 进行登录操作\r\n");
      out.write("\t\t\t\tform.on('submit(login)', function(data) {\r\n");
      out.write("\t\t\t\t\tdata = data.field;\r\n");
      out.write("\t\t\t\t\tif (data.username == '') {\r\n");
      out.write("\t\t\t\t\t\tlayer.msg('用户名不能为空');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif (data.password == '') {\r\n");
      out.write("\t\t\t\t\t\tlayer.msg('密码不能为空');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif (data.captcha == '') {\r\n");
      out.write("\t\t\t\t\t\tlayer.msg('验证码不能为空');\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar isLogindata = 0;\r\n");
      out.write("\t\t\t\t\tif($('.icon-nocheck').hasClass(\"icon-check\")){\r\n");
      out.write("\t\t\t\t\t\tisLogindata = 1;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar logins = {\r\n");
      out.write("\t\t\t\t\t\t\"username\":data.username,\r\n");
      out.write("\t\t\t\t\t\t\"password\":hex_md5(data.password),\r\n");
      out.write("\t\t\t\t\t\t\"code\":data.captcha,\r\n");
      out.write("\t\t\t\t\t\t\"isLogindata\":isLogindata\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tlogin(logins);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t  * @Description: 刷新验证码\r\n");
      out.write("\t\t\t  * @author: WEI.ZHOU\r\n");
      out.write("\t\t\t  * @date: 2021-6-9 3:45:38 ?F10: PM?\r\n");
      out.write("\t\t\t  * @version: v1.0.0\r\n");
      out.write("\t\t\t  */\r\n");
      out.write("\t\t\tfunction refresh() {\r\n");
      out.write("\t\t\t\tvar date = new Date();\r\n");
      out.write("\t\t\t\tvar captcha = document.getElementById(\"refreshCaptcha\");\r\n");
      out.write("\t\t\t\tcaptcha.src = \"login?method=getCaptchar&t=\" +\r\n");
      out.write("\t\t\t\t\tdate.getTime();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t  * @Description: 用户登录请求\r\n");
      out.write("\t\t\t  * @author: WEI.ZHOU\r\n");
      out.write("\t\t\t  * @param: data\t\t\t\t登录表单数据\r\n");
      out.write("\t\t\t  * @return: null\t\t\t\t空\r\n");
      out.write("\t\t\t  * @date: 2021-7-1 10:20:54 ?F10: AM?\r\n");
      out.write("\t\t\t  * @version: v1.0.0\r\n");
      out.write("\t\t\t  */\r\n");
      out.write("\t\t\tfunction login(data){\r\n");
      out.write("\t\t\t\tpostHasData(\"/login?method=login\",data).then(result =>{\r\n");
      out.write("\t\t\t\t\tif(result.status == -1){\r\n");
      out.write("\t\t\t\t\t\tlayer.msg(result.message);\r\n");
      out.write("\t\t\t\t\t\trefresh()\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(result.status == -2){\r\n");
      out.write("\t\t\t\t\t\tlayer.msg(result.message);\r\n");
      out.write("\t\t\t\t\t\trefresh()\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(result.status == 1){\r\n");
      out.write("\t\t\t\t\t\tlayer.msg('登录成功', function() {\r\n");
      out.write("\t\t\t\t\t\t\twindow.location = './index.jsp';\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
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