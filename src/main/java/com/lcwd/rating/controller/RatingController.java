package com.lcwd.rating.controller;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create rating
    @PostMapping
    public ResponseEntity<Rating> createRatings(@RequestBody Rating rating){
//        Rating createrating = ratingService.createrating(rating);
//        return new ResponseEntity<>(createrating, HttpStatus.CREATED);

        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createrating((rating)));

    }

    //get all
    @GetMapping
    public ResponseEntity<List<Rating>> getRating(){
        return ResponseEntity.ok(ratingService.fetchAll());

    }
    //get all of user


    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getUserById(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getUserById(userId));
    }
    //get all of hotels
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getHotelById(hotelId));
    }
    }









