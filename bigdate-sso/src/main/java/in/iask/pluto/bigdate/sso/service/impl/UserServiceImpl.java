package in.iask.pluto.bigdate.sso.service.impl;

import in.iask.pluto.bigdate.sso.bean.UmsMember;
import in.iask.pluto.bigdate.sso.mapper.UserMapper;
import in.iask.pluto.bigdate.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/12 11:08 下午
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembersList = userMapper.selectAllUser();
        return umsMembersList;
    }

}
