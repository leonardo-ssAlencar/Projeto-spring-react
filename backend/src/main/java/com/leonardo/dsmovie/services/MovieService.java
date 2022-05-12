package com.leonardo.dsmovie.services;

import com.leonardo.dsmovie.dto.MovieDTO;
import com.leonardo.dsmovie.entities.Movie;
import com.leonardo.dsmovie.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
public class MovieService 
{
  @Autowired
  private MovieRepository repo;

  @Transactional(readOnly = true)
  public Page<MovieDTO> findall(Pageable pageable)
  {
      Page<Movie> list = repo.findAll(pageable);
      return list.map(x-> new MovieDTO(x));

      
  }
  @Transactional(readOnly = true)
  public MovieDTO findById(Long id)
  {
      Movie result = repo.findById(id).get();
      
      return new MovieDTO(result);
  }

}
