package com.itheima.po;

import javax.persistence.*;

/**
 * CREATE TABLE `cst_customer` (
 `cust_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '客户编号(主键)',
 `cust_name` varchar(32) NOT NULL COMMENT '客户名称(公司名称)',
 `cust_source` varchar(32) DEFAULT NULL COMMENT '客户信息来源',
 `cust_industry` varchar(32) DEFAULT NULL COMMENT '客户所属行业',
 `cust_level` varchar(32) DEFAULT NULL COMMENT '客户级别',
 `cust_address` varchar(128) DEFAULT NULL COMMENT '客户联系地址',
 `cust_phone` varchar(64) DEFAULT NULL COMMENT '客户联系电话',
 PRIMARY KEY (`cust_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
 */
@Entity //指定这是个持久化类
@Table(name="cst_customer")//Table 可以不写，表名和类名一致的时候。
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//GeneratedValue 选择主键的生成策略 ，IDENTITY mysql的自增
    @Column(name="cust_id")
    private Long custId;
    @Column(name="cust_name")
    private String custName;
    @Column(name="cust_source")
    private String custSource;
    @Column(name="cust_industry")
    private String custIndustry;
    @Column(name="cust_level")
    private String custLevel;
    @Column(name="cust_address")
    private String custAddress;
    @Column(name="cust_phone")
    private String custPhone;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}
