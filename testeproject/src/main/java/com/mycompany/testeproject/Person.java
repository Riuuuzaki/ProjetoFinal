/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;

/**
 *
 * @author felicianoe
 */
public class Person {

    private String name;
    private Integer idade;

    public Person(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
