package com.fedi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fedi.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
