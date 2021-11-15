package com.mybatis.demo.service;

import com.mybatis.demo.entity.TSales;

/**
 * (TSales)������ӿ�
 *
 * @author makejava
 * @since 2021-11-15 14:21:54
 */
public interface TSalesService {

    /**
     * ͨ��ID��ѯ��������
     *
     * @param id ����
     * @return ʵ������
     */
    TSales queryById(Integer id);

    /**
     * ��������
     *
     * @param tSales ʵ������
     * @return ʵ������
     */
    TSales insert(TSales tSales);

    /**
     * �޸�����
     *
     * @param tSales ʵ������
     * @return ʵ������
     */
    TSales update(TSales tSales);

    /**
     * ͨ������ɾ������
     *
     * @param id ����
     * @return �Ƿ�ɹ�
     */
    boolean deleteById(Integer id);

}