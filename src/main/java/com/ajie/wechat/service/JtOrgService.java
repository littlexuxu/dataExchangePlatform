package com.ajie.wechat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.dao.JtOrgDao;
import com.ajie.wechat.model.JtDict;
import com.ajie.wechat.model.JtOrgMapping;

import cn.ccccltd.webservice.org.MdorgVO;
import cn.ccccltd.webservice.org.VoSupport;

@Service
@Transactional
public class JtOrgService {
	
	@Autowired
    private JtOrgDao jtorgdao;
	
	/**
	 * 删除所有组织机构
	 */
	public void deleteAll(){
		jtorgdao.deleteAll();
	}
	
	/**
	 * 组织机构批量录入
	 * @param vos
	 */
	public void getOrg(List<VoSupport> vos){
		List<JtOrgMapping> dicts = new ArrayList<JtOrgMapping>();
		if(vos != null && vos.size()>0){
			for(VoSupport vo:vos){
				JtOrgMapping jtorg = new JtOrgMapping();
				MdorgVO mdorgvo = (MdorgVO)vo;
				orgSet(mdorgvo,jtorg);
				dicts.add(jtorg);
			}
			//批量存储
			jtorgdao.save(dicts);
		}
	}
	
	private void orgSet(MdorgVO mdorgvo,JtOrgMapping jtdict){
		jtdict.setOrgmappingid(mdorgvo.getRecid());
		jtdict.setJtorgcode(mdorgvo.getOrgcode());
		jtdict.setJtorgname(mdorgvo.getOrgname());
		jtdict.setJtparentorgname(mdorgvo.getParentname());
		jtdict.setJtparentorgcode(mdorgvo.getParentcode());
	}

}
