package cn.edu.lingnan.demo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuVo {
    private Integer id;

    private Integer pid;

    private String title;

    private String icon;

    private String href;

    private String target;

    private List<MenuVo> child;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<MenuVo> getChild() {
        return child;
    }

    public void setChild(List<MenuVo> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "MenuVo{" +
                "id=" + id +
                ", pid=" + pid +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", href='" + href + '\'' +
                ", target='" + target + '\'' +
                ", child=" + child +
                '}';
    }
}