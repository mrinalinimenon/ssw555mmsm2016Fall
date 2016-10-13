package Model;

import java.util.*;

//class for individual
public class Individual {

  // the info list for individual
  private String id;
  private String name;
  private String givenName;
  private String surName;
  private char sex;
  private String birthDate;
  private String deathDate;

  public void setId (String id) {
      this.id = id;
  }

  public String getId () {
      return this.id;
  }

  public void setName (String name) {
      this.name = name;
  }

  public String getName () {
      return this.name;
  }

  public void setSurName (String name) {
      this.surName = name;
  }

  public String getSurName () {
      return this.surName;
  }

  public void setGivenName (String name) {
      this.givenName = name;
  }

  public String getGivenName () {
      return this.givenName;
  }

  public void setSex (char sex) {
      this.sex = sex;
  }

  public char getSex() {
      return this.sex;
  }

  public void setBirthDate(String birthDate) {
      this.birthDate = birthDate;
  }

  public String getBirthDate() {
      return this.birthDate;
  }

  public void setDeathDate(String deathDate) {
      this.deathDate = deathDate;
  }

  public String getDeathDate() {
      return this.deathDate;
  }
}
