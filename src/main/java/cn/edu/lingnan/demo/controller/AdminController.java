package cn.edu.lingnan.demo.controller;

import cn.edu.lingnan.demo.entity.Admin;
import cn.edu.lingnan.demo.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jws.WebParam;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2020-05-26 08:33:28
 */
//在使用模板页面的时候，不要使用@RestController，如果某些方法需要返回json格式，则在方法上使用@RestBody
//@RestController
@Controller
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource//@Autowired注入（注册组件）
    private AdminService adminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ResponseBody
    public Admin selectOne(Integer id) {
        return this.adminService.queryById(id);
    }
    @GetMapping("select")
    @ResponseBody
    public Admin select() {
        return this.adminService.queryById(1);
    }

    /**
     * 前往登录页面
     *
     * @return 登录页面
     */
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 登录
     *
     * @param account 账号
     * @param password 密码
     * @param model 页面（数据）回显
     * @return 页面
     */
    @PostMapping("login")
    public String login(String account, String password, Model model){
        Admin admin = this.adminService.login(account, password);
        if (admin == null){
            //登录失败
            model.addAttribute("msg", "账号密码错误！");
            return "login";
        }
//        使用cookie记住密码；
//        将账号信息存到session
        return  "index";
    }

    /**
     * 前往主页面
     *
     * @return 主页面
     */
    @RequestMapping("toIndex")
    public String toIndex() {
        return "index";
    }

    /**
     * 插入
     *
     * @return json格式数据
     */
    @PostMapping("insert")
    @ResponseBody
    public Admin insert(Admin admin){
        return adminService.insert(admin);
    }

    /**
     * 前往欢迎页面（在主页中）
     *
     * @return 欢迎页面
     */
    @RequestMapping("toWelcome")
    public String toWelcome(){
        return "welcome";
    }
}