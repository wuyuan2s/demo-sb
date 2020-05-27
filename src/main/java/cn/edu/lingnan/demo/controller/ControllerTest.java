package cn.edu.lingnan.demo.controller;

import cn.edu.lingnan.demo.entity.Admin;
import cn.edu.lingnan.demo.model.Teacher;
import cn.edu.lingnan.demo.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuyuan
 * @since 2020-05-25 11:26
 */
@Controller
public class ControllerTest {

    /**
    *
    * ${}: 可以取环境变量中的值，只是取值
    * #{}: 字符串做"", 数值不加
    */

    @Value(value = "${lingnan.className}")
    private String className;

    @Value(value = "${lingnan.count}")
    private int count;

    @Autowired
    private Teacher teacher;

    @RequestMapping("/hello")
    @ResponseBody//响应体：设置为json格式数据
    public String hello(){
        return "课程名称：" + className + "  " + "班级人数：" + count + "\n" + "热部署";
    }

    @RequestMapping("/tea")
    @ResponseBody//响应体：设置为json格式数据
    public String teacher(){
        return teacher.toString();
    }


    @RequestMapping("/admin")
    @ResponseBody//响应体：设置为json格式数据
    public String admin(){
        AdminServiceImpl adi = new AdminServiceImpl();
        return adi.queryById(1).toString();
    }
}

