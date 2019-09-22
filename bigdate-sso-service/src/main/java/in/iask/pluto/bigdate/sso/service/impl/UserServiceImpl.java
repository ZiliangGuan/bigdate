package in.iask.pluto.bigdate.sso.service.impl;




import com.alibaba.dubbo.config.annotation.Service;
import in.iask.pluto.bigdate.bean.UmsMember;
import in.iask.pluto.bigdate.bean.UmsMemberAddress;
import in.iask.pluto.bigdate.service.UserService;
import in.iask.pluto.bigdate.sso.mapper.UmsMemberReceiveAddressMapper;
import in.iask.pluto.bigdate.sso.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

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
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembersList = userMapper.selectAllUser();//userMapper.selectAllUser();
        return umsMembersList;
    }

    @Override
    public List<UmsMemberAddress> getMemberReceiveAddressbyMemberId(String memberId) {

        UmsMemberAddress umsMemberReceiveAddress = new UmsMemberAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;

        //Example example = new Example(UmsMemberAddress.class);
        //example.createCriteria().andEqualTo("memberId", memberId);
        //List<UmsMemberAddress> umsMemberAddresses = umsMemberReceiveAddressMapper.selectByExample(example);
        //return  umsMemberAddresses;
    }

}
