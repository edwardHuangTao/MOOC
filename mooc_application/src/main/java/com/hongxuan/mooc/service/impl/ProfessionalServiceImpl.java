package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbProfessionalMapper;
import com.hongxuan.mooc.service.ProfessionalService;
import com.hongxuan.pojo.TbProfessional;
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
public class ProfessionalServiceImpl implements ProfessionalService {

	@Autowired
	private TbProfessionalMapper professionalMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbProfessional> findAll() {
		return professionalMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbProfessional> result = new PageResult<TbProfessional>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbProfessional> list = professionalMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbProfessional> info = new PageInfo<TbProfessional>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbProfessional professional) {
		professionalMapper.insertSelective(professional);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbProfessional professional){
		professionalMapper.updateByPrimaryKeySelective(professional);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbProfessional findOne(Long id){
		return professionalMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbProfessional.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        professionalMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbProfessional professional, int pageNum, int pageSize) {
		PageResult<TbProfessional> result = new PageResult<TbProfessional>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbProfessional.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(professional!=null){			
						//如果字段不为空
			if (professional.getName()!=null && professional.getName().length()>0) {
				criteria.andLike("name", "%" + professional.getName() + "%");
			}
			//如果字段不为空
			if (professional.getIsValid()!=null && professional.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + professional.getIsValid() + "%");
			}
			//如果字段不为空
			if (professional.getRemark()!=null && professional.getRemark().length()>0) {
				criteria.andLike("remark", "%" + professional.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbProfessional> list = professionalMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbProfessional> info = new PageInfo<TbProfessional>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
