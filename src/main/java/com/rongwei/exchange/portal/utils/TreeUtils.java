package com.rongwei.exchange.portal.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.ajie.wechat.model.JtDict;
import com.rongwei.exchange.portal.model.TreeObject;

public class TreeUtils {

	public static void main(String[] args) {
		System.out.println("TreeUtils Class");
	}
	
	public List<TreeObject> getDictSelectTree(List<JtDict> dictList) {
		List<TreeObject> returnList = new ArrayList<TreeObject>();
		
		List<TreeObject> treeList = new ArrayList<TreeObject>();
		for (JtDict dict : dictList) {
			TreeObject tree = new TreeObject();
			tree.setId(dict.getDictid());
			tree.setText(dict.getDictname());
			tree.setPid(dict.getDictparentid());
			tree.setPname(dict.getDictparentname());
			treeList.add(tree);
		}
		
		for (Iterator<TreeObject> iterator = treeList.iterator(); iterator.hasNext();) {
			TreeObject t = (TreeObject) iterator.next();
			// 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
			if (StringUtils.isBlank(t.getPid())) {
				recursionFn(treeList, t);
				t.setState("closed");
				returnList.add(t);
			}
		}
		
		return returnList;
	}
	
	private void  recursionFn(List<TreeObject> list, TreeObject t) {
		List<TreeObject> childList = getChildList(list, t);// 得到子节点列表
		t.setChildren(childList);
		for (TreeObject tChild : childList) {
			if (hasChild(list, tChild)) {// 判断是否有子节点
				Iterator<TreeObject> it = childList.iterator();
				while (it.hasNext()) {
					TreeObject n = (TreeObject) it.next();
					n.setState("closed");
					recursionFn(list, n);
				}
			}
		}
	}

	
	// 得到子节点列表
	private List<TreeObject> getChildList(List<TreeObject> list, TreeObject t) {
		
		List<TreeObject> tlist = new ArrayList<TreeObject>();
		Iterator<TreeObject> it = list.iterator();
		while (it.hasNext()) {
			TreeObject n = (TreeObject) it.next();
			if (n.getPid().equals(t.getId())) {
				tlist.add(n);
			}
		}
		return tlist;
	}
	
	// 判断是否有子节点
	private boolean hasChild(List<TreeObject> list, TreeObject t) {
		return getChildList(list, t).size() > 0 ? true : false;
	}
	
}
