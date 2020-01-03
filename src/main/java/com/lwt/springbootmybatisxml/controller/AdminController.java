package com.lwt.springbootmybatisxml.controller;

import com.lwt.springbootmybatisxml.bean.TAdmin;
import com.lwt.springbootmybatisxml.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/getAdminById")
    public TAdmin getAdminById (Integer id){
        System.out.println(id);
        return adminService.get(id);
    }
}