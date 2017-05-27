package com.rongwei.exchange.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rongwei.exchange.portal.model.SgProjectBase;

public interface OtherDao extends JpaRepository<SgProjectBase, Integer> , JpaSpecificationExecutor<SgProjectBase> {

}
