package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CategoryMapper {
    // 新增分类
    @AutoFill(value =OperationType.INSERT)
    void insert(Category category);

    //分页查询分类
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);
    //修改分类
    @AutoFill(value = OperationType.UPDATE)
    void update(Category category);
    //删除分类
    @Delete("delete from category where id =#{id}")
    void delete(Long id);
    //根据类型查询
    @Select("select * from category where status=1 and type= #{type} order by sort")
    List<Category> getByType(Integer type);
}
