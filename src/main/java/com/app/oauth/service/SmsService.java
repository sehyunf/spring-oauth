package com.app.oauth.service;

import org.springframework.http.ResponseEntity;
import retrofit2.Response;

import java.util.Map;

public interface SmsService {

//    이메일 전솔
    public ResponseEntity<Map<String, Object>> transferMessage(String memberPhone);

//    문자 전송
    public ResponseEntity<Map<String, Object>> sendEmailVerification(String memberEmail);

//    인증코드 확인
    public boolean verifyAuthCode(String authCode);

}
