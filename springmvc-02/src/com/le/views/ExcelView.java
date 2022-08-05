package com.le.views;

import com.le.pojo.Customer;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Component("excel")
public class ExcelView extends AbstractXlsxView {

    @Override
    protected void buildExcelDocument(Map<String, Object> map, Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response)
            throws Exception {

        //从model中拿到渲染excel视图的数据
        List<Customer> customers = (List<Customer>) map.get("customers");
        System.out.println("model拿到渲染视图成功");

        //创建一个sheet页
        Sheet sheet = workbook.createSheet("客户信息");
        System.out.println("创建一个sheet页");

        //新建一行 -- 标题行
        Row title = sheet.createRow(0);
        //给第一行添加5列，然后同时给每列添加内容
        title.createCell(0).setCellValue("编号");
        title.createCell(1).setCellValue("姓名");
        title.createCell(2).setCellValue("年龄");
        title.createCell(3).setCellValue("性别");
        title.createCell(4).setCellValue("邮箱");

        //循环List，每循环一次拿到一个Customer，就生成一行内容行
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(customer.getId());
            row.createCell(1).setCellValue(customer.getName());
            row.createCell(2).setCellValue(customer.getAge());
            row.createCell(3).setCellValue(customer.getSex());
            row.createCell(4).setCellValue(customer.getEmail());
        }
        System.out.println("循环Customer成功");

        //将excel发送给浏览器，让浏览器下载 -- 下载文档的效果
        //1)设置响应的文档类型
        response.setContentType("application/ms-excel;charset-UTF-8");
        //2)设置Content-Disposition响应头 -- 告诉浏览器用下载插件去下载文件
        response.setHeader("Content-Disposition", "attachment;filename=info.xlsx");
        System.out.println("设置Content-Disposition响应头成功");
        //3)将excel文件的字节数据发送给浏览器
        workbook.write(response.getOutputStream());
        System.out.println("将excel文件的字节数据发送给浏览器成功");
    }
}
