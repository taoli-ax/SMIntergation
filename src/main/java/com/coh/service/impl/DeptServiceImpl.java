package com.coh.service.impl;

import com.coh.mapper.DeptMapper;
import com.coh.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coh.service.DeptService;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;


    @Override
    public List<Dept> findAll() {

        return deptMapper.findAll();
    }
}
