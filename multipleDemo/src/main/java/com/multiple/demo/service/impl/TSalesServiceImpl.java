package com.multiple.demo.service.impl;

import com.multiple.demo.dao.test1.TSalesDao;
import com.multiple.demo.entity.TSales;
import com.multiple.demo.service.TSalesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TSales)�����ʵ����
 *
 * @author makejava
 * @since 2021-11-15 14:33:25
 */
@Service("tSalesService")
public class TSalesServiceImpl implements TSalesService {
    @Resource
    private TSalesDao tSalesDao;

    /**
     * ͨ��ID��ѯ��������
     *
     * @param id ����
     * @return ʵ������
     */
    @Override
    public TSales queryById(Integer id) {
        return this.tSalesDao.queryById(id);
    }


    /**
     * ��������
     *
     * @param tSales ʵ������
     * @return ʵ������
     */
    @Override
    public TSales insert(TSales tSales) {
        this.tSalesDao.insert(tSales);
        return tSales;
    }

    /**
     * �޸�����
     *
     * @param tSales ʵ������
     * @return ʵ������
     */
    @Override
    public TSales update(TSales tSales) {
        this.tSalesDao.update(tSales);
        return this.queryById(tSales.getId());
    }

    /**
     * ͨ������ɾ������
     *
     * @param id ����
     * @return �Ƿ�ɹ�
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tSalesDao.deleteById(id) > 0;
    }
}
