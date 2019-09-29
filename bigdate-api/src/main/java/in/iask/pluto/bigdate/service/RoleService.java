package in.iask.pluto.bigdate.service;

import in.iask.pluto.bigdate.bean.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRole();

    List<Role> getRoleByParentId(String parent_id);

    Role insertRole(Role role);

}
