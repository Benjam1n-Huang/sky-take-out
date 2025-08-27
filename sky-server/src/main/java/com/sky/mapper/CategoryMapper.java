package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: CategoryMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author Benjamin-Huang
 * @Create 2025/8/27 11:05
 * @Version 1.0
 */
@Mapper
public interface CategoryMapper {
    /**
     * 新增菜品
     * @param category
     */
    @AutoFill(value = OperationType.INSERT)
    void insert(Category category);

    /**
     * 分类条件分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 根据id删除分类数据
     * @param id
     */
    @Delete("delete from category where id = #{id}")
    void deleteById(Long id);

    /**
     * 启用禁用分类
     * @param category
     */
    @AutoFill(value = OperationType.UPDATE)
    void update(Category category);

    @Select("select * from category where type = #{type}")
    List<Category> list(Integer type);
}
