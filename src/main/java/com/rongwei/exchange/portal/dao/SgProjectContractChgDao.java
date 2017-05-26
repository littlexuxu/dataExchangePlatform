package com.rongwei.exchange.portal.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.rongwei.exchange.portal.model.JtSgContractChange;

public interface SgProjectContractChgDao extends JpaRepository<JtSgContractChange, Integer> , JpaSpecificationExecutor<JtSgContractChange> {
}
