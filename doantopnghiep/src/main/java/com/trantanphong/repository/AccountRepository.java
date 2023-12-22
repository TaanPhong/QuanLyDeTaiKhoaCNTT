package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.Acount;

public interface AccountRepository extends JpaRepository<Acount, String>{

}
