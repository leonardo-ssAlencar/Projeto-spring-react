package com.leonardo.dsmovie.services;

import com.leonardo.dsmovie.dto.MovieDTO;
import com.leonardo.dsmovie.dto.ScoreDTO;
import com.leonardo.dsmovie.entities.Movie;
import com.leonardo.dsmovie.entities.Score;
import com.leonardo.dsmovie.entities.User;
import com.leonardo.dsmovie.repositories.MovieRepository;
import com.leonardo.dsmovie.repositories.ScoreRepository;
import com.leonardo.dsmovie.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService 
{
 @Autowired
 private MovieRepository movieRepo;
 @Autowired
 private UserRepository userRepo;
 @Autowired
 private ScoreRepository scoreRepo;


 ///Salvar score, fazer a media e incrementar
 @Transactional
 public MovieDTO saveScore(ScoreDTO dto)
 {
   User user = userRepo.findByEmail(dto.getEmail());
   
   if(user == null)
   {
      user = new User();
      user.setEmail(dto.getEmail());
      user = userRepo.saveAndFlush(user);
   }
   Movie movie = movieRepo.findById(dto.getMovieId()).get();

   Score score = new Score();
   score.setMovie(movie);
   score.setUser(user);
   score.setValue(dto.getScore());

   score = scoreRepo.saveAndFlush(score);
   
   double sum = .0;
   for(Score s : movie.getScores())
   {
     sum += s.getValue();
   }

   double avg = sum / movie.getScores().size();

   movie.setScore(avg);
   movie.setCount(movie.getScores().size());

   movie = movieRepo.saveAndFlush(movie);

   return new MovieDTO(movie);


   
 }

  

}


