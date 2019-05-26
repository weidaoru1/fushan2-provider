package com.fushan2provider.service.cost;
import com.fushan2api.common.utils.DataGrid;
import com.fushan2api.common.utils.PageInfo;
import com.fushan2api.model.cost.PaymentRecord;
import com.fushan2api.service.cost.PaymentRecordService;
import com.fushan2provider.mapper.PaymentRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PaymentRecordServiceImpl implements PaymentRecordService {
    @Autowired
    PaymentRecordMapper paymentRecordMapper;

    @Override
    public int deleteByPaymentId(Integer id) {
        return paymentRecordMapper.deleteByPaymentId(id);
    }

    @Override

    public int deleteByPrimaryKey(Integer id) {
        return paymentRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PaymentRecord record) {
        return paymentRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(PaymentRecord record) {
        return paymentRecordMapper.insertSelective(record);
    }

    @Override
    public PaymentRecord selectByPrimaryKey(Integer id) {
        return paymentRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PaymentRecord record) {
        return paymentRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PaymentRecord record) {
        return paymentRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<PaymentRecord> pagedQuery(DataGrid grid) {
        return this.pagedQueryByCondition(grid,new HashMap<>());
    }

    @Override
    public PageInfo<PaymentRecord> pagedQueryByCondition(DataGrid grid, Map<String, Object> map) {
        int totalRows = paymentRecordMapper.count(map);
        int startRows = (grid.getPageNum() - 1) * grid.getPageSize();
        map.put("start",startRows);
        map.put("end",grid.getPageSize());
        List<PaymentRecord> list = paymentRecordMapper.pagedQuery(map);
        return new PageInfo<>(startRows,totalRows,grid.getPageSize(),grid.getPageNum(),list);
    }

    @Override
    public int count(Map<String, Object> map) {
        return paymentRecordMapper.count(map);
    }
}
