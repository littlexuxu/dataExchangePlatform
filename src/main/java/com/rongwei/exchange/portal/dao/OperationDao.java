package com.rongwei.exchange.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rongwei.exchange.portal.model.Operation;


public interface OperationDao extends JpaRepository<Operation, Long> {

}
