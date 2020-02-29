package com.hongxuan.mooc.controller;

import com.hongxuan.mooc.service.FileResourcesService;
import com.hongxuan.pojo.TbFileResources;
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
@RequestMapping("/fileResources")
public class FileResourcesController {

	@Autowired
	private FileResourcesService fileResourcesService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbFileResources> findAll(){			
		return fileResourcesService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return fileResourcesService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param fileResources
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbFileResources fileResources){
		try {
			fileResourcesService.add(fileResources);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param fileResources
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbFileResources fileResources){
		try {
			fileResourcesService.update(fileResources);
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
	public TbFileResources findOne(Long id){
		return fileResourcesService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			fileResourcesService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param fileResources
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbFileResources fileResources, int page, int rows  ){
		return fileResourcesService.findPage(fileResources, page, rows);		
	}
	
}
