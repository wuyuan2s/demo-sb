package cn.edu.lingnan.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuyuan
 * @create 2020-05-25 11:26
 */
@Controller
public class controller {
    @RequestMapping("/hello")
    @ResponseBody//
    public String hello(){
        return "hello";
    }
}
