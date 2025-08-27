package com.sky.service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: SetmealMappper
 * Package: com.sky.service
 * Description:
 *
 * @Author Benjamin-Huang
 * @Create 2025/8/27 17:13
 * @Version 1.0
 */
@Mapper
public interface SetmealMappper {
    /**
     * 根据分类id查询套餐数量
     * @param id
     * @return
     */
    @Select("select count(*) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);
}
