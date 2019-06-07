package com.xiao.admin.controller;
import com.xiao.admin.common.Result;
import com.xiao.admin.entity.TbTree;
import com.xiao.admin.service.TreeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller
 * @author xiaoruiqing
 *
 */
@RestController
@RequestMapping("/tree")
@Api(value = "人员管理模块",description = "人员管理模块的接口信息")
public class TreeController {

	@Autowired
	private TreeService treeService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@GetMapping("/findAll")
	@ApiOperation(value = "获取人员列表",notes = "获取所有人员的列表")
	public List<TbTree> findAll(){
		return treeService.findAll();
	}
	
	/**
	 * 增加
	 * @param tree
	 * @return
	 */
	@PostMapping("/add")
	@ApiOperation(value = "添加",notes = "添加信息")
	public Result add(@RequestBody TbTree tree){
		try {
			treeService.add(tree);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param tree
	 * @return
	 */
	@PostMapping("/update")
	@ApiOperation(value = "修改",notes = "修改信息")
	public Result update(@RequestBody TbTree tree){
		try {
			treeService.update(tree);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param treeId
	 * @return
	 */
	@GetMapping("/findOne")
	@ApiOperation(value = "查询（treeId）",notes = "查询单个信息")
	public TbTree findOne(String treeId){
		return treeService.findOne(treeId);
	}

	/**
	 * 根据treeId删除
	 * @param treeId
	 * @return
	 */
	@GetMapping("/delete")
	@ApiOperation(value = "删除（treeId）",notes = "根据treeId删除信息")
	public Result delete(String treeId){
		try {
			treeService.delete(treeId);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
}
