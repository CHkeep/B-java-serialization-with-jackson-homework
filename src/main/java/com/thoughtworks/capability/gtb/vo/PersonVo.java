package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonVo {

  private String id;
  private Integer age;
  private String name;
  @JsonIgnore
  private String hobby;

  @JsonGetter("age")
  public int getTheAge() {
    return age == null ? 0 : age;
  }
}
