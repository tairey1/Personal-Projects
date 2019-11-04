package com.fanatics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fanatics.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
