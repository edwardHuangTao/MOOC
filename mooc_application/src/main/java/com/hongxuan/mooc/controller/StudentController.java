package com.hongxuan.mooc.controller;

import com.hongxuan.mooc.service.StudentService;
import com.hongxuan.pojo.TbStudent;
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
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbStudent> findAll(){			
		return studentService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return studentService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param student
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbStudent student){
		try {
			studentService.add(student);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param student
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbStudent student){
		try {
			studentService.update(student);
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
	public TbStudent findOne(Long id){
		return studentService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			studentService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param student
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbStudent student, int page, int rows  ){
		return studentService.findPage(student, page, rows);		
	}
	
}
