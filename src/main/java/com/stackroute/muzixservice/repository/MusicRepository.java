package com.stackroute.muzixservice.repository;

import com.stackroute.muzixservice.domain.Music;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sound.midi.Track;

@Repository
public interface MusicRepository extends MongoRepository<Music,Integer> {
//    @Query(value = "select * from track where trackName = ?", nativeQuery = true)
   // public Music getTrackByName(String trackName);

}
// CrudRepository<Music,Integer>
