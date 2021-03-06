package com.yuntong.hibernate.database.po;

import java.util.HashSet;
import java.util.Set;


/**
 * TPartnetState generated by MyEclipse - Hibernate Tools
 */

public class TPartnetState  implements java.io.Serializable {


    // Fields    

     private Integer partnetStateId;
     private String partnetStateName;
     private String partnetStateRemarkInfo;
     private Set TPartners = new HashSet(0);


    // Constructors

    /** default constructor */
    public TPartnetState() {
    }

	/** minimal constructor */
    public TPartnetState(Integer partnetStateId) {
        this.partnetStateId = partnetStateId;
    }
    
    /** full constructor */
    public TPartnetState(Integer partnetStateId, String partnetStateName, String partnetStateRemarkInfo, Set TPartners) {
        this.partnetStateId = partnetStateId;
        this.partnetStateName = partnetStateName;
        this.partnetStateRemarkInfo = partnetStateRemarkInfo;
        this.TPartners = TPartners;
    }

   
    // Property accessors

    public Integer getPartnetStateId() {
        return this.partnetStateId;
    }
    
    public void setPartnetStateId(Integer partnetStateId) {
        this.partnetStateId = partnetStateId;
    }

    public String getPartnetStateName() {
        return this.partnetStateName;
    }
    
    public void setPartnetStateName(String partnetStateName) {
        this.partnetStateName = partnetStateName;
    }

    public String getPartnetStateRemarkInfo() {
        return this.partnetStateRemarkInfo;
    }
    
    public void setPartnetStateRemarkInfo(String partnetStateRemarkInfo) {
        this.partnetStateRemarkInfo = partnetStateRemarkInfo;
    }

    public Set getTPartners() {
        return this.TPartners;
    }
    
    public void setTPartners(Set TPartners) {
        this.TPartners = TPartners;
    }
   








}