package com.dao;

import com.entity.LvyouluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyouluxianView;

/**
 * 旅游路线 Dao 接口
 *
 * @author 
 */
public interface LvyouluxianDao extends BaseMapper<LvyouluxianEntity> {

   List<LvyouluxianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
