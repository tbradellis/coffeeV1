package com.example.model;
import java.util.*;



public class CoffeeExpert {

  public List getBrands(String color){
    List brands = new ArrayList();
    if(color.equals("amber")){
      brands.add("Trailhead");
      brands.add("Nossa Familla");
    } else {
      brands.add("Heart");
      brands.add("Grounds for Change");
    }
    return brands;
  }
}
