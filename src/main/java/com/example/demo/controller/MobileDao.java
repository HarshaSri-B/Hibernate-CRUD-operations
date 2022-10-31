package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Mobiles;

@Repository
public interface MobileDao extends JpaRepository<Mobiles,Integer>{

}
