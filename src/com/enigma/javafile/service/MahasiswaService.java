package com.enigma.javafile.service;

import com.enigma.javafile.Mahasiswa;

import java.util.List;

public interface MahasiswaService {
    void create(Mahasiswa mahasiswa);
    List<Mahasiswa> getAll();
}
