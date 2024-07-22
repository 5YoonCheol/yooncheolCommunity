package kr.co.yooncheolcommunity.api.user.controller;

import kr.co.yooncheolcommunity.api.user.dto.UserAuthRequest;
import kr.co.yooncheolcommunity.api.user.service.UserAuthService;
import kr.co.yooncheolcommunity.api.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class UserAuthController {
    private final UserAuthService userAuthService;
    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String createToken(@RequestBody UserAuthRequest authRequest) throws Exception {
        String userId = userAuthService.authenticate(authRequest.getUserId(), authRequest.getPassword());
        String token = jwtUtil.generateToken(userId);

        return token;
    }

}
