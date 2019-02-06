package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> javaStudentGruop = new ArrayList<>();
        javaStudentGruop.add(new Student("vytas", "Vardis"));
        javaStudentGruop.add(new Student("vytas", "Rudis"));
        javaStudentGruop.add(new Student("rytas", "dis"));
        javaStudentGruop.add(new Student("tas", "adis"));
        javaStudentGruop.add(new Student("yts", "madis"));
        javaStudentGruop.add(new Student("cytas", "eadis"));
        javaStudentGruop.add(new Student("jytas", "ladis"));
        javaStudentGruop.add(new Student("ktas", "sadis"));
        javaStudentGruop.add(new Student("watas", "xadis"));
        javaStudentGruop.add(new Student("thtas", "seradis"));
        javaStudentGruop.add(new Student("fdrgas", "etyadis"));
        javaStudentGruop.add(new Student("trjyktas", "mhgjsrkadis"));
        javaStudentGruop.add(new Student("dsrgtas", "mgfdxxadis"));
        javaStudentGruop.add(new Student("afrjhtyrkas", "mfgfxfngadis"));
        javaStudentGruop.add(new Student("dsdgrtjas", "gbnmgadis"));
        javaStudentGruop.add(new Student("ytswfrehgs", "saghtjis"));
        javaStudentGruop.add(new Student("ysaFFgjas", "hdjdk,adis"));
        javaStudentGruop.add(new Student("sdgrjas", "asfgtjkliis"));
        javaStudentGruop.add(new Student("yfdhtykjas", "fgnmghkdis"));
        javaStudentGruop.add(new Student("sdgbgkas", "jkghkdis"));
        javaStudentGruop.add(new Student("fdshggjtas", "hkjuladis"));
        javaStudentGruop.add(new Student("gjtas", "hladis"));
        for (Student x : javaStudentGruop)
            System.out.println(x);
        System.out.println("============================");
        Collections.sort(javaStudentGruop);
        for (Student x : javaStudentGruop)
            System.out.println(x);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        GroupMaker.generateList(javaStudentGruop,4);
        for (Student x :g )
            System.out.println(x);



    }
    public  static class GroupMaker {
         public static HashMap<Integer, List<Student>> groupList = new HashMap<>();
         public static  HashMap<Integer, List<Student>> generateList(List<Student> studentHashMap, int groupSize) {
            int counter = 0;
            List<Student> studentsForGroup = new ArrayList<>();
            //find how many student to a group
            int quantity = (int) Math.floor(studentHashMap.size() / groupSize);
            int lastStudents = studentHashMap.size() % groupSize;
            Array[][] groupArrays = new Array[groupSize][];
            for (int i = 0; i < groupSize; i++) {
                groupArrays[i] = new Array[quantity];
            }
            for (int i = 0; i < lastStudents; i++) {
                groupArrays[i] = new Array[quantity + 1];
            }
            for (Student student : studentHashMap) {
                studentsForGroup.add(student);
                if (studentsForGroup.size() >= groupArrays[counter].length) {
                    groupList.put(counter, studentsForGroup);
                    counter++;
                    studentsForGroup = new ArrayList<>();
                }
            }


            //start adding people
            return groupList;
        }


    }
}


