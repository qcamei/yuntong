package com.yuntong.hibernate.database.po;

import java.util.HashSet;
import java.util.Set;


/**
 * TGoodsInfo generated by MyEclipse - Hibernate Tools
 */

public class TGoodsInfo  implements java.io.Serializable {


    // Fields    

     private Integer goodsId;
     private TPaymentOfGoodsStyle TPaymentOfGoodsStyle;
     private String goodsName;
     private Float goodsHeft;
     private Float goodsBulk;
     private Long goodsNumber;
     private String goodsNumberUnit;
     private Float goodsValue;
     private Float goodsFreight;
     private Float goodsInsuranceValue;
     private String goodsRemarkInfo;
     private Set TRegisterInfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public TGoodsInfo() {
    }

	/** minimal constructor */
    public TGoodsInfo(Integer goodsId) {
        this.goodsId = goodsId;
    }
    
    /** full constructor */
    public TGoodsInfo(Integer goodsId, TPaymentOfGoodsStyle TPaymentOfGoodsStyle, String goodsName, Float goodsHeft, Float goodsBulk, Long goodsNumber, String goodsNumberUnit, Float goodsValue, Float goodsFreight, Float goodsInsuranceValue, String goodsRemarkInfo, Set TRegisterInfos) {
        this.goodsId = goodsId;
        this.TPaymentOfGoodsStyle = TPaymentOfGoodsStyle;
        this.goodsName = goodsName;
        this.goodsHeft = goodsHeft;
        this.goodsBulk = goodsBulk;
        this.goodsNumber = goodsNumber;
        this.goodsNumberUnit = goodsNumberUnit;
        this.goodsValue = goodsValue;
        this.goodsFreight = goodsFreight;
        this.goodsInsuranceValue = goodsInsuranceValue;
        this.goodsRemarkInfo = goodsRemarkInfo;
        this.TRegisterInfos = TRegisterInfos;
    }

   
    // Property accessors

    public Integer getGoodsId() {
        return this.goodsId;
    }
    
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public TPaymentOfGoodsStyle getTPaymentOfGoodsStyle() {
        return this.TPaymentOfGoodsStyle;
    }
    
    public void setTPaymentOfGoodsStyle(TPaymentOfGoodsStyle TPaymentOfGoodsStyle) {
        this.TPaymentOfGoodsStyle = TPaymentOfGoodsStyle;
    }

    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Float getGoodsHeft() {
        return this.goodsHeft;
    }
    
    public void setGoodsHeft(Float goodsHeft) {
        this.goodsHeft = goodsHeft;
    }

    public Float getGoodsBulk() {
        return this.goodsBulk;
    }
    
    public void setGoodsBulk(Float goodsBulk) {
        this.goodsBulk = goodsBulk;
    }

    public Long getGoodsNumber() {
        return this.goodsNumber;
    }
    
    public void setGoodsNumber(Long goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsNumberUnit() {
        return this.goodsNumberUnit;
    }
    
    public void setGoodsNumberUnit(String goodsNumberUnit) {
        this.goodsNumberUnit = goodsNumberUnit;
    }

    public Float getGoodsValue() {
        return this.goodsValue;
    }
    
    public void setGoodsValue(Float goodsValue) {
        this.goodsValue = goodsValue;
    }

    public Float getGoodsFreight() {
        return this.goodsFreight;
    }
    
    public void setGoodsFreight(Float goodsFreight) {
        this.goodsFreight = goodsFreight;
    }

    public Float getGoodsInsuranceValue() {
        return this.goodsInsuranceValue;
    }
    
    public void setGoodsInsuranceValue(Float goodsInsuranceValue) {
        this.goodsInsuranceValue = goodsInsuranceValue;
    }

    public String getGoodsRemarkInfo() {
        return this.goodsRemarkInfo;
    }
    
    public void setGoodsRemarkInfo(String goodsRemarkInfo) {
        this.goodsRemarkInfo = goodsRemarkInfo;
    }

    public Set getTRegisterInfos() {
        return this.TRegisterInfos;
    }
    
    public void setTRegisterInfos(Set TRegisterInfos) {
        this.TRegisterInfos = TRegisterInfos;
    }
   








}