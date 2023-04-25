package com.spring.async.repository;

import com.spring.async.model.Asyncs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncRepository extends JpaRepository<Asyncs,Integer>
{

}
