package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    // 新增分类
    void insert(Category category);

    //分页查询分类
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);
}
