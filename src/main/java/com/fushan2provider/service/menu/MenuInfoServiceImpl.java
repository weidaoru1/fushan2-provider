package com.fushan2provider.service.menu;
import com.fushan2api.common.utils.DataGrid;
import com.fushan2api.common.utils.PageInfo;
import com.fushan2api.model.menu.MenuInfo;
import com.fushan2api.service.menu.MenuInfoService;
import com.fushan2provider.mapper.MenuInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MenuInfoServiceImpl implements MenuInfoService {
    @Autowired
    MenuInfoMapper menuInfoMapper;
    @Override
    public PageInfo<MenuInfo> pagedQuery(DataGrid grid) {
        return this.pagedQueryByCondition(grid,new HashMap<>());
    }

    @Override
    public List<MenuInfo> queryByUserId(Integer id) {
        Map<String,Object> map = new HashMap<>();
        map.put("userId",id);
        return menuInfoMapper.queryByUserId(map);
    }

    @Override
    public MenuInfo selectByPrimaryKey(Integer key) {
        return menuInfoMapper.selectByPrimaryKey(key);
    }

    @Override
    public PageInfo<MenuInfo> pagedQueryByCondition(DataGrid grid, Map<String, Object> map) {
        int totalRows = menuInfoMapper.count(map);
        int startRows = (grid.getPageNum() - 1) * grid.getPageSize();
        map.put("start",startRows);
        map.put("end",grid.getPageSize());
        List<MenuInfo> list = menuInfoMapper.pagedQuery(map);
        return new PageInfo<>(startRows,totalRows,grid.getPageSize(),grid.getPageNum(),list);
    }

    @Override
    public List<MenuInfo> queryList(MenuInfo entity) {
        return menuInfoMapper.queryList(entity);
    }

    @Override
    public List<MenuInfo> queryListAll() {
        return menuInfoMapper.queryListAll();
    }

    @Override
    public int count(Map<String, Object> map) {
        return menuInfoMapper.count(map);
    }

    @Override
    public int insertSelective(MenuInfo entity) {
        return menuInfoMapper.insertSelective(entity);
    }

    @Override
    public int updateByPrimaryKey(MenuInfo entity) {
        return menuInfoMapper.updateByPrimaryKeySelective(entity);
    }

}
