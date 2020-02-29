package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbTeacherMapper;
import com.hongxuan.mooc.service.TeacherService;
import com.hongxuan.pojo.TbTeacher;
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
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TbTeacherMapper teacherMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbTeacher> findAll() {
		return teacherMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbTeacher> result = new PageResult<TbTeacher>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbTeacher> list = teacherMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbTeacher> info = new PageInfo<TbTeacher>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbTeacher teacher) {
		teacherMapper.insertSelective(teacher);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbTeacher teacher){
		teacherMapper.updateByPrimaryKeySelective(teacher);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbTeacher findOne(Long id){
		return teacherMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbTeacher.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        teacherMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbTeacher teacher, int pageNum, int pageSize) {
		PageResult<TbTeacher> result = new PageResult<TbTeacher>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbTeacher.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(teacher!=null){			
						//如果字段不为空
			if (teacher.getName()!=null && teacher.getName().length()>0) {
				criteria.andLike("name", "%" + teacher.getName() + "%");
			}
			//如果字段不为空
			if (teacher.getGender()!=null && teacher.getGender().length()>0) {
				criteria.andLike("gender", "%" + teacher.getGender() + "%");
			}
			//如果字段不为空
			if (teacher.getPhoneNumber()!=null && teacher.getPhoneNumber().length()>0) {
				criteria.andLike("phoneNumber", "%" + teacher.getPhoneNumber() + "%");
			}
			//如果字段不为空
			if (teacher.getLegalPersonCardId()!=null && teacher.getLegalPersonCardId().length()>0) {
				criteria.andLike("legalPersonCardId", "%" + teacher.getLegalPersonCardId() + "%");
			}
			//如果字段不为空
			if (teacher.getWechatNumber()!=null && teacher.getWechatNumber().length()>0) {
				criteria.andLike("wechatNumber", "%" + teacher.getWechatNumber() + "%");
			}
			//如果字段不为空
			if (teacher.getQqNumber()!=null && teacher.getQqNumber().length()>0) {
				criteria.andLike("qqNumber", "%" + teacher.getQqNumber() + "%");
			}
			//如果字段不为空
			if (teacher.getEmailAddress()!=null && teacher.getEmailAddress().length()>0) {
				criteria.andLike("emailAddress", "%" + teacher.getEmailAddress() + "%");
			}
			//如果字段不为空
			if (teacher.getIntroduction()!=null && teacher.getIntroduction().length()>0) {
				criteria.andLike("introduction", "%" + teacher.getIntroduction() + "%");
			}
			//如果字段不为空
			if (teacher.getNickName()!=null && teacher.getNickName().length()>0) {
				criteria.andLike("nickName", "%" + teacher.getNickName() + "%");
			}
			//如果字段不为空
			if (teacher.getHonorName()!=null && teacher.getHonorName().length()>0) {
				criteria.andLike("honorName", "%" + teacher.getHonorName() + "%");
			}
			//如果字段不为空
			if (teacher.getNativePlace()!=null && teacher.getNativePlace().length()>0) {
				criteria.andLike("nativePlace", "%" + teacher.getNativePlace() + "%");
			}
			//如果字段不为空
			if (teacher.getStatus()!=null && teacher.getStatus().length()>0) {
				criteria.andLike("status", "%" + teacher.getStatus() + "%");
			}
			//如果字段不为空
			if (teacher.getIsValid()!=null && teacher.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + teacher.getIsValid() + "%");
			}
			//如果字段不为空
			if (teacher.getRemark()!=null && teacher.getRemark().length()>0) {
				criteria.andLike("remark", "%" + teacher.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbTeacher> list = teacherMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbTeacher> info = new PageInfo<TbTeacher>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
