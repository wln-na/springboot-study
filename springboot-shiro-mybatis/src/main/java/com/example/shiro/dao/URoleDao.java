package com.example.shiro.dao;

import com.example.shiro.constant.BaseDao;
import com.example.shiro.dao.entity.URole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface URoleDao extends BaseDao<URole, Long> {
	
	/**
	 * 根据用户ID获取该用户所在组的角色权限
	 * @param obj
	 */
	public List<URole> findRoleByUid(Long obj);
}
