package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

/**
 * 주문 생성 요청이 오면, 회원 정보를 조회하고, 할인 정책을 적용한 다음 주문 객체를 생성해서 반환한다.
 * 메모리 회원 리포지토리와, 고정 금액 할인 정책을 구현체로 생성한다.
 */
public class OrderServiceImpl implements OrderService {

//    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 할인 정책을 변경하려면 클라이언트인 OrderServiceImpl 코드를 고쳐야 한다.
     * FixDiscountPolicy -> RateDiscountPolicy
     *
     * FixDiscountPolicy 를 RateDiscountPolicy 로 변경하는 순간 OrderServiceImpl 의 소스 코드도 함께 변경해야 한다! -> OCP 위반
     *
     * 클라이언트 코드인 OrderServiceImpl 은 DiscountPolicy 의 인터페이스 뿐만 아니라 구체 클래스도 함께 의존한다.
     * 그래서 구체 클래스를 변경할 때 클라이언트 코드도 함께 변경해야 한다.
     * DIP 위반하므로 추상에만 의존하도록 변경(인터페이스에만 의존)
     * DIP를 위반하지 않도록 인터페이스에만 의존하도록 의존관계를 변경하면 된다.
     */
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    /**
     * 인터페이스에만 의존하도록 코드 변경
     * 실제 실행을 해보면 NPE(null pointer exception)가 발생
     */
//    private DiscountPolicy discountPolicy;

    /**
     * AppConfig 생성
     */
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
