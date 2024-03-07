package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

/**
 * 주문한 금액의 %를 할인해주는 새로운 정률 할인 정책을 추가
 */
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10; //10% 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
