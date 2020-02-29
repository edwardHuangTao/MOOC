package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbUserRoleRMapper;
import com.hongxuan.mooc.service.UserRoleRService;
import com.hongxuan.pojo.TbUserRoleR;
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
public class UserRoleRServiceImpl implements UserRoleRService {

	@Autowired
	private TbUserRoleRMapper userRoleRMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbUserRoleR> findAll() {
		return userRoleRMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbUserRoleR> result = new PageResult<TbUserRoleR>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbUserRoleR> list = userRoleRMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbUserRoleR> info = new PageInfo<TbUserRoleR>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbUserRoleR userRoleR) {
		userRoleRMapper.insertSelective(userRoleR);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbUserRoleR userRoleR){
		userRoleRMapper.updateByPrimaryKeySelective(userRoleR);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbUserRoleR findOne(Long id){
		return userRoleRMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbUserRoleR.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        userRoleRMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbUserRoleR userRoleR, int pageNum, int pageSize) {
		PageResult<TbUserRoleR> result = new PageResult<TbUserRoleR>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbUserRoleR.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(userRoleR!=null){			
						//如果字段不为空
			if (userRoleR.getRelationStatus()!=null && userRoleR.getRelationStatus().length()>0) {
				criteria.andLike("relationStatus", "%" + userRoleR.getRelationStatus() + "%");
			}
			//如果字段不为空
			if (userRoleR.getIsValid()!=null && userRoleR.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + userRoleR.getIsValid() + "%");
			}
			//如果字段不为空
			if (userRoleR.getRemark()!=null && userRoleR.getRemark().length()>0) {
				criteria.andLike("remark", "%" + userRoleR.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbUserRoleR> list = userRoleRMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbUserRoleR> info = new PageInfo<TbUserRoleR>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
