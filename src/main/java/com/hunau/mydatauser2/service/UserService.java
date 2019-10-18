package com.hunau.mydatauser2.service;

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
import com.hunau.mydatauser2.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User selectUser(int id){
        return userDao.selectUser(id);
    }

    public List<User> findBy(String name){
        return userDao.findBy(name);
    }
}
