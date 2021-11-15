package com.mybatis.demo.service.impl;

import com.mybatis.demo.dao.TSalesDao;
import com.mybatis.demo.entity.TSales;
import com.mybatis.demo.service.TSalesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TSales)表服务实现类
 *
 * @author makejava
 * @since 2021-11-15 14:21:54
 */
@Service("tSalesService")
public class TSalesServiceImpl implements TSalesService {
    @Resource
    private TSalesDao tSalesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TSales queryById(Integer id) {
        return this.tSalesDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param tSales 实例对象
     * @return 实例对象
     */
    @Override
    public TSales insert(TSales tSales) {
        this.tSalesDao.insert(tSales);
        return tSales;
    }

    /**
     * 修改数据
     *
     * @param tSales 实例对象
     * @return 实例对象
     */
    @Override
    public TSales update(TSales tSales) {
        this.tSalesDao.update(tSales);
        return this.queryById(tSales.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tSalesDao.deleteById(id) > 0;
    }
}
