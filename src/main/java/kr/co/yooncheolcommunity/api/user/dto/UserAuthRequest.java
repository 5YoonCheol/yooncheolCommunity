package kr.co.yooncheolcommunity.api.user.dto;

import lombok.Data;

@Data
public class UserAuthRequest {
    private String userId;
    private String password;
}
