package com.victoroliveira.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoroliveira.crud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
