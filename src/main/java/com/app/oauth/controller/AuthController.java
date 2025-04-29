package com.app.oauth.controller;

import com.app.oauth.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/member/*")
@RequiredArgsConstructor
public class AuthController {
    private final MemberService memberService;

//    회원가입
//    로그인
//    로그인 이후 ㅇㅇㅇㅇ 하는 페이지

}
