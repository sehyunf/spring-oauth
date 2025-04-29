package com.app.oauth;

import com.app.oauth.domain.OauthMemberVO;
import com.app.oauth.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
@Slf4j
public class OauthMapperTest {

    @Autowired
    private MemberMapper memberMapper;

//    회원조회
    @Test
    public void selectTest() {
        log.info("{}", memberMapper.select(1L));
    }
//    회원 전체 조회
    @Test
    public void selectAllTest() {
        for (OauthMemberVO oauthMemberVO : memberMapper.selectAll()) {
            log.info("{}", oauthMemberVO);
        }
    }

//    이메일로 아이디 찾기
    @Test
    public void selectByEmailTest() {
        log.info("{}", memberMapper.selectByEmail("test1234@test.com"));

    }
//    최원가입 테어ㅡ트
    @Test
    public void insertTest() {
        OauthMemberVO oauthMemberVO = new OauthMemberVO();
        oauthMemberVO.setMemberEmail("test12345@test.com");
        oauthMemberVO.setMemberPassword("1234");
        oauthMemberVO.setMemberName("이순신");
        memberMapper.insert(oauthMemberVO);
    }
//    회원수정 테으트
    @Test
    public void updateTest() {
        Long memberId = memberMapper.selectByEmail("test1234@test.com");
        memberMapper.select(memberId).ifPresent(member -> {
            OauthMemberVO oauthMemberVO = new OauthMemberVO();
            oauthMemberVO.setId(member.getId());
            oauthMemberVO.setMemberEmail("test1234@test.com");
            oauthMemberVO.setMemberPassword(member.getMemberPassword());
            oauthMemberVO.setMemberName(member.getMemberName());
            oauthMemberVO.setMemberPicture(member.getMemberPicture());
            oauthMemberVO.setMemberProvider(member.getMemberProvider());
            memberMapper.update(oauthMemberVO);
        });
    }

//    회원 탈퇴 테스트
    @Test
    public void deleteTest() {
        memberMapper.delete(1L);
    }
}
