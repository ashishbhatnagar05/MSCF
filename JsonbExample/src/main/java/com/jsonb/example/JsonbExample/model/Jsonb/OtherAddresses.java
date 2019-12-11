package com.jsonb.example.JsonbExample.model.Jsonb;

import java.io.Serializable;
import java.util.List;

public class OtherAddresses implements Serializable {

  private List<Address> address;

  public List<Address> getAddress() {
    return address;
  }

  public void setAddress(List<Address> address) {
    this.address = address;
  }
}
