package com.ericsson.java8.com.danqing;

public interface DefaultInterface {
  int size();
  default boolean isEmpty(){
      System.out.println("isEmpty default method was called ");
      return  size()==0;
  }
}
