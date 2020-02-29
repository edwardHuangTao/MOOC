package com.hongxuan.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_student")
public class TbStudent implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 手机号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 法定代表人身份证
     */
    @Column(name = "legal_person_card_id")
    private String legalPersonCardId;

    /**
     * 微信账号
     */
    @Column(name = "wechat_number")
    private String wechatNumber;

    /**
     * QQ账号
     */
    @Column(name = "qq_number")
    private String qqNumber;

    /**
     * 邮箱地址
     */
    @Column(name = "email_address")
    private String emailAddress;

    /**
     * 自我介绍
     */
    private String introduction;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 头像
     */
    @Column(name = "portrait_img_id")
    private Long portraitImgId;

    /**
     * 年级
     */
    @Column(name = "grade_level")
    private Integer gradeLevel;

    /**
     * 班级
     */
    @Column(name = "class_level")
    private Integer classLevel;

    /**
     * 专业代码
     */
    @Column(name = "professional_id")
    private Long professionalId;

    /**
     * 院系代码
     */
    @Column(name = "department_id")
    private Long departmentId;

    /**
     * 籍贯
     */
    @Column(name = "native_place")
    private String nativePlace;

    /**
     * 学生状态,0无学籍
     */
    private String status;

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
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

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
     * 获取学生姓名
     *
     * @return name - 学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生姓名
     *
     * @param name 学生姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取手机号码
     *
     * @return phone_number - 手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号码
     *
     * @param phoneNumber 手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取法定代表人身份证
     *
     * @return legal_person_card_id - 法定代表人身份证
     */
    public String getLegalPersonCardId() {
        return legalPersonCardId;
    }

    /**
     * 设置法定代表人身份证
     *
     * @param legalPersonCardId 法定代表人身份证
     */
    public void setLegalPersonCardId(String legalPersonCardId) {
        this.legalPersonCardId = legalPersonCardId;
    }

    /**
     * 获取微信账号
     *
     * @return wechat_number - 微信账号
     */
    public String getWechatNumber() {
        return wechatNumber;
    }

    /**
     * 设置微信账号
     *
     * @param wechatNumber 微信账号
     */
    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    /**
     * 获取QQ账号
     *
     * @return qq_number - QQ账号
     */
    public String getQqNumber() {
        return qqNumber;
    }

    /**
     * 设置QQ账号
     *
     * @param qqNumber QQ账号
     */
    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    /**
     * 获取邮箱地址
     *
     * @return email_address - 邮箱地址
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 设置邮箱地址
     *
     * @param emailAddress 邮箱地址
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * 获取自我介绍
     *
     * @return introduction - 自我介绍
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置自我介绍
     *
     * @param introduction 自我介绍
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取头像
     *
     * @return portrait_img_id - 头像
     */
    public Long getPortraitImgId() {
        return portraitImgId;
    }

    /**
     * 设置头像
     *
     * @param portraitImgId 头像
     */
    public void setPortraitImgId(Long portraitImgId) {
        this.portraitImgId = portraitImgId;
    }

    /**
     * 获取年级
     *
     * @return grade_level - 年级
     */
    public Integer getGradeLevel() {
        return gradeLevel;
    }

    /**
     * 设置年级
     *
     * @param gradeLevel 年级
     */
    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    /**
     * 获取班级
     *
     * @return class_level - 班级
     */
    public Integer getClassLevel() {
        return classLevel;
    }

    /**
     * 设置班级
     *
     * @param classLevel 班级
     */
    public void setClassLevel(Integer classLevel) {
        this.classLevel = classLevel;
    }

    /**
     * 获取专业代码
     *
     * @return professional_id - 专业代码
     */
    public Long getProfessionalId() {
        return professionalId;
    }

    /**
     * 设置专业代码
     *
     * @param professionalId 专业代码
     */
    public void setProfessionalId(Long professionalId) {
        this.professionalId = professionalId;
    }

    /**
     * 获取院系代码
     *
     * @return department_id - 院系代码
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置院系代码
     *
     * @param departmentId 院系代码
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取籍贯
     *
     * @return native_place - 籍贯
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * 设置籍贯
     *
     * @param nativePlace 籍贯
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    /**
     * 获取学生状态,0无学籍
     *
     * @return status - 学生状态,0无学籍
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置学生状态,0无学籍
     *
     * @param status 学生状态,0无学籍
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", legalPersonCardId=").append(legalPersonCardId);
        sb.append(", wechatNumber=").append(wechatNumber);
        sb.append(", qqNumber=").append(qqNumber);
        sb.append(", emailAddress=").append(emailAddress);
        sb.append(", introduction=").append(introduction);
        sb.append(", nickName=").append(nickName);
        sb.append(", portraitImgId=").append(portraitImgId);
        sb.append(", gradeLevel=").append(gradeLevel);
        sb.append(", classLevel=").append(classLevel);
        sb.append(", professionalId=").append(professionalId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", status=").append(status);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createDate=").append(createDate);
        sb.append(", uodateUserId=").append(uodateUserId);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", isValid=").append(isValid);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}