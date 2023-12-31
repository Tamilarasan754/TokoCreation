package com.kgisl.sportsclub.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.sportsclub.entity.SportClub;
import com.kgisl.sportsclub.service.SportClubService;

@RestController
@RequestMapping("/club")
public class SportClubController {
    @Autowired
    private SportClubService sportClubService;
    @GetMapping("")
    public ResponseEntity<List<SportClub>> GetAll()
    {
        List<SportClub> club=sportClubService.getAll();
        if(club.isEmpty())
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(club, HttpStatus.OK);
    }
    
     @GetMapping("/{id}")
    public ResponseEntity<SportClub> getSportClubById(@PathVariable Integer id) {
        Optional<SportClub> sportClub = sportClubService.getSportClubById(id);
        return sportClub.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<SportClub> createSportClub(@RequestBody SportClub sportClub) {
        SportClub createdSportClub = sportClubService.createSportClub(sportClub);
        return new ResponseEntity<>(createdSportClub, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SportClub> updateSportClub(@PathVariable Integer id, @RequestBody SportClub sportClub) {
        try {
            SportClub updatedSportClub = sportClubService.updateSportClub(id, sportClub);
            return new ResponseEntity<>(updatedSportClub, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSportClub(@PathVariable Integer id) {
        sportClubService.deleteSportClub(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}