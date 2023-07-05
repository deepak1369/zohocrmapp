package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.Entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
