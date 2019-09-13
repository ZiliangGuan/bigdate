package in.iask.pluto.bigdate.sso.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/13 12:29 下午
 **/

@Data
public class UmsMember {


    private long id;
    private long memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private long status;
    private Date createTime;
    private String icon;
    private long gender;
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private long sourceType;
    private long integration;
    private long growth;
    private long luckyCount;
    private long historyIntegration;


}
