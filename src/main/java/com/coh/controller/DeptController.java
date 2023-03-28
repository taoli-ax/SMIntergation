package com.coh.controller;

import com.coh.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.coh.service.DeptService;

import java.util.List;
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    public List<Dept> findAll(){
        return deptService.findAll();
    }
}
