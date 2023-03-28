package com.coh.test;

import com.coh.pojo.Dept;
import com.coh.controller.DeptController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-config*.xml")
public class DeptTest {
    @Autowired
    private DeptController deptController;
    @Test
    public void fun1(){
        List<Dept> deptList=deptController.findAll();
        deptList.forEach(System.out::println);
    }
}
