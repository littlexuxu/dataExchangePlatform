package com.rongwei.exchange.portal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rongwei.exchange.portal.model.JtSgProjectTrack;

public interface SgProjectTrackDao extends JpaRepository<JtSgProjectTrack, Integer> , JpaSpecificationExecutor<JtSgProjectTrack> {
	public List<JtSgProjectTrack> findByBaserecid(int baserecid);
}
