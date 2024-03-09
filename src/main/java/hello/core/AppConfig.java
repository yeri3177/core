package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

/**
 * 애플리케이션의 전체 동작 방식을 구성(config)하기 위해, 구현 객체를 생성하고, 연결하는 책임을 가지는 별도의 설정 클래스
 *
 * AppConfig는 애플리케이션의 실제 동작에 필요한 구현 객체를 생성한다.
 * - MemberServiceImpl
 * - MemoryMemberRepository
 * - OrderServiceImpl
 * - FixDiscountPolicy
 *
 * AppConfig는 생성한 객체 인스턴스의 참조(레퍼런스)를 생성자를 통해서 주입(연결)해준다.
 * - MemberServiceImpl -> MemoryMemberRepository
 * - OrderServiceImpl -> MemoryMemberRepository, FixDiscountPolicy
 */
public class AppConfig {
    /**
     * 리팩터링 후
     * new MemoryMemberRepository() 이 부분이 중복 제거되었다.
     * 이제 MemoryMemberRepository 를 다른 구현체로 변경할 때 한 부분만 변경하면 된다.
     * AppConfig 를 보면 역할과 구현 클래스가 한눈에 들어온다.
     * 애플리케이션 전체 구성이 어떻게 되어있는지 빠르게 파악할 수 있다.
     */
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

    /**
     * 리팩터링 전 : 중복이 있고, 역할에 따른 구현이 잘 안보인다
     */
//    public MemberService memberService() {
//        return new MemberServiceImpl(new MemoryMemberRepository());
//    }
//
//    public OrderService orderService() {
//        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
//    }
}
