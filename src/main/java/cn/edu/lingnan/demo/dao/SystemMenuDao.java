package cn.edu.lingnan.demo.dao;

import cn.edu.lingnan.demo.entity.SystemMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 系统菜单表(SystemMenu)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-27 16:53:04
 */
@Mapper
@Repository
public interface SystemMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SystemMenu queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SystemMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param systemMenu 实例对象
     * @return 对象列表
     */
    List<SystemMenu> queryAll(SystemMenu systemMenu);

    /**
     * 新增数据
     *
     * @param systemMenu 实例对象
     * @return 影响行数
     */
    int insert(SystemMenu systemMenu);

    /**
     * 修改数据
     *
     * @param systemMenu 实例对象
     * @return 影响行数
     */
    int update(SystemMenu systemMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}