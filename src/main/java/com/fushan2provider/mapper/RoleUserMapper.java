package com.fushan2provider.mapper;
import com.fushan2api.model.role.RoleUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleUserMapper {
    int insertSelective(RoleUser entity);
    int deleteByUserId(Integer id);
}
