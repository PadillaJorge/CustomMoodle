/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

/**
 *
 * @author padilla
 */
public class Student {
 private String name;    
 private String LastName;
 private String Id; 

  public Student(){
  }
  
    public Student(String name, String LastName) {
        this.name = name;
        this.LastName = LastName;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getId() {
        return Id;
    }
 
    @Override
    public String toString(){
        return String.format("id=%s,\nname=%s,\nlastname=%s",Id,name,LastName);
    }
 
}
