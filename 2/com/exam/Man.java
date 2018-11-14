package com.exam;

public class Man {
  private FirstName name;
  private LastName lastname;
  private int age;
  private int weight;
  private int height;

  public Man(FirstName name, LastName lastname, int age, int height, int weight) {
    this.name = name;
    this.lastname = lastname;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String toString() {
    return "Man{"
        + "FirstName="
        + name
        + ", LastName="
        + lastname
        + ", Age="
        + age
        + ", Height="
        + height
        + ", Weight="
        + weight
        + "}";
  }
}
