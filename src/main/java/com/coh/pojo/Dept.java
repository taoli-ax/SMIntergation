package com.coh.pojo;

import lombok.*;

import java.io.Serializable;


@Setter
@Getter
@ToString
public class Dept implements Serializable {
    //远程接口访问和redis
    private static final long serialVersionUID = -9208223905663865388L;

    private String name;
    private int deptNo;
    private String loc;
}
