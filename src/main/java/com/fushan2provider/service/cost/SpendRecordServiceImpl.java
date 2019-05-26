package com.fushan2provider.service.cost;
import com.fushan2api.common.utils.DataGrid;
import com.fushan2api.common.utils.PageInfo;
import com.fushan2api.model.cost.SpendRecord;
import com.fushan2api.service.cost.SpendRecordService;
import com.fushan2provider.mapper.SpendRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SpendRecordServiceImpl implements SpendRecordService {
    @Autowired
    SpendRecordMapper spendRecordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return spendRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SpendRecord record) {
        return spendRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(SpendRecord record) {
        return spendRecordMapper.insertSelective(record);
    }

    @Override
    public SpendRecord selectByPrimaryKey(Integer id) {
        return spendRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SpendRecord record) {
        return spendRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SpendRecord record) {
        return spendRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteBySpendId(Integer id) {
        return spendRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<SpendRecord> pagedQuery(DataGrid grid) {
        return this.pagedQueryByCondition(grid,new HashMap<>());
    }

    @Override
    public PageInfo<SpendRecord> pagedQueryByCondition(DataGrid grid, Map<String, Object> map) {
        int totalRows = spendRecordMapper.count(map);
        int startRows = (grid.getPageNum() - 1) * grid.getPageSize();
        map.put("start",startRows);
        map.put("end",grid.getPageSize());
        List<SpendRecord> list = spendRecordMapper.pagedQuery(map);
        return new PageInfo<>(startRows,totalRows,grid.getPageSize(),grid.getPageNum(),list);
    }

    @Override
    public int count(Map<String, Object> map) {
        return spendRecordMapper.count(map);
    }
}
