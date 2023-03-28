package com.coh.mapper;

import com.coh.pojo.Dept;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Repository
public interface DeptMapper {
    /**
     * mapper接口代理开发
     * 查询所有部门
     * @ return 所有记录
     * **/
    List<Dept> findAll();
}
