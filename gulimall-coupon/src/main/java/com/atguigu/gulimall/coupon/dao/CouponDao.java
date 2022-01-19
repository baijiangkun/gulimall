package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author bjk
 * @email baijkpx@163.com
 * @date 2022-01-08 10:10:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
