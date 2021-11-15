package com.multiple.demo.service.impl;

import com.multiple.demo.dao.test2.TSalessDao;
import com.multiple.demo.entity.TSaless;
import com.multiple.demo.service.TSalessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TSaless)表服务实现类
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
@Service("tSalessService")
public class TSalessServiceImpl implements TSalessService {
    @Resource
    private TSalessDao tSalessDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TSaless queryById(Integer id) {
        return this.tSalessDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param tSaless 实例对象
     * @return 实例对象
     */
    @Override
    public TSaless insert(TSaless tSaless) {
        this.tSalessDao.insert(tSaless);
        return tSaless;
    }

    /**
     * 修改数据
     *
     * @param tSaless 实例对象
     * @return 实例对象
     */
    @Override
    public TSaless update(TSaless tSaless) {
        this.tSalessDao.update(tSaless);
        return this.queryById(tSaless.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tSalessDao.deleteById(id) > 0;
    }
}
