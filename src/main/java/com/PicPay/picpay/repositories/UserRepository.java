package com.PicPay.picpay.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PicPay.picpay.domain.domainUser.User;

public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findUserByDocument(String document);
}
