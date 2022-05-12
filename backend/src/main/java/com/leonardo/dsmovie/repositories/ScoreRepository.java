package com.leonardo.dsmovie.repositories;


import com.leonardo.dsmovie.entities.Score;
import com.leonardo.dsmovie.entities.ScorePk;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>
{}
