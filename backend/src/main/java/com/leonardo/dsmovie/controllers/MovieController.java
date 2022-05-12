package com.leonardo.dsmovie.controllers;

import com.leonardo.dsmovie.dto.MovieDTO;
import com.leonardo.dsmovie.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieController
{
 @Autowired
 private MovieService serv;

 @GetMapping
 public Page<MovieDTO> findall(Pageable page)
 {
     return serv.findall(page);
 }

 @GetMapping(value = "/{id}")
 public MovieDTO findById(@PathVariable Long id)
 {
    return serv.findById(id);
 }
    

}
