package com.enigma.javafile;

import java.io.Serializable;

public class Mahasiswa implements Serializable {

    public static final long serialVersionUID = 1L;
    private String name;
    private Integer age;
    private String major;

    public Mahasiswa(String name, Integer age, String major) {

        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + name + '\'' +
                ", usia=" + age +
                ", jurusan='" + major + '\'' +
                '}';
    }
}
