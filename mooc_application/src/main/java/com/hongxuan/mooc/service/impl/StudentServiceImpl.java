package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbStudentMapper;
import com.hongxuan.mooc.service.StudentService;
import com.hongxuan.pojo.TbStudent;
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
public class StudentServiceImpl implements StudentService {

	@Autowired
	private TbStudentMapper studentMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbStudent> findAll() {
		return studentMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbStudent> result = new PageResult<TbStudent>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbStudent> list = studentMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbStudent> info = new PageInfo<TbStudent>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbStudent student) {
		studentMapper.insertSelective(student);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbStudent student){
		studentMapper.updateByPrimaryKeySelective(student);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbStudent findOne(Long id){
		return studentMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbStudent.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        studentMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbStudent student, int pageNum, int pageSize) {
		PageResult<TbStudent> result = new PageResult<TbStudent>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbStudent.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(student!=null){			
						//如果字段不为空
			if (student.getName()!=null && student.getName().length()>0) {
				criteria.andLike("name", "%" + student.getName() + "%");
			}
			//如果字段不为空
			if (student.getGender()!=null && student.getGender().length()>0) {
				criteria.andLike("gender", "%" + student.getGender() + "%");
			}
			//如果字段不为空
			if (student.getPhoneNumber()!=null && student.getPhoneNumber().length()>0) {
				criteria.andLike("phoneNumber", "%" + student.getPhoneNumber() + "%");
			}
			//如果字段不为空
			if (student.getLegalPersonCardId()!=null && student.getLegalPersonCardId().length()>0) {
				criteria.andLike("legalPersonCardId", "%" + student.getLegalPersonCardId() + "%");
			}
			//如果字段不为空
			if (student.getWechatNumber()!=null && student.getWechatNumber().length()>0) {
				criteria.andLike("wechatNumber", "%" + student.getWechatNumber() + "%");
			}
			//如果字段不为空
			if (student.getQqNumber()!=null && student.getQqNumber().length()>0) {
				criteria.andLike("qqNumber", "%" + student.getQqNumber() + "%");
			}
			//如果字段不为空
			if (student.getEmailAddress()!=null && student.getEmailAddress().length()>0) {
				criteria.andLike("emailAddress", "%" + student.getEmailAddress() + "%");
			}
			//如果字段不为空
			if (student.getIntroduction()!=null && student.getIntroduction().length()>0) {
				criteria.andLike("introduction", "%" + student.getIntroduction() + "%");
			}
			//如果字段不为空
			if (student.getNickName()!=null && student.getNickName().length()>0) {
				criteria.andLike("nickName", "%" + student.getNickName() + "%");
			}
			//如果字段不为空
			if (student.getNativePlace()!=null && student.getNativePlace().length()>0) {
				criteria.andLike("nativePlace", "%" + student.getNativePlace() + "%");
			}
			//如果字段不为空
			if (student.getStatus()!=null && student.getStatus().length()>0) {
				criteria.andLike("status", "%" + student.getStatus() + "%");
			}
			//如果字段不为空
			if (student.getIsValid()!=null && student.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + student.getIsValid() + "%");
			}
			//如果字段不为空
			if (student.getRemark()!=null && student.getRemark().length()>0) {
				criteria.andLike("remark", "%" + student.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbStudent> list = studentMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbStudent> info = new PageInfo<TbStudent>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
