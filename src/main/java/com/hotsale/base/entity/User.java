package com.hotsale.base.entity;

import com.hotsale.core.res.CreateUpdateEntityRes;

import java.util.Date;

/**
 * Created by  hyhadmin on 2018/7/26.
 */
public class User extends CreateUpdateEntityRes {

    /**
     * 主键
     * 用户ID
     * isNullAble:0
     */
    private Long userId;

    /**
     * 用户名
     * isNullAble:1
     */
    private String userName;

    /**
     *
     * isNullAble:0
     */
    private String userPassword;

    /**
     *
     * isNullAble:1
     */
    private String headerUrl;

    /**
     *
     * isNullAble:1,defaultVal:0
     */
    private Integer merchant;

    /**
     * 创建时间
     * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
     */
    private Date createTime;


    public void setUserId(Long userId){this.userId = userId;}

    public Long getUserId(){return this.userId;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setUserPassword(String userPassword){this.userPassword = userPassword;}

    public String getUserPassword(){return this.userPassword;}

    public void setHeaderUrl(String headerUrl){this.headerUrl = headerUrl;}

    public String getHeaderUrl(){return this.headerUrl;}

    public void setMerchant(Integer merchant){this.merchant = merchant;}

    public Integer getMerchant(){return this.merchant;}

    public void setCreateTime(Date createTime){this.createTime = createTime;}

    public Date getCreateTime(){return this.createTime;}
}
