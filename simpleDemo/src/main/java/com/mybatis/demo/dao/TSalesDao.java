package com.mybatis.demo.dao;

import com.mybatis.demo.entity.TSales;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TSales)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-15 14:21:54
 */
public interface TSalesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TSales queryById(Integer id);

    /**
     * 统计总行数
     *
     * @param tSales 查询条件
     * @return 总行数
     */
    long count(TSales tSales);

    /**
     * 新增数据
     *
     * @param tSales 实例对象
     * @return 影响行数
     */
    int insert(TSales tSales);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TSales> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TSales> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TSales> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TSales> entities);

    /**
     * 修改数据
     *
     * @param tSales 实例对象
     * @return 影响行数
     */
    int update(TSales tSales);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

