package com.hongxuan.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_student_course_r")
public class TbStudentCourseR implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 学号
     */
    @Column(name = "s_id")
    private Long sId;

    /**
     * 课程号
     */
    @Column(name = "c_id")
    private Long cId;

    /**
     * 课程评分
     */
    @Column(name = "course_grade")
    private Integer courseGrade;

    /**
     * 课程评论
     */
    @Column(name = "course_comments")
    private String courseComments;

    /**
     * 是否匿名评论0,不匿名
     */
    @Column(name = "is_anonymous")
    private String isAnonymous;

    /**
     * 学生成绩
     */
    @Column(name = "student_scores")
    private Integer studentScores;

    /**
     * 是否参与学习(默认值0、已学习1)
     */
    @Column(name = "is_participate_in_learn")
    private String isParticipateInLearn;

    /**
     * 想报名学习程度量化(12345、默认值为1)
     */
    @Column(name = "wanted_to_learn_level")
    private String wantedToLearnLevel;

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
     * 获取学号
     *
     * @return s_id - 学号
     */
    public Long getsId() {
        return sId;
    }

    /**
     * 设置学号
     *
     * @param sId 学号
     */
    public void setsId(Long sId) {
        this.sId = sId;
    }

    /**
     * 获取课程号
     *
     * @return c_id - 课程号
     */
    public Long getcId() {
        return cId;
    }

    /**
     * 设置课程号
     *
     * @param cId 课程号
     */
    public void setcId(Long cId) {
        this.cId = cId;
    }

    /**
     * 获取课程评分
     *
     * @return course_grade - 课程评分
     */
    public Integer getCourseGrade() {
        return courseGrade;
    }

    /**
     * 设置课程评分
     *
     * @param courseGrade 课程评分
     */
    public void setCourseGrade(Integer courseGrade) {
        this.courseGrade = courseGrade;
    }

    /**
     * 获取课程评论
     *
     * @return course_comments - 课程评论
     */
    public String getCourseComments() {
        return courseComments;
    }

    /**
     * 设置课程评论
     *
     * @param courseComments 课程评论
     */
    public void setCourseComments(String courseComments) {
        this.courseComments = courseComments;
    }

    /**
     * 获取是否匿名评论0,不匿名
     *
     * @return is_anonymous - 是否匿名评论0,不匿名
     */
    public String getIsAnonymous() {
        return isAnonymous;
    }

    /**
     * 设置是否匿名评论0,不匿名
     *
     * @param isAnonymous 是否匿名评论0,不匿名
     */
    public void setIsAnonymous(String isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    /**
     * 获取学生成绩
     *
     * @return student_scores - 学生成绩
     */
    public Integer getStudentScores() {
        return studentScores;
    }

    /**
     * 设置学生成绩
     *
     * @param studentScores 学生成绩
     */
    public void setStudentScores(Integer studentScores) {
        this.studentScores = studentScores;
    }

    /**
     * 获取是否参与学习(默认值0、已学习1)
     *
     * @return is_participate_in_learn - 是否参与学习(默认值0、已学习1)
     */
    public String getIsParticipateInLearn() {
        return isParticipateInLearn;
    }

    /**
     * 设置是否参与学习(默认值0、已学习1)
     *
     * @param isParticipateInLearn 是否参与学习(默认值0、已学习1)
     */
    public void setIsParticipateInLearn(String isParticipateInLearn) {
        this.isParticipateInLearn = isParticipateInLearn;
    }

    /**
     * 获取想报名学习程度量化(12345、默认值为1)
     *
     * @return wanted_to_learn_level - 想报名学习程度量化(12345、默认值为1)
     */
    public String getWantedToLearnLevel() {
        return wantedToLearnLevel;
    }

    /**
     * 设置想报名学习程度量化(12345、默认值为1)
     *
     * @param wantedToLearnLevel 想报名学习程度量化(12345、默认值为1)
     */
    public void setWantedToLearnLevel(String wantedToLearnLevel) {
        this.wantedToLearnLevel = wantedToLearnLevel;
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
        sb.append(", sId=").append(sId);
        sb.append(", cId=").append(cId);
        sb.append(", courseGrade=").append(courseGrade);
        sb.append(", courseComments=").append(courseComments);
        sb.append(", isAnonymous=").append(isAnonymous);
        sb.append(", studentScores=").append(studentScores);
        sb.append(", isParticipateInLearn=").append(isParticipateInLearn);
        sb.append(", wantedToLearnLevel=").append(wantedToLearnLevel);
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