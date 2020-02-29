package com.hongxuan.mooc.controller;

import com.hongxuan.mooc.service.TeacherService;
import com.hongxuan.pojo.TbTeacher;
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
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbTeacher> findAll(){			
		return teacherService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return teacherService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param teacher
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbTeacher teacher){
		try {
			teacherService.add(teacher);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param teacher
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbTeacher teacher){
		try {
			teacherService.update(teacher);
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
	public TbTeacher findOne(Long id){
		return teacherService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			teacherService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param teacher
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbTeacher teacher, int page, int rows  ){
		return teacherService.findPage(teacher, page, rows);		
	}
	
}
