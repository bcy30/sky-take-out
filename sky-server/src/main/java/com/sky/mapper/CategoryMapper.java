package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CategoryMapper {
    // 新增分类
    void insert(Category category);

    //分页查询分类
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);
    //修改分类
    void update(Category category);
    //删除分类
    @Delete("delete from category where id =#{id}")
    void delete(Long id);
}
