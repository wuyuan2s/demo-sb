package cn.edu.lingnan.demo.service;

import cn.edu.lingnan.demo.entity.SystemMenu;
import java.util.List;
import java.util.Map;

/**
 * 系统菜单表(SystemMenu)表服务接口
 *
 * @author makejava
 * @since 2020-05-27 16:53:04
 */
public interface SystemMenuService {

    /**
     * 查询全部数据
     *
     * @return 实例对象map
     */
    Map<String, Object> queryAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SystemMenu queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SystemMenu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param systemMenu 实例对象
     * @return 实例对象
     */
    SystemMenu insert(SystemMenu systemMenu);

    /**
     * 修改数据
     *
     * @param systemMenu 实例对象
     * @return 实例对象
     */
    SystemMenu update(SystemMenu systemMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}