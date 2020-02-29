package com.hongxuan.mooc.controller;

import com.hongxuan.mooc.service.UserRoleRService;
import com.hongxuan.pojo.TbUserRoleR;
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
@RequestMapping("/userRoleR")
public class UserRoleRController {

	@Autowired
	private UserRoleRService userRoleRService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbUserRoleR> findAll(){			
		return userRoleRService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return userRoleRService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param userRoleR
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbUserRoleR userRoleR){
		try {
			userRoleRService.add(userRoleR);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param userRoleR
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbUserRoleR userRoleR){
		try {
			userRoleRService.update(userRoleR);
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
	public TbUserRoleR findOne(Long id){
		return userRoleRService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			userRoleRService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param userRoleR
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbUserRoleR userRoleR, int page, int rows  ){
		return userRoleRService.findPage(userRoleR, page, rows);		
	}
	
}
