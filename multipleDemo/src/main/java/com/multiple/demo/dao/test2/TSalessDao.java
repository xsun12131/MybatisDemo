package com.multiple.demo.dao.test2;

import com.multiple.demo.entity.TSaless;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TSaless)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
public interface TSalessDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TSaless queryById(Integer id);


    /**
     * 统计总行数
     *
     * @param tSaless 查询条件
     * @return 总行数
     */
    long count(TSaless tSaless);

    /**
     * 新增数据
     *
     * @param tSaless 实例对象
     * @return 影响行数
     */
    int insert(TSaless tSaless);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TSaless> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TSaless> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TSaless> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TSaless> entities);

    /**
     * 修改数据
     *
     * @param tSaless 实例对象
     * @return 影响行数
     */
    int update(TSaless tSaless);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

