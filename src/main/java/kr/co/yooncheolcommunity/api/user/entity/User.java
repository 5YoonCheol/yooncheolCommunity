package kr.co.yooncheolcommunity.api.user.entity;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String userPassword;
    private String userName;
    private int age;
    private String userState;
}
