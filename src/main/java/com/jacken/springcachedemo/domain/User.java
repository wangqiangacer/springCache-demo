package com.jacken.springcachedemo.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private  Integer id;
    private String name;
}
