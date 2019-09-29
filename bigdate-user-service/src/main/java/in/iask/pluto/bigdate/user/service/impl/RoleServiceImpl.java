package in.iask.pluto.bigdate.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import in.iask.pluto.bigdate.bean.Role;
import in.iask.pluto.bigdate.service.RoleService;
import in.iask.pluto.bigdate.user.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/28 2:16 下午
 **/

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getAllRole() {
        List<Role> roles = roleMapper.getAllRole();
        return roles;
    }

    @Override
    public List<Role> getRoleByParentId(String parent_id) {
        List<Role> roleList = roleMapper.getRoleByParentId(parent_id);
        return roleList;
    }

    @Override
    public Role insertRole(Role role) {
        roleMapper.insertRole(role);
        return role;
    }

}
