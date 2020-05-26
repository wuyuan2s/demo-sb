package cn.edu.lingnan.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;

/**
 * @author wuyuan
 * @since 2020-05-25 16:44
 */
@Component
//将配置文件中的值批量绑定到组件中、支持JSR303数据校验，所以要加上@Component、而@Value是单个读取，不支持校验
@ConfigurationProperties(prefix = "lingnan.teacher")
@Validated//jsr303校验
public class Teacher {

//    @Email//jsr303校验
    private String name;
    private int age;
    private List<String> skills;

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
