package com.fushan2provider.mapper;
import com.fushan2api.model.role.RoleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleInfoMapper {
    List<RoleInfo> queryByUserId(Map<String, Object> map);
    List<RoleInfo> queryListAll();
}
