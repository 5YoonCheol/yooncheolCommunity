package kr.co.yooncheolcommunity.api.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAuthService {

    public String authenticate(String userId, String password) {
        //실제 사용자 인증 수행로직
        if("user".equals(userId) && "password".equals(password)) {
            return userId;
        }

        throw new RuntimeException("Invalid credentials");
    }
}
