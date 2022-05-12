package com.leonardo.dsmovie.repositories;

import com.leonardo.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>
{}
