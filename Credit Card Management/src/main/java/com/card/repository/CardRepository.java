package com.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.card.entity.CardEntity;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Integer>{

}
