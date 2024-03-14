package com.dao;

import com.entity.JingdianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianCollectionView;

/**
 * 景点收藏 Dao 接口
 *
 * @author 
 */
public interface JingdianCollectionDao extends BaseMapper<JingdianCollectionEntity> {

   List<JingdianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
