package in.iask.pluto.bigdate.user.mapper;

import in.iask.pluto.bigdate.bean.Role;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoleMapper extends Mapper<Role> {


    List<Role> getAllRole();

    List<Role> getRoleByParentId(String parent_id);

    int insertRole(Role role);


}
