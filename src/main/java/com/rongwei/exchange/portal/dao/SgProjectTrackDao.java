package com.rongwei.exchange.portal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rongwei.exchange.portal.model.SgProjectTrack;

public interface SgProjectTrackDao extends JpaRepository<SgProjectTrack, Integer> , JpaSpecificationExecutor<SgProjectTrack> {
	public List<SgProjectTrack> findByBaserecid(int baserecid);
}
