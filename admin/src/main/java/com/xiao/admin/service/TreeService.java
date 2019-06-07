package com.xiao.admin.service;


import com.xiao.admin.entity.TbTree;

import java.util.List;

/**
 * 服务层接口
 * @author xiaoruiqing
 *
 */
public interface TreeService {

	/**
	 * 返回全部列表
	 * @return
	 */
	List<TbTree> findAll();
	
	
	/**
	 * 增加
	*/
	TbTree add(TbTree tree);
	
	
	/**
	 * 修改
	 */
	void update(TbTree tree);
	

	/**
	 * 根据ID获取实体
	 * @param treeId
	 * @return
	 */
	TbTree findOne(String treeId);

	/**
	 * 根据treeId删除
	 * @param treeId
	 * @return
	 */
	void delete(String treeId);
}
