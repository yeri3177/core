package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

/**
 * 순수 JAVA 코드만으로 테스트
 * 애플리케이션 로직으로 이렇게 테스트 하는 것은 좋은 방법이 아니다.
 * JUnit 테스트를 사용하자. -> MemberServiceTest
 */
public class MemberApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl();

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("new member = " + member.getName()); // new member = memberA
        System.out.println("find Member = " + findMember.getName()); // find Member = memberA
    }
}
