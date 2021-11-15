package com.mybatis.demo.dao;

import com.mybatis.demo.entity.TSales;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TSales)�����ݿ���ʲ�
 *
 * @author makejava
 * @since 2021-11-15 14:21:54
 */
public interface TSalesDao {

    /**
     * ͨ��ID��ѯ��������
     *
     * @param id ����
     * @return ʵ������
     */
    TSales queryById(Integer id);

    /**
     * ͳ��������
     *
     * @param tSales ��ѯ����
     * @return ������
     */
    long count(TSales tSales);

    /**
     * ��������
     *
     * @param tSales ʵ������
     * @return Ӱ������
     */
    int insert(TSales tSales);

    /**
     * �����������ݣ�MyBatisԭ��foreach������
     *
     * @param entities List<TSales> ʵ�������б�
     * @return Ӱ������
     */
    int insertBatch(@Param("entities") List<TSales> entities);

    /**
     * ���������������������ݣ�MyBatisԭ��foreach������
     *
     * @param entities List<TSales> ʵ�������б�
     * @return Ӱ������
     * @throws org.springframework.jdbc.BadSqlGrammarException ����ǿ�List��ʱ�����SQL��������쳣��������У�����
     */
    int insertOrUpdateBatch(@Param("entities") List<TSales> entities);

    /**
     * �޸�����
     *
     * @param tSales ʵ������
     * @return Ӱ������
     */
    int update(TSales tSales);

    /**
     * ͨ������ɾ������
     *
     * @param id ����
     * @return Ӱ������
     */
    int deleteById(Integer id);

}

