package com.leonardo.dsmovie.controllers;

import com.leonardo.dsmovie.dto.MovieDTO;
import com.leonardo.dsmovie.dto.ScoreDTO;
import com.leonardo.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/score")
public class ScoreController 
{
  @Autowired
  private ScoreService serv;

 @PutMapping
 public MovieDTO saveScore(@RequestBody ScoreDTO dto)
 {
   return serv.saveScore(dto);
 }
}
