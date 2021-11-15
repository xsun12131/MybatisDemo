package com.multiple.demo.service;

import com.multiple.demo.entity.TSaless;

/**
 * (TSaless)表服务接口
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
public interface TSalessService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TSaless queryById(Integer id);


    /**
     * 新增数据
     *
     * @param tSaless 实例对象
     * @return 实例对象
     */
    TSaless insert(TSaless tSaless);

    /**
     * 修改数据
     *
     * @param tSaless 实例对象
     * @return 实例对象
     */
    TSaless update(TSaless tSaless);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
