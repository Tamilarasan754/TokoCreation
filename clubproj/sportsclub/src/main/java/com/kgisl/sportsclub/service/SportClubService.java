package com.kgisl.sportsclub.service;

import java.util.List;
import java.util.Optional;

import com.kgisl.sportsclub.entity.SportClub;

public interface SportClubService {

     public List<SportClub> getAll();
      public Optional<SportClub> getSportClubById(Integer id);
      public SportClub createSportClub(SportClub sportClub);
      public SportClub updateSportClub(Integer id, SportClub sportClub);
      public void deleteSportClub(Integer id);

    
}