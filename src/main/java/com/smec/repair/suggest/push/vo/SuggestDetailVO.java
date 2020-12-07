package com.smec.repair.suggest.push.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author LiHao
 */
@Data
public class SuggestDetailVO {
    private Integer id;
    private String bismt;
    private String eleType;
    private String mntContractNo;
    private String customerName;
    private String projectName;
    private String requestName;
    private String weight;
    private String speed;
    private String floor;
    private String inout;
    private String equipRegisterNo;
    private String contractCategoryMeaning;
    private String station;
    private String unit;
    private String projectAddress;
    private Date beginDate;
    private Date endDate;
}
