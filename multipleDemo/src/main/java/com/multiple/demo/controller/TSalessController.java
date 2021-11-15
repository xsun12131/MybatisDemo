package com.multiple.demo.controller;

import com.multiple.demo.entity.TSaless;
import com.multiple.demo.service.TSalessService;
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
 * (TSaless)����Ʋ�
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
@RestController
@RequestMapping("tSaless")
public class TSalessController {
    /**
     * �������
     */
    @Resource
    private TSalessService tSalessService;


    /**
     * ͨ��������ѯ��������
     *
     * @param id ����
     * @return ��������
     */
    @GetMapping("{id}")
    public ResponseEntity<TSaless> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tSalessService.queryById(id));
    }

    /**
     * ��������
     *
     * @param tSaless ʵ��
     * @return �������
     */
    @PostMapping
    public ResponseEntity<TSaless> add(TSaless tSaless) {
        return ResponseEntity.ok(this.tSalessService.insert(tSaless));
    }

    /**
     * �༭����
     *
     * @param tSaless ʵ��
     * @return �༭���
     */
    @PutMapping
    public ResponseEntity<TSaless> edit(TSaless tSaless) {
        return ResponseEntity.ok(this.tSalessService.update(tSaless));
    }

    /**
     * ɾ������
     *
     * @param id ����
     * @return ɾ���Ƿ�ɹ�
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tSalessService.deleteById(id));
    }

}

