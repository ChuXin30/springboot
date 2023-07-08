package com.example.springboot1.service.impl;


import com.example.springboot1.dao.cluster.CityDao;
import com.example.springboot1.dao.master.UserDao;
import com.example.springboot1.domain.City;
import com.example.springboot1.domain.User;
import com.example.springboot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现层
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Autowired
    private CityDao cityDao; // 从数据源

    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("温岭市");
        user.setCity(city);
        return user;
    }
}
