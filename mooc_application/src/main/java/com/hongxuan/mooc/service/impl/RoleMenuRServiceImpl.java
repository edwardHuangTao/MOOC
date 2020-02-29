package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbRoleMenuRMapper;
import com.hongxuan.mooc.service.RoleMenuRService;
import com.hongxuan.pojo.TbRoleMenuR;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 业务逻辑实现
 * @author LiaoHongXuan
 *
 */
@Service
public class RoleMenuRServiceImpl implements RoleMenuRService {

	@Autowired
	private TbRoleMenuRMapper roleMenuRMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRoleMenuR> findAll() {
		return roleMenuRMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbRoleMenuR> result = new PageResult<TbRoleMenuR>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbRoleMenuR> list = roleMenuRMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbRoleMenuR> info = new PageInfo<TbRoleMenuR>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRoleMenuR roleMenuR) {
		roleMenuRMapper.insertSelective(roleMenuR);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRoleMenuR roleMenuR){
		roleMenuRMapper.updateByPrimaryKeySelective(roleMenuR);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRoleMenuR findOne(Long id){
		return roleMenuRMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbRoleMenuR.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        roleMenuRMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbRoleMenuR roleMenuR, int pageNum, int pageSize) {
		PageResult<TbRoleMenuR> result = new PageResult<TbRoleMenuR>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbRoleMenuR.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(roleMenuR!=null){			
						//如果字段不为空
			if (roleMenuR.getRelationStatus()!=null && roleMenuR.getRelationStatus().length()>0) {
				criteria.andLike("relationStatus", "%" + roleMenuR.getRelationStatus() + "%");
			}
			//如果字段不为空
			if (roleMenuR.getIsValid()!=null && roleMenuR.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + roleMenuR.getIsValid() + "%");
			}
			//如果字段不为空
			if (roleMenuR.getRemark()!=null && roleMenuR.getRemark().length()>0) {
				criteria.andLike("remark", "%" + roleMenuR.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbRoleMenuR> list = roleMenuRMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbRoleMenuR> info = new PageInfo<TbRoleMenuR>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
