package com.cook.simplerealmandroid.model;


import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

/**
 * Created by roma on 14.10.15.
 */
public class University extends RealmObject {

    public University() {
    }

    public University(String name) {
        this.name = name;
    }

    @Index
    private int id;
    private String name;
    private RealmList<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealmList<Student> getStudents() {
        return students;
    }

    public void setStudents(RealmList<Student> students) {
        this.students = students;
    }
}