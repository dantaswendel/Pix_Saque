package com.wendel.pixSaque.repository;


import com.wendel.pixSaque.entity.PixSaque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PixSaqueRepository extends JpaRepository<PixSaque, Long> {

}
