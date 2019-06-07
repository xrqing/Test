package com.xiao.admin.service.impl;
import java.util.List;
import com.xiao.admin.entity.TbTree;
import com.xiao.admin.mapper.TbTreeMapper;
import com.xiao.admin.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author xiaoruiqing
 *
 */
@Service
public class TreeServiceImpl implements TreeService {

	@Autowired
	private TbTreeMapper treeMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbTree> findAll() {
		return treeMapper.selectByExample(null);
	}

	/**
	 * 增加
	 */
	@Override
	public TbTree add(TbTree tree) {
		treeMapper.insert(tree);
		return tree;
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbTree tree){
		treeMapper.updateByPrimaryKey(tree);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param treeId
	 * @return
	 */
	@Override
	public TbTree findOne(String treeId){
		return treeMapper.selectByPrimaryKey(treeId);
	}

	/**
	 * 根据treeId删除
	 * @param treeId
	 * @return
	 */
	@Override
	public void delete(String treeId) {
		treeMapper.deleteByPrimaryKey(treeId);
	}

}
