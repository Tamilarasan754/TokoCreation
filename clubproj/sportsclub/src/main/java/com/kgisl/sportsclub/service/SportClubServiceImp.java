package com.kgisl.sportsclub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.sportsclub.entity.SportClub;
import com.kgisl.sportsclub.repository.SportClubRepository;
@Service
public class SportClubServiceImp implements SportClubService {
    @Autowired
    private SportClubRepository sportClubRepository;
     @Override
    public List<SportClub> getAll()
    {
        return sportClubRepository.findAll();
    }
    public Optional<SportClub> getSportClubById(Integer id) {
        return sportClubRepository.findById(id);
    }

    public SportClub createSportClub(SportClub sportClub) {
        return sportClubRepository.save(sportClub);
    }

    public SportClub updateSportClub(Integer id, SportClub sportClub) {
        if (sportClubRepository.existsById(id)) {
            sportClub.setId(id);
            return sportClubRepository.save(sportClub);
        } else {
            throw new RuntimeException("SportClub with id " + id + " not found");
        }
    }

    public void deleteSportClub(Integer id) {
        sportClubRepository.deleteById(id);
    }

    
}