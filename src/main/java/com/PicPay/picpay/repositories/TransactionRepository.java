package com.PicPay.picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PicPay.picpay.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository <Transaction, Long>{
    
}
