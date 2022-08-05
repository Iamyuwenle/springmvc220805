package com.le.views;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

@Component("html")
public class HtmlView implements View {

    //指定文档（视图）类型
    @Override
    public String getContentType() {
        return "text/html";
    }

    //渲染视图
    @Override
    public void render(Map<String, ?> map, HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<body>");
        out.write("<div align='center'><h3>" + new Date() + "</h3></div>");
        out.write("</body>");
        out.write("</html>");
    }
}
