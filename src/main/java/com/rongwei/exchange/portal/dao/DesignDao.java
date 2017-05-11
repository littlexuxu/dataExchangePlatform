package com.rongwei.exchange.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.rongwei.exchange.portal.model.JtSjProjectBase;

public interface DesignDao extends JpaRepository<JtSjProjectBase, Integer> , JpaSpecificationExecutor<JtSjProjectBase> {

}
