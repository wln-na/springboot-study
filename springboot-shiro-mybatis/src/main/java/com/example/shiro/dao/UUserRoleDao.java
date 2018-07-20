package com.example.shiro.dao;


import com.example.shiro.constant.BaseDao;
import com.example.shiro.dao.entity.UUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UUserRoleDao extends BaseDao<UUserRole, Long> {

   /**
    * 增加对象
    * @param obj
    */
   //public void add(SysMessageTep	 obj);
}
