package com.jinman.entity;

public class Score {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.id
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.school
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    private String school;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.teacher
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    private String teacher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.hobby
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    private String hobby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.girlfriend
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    private String girlfriend;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.id
     *
     * @return the value of t_score.id
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.id
     *
     * @param id the value for t_score.id
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.school
     *
     * @return the value of t_score.school
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.school
     *
     * @param school the value for t_score.school
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.teacher
     *
     * @return the value of t_score.teacher
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.teacher
     *
     * @param teacher the value for t_score.teacher
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.hobby
     *
     * @return the value of t_score.hobby
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.hobby
     *
     * @param hobby the value for t_score.hobby
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.girlfriend
     *
     * @return the value of t_score.girlfriend
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public String getGirlfriend() {
        return girlfriend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.girlfriend
     *
     * @param girlfriend the value for t_score.girlfriend
     *
     * @mbg.generated Fri Jun 15 17:04:50 CST 2018
     */
    public void setGirlfriend(String girlfriend) {
        this.girlfriend = girlfriend == null ? null : girlfriend.trim();
    }
}