package com.example.shiro.dao;


import com.example.shiro.constant.BaseDao;
import com.example.shiro.dao.entity.UUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@Mapper
public interface UUserDao extends BaseDao<UUser, Long> {

   /**
    * 增加对象
    * @param username
    */
   public UUser findByName(String username);


   UUser selectAllByName(String nickname);
}
