package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbStudentCourseRMapper;
import com.hongxuan.mooc.service.StudentCourseRService;
import com.hongxuan.pojo.TbStudentCourseR;
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
public class StudentCourseRServiceImpl implements StudentCourseRService {

	@Autowired
	private TbStudentCourseRMapper studentCourseRMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbStudentCourseR> findAll() {
		return studentCourseRMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbStudentCourseR> result = new PageResult<TbStudentCourseR>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbStudentCourseR> list = studentCourseRMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbStudentCourseR> info = new PageInfo<TbStudentCourseR>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbStudentCourseR studentCourseR) {
		studentCourseRMapper.insertSelective(studentCourseR);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbStudentCourseR studentCourseR){
		studentCourseRMapper.updateByPrimaryKeySelective(studentCourseR);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbStudentCourseR findOne(Long id){
		return studentCourseRMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbStudentCourseR.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        studentCourseRMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbStudentCourseR studentCourseR, int pageNum, int pageSize) {
		PageResult<TbStudentCourseR> result = new PageResult<TbStudentCourseR>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbStudentCourseR.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(studentCourseR!=null){			
						//如果字段不为空
			if (studentCourseR.getCourseComments()!=null && studentCourseR.getCourseComments().length()>0) {
				criteria.andLike("courseComments", "%" + studentCourseR.getCourseComments() + "%");
			}
			//如果字段不为空
			if (studentCourseR.getIsAnonymous()!=null && studentCourseR.getIsAnonymous().length()>0) {
				criteria.andLike("isAnonymous", "%" + studentCourseR.getIsAnonymous() + "%");
			}
			//如果字段不为空
			if (studentCourseR.getIsParticipateInLearn()!=null && studentCourseR.getIsParticipateInLearn().length()>0) {
				criteria.andLike("isParticipateInLearn", "%" + studentCourseR.getIsParticipateInLearn() + "%");
			}
			//如果字段不为空
			if (studentCourseR.getWantedToLearnLevel()!=null && studentCourseR.getWantedToLearnLevel().length()>0) {
				criteria.andLike("wantedToLearnLevel", "%" + studentCourseR.getWantedToLearnLevel() + "%");
			}
			//如果字段不为空
			if (studentCourseR.getIsValid()!=null && studentCourseR.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + studentCourseR.getIsValid() + "%");
			}
			//如果字段不为空
			if (studentCourseR.getRemark()!=null && studentCourseR.getRemark().length()>0) {
				criteria.andLike("remark", "%" + studentCourseR.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbStudentCourseR> list = studentCourseRMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbStudentCourseR> info = new PageInfo<TbStudentCourseR>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
