package com.company;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Asmuo implements Serializable {
    private String name;
    private String surname;

    public Asmuo() {
    }

    public Asmuo(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurnaname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Asmuo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
