package com.hongxuan.mooc.service;
import com.hongxuan.pojo.TbProfessional;
import entity.PageResult;

import java.util.List;
/**
 * 业务逻辑接口
 * @author LiaoHongXuan
 *
 */
public interface ProfessionalService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbProfessional> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbProfessional professional);
	
	
	/**
	 * 修改
	 */
	public void update(TbProfessional professional);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbProfessional findOne(Long id);
	
	
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
	public PageResult findPage(TbProfessional professional, int pageNum,int pageSize);
	
}
