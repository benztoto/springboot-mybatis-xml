package com.lwt.springbootmybatisxml.service.impl;/*
@author:liuwentao

@create date:2019/12/31
*/

import com.lwt.springbootmybatisxml.bean.TAdmin;
import com.lwt.springbootmybatisxml.mapper.AdminMapper;
import com.lwt.springbootmybatisxml.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public TAdmin get(Integer id) {
        System.out.println(2);
        return adminMapper.getTAdminById(id);
    }
}
