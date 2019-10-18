package com.hunau.mydatauser2.Dao;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 曹佳怡
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */
import com.hunau.mydatauser2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Select("select id,name,pwd,sexy,birthday,year(now())-year(birthday) age,isuse from tb_user where name like'%${value}%'")
        //@Transactional(readOnly = true)
    List<User> findBy(String name);

    @Select("select id,name,pwd,sexy,birthday,year(now())-year(birthday) age,isuse from tb_user where id=#{id}")
    User selectUser(int id);
}
