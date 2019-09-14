package in.iask.pluto.bigdate.service;




import in.iask.pluto.bigdate.bean.UmsMember;
import in.iask.pluto.bigdate.bean.UmsMemberAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberAddress> getMemberReceiveAddressbyMemberId(String memberId);

}
