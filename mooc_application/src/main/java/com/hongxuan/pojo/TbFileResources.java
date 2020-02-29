package com.hongxuan.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_file_resources")
public class TbFileResources implements Serializable {
    /**
     * 资源id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 信息类型(图片0、文本1、视频2、音频3)
     */
    @Column(name = "info_type")
    private String infoType;

    /**
     * 文件路径
     */
    @Column(name = "file_address")
    private String fileAddress;

    /**
     * 资源状态(0失效)
     */
    @Column(name = "info_status")
    private String infoStatus;

    /**
     * 所属类型(课程0、人1)
     */
    @Column(name = "belong_type")
    private String belongType;

    /**
     * 所属的账号
     */
    @Column(name = "belong_id")
    private Long belongId;

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
     * 获取资源id
     *
     * @return id - 资源id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置资源id
     *
     * @param id 资源id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取信息类型(图片0、文本1、视频2、音频3)
     *
     * @return info_type - 信息类型(图片0、文本1、视频2、音频3)
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * 设置信息类型(图片0、文本1、视频2、音频3)
     *
     * @param infoType 信息类型(图片0、文本1、视频2、音频3)
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    /**
     * 获取文件路径
     *
     * @return file_address - 文件路径
     */
    public String getFileAddress() {
        return fileAddress;
    }

    /**
     * 设置文件路径
     *
     * @param fileAddress 文件路径
     */
    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    /**
     * 获取资源状态(0失效)
     *
     * @return info_status - 资源状态(0失效)
     */
    public String getInfoStatus() {
        return infoStatus;
    }

    /**
     * 设置资源状态(0失效)
     *
     * @param infoStatus 资源状态(0失效)
     */
    public void setInfoStatus(String infoStatus) {
        this.infoStatus = infoStatus;
    }

    /**
     * 获取所属类型(课程0、人1)
     *
     * @return belong_type - 所属类型(课程0、人1)
     */
    public String getBelongType() {
        return belongType;
    }

    /**
     * 设置所属类型(课程0、人1)
     *
     * @param belongType 所属类型(课程0、人1)
     */
    public void setBelongType(String belongType) {
        this.belongType = belongType;
    }

    /**
     * 获取所属的账号
     *
     * @return belong_id - 所属的账号
     */
    public Long getBelongId() {
        return belongId;
    }

    /**
     * 设置所属的账号
     *
     * @param belongId 所属的账号
     */
    public void setBelongId(Long belongId) {
        this.belongId = belongId;
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
        sb.append(", infoType=").append(infoType);
        sb.append(", fileAddress=").append(fileAddress);
        sb.append(", infoStatus=").append(infoStatus);
        sb.append(", belongType=").append(belongType);
        sb.append(", belongId=").append(belongId);
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