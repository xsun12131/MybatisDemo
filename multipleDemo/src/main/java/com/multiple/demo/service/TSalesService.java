package com.multiple.demo.service;

import com.multiple.demo.entity.TSales;

/**
 * (TSales)表服务接口
 *
 * @author makejava
 * @since 2021-11-15 14:33:25
 */
public interface TSalesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TSales queryById(Integer id);


    /**
     * 新增数据
     *
     * @param tSales 实例对象
     * @return 实例对象
     */
    TSales insert(TSales tSales);

    /**
     * 修改数据
     *
     * @param tSales 实例对象
     * @return 实例对象
     */
    TSales update(TSales tSales);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
