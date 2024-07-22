package kr.co.yooncheolcommunity.api.user.service;

import kr.co.yooncheolcommunity.api.user.dao.UserDao;
import kr.co.yooncheolcommunity.api.user.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAuthService {
    private final UserDao userDao;

    public String authenticate(String userId, String password) throws Exception {
        //실제 사용자 인증 수행로직
        User user = userDao.findUserById(userId);
        if (user == null){
            throw new Exception("존재하지 않는 ID 입니다.");
        }
        user = userDao.findUser(userId, password);
        if (user == null){
            throw new Exception("비밀번호가 올바르지 않습니다.");
        }else {
            return userId;
        }
    }
}
