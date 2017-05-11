package com.ajie.wechat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ajie.wechat.model.JTContract;


public interface JTContractDao  extends JpaRepository<JTContract, Long> , JpaSpecificationExecutor<JTContract>{

}
