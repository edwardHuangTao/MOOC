package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbDepartmentMapper;
import com.hongxuan.mooc.service.DepartmentService;
import com.hongxuan.pojo.TbDepartment;
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
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private TbDepartmentMapper departmentMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbDepartment> findAll() {
		return departmentMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbDepartment> result = new PageResult<TbDepartment>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbDepartment> list = departmentMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbDepartment> info = new PageInfo<TbDepartment>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbDepartment department) {
		departmentMapper.insertSelective(department);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbDepartment department){
		departmentMapper.updateByPrimaryKeySelective(department);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbDepartment findOne(Long id){
		return departmentMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbDepartment.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        departmentMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbDepartment department, int pageNum, int pageSize) {
		PageResult<TbDepartment> result = new PageResult<TbDepartment>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbDepartment.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(department!=null){			
						//如果字段不为空
			if (department.getName()!=null && department.getName().length()>0) {
				criteria.andLike("name", "%" + department.getName() + "%");
			}
			//如果字段不为空
			if (department.getIsValid()!=null && department.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + department.getIsValid() + "%");
			}
			//如果字段不为空
			if (department.getRemark()!=null && department.getRemark().length()>0) {
				criteria.andLike("remark", "%" + department.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbDepartment> list = departmentMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbDepartment> info = new PageInfo<TbDepartment>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
