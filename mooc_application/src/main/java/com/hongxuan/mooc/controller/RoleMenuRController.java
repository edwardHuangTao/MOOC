package com.hongxuan.mooc.controller;

import com.hongxuan.mooc.service.RoleMenuRService;
import com.hongxuan.pojo.TbRoleMenuR;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * 请求处理器
 * @author LiaoHongXuan
 *
 */
@RestController
@RequestMapping("/roleMenuR")
public class RoleMenuRController {

	@Autowired
	private RoleMenuRService roleMenuRService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbRoleMenuR> findAll(){			
		return roleMenuRService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return roleMenuRService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param roleMenuR
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbRoleMenuR roleMenuR){
		try {
			roleMenuRService.add(roleMenuR);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param roleMenuR
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbRoleMenuR roleMenuR){
		try {
			roleMenuRService.update(roleMenuR);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbRoleMenuR findOne(Long id){
		return roleMenuRService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			roleMenuRService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param roleMenuR
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbRoleMenuR roleMenuR, int page, int rows  ){
		return roleMenuRService.findPage(roleMenuR, page, rows);		
	}
	
}
