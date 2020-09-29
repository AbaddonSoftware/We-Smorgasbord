package com.we_smorgasbord.potluck_api.repository;

import com.we_smorgasbord.potluck_api.models.PotluckEvent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PotluckEventRepository extends JpaRepository<PotluckEvent, Long> {

}
