package com.bomed.sprint3.repositories;

import com.bomed.sprint3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryEmployee extends JpaRepository<Employee,Long> {

}