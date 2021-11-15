package com.multiple.demo.service.impl;

import com.multiple.demo.dao.test2.TSalessDao;
import com.multiple.demo.entity.TSaless;
import com.multiple.demo.service.TSalessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TSaless)�����ʵ����
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
@Service("tSalessService")
public class TSalessServiceImpl implements TSalessService {
    @Resource
    private TSalessDao tSalessDao;

    /**
     * ͨ��ID��ѯ��������
     *
     * @param id ����
     * @return ʵ������
     */
    @Override
    public TSaless queryById(Integer id) {
        return this.tSalessDao.queryById(id);
    }


    /**
     * ��������
     *
     * @param tSaless ʵ������
     * @return ʵ������
     */
    @Override
    public TSaless insert(TSaless tSaless) {
        this.tSalessDao.insert(tSaless);
        return tSaless;
    }

    /**
     * �޸�����
     *
     * @param tSaless ʵ������
     * @return ʵ������
     */
    @Override
    public TSaless update(TSaless tSaless) {
        this.tSalessDao.update(tSaless);
        return this.queryById(tSaless.getId());
    }

    /**
     * ͨ������ɾ������
     *
     * @param id ����
     * @return �Ƿ�ɹ�
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tSalessDao.deleteById(id) > 0;
    }
}
