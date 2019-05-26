package com.fushan2provider.service.role;
import com.fushan2api.model.role.RoleUser;
import com.fushan2api.service.role.RoleUserService;
import com.fushan2provider.mapper.RoleUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    RoleUserMapper roleUserMapper;
    @Override
    public int insertSelective(RoleUser entity) {
        return roleUserMapper.insertSelective(entity);
    }

    @Override
    public int deleteByUserId(Integer id) {
        return roleUserMapper.deleteByUserId(id);
    }
}
