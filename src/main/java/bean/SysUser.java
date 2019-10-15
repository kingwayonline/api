package bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sys_user")
public class SysUser {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 登录帐号
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 手机号
     */
    private Integer telephone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 用户所在部门的id
     */
    @Column(name = "dept_id")
    private Integer deptId;

    /**
     * 是否删除，0：已删除，1：未删除
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作者
     */
    private String operator;

    /**
     * 最后一次更新时间
     */
    @Column(name = "operate_time")
    private Date operateTime;

    /**
     * 最后一次更新者的ip地址
     */
    @Column(name = "operate_ip")
    private String operateIp;

    /**
     * 平台类型，1：系统管理，2：美宅计，3：物业平台
     */
    private Integer type;

    /**
     * 积分
     */
    private Integer integrals;

}