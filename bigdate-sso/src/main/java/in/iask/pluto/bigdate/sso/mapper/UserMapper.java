package in.iask.pluto.bigdate.sso.mapper;

import in.iask.pluto.bigdate.sso.bean.UmsMember;
import in.iask.pluto.bigdate.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/12 11:10 下午
 **/


public interface UserMapper {

    List<UmsMember> selectAllUser();


}
