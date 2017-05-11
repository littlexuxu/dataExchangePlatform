package com.ajie.wechat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ajie.wechat.model.JtOrgMapping;

public interface JtOrgDao extends JpaRepository<JtOrgMapping, Long> , JpaSpecificationExecutor<JtOrgMapping>{
	
	
	
}
