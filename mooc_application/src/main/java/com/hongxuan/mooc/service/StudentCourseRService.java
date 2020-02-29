package com.hongxuan.mooc.service;
import com.hongxuan.pojo.TbStudentCourseR;
import entity.PageResult;

import java.util.List;
/**
 * 业务逻辑接口
 * @author LiaoHongXuan
 *
 */
public interface StudentCourseRService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbStudentCourseR> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbStudentCourseR studentCourseR);
	
	
	/**
	 * 修改
	 */
	public void update(TbStudentCourseR studentCourseR);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbStudentCourseR findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbStudentCourseR studentCourseR, int pageNum,int pageSize);
	
}
