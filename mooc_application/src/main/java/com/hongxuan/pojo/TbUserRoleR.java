package com.hongxuan.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_role_r")
public class TbUserRoleR implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 人员账号id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 关系是否禁用(0失效)
     */
    @Column(name = "relation_status")
    private String relationStatus;

    /**
     * 授权开始时间
     */
    @Column(name = "authorization_begin_time")
    private Date authorizationBeginTime;

    /**
     * 授权结束时间
     */
    @Column(name = "authorization_end_time")
    private Date authorizationEndTime;

    /**
     * 创建人
     */
    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新人
     */
    @Column(name = "uodate_user_id")
    private Long uodateUserId;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 是否有效
     */
    @Column(name = "is_valid")
    private String isValid;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取人员账号id
     *
     * @return user_id - 人员账号id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置人员账号id
     *
     * @param userId 人员账号id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取关系是否禁用(0失效)
     *
     * @return relation_status - 关系是否禁用(0失效)
     */
    public String getRelationStatus() {
        return relationStatus;
    }

    /**
     * 设置关系是否禁用(0失效)
     *
     * @param relationStatus 关系是否禁用(0失效)
     */
    public void setRelationStatus(String relationStatus) {
        this.relationStatus = relationStatus;
    }

    /**
     * 获取授权开始时间
     *
     * @return authorization_begin_time - 授权开始时间
     */
    public Date getAuthorizationBeginTime() {
        return authorizationBeginTime;
    }

    /**
     * 设置授权开始时间
     *
     * @param authorizationBeginTime 授权开始时间
     */
    public void setAuthorizationBeginTime(Date authorizationBeginTime) {
        this.authorizationBeginTime = authorizationBeginTime;
    }

    /**
     * 获取授权结束时间
     *
     * @return authorization_end_time - 授权结束时间
     */
    public Date getAuthorizationEndTime() {
        return authorizationEndTime;
    }

    /**
     * 设置授权结束时间
     *
     * @param authorizationEndTime 授权结束时间
     */
    public void setAuthorizationEndTime(Date authorizationEndTime) {
        this.authorizationEndTime = authorizationEndTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user_id - 创建人
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人
     *
     * @param createUserId 创建人
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新人
     *
     * @return uodate_user_id - 更新人
     */
    public Long getUodateUserId() {
        return uodateUserId;
    }

    /**
     * 设置更新人
     *
     * @param uodateUserId 更新人
     */
    public void setUodateUserId(Long uodateUserId) {
        this.uodateUserId = uodateUserId;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取是否有效
     *
     * @return is_valid - 是否有效
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效
     *
     * @param isValid 是否有效
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", relationStatus=").append(relationStatus);
        sb.append(", authorizationBeginTime=").append(authorizationBeginTime);
        sb.append(", authorizationEndTime=").append(authorizationEndTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createDate=").append(createDate);
        sb.append(", uodateUserId=").append(uodateUserId);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", isValid=").append(isValid);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}