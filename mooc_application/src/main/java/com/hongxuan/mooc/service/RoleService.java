package com.hongxuan.mooc.service;
import com.hongxuan.pojo.TbRole;
import entity.PageResult;

import java.util.List;
/**
 * 业务逻辑接口
 * @author LiaoHongXuan
 *
 */
public interface RoleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbRole> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbRole role);
	
	
	/**
	 * 修改
	 */
	public void update(TbRole role);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbRole findOne(Long id);
	
	
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
	public PageResult findPage(TbRole role, int pageNum,int pageSize);
	
}
