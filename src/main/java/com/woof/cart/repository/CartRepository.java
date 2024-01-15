package com.woof.cart.repository;

import com.example.Woof_2nd.cart.model.Cart;
import com.example.demo.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    public List<Cart> findAllByMember(Member member);
    public void deleteByIdAndMember(Long id, Member member);
    // void인 이유는 이 메소드가 어떤 결과를 반환하지 않고 삭제하는 기능이기 때문
}
