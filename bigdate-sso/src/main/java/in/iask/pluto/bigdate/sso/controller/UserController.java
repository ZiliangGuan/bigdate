package in.iask.pluto.bigdate.sso.controller;



import in.iask.pluto.bigdate.bean.UmsMember;
import in.iask.pluto.bigdate.bean.UmsMemberAddress;
import in.iask.pluto.bigdate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/12 11:04 下午
 **/

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getReceiveAddressByMemberId")
    public List<UmsMemberAddress> getMemberReceiveAddressbyMemberId(String memberId) {
        List<UmsMemberAddress> umsMemberReceiveAddressrs = userService.getMemberReceiveAddressbyMemberId(memberId);
        return umsMemberReceiveAddressrs;
    }



}
