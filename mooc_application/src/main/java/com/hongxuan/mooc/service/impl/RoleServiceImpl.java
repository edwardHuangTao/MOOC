package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbRoleMapper;
import com.hongxuan.mooc.service.RoleService;
import com.hongxuan.pojo.TbRole;
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
public class RoleServiceImpl implements RoleService {

	@Autowired
	private TbRoleMapper roleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRole> findAll() {
		return roleMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbRole> result = new PageResult<TbRole>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbRole> list = roleMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbRole> info = new PageInfo<TbRole>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRole role) {
		roleMapper.insertSelective(role);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRole role){
		roleMapper.updateByPrimaryKeySelective(role);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRole findOne(Long id){
		return roleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        roleMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbRole role, int pageNum, int pageSize) {
		PageResult<TbRole> result = new PageResult<TbRole>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbRole.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(role!=null){			
						//如果字段不为空
			if (role.getRoleName()!=null && role.getRoleName().length()>0) {
				criteria.andLike("roleName", "%" + role.getRoleName() + "%");
			}
			//如果字段不为空
			if (role.getRoleStatus()!=null && role.getRoleStatus().length()>0) {
				criteria.andLike("roleStatus", "%" + role.getRoleStatus() + "%");
			}
			//如果字段不为空
			if (role.getIsValid()!=null && role.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + role.getIsValid() + "%");
			}
			//如果字段不为空
			if (role.getRemark()!=null && role.getRemark().length()>0) {
				criteria.andLike("remark", "%" + role.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbRole> list = roleMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbRole> info = new PageInfo<TbRole>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
