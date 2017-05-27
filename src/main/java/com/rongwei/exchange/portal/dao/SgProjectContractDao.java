package com.rongwei.exchange.portal.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.rongwei.exchange.portal.model.SgProjectContract;

public interface SgProjectContractDao extends JpaRepository<SgProjectContract, Integer> , JpaSpecificationExecutor<SgProjectContract> {
}
