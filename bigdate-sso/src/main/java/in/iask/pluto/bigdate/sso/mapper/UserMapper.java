package in.iask.pluto.bigdate.sso.mapper;




import in.iask.pluto.bigdate.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/12 11:10 下午
 **/


public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();


}
