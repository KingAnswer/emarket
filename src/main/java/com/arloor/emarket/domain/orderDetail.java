package com.arloor.emarket.domain;

public class orderDetail extends orderDetailKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderDetail.oid
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    private Integer oid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderDetail.num
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderDetail.price
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderDetail.yundanStatus
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    private String yundanStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderDetail.oid
     *
     * @return the value of orderDetail.oid
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderDetail.oid
     *
     * @param oid the value for orderDetail.oid
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderDetail.num
     *
     * @return the value of orderDetail.num
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderDetail.num
     *
     * @param num the value for orderDetail.num
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderDetail.price
     *
     * @return the value of orderDetail.price
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderDetail.price
     *
     * @param price the value for orderDetail.price
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderDetail.yundanStatus
     *
     * @return the value of orderDetail.yundanStatus
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    public String getYundanStatus() {
        return yundanStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderDetail.yundanStatus
     *
     * @param yundanStatus the value for orderDetail.yundanStatus
     *
     * @mbggenerated Mon Jun 11 11:02:26 CST 2018
     */
    public void setYundanStatus(String yundanStatus) {
        this.yundanStatus = yundanStatus;
    }
}