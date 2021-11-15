package com.multiple.demo.controller;

import com.multiple.demo.entity.TSales;
import com.multiple.demo.service.TSalesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TSales)����Ʋ�
 *
 * @author makejava
 * @since 2021-11-15 14:33:25
 */
@RestController
@RequestMapping("tSales")
public class TSalesController {
    /**
     * �������
     */
    @Resource
    private TSalesService tSalesService;

    /**
     * ͨ��������ѯ��������
     *
     * @param id ����
     * @return ��������
     */
    @GetMapping("{id}")
    public ResponseEntity<TSales> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tSalesService.queryById(id));
    }

    /**
     * ��������
     *
     * @param tSales ʵ��
     * @return �������
     */
    @PostMapping
    public ResponseEntity<TSales> add(TSales tSales) {
        return ResponseEntity.ok(this.tSalesService.insert(tSales));
    }

    /**
     * �༭����
     *
     * @param tSales ʵ��
     * @return �༭���
     */
    @PutMapping
    public ResponseEntity<TSales> edit(TSales tSales) {
        return ResponseEntity.ok(this.tSalesService.update(tSales));
    }

    /**
     * ɾ������
     *
     * @param id ����
     * @return ɾ���Ƿ�ɹ�
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tSalesService.deleteById(id));
    }

}

