package com.multiple.demo.service;

import com.multiple.demo.entity.TSaless;

/**
 * (TSaless)�����ӿ�
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
public interface TSalessService {

    /**
     * ͨ��ID��ѯ��������
     *
     * @param id ����
     * @return ʵ������
     */
    TSaless queryById(Integer id);


    /**
     * ��������
     *
     * @param tSaless ʵ������
     * @return ʵ������
     */
    TSaless insert(TSaless tSaless);

    /**
     * �޸�����
     *
     * @param tSaless ʵ������
     * @return ʵ������
     */
    TSaless update(TSaless tSaless);

    /**
     * ͨ������ɾ������
     *
     * @param id ����
     * @return �Ƿ�ɹ�
     */
    boolean deleteById(Integer id);

}
