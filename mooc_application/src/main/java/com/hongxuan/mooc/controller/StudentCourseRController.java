package com.hongxuan.mooc.controller;

import com.hongxuan.mooc.service.StudentCourseRService;
import com.hongxuan.pojo.TbStudentCourseR;
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
@RequestMapping("/studentCourseR")
public class StudentCourseRController {

	@Autowired
	private StudentCourseRService studentCourseRService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbStudentCourseR> findAll(){			
		return studentCourseRService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return studentCourseRService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param studentCourseR
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbStudentCourseR studentCourseR){
		try {
			studentCourseRService.add(studentCourseR);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param studentCourseR
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbStudentCourseR studentCourseR){
		try {
			studentCourseRService.update(studentCourseR);
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
	public TbStudentCourseR findOne(Long id){
		return studentCourseRService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			studentCourseRService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param studentCourseR
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbStudentCourseR studentCourseR, int page, int rows  ){
		return studentCourseRService.findPage(studentCourseR, page, rows);		
	}
	
}
