package com.exam;

import com.exam.FirstName;
import com.exam.LastName;
import java.util.Random;

public class Main {

  public static final int START_AGE = 18;
  public static final int START_WEIGHT = 50;
  public static final int START_HEIGHT = 160;

  public static void main(String[] args) {
    Man[] students = new Man[100];
    Random random = new Random();
    int realAge;
    int realWeight;
    int realHeight;
    FirstName realFirstName;
    LastName realLastName;

    for (int i = 0; i < students.length; i++) {
      realAge = START_AGE + random.nextInt(30);
      realWeight = START_WEIGHT + random.nextInt(30);
      realHeight = START_HEIGHT + random.nextInt(30);
      realFirstName = randomFirstName();
      realLastName = randomLastName();
      students[i] = new Man(realFirstName, realLastName, realAge, realHeight, realWeight);
      System.out.println("Student[" + i + "]=" + students[i]);
    }
  }

  public static FirstName randomFirstName() {
    int index = new Random().nextInt(FirstName.values().length);
    return FirstName.values()[index];
  }

  public static LastName randomLastName() {
    int index1 = new Random().nextInt(LastName.values().length);
    return LastName.values()[index1];
  }
}
