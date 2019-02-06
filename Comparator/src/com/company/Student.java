package com.company;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private int id;
    private static int regId = 1;

    @Override
    public int compareTo(Student anotherStudent) {
        int i = this.getName().compareTo(anotherStudent.getName());
        if (i != 0) {
            return i;
        }
        int k = this.getSurname().compareTo(anotherStudent.getSurname());
        if (k != 0) {
            return k;
        }

        return this.getId() - anotherStudent.getId();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = regId;
        regId++;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }

//    public  static void divideInGroup(int gruopQauntity) {
//        int[] groupsize=new int [gruopQauntity];
//        int tempQauntitySize = (regId-1)/gruopQauntity;
//        int tempRemainSize =(regId-1)%gruopQauntity;
//        System.out.println(tempQauntitySize);
//        System.out.println(tempRemainSize);
//        System.out.println(groupsize.length);
//
//            for (int i=0; i<gruopQauntity;i++){
//                if(tempRemainSize>0){
//                groupsize[i]=tempQauntitySize+1;
//                    System.out.println(groupsize[i]);
//                    tempRemainSize--;
//            }else {
//                    groupsize[i]=tempQauntitySize;
//                    System.out.println(groupsize[i]);
//                }
//        }
//
//            for(int j=0; j<gruopQauntity;j++){
//
//
//            }

    }

