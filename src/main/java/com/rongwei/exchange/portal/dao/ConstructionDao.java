package com.rongwei.exchange.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rongwei.exchange.portal.model.JtSgProjectBase;

public interface ConstructionDao extends JpaRepository<JtSgProjectBase, Integer> , JpaSpecificationExecutor<JtSgProjectBase> {
	
}
