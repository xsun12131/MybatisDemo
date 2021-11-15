package com.multiple.demo.dao.test2;

import com.multiple.demo.entity.TSaless;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TSaless)�����ݿ���ʲ�
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
public interface TSalessDao {

    /**
     * ͨ��ID��ѯ��������
     *
     * @param id ����
     * @return ʵ������
     */
    TSaless queryById(Integer id);


    /**
     * ͳ��������
     *
     * @param tSaless ��ѯ����
     * @return ������
     */
    long count(TSaless tSaless);

    /**
     * ��������
     *
     * @param tSaless ʵ������
     * @return Ӱ������
     */
    int insert(TSaless tSaless);

    /**
     * �����������ݣ�MyBatisԭ��foreach������
     *
     * @param entities List<TSaless> ʵ�������б�
     * @return Ӱ������
     */
    int insertBatch(@Param("entities") List<TSaless> entities);

    /**
     * ���������������������ݣ�MyBatisԭ��foreach������
     *
     * @param entities List<TSaless> ʵ�������б�
     * @return Ӱ������
     * @throws org.springframework.jdbc.BadSqlGrammarException ����ǿ�List��ʱ�����SQL��������쳣��������У�����
     */
    int insertOrUpdateBatch(@Param("entities") List<TSaless> entities);

    /**
     * �޸�����
     *
     * @param tSaless ʵ������
     * @return Ӱ������
     */
    int update(TSaless tSaless);

    /**
     * ͨ������ɾ������
     *
     * @param id ����
     * @return Ӱ������
     */
    int deleteById(Integer id);

}

