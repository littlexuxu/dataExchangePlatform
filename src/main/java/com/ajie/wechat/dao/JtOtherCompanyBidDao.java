package com.ajie.wechat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ajie.wechat.model.JtOtherCompanyBid;



public interface JtOtherCompanyBidDao extends JpaRepository<JtOtherCompanyBid, Integer> , JpaSpecificationExecutor<JtOtherCompanyBid>{

}
