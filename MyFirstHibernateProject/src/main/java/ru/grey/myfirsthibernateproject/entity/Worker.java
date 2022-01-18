
package ru.grey.myfirsthibernateproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Worker")
public class Worker {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column
    private String firm;
    @Column
    private int hours;
    
    public Worker(int id, String name, String firm, int hours){
    this.id = id;
    this.name = name;
    this.firm = firm;
    this.hours = hours;
    }
    
    public Worker(){}
    
    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getFirm() {
        return firm;
    }
    public int getHours() {
        return hours;
    }
    
    public void setId(){
    this.id = id;
    }
    public void setName() {
        this.name = name;
    }
    public void setFirm() {
        this.firm = firm;
    }
    public void setHours() {
        this.hours = hours;
    }
    
}