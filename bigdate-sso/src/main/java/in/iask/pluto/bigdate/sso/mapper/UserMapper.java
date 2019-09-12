package in.iask.pluto.bigdate.sso.mapper;

import in.iask.pluto.bigdate.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/12 11:10 下午
 **/


@RestController
public class UserMapper {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String index() {
        return "Hello user";
    }

}
