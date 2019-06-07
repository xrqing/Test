package com.xiao.admin.mapper;


import com.xiao.admin.entity.TbTree;
import com.xiao.admin.entity.TbTreeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTreeMapper {

    /**
     * 根据treeId删除
     * @param treeId
     * @return
     */
    int deleteByPrimaryKey(String treeId);

    /**
     * 增加
     */
    int insert(TbTree record);

    /**
     * 查询全部
     */
    List<TbTree> selectByExample(TbTreeExample example);

    /**
     * 根据ID获取实体
     * @param treeId
     * @return
     */
    TbTree selectByPrimaryKey(String treeId);

    /**
     * 修改
     */
    int updateByPrimaryKey(TbTree record);
}