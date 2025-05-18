package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.result.PageResult;

public interface CategoryService {
    //新增分类
    void save(CategoryDTO categoryDTO);

    //分类分页查询
    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);
    //修改分类
    void update(CategoryDTO categoryDTO);
    //启用禁用分类
    void startOrStop(Integer status, Long id);
    //删除分类
    void delete(Long id);
}
