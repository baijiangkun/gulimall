package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author bjk
 * @email baijkpx@163.com
 * @date 2022-01-16 16:50:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
