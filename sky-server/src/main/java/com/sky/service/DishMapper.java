package com.sky.service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: DishMapper
 * Package: com.sky.service
 * Description:
 *
 * @Author Benjamin-Huang
 * @Create 2025/8/27 17:12
 * @Version 1.0
 */
@Mapper
public interface DishMapper {
    /**
     * 根据分类id查询结果数量
     * @param categoryId
     * @return
     */
    @Select("select count(*) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);
}
