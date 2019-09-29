package in.iask.pluto.bigdate.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import in.iask.pluto.bigdate.bean.Role;
import in.iask.pluto.bigdate.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/28 2:20 下午
 **/

@RestController
public class RoleController {

    @Reference
    RoleService roleService;

    @RequestMapping("/getAllRole")
    public List<Role> getAllRole() {
        List<Role> roles = roleService.getAllRole();
        return roles;
    }

    @RequestMapping("/getRoleByParentId")
    public List<Role> getRoleByParentId(String parent_id) {
        List<Role> roleList = roleService.getRoleByParentId(parent_id);
        return roleList;
    }

    @RequestMapping("/insertRole")
    public Role insertRole(Role role) {
        return roleService.insertRole(role);
    }


}
