package com.example.shardingjdbcdemo.model;


import lombok.Data;

/**
 * @author lqb
 */
@Data
public class User {

  private long id;
  private String name;
  private String phone;
  private String email;

}
