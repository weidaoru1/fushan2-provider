package com.fushan2provider.mapper;
import com.fushan2api.model.menu.MenuInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuInfoMapper{
    int count(Map<String, Object> map);
    List<MenuInfo> pagedQuery(Map<String, Object> map);
    List<MenuInfo> queryList(MenuInfo menuInfo);
    List<MenuInfo> queryListAll();
    int deleteByPrimaryKey(Integer id);
    int insertSelective(MenuInfo menuInfo);
    MenuInfo selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(MenuInfo menuInfo);
    List<MenuInfo> queryByUserId(Map<String, Object> map);
}
