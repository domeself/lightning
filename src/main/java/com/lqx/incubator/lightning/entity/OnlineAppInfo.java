package com.lqx.incubator.lightning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 电商app信息维护
 * @Author ultima
 * @Date 2021/1/20 20:43
 **/
@Entity
@Table(name="online_app_info")
public class OnlineAppInfo {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;
  private String appLabel;
  private String pkgName;
  private String downPath;
  private String rules;
  private String time;
  private String goodsName;

  public void setAppLabel(String appLabel) {
    this.appLabel = appLabel;
  }

  public void setPkgName(String pkgName) {
    this.pkgName = pkgName;
  }

  public void setDownPath(String downPath) {
    this.downPath = downPath;
  }

  public void setRules(String rules) {
    this.rules = rules;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }

  public String getAppLabel() {
    return appLabel;
  }

  public String getPkgName() {
    return pkgName;
  }

  public String getDownPath() {
    return downPath;
  }

  public String getRules() {
    return rules;
  }

  public String getTime() {
    return time;
  }

  public String getGoodsName() {
    return goodsName;
  }
}
