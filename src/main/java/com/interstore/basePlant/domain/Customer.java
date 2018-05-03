package com.interstore.basePlant.domain;

import java.util.Date;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.id
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.name
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.create_date
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.modify_date
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    private Date modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.nickname
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.unionid
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    private String unionid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.id
     *
     * @return the value of customer.id
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.id
     *
     * @param id the value for customer.id
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.name
     *
     * @return the value of customer.name
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.name
     *
     * @param name the value for customer.name
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.create_date
     *
     * @return the value of customer.create_date
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.create_date
     *
     * @param createDate the value for customer.create_date
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.modify_date
     *
     * @return the value of customer.modify_date
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.modify_date
     *
     * @param modifyDate the value for customer.modify_date
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.nickname
     *
     * @return the value of customer.nickname
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.nickname
     *
     * @param nickname the value for customer.nickname
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.unionid
     *
     * @return the value of customer.unionid
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.unionid
     *
     * @param unionid the value for customer.unionid
     *
     * @mbg.generated Thu May 03 09:01:46 CST 2018
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}