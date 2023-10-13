package com.lcwd.rating.service;

import com.lcwd.rating.entity.Rating;

import java.util.List;

public interface RatingService {

    Rating createrating(Rating rating);
    List<Rating> fetchAll();

    List<Rating> getUserById(String userId);

    List<Rating> getHotelById(String hotelId);


}
