package com.hongxuan.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_course")
public class TbCourse implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程介绍
     */
    private String introduction;

    /**
     * 所属院系
     */
    @Column(name = "departments_id")
    private Long departmentsId;

    /**
     * 所属专业
     */
    @Column(name = "professional_id")
    private Long professionalId;

    /**
     * 开课时间
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 课程状态 1为正常状态
     */
    private String status;

    /**
     * 授课老师工号
     */
    @Column(name = "teacher_id")
    private Long teacherId;

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
     * 获取课程名称
     *
     * @return name - 课程名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置课程名称
     *
     * @param name 课程名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取课程介绍
     *
     * @return introduction - 课程介绍
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置课程介绍
     *
     * @param introduction 课程介绍
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 获取所属院系
     *
     * @return departments_id - 所属院系
     */
    public Long getDepartmentsId() {
        return departmentsId;
    }

    /**
     * 设置所属院系
     *
     * @param departmentsId 所属院系
     */
    public void setDepartmentsId(Long departmentsId) {
        this.departmentsId = departmentsId;
    }

    /**
     * 获取所属专业
     *
     * @return professional_id - 所属专业
     */
    public Long getProfessionalId() {
        return professionalId;
    }

    /**
     * 设置所属专业
     *
     * @param professionalId 所属专业
     */
    public void setProfessionalId(Long professionalId) {
        this.professionalId = professionalId;
    }

    /**
     * 获取开课时间
     *
     * @return begin_time - 开课时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置开课时间
     *
     * @param beginTime 开课时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取课程状态 1为正常状态
     *
     * @return status - 课程状态 1为正常状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置课程状态 1为正常状态
     *
     * @param status 课程状态 1为正常状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取授课老师工号
     *
     * @return teacher_id - 授课老师工号
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * 设置授课老师工号
     *
     * @param teacherId 授课老师工号
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
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
        sb.append(", name=").append(name);
        sb.append(", introduction=").append(introduction);
        sb.append(", departmentsId=").append(departmentsId);
        sb.append(", professionalId=").append(professionalId);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", status=").append(status);
        sb.append(", teacherId=").append(teacherId);
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