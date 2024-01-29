package com.enigma.javafile.service;

import com.enigma.javafile.Mahasiswa;
import com.enigma.javafile.util.Utility;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaServiceImpl implements MahasiswaService {
    @Override
    public void create(Mahasiswa mahasiswa) {
        List<Mahasiswa> mahasiswaList = getAll();

        mahasiswaList.add(mahasiswa);
        Utility.saveObject(mahasiswaList);
    }

    @Override
    public List<Mahasiswa> getAll() {
        Object object = Utility.readObject();
        if (object == null || !(object instanceof List)) {
            return new ArrayList<>();
        }
        return (List<Mahasiswa>) object;
    }
}
