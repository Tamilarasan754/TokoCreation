package com.kgisl.sportsclub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.sportsclub.entity.SportClub;

public interface SportClubRepository extends JpaRepository<SportClub,Integer> {
    
}
