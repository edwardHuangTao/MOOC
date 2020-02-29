package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbFileResourcesMapper;
import com.hongxuan.mooc.service.FileResourcesService;
import com.hongxuan.pojo.TbFileResources;
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
public class FileResourcesServiceImpl implements FileResourcesService {

	@Autowired
	private TbFileResourcesMapper fileResourcesMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbFileResources> findAll() {
		return fileResourcesMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbFileResources> result = new PageResult<TbFileResources>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbFileResources> list = fileResourcesMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbFileResources> info = new PageInfo<TbFileResources>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbFileResources fileResources) {
		fileResourcesMapper.insertSelective(fileResources);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbFileResources fileResources){
		fileResourcesMapper.updateByPrimaryKeySelective(fileResources);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbFileResources findOne(Long id){
		return fileResourcesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbFileResources.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        fileResourcesMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbFileResources fileResources, int pageNum, int pageSize) {
		PageResult<TbFileResources> result = new PageResult<TbFileResources>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbFileResources.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(fileResources!=null){			
						//如果字段不为空
			if (fileResources.getInfoType()!=null && fileResources.getInfoType().length()>0) {
				criteria.andLike("infoType", "%" + fileResources.getInfoType() + "%");
			}
			//如果字段不为空
			if (fileResources.getFileAddress()!=null && fileResources.getFileAddress().length()>0) {
				criteria.andLike("fileAddress", "%" + fileResources.getFileAddress() + "%");
			}
			//如果字段不为空
			if (fileResources.getInfoStatus()!=null && fileResources.getInfoStatus().length()>0) {
				criteria.andLike("infoStatus", "%" + fileResources.getInfoStatus() + "%");
			}
			//如果字段不为空
			if (fileResources.getBelongType()!=null && fileResources.getBelongType().length()>0) {
				criteria.andLike("belongType", "%" + fileResources.getBelongType() + "%");
			}
			//如果字段不为空
			if (fileResources.getIsValid()!=null && fileResources.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + fileResources.getIsValid() + "%");
			}
			//如果字段不为空
			if (fileResources.getRemark()!=null && fileResources.getRemark().length()>0) {
				criteria.andLike("remark", "%" + fileResources.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbFileResources> list = fileResourcesMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbFileResources> info = new PageInfo<TbFileResources>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
