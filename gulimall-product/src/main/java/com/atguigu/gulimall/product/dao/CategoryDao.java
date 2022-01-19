package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bjk
 * @email baijkpx@163.com
 * @date 2022-01-16 16:45:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
