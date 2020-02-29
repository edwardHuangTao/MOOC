package com.hongxuan.mooc.service.impl;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hongxuan.mapper.TbMenuMapper;
import com.hongxuan.mooc.service.MenuService;
import com.hongxuan.pojo.TbMenu;
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
public class MenuServiceImpl implements MenuService {

	@Autowired
	private TbMenuMapper menuMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbMenu> findAll() {
		return menuMapper.select(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageResult<TbMenu> result = new PageResult<TbMenu>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //查询数据
        List<TbMenu> list = menuMapper.select(null);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbMenu> info = new PageInfo<TbMenu>(list);
        result.setTotal(info.getTotal());
		return result;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbMenu menu) {
		menuMapper.insertSelective(menu);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbMenu menu){
		menuMapper.updateByPrimaryKeySelective(menu);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbMenu findOne(Long id){
		return menuMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		//数组转list
        List longs = Arrays.asList(ids);
        //构建查询条件
        Example example = new Example(TbMenu.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", longs);

        //跟据查询条件删除数据
        menuMapper.deleteByExample(example);
	}
	
	
	@Override
	public PageResult findPage(TbMenu menu, int pageNum, int pageSize) {
		PageResult<TbMenu> result = new PageResult<TbMenu>();
        //设置分页条件
        PageHelper.startPage(pageNum, pageSize);

        //构建查询条件
        Example example = new Example(TbMenu.class);
        Example.Criteria criteria = example.createCriteria();
		
		if(menu!=null){			
						//如果字段不为空
			if (menu.getMenuName()!=null && menu.getMenuName().length()>0) {
				criteria.andLike("menuName", "%" + menu.getMenuName() + "%");
			}
			//如果字段不为空
			if (menu.getMenuStatus()!=null && menu.getMenuStatus().length()>0) {
				criteria.andLike("menuStatus", "%" + menu.getMenuStatus() + "%");
			}
			//如果字段不为空
			if (menu.getIsValid()!=null && menu.getIsValid().length()>0) {
				criteria.andLike("isValid", "%" + menu.getIsValid() + "%");
			}
			//如果字段不为空
			if (menu.getRemark()!=null && menu.getRemark().length()>0) {
				criteria.andLike("remark", "%" + menu.getRemark() + "%");
			}
	
		}

        //查询数据
        List<TbMenu> list = menuMapper.selectByExample(example);
        //保存数据列表
        result.setRows(list);

        //获取总记录数
        PageInfo<TbMenu> info = new PageInfo<TbMenu>(list);
        result.setTotal(info.getTotal());
		
		return result;
	}
	
}
