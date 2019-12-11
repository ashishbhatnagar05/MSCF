package com.jsonb.example.JsonbExample.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.jsonb.example.JsonbExample.model.Jsonb.HomeAddress;
import com.jsonb.example.JsonbExample.model.Jsonb.OtherAddresses;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Address")
@JsonAutoDetect
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Address {
  @Id
  @Column(name = "SUBR_MEMB_SKEY")
  private String subrMemberSkey;

  @Column(name = "lifeId")
  private String lifeId;

  @Column(name = "sourceSystemMemberId")
  private String sourceSystemMemberId;

  @Column(name = "otherAddresses", columnDefinition = "jsonb")
  @Type(type = "jsonb")
  private OtherAddresses otherAddresses;

  @Column(name = "homeAddress", columnDefinition = "jsonb")
  @Type(type = "jsonb")
  private HomeAddress homeAddress;

  public String getSubrMemberSkey() {
    return subrMemberSkey;
  }

  public void setSubrMemberSkey(String subrMemberSkey) {
    this.subrMemberSkey = subrMemberSkey;
  }

  public String getLifeId() {
    return lifeId;
  }

  public void setLifeId(String lifeId) {
    this.lifeId = lifeId;
  }

  public String getSourceSystemMemberId() {
    return sourceSystemMemberId;
  }

  public void setSourceSystemMemberId(String sourceSystemMemberId) {
    this.sourceSystemMemberId = sourceSystemMemberId;
  }

  public OtherAddresses getOtherAddresses() {
    return otherAddresses;
  }

  public void setOtherAddresses(OtherAddresses otherAddresses) {
    this.otherAddresses = otherAddresses;
  }

  public HomeAddress getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(HomeAddress homeAddress) {
    this.homeAddress = homeAddress;
  }
}
