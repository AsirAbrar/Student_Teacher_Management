/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.package1;

public class Semester {
    private String name;
    private int code;
    
    public Semester(String name, int code){
    this.name=name;
    this.code=code;
    }
    public Semester(){
    }
public String getName(){
return name;
}
public int getCode(){
return code;
}
}
