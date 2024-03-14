package com.dao;

import com.entity.LvyouluxianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyouluxianLiuyanView;

/**
 * 路线留言 Dao 接口
 *
 * @author 
 */
public interface LvyouluxianLiuyanDao extends BaseMapper<LvyouluxianLiuyanEntity> {

   List<LvyouluxianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
