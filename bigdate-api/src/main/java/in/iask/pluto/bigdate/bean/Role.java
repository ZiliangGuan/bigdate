package in.iask.pluto.bigdate.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * @Description
 * @Author Guan Ziliang
 * @Email guanziliang@qq.com
 * @CreateDate 2019/9/26 8:48 下午
 **/

@Data
@Table(name = "role")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "parent_id")
    private String parent_id;
    @Column(name = "role_name")
    private String role_name;
    @Column(name = "create_date")
    private java.sql.Timestamp create_date;
    @Column(name = "role_des")
    private String role_des;

}
