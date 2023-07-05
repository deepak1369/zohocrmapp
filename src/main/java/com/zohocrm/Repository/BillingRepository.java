package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.Entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
