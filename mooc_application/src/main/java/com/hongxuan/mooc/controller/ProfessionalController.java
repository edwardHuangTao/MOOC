package com.hongxuan.mooc.controller;

import com.hongxuan.mooc.service.ProfessionalService;
import com.hongxuan.pojo.TbProfessional;
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
@RequestMapping("/professional")
public class ProfessionalController {

	@Autowired
	private ProfessionalService professionalService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbProfessional> findAll(){			
		return professionalService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return professionalService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param professional
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbProfessional professional){
		try {
			professionalService.add(professional);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param professional
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbProfessional professional){
		try {
			professionalService.update(professional);
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
	public TbProfessional findOne(Long id){
		return professionalService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			professionalService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	/**
	 * 查询+分页
	 * @param professional
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbProfessional professional, int page, int rows  ){
		return professionalService.findPage(professional, page, rows);		
	}
	
}
