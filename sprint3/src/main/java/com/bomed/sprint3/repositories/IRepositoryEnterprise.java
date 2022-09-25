package com.bomed.sprint3.repositories;

import com.bomed.sprint3.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryEnterprise extends JpaRepository<Enterprise,Long> {

}