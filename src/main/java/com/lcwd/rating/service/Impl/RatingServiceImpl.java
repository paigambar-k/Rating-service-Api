package com.lcwd.rating.service.Impl;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating createrating(Rating rating) {
        String s = UUID.randomUUID().toString();
        rating.setRatingId(s);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> fetchAll() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getUserById(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getHotelById(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
