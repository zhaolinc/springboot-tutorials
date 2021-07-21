package com.lanqiao.tutorials.model;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * 
 * @TableName users
 */
@Data
@ToString
public class Users implements Serializable {
    private Integer userId;
    private String username;
    private String password;
}