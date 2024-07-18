package kr.co.yooncheolcommunity.api.user.controller;

import kr.co.yooncheolcommunity.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    final UserService userService;


}
