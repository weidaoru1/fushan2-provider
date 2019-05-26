package com.fushan2provider.service.role;
import com.fushan2api.model.role.RoleInfo;
import com.fushan2api.service.role.RoleInfoService;
import com.fushan2provider.mapper.RoleInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    RoleInfoMapper roleInfoMapper;
    @Override
    public List<RoleInfo> queryListAll() {
        return roleInfoMapper.queryListAll();
    }

    @Override
    public List<RoleInfo> queryByUserId(Integer id) {
        Map<String,Object> map = new HashMap<>();
        map.put("userId",id);
        return roleInfoMapper.queryByUserId(map);
    }
}
