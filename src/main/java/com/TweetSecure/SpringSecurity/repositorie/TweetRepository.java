package com.TweetSecure.SpringSecurity.repositorie;

import com.TweetSecure.SpringSecurity.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
