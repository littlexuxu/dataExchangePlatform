package com.rongwei.exchange.portal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rongwei.exchange.portal.model.Resource;


public interface ResourceDao extends JpaRepository<Resource, Long> {
    List<Resource> findByIdentity(String identity);
}
