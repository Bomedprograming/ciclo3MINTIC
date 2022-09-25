package com.bomed.sprint3.repositories;

import com.bomed.sprint3.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryTransaction extends JpaRepository<Transaction,Long> {

}