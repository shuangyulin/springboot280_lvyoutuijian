package com.dao;

import com.entity.LvyouluxianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyouluxianCollectionView;

/**
 * 路线收藏 Dao 接口
 *
 * @author 
 */
public interface LvyouluxianCollectionDao extends BaseMapper<LvyouluxianCollectionEntity> {

   List<LvyouluxianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
