package com.enigma.javafile.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Utility {

    private static final Path mahasiswaPath = Path.of("Mahasiswa Binus");

    // Menyimpan objek
    public static void saveObject(Object object) {
        try (OutputStream os = Files.newOutputStream(mahasiswaPath);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(object);
            System.out.println("Objek berhasil disimpan????");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readObject() {
        Object result = null;
        try (InputStream is = Files.newInputStream(mahasiswaPath);
             ObjectInputStream ois = new ObjectInputStream(is)) {
            result = ois.readObject();
            System.out.println("Objek berhasil dibaca.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

}
