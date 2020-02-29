package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbCourseMapper;
import com.hongxuan.mooc.service.CourseService;
import com.hongxuan.pojo.TbCourse;
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
public class CourseServiceImpl implements CourseService {

	@Autowired
	private TbCourseMapper courseMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCourse> findAll() {
		return courseMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbCourse> result = new PageResult<TbCourse>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbCourse> list = courseMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbCourse> info = new PageInfo<TbCourse>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCourse course) {
		courseMapper.insertSelective(course);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCourse course){
		courseMapper.updateByPrimaryKeySelective(course);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCourse findOne(Long id){
		return courseMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbCourse.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        courseMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbCourse course, int pageNum, int pageSize) {
		PageResult<TbCourse> result = new PageResult<TbCourse>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbCourse.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(course!=null){			
						//如果字段不为空
			if (course.getName()!=null && course.getName().length()>0) {
				criteria.andLike("name", "%" + course.getName() + "%");
			}
			//如果字段不为空
			if (course.getIntroduction()!=null && course.getIntroduction().length()>0) {
				criteria.andLike("introduction", "%" + course.getIntroduction() + "%");
			}
			//如果字段不为空
			if (course.getStatus()!=null && course.getStatus().length()>0) {
				criteria.andLike("status", "%" + course.getStatus() + "%");
			}
			//如果字段不为空
			if (course.getIsValid()!=null && course.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + course.getIsValid() + "%");
			}
			//如果字段不为空
			if (course.getRemark()!=null && course.getRemark().length()>0) {
				criteria.andLike("remark", "%" + course.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbCourse> list = courseMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbCourse> info = new PageInfo<TbCourse>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
