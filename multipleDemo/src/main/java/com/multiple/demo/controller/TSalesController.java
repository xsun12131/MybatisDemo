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
 * (TSales)表控制层
 *
 * @author makejava
 * @since 2021-11-15 14:33:25
 */
@RestController
@RequestMapping("tSales")
public class TSalesController {
    /**
     * 服务对象
     */
    @Resource
    private TSalesService tSalesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TSales> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tSalesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tSales 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TSales> add(TSales tSales) {
        return ResponseEntity.ok(this.tSalesService.insert(tSales));
    }

    /**
     * 编辑数据
     *
     * @param tSales 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TSales> edit(TSales tSales) {
        return ResponseEntity.ok(this.tSalesService.update(tSales));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tSalesService.deleteById(id));
    }

}

