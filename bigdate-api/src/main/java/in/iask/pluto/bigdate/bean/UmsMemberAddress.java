package in.iask.pluto.bigdate.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/13 5:22 下午
 **/

@Data
public class UmsMemberAddress implements Serializable {

    @Id
    private long id;
    private String memberId;
    private String name;
    private String phoneNumber;
    private long defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

}
