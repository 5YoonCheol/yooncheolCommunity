package kr.co.yooncheolcommunity.api.user.dao;

import kr.co.yooncheolcommunity.api.user.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User findUser(String userId, String password);

    User findUserById(String userId);
}
