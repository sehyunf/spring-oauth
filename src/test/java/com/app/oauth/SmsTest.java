package com.app.oauth;

import com.app.oauth.service.SmsService;
import com.app.oauth.util.SmsUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SmsTest {

    @Autowired
    private SmsService smsService;


//    인증코드 검증

    @Test
    public void emailTest() {

    }


}
