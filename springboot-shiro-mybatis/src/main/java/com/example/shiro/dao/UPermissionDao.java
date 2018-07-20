package com.example.shiro.dao;


import com.example.shiro.constant.BaseDao;
import com.example.shiro.dao.entity.UPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UPermissionDao extends BaseDao<UPermission, Long> {



   /**
    * 根据用户id获取用户权限
    * @param id
    */
    List<UPermission> findPermissionByUid(Long id);
}
