package com.lin.shulan.entity;

import javax.persistence.*;

/**
 *
 * @author lin
 * @version 1.0.0
 * 当地游跟团页
 *
 */

@Entity
@Table(name = "dangdiGentuan")
public class DangdiGentuan {

    @Id
    @GeneratedValue
    @Column(name = "postid")
    private Integer postid;

    @Column(name = "gtitle")
    private String gtitle;

    @Column(name = "gprice")
    private Double gprice;

    @Column(name = "gdate")
    private String gdate;

    @Column(name = "gdeparture")
    private String gdeparture;

    @Column(name = "gvehicle")
    private String gvehicle;

    @Column(name = "gimgsrc")
    private String gimgsrc;

    @Column(name = "gdiscount")
    private String gdiscount;

    public DangdiGentuan() {
    }

    public DangdiGentuan(String gtitle, Double gprice, String gdate, String gdeparture, String gvehicle, String gimgsrc, String gdiscount) {
        this.gtitle = gtitle;
        this.gprice = gprice;
        this.gdate = gdate;
        this.gdeparture = gdeparture;
        this.gvehicle = gvehicle;
        this.gimgsrc = gimgsrc;
        this.gdiscount = gdiscount;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getGtitle() {
        return gtitle;
    }

    public void setGtitle(String gtitle) {
        this.gtitle = gtitle;
    }

    public Double getGprice() {
        return gprice;
    }

    public void setGprice(Double gprice) {
        this.gprice = gprice;
    }

    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate;
    }

    public String getGdeparture() {
        return gdeparture;
    }

    public void setGdeparture(String gdeparture) {
        this.gdeparture = gdeparture;
    }

    public String getGvehicle() {
        return gvehicle;
    }

    public void setGvehicle(String gvehicle) {
        this.gvehicle = gvehicle;
    }

    public String getGimgsrc() {
        return gimgsrc;
    }

    public void setGimgsrc(String gimgsrc) {
        this.gimgsrc = gimgsrc;
    }

    public String getGdiscount() {
        return gdiscount;
    }

    public void setGdiscount(String gdiscount) {
        this.gdiscount = gdiscount;
    }
}



