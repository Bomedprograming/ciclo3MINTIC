package com.bomed.sprint3.repositories;

import com.bomed.sprint3.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryProfile extends JpaRepository<Profile,String> {

}