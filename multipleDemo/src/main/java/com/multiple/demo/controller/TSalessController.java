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
 * (TSaless)表控制层
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
@RestController
@RequestMapping("tSaless")
public class TSalessController {
    /**
     * 服务对象
     */
    @Resource
    private TSalessService tSalessService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TSaless> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tSalessService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tSaless 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TSaless> add(TSaless tSaless) {
        return ResponseEntity.ok(this.tSalessService.insert(tSaless));
    }

    /**
     * 编辑数据
     *
     * @param tSaless 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TSaless> edit(TSaless tSaless) {
        return ResponseEntity.ok(this.tSalessService.update(tSaless));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tSalessService.deleteById(id));
    }

}

