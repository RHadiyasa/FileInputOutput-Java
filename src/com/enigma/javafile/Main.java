package com.enigma.javafile;

import com.enigma.javafile.service.MahasiswaService;
import com.enigma.javafile.service.MahasiswaServiceImpl;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    //    public static void main(String[] args) {
//        // File file = new File("D:/Enigma/Java Fundamental/Belajar File Java/belajar.txt");
////
////        try (FileReader fr = new FileReader(file)) {
////
//////            while (true) {
//////                int textFile = fr.read();
//////
//////                if (textFile == -1) {
//////                    break;
//////                }
//////                System.out.print((char) textFile);
//////            }
////
//////            // Bisa pake scanner juga
//////            Scanner sc = new Scanner(file);
//////            String s = sc.nextLine();
//////            System.out.println(s);
////
////            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
////                String text = br.readLine();
////                System.out.println(text);
////            }
////
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
////        try {
////            if(!Files.exists(path)){
////                Files.createFile(path);
////            }
////            Files.write(path,"Rafi Hadiyasa\n".getBytes(), StandardOpenOption.APPEND);
////            Files.write(path,"Rafi Hadiyasa\n".getBytes(), StandardOpenOption.APPEND);
////            List<String> list = Files.readAllLines(path);
////            System.out.println(list);
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        Path path = Path.of("mahasiswa");
//
//        try (OutputStream stream = Files.newOutputStream(path)) {
//            try (ObjectOutputStream oos = new ObjectOutputStream(stream)) {
//                Mahasiswa mahasiswa = new Mahasiswa("Rafi", 24, "Management");
//                oos.writeObject(mahasiswa);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (InputStream stream = Files.newInputStream(path)) {
//            try (ObjectInputStream ois = new ObjectInputStream(stream)) {
//                Mahasiswa rafi = (Mahasiswa) ois.readObject();
//                System.out.println(rafi);
//            } catch (ClassNotFoundException | IOException e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
// Implementasi program utama di sini

        // Contoh penggunaan layanan Mahasiswa
        MahasiswaService mahasiswaService = new MahasiswaServiceImpl();

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Rafi", 22, "Computer Science");
        Mahasiswa mahasiswa2 = new Mahasiswa("Thifaaa", 21, "Management");

        // Menambahkan Mahasiswa ke daftar
        mahasiswaService.create(mahasiswa1);
        mahasiswaService.create(mahasiswa2);

        // Mendapatkan semua Mahasiswa
        List<Mahasiswa> daftarMahasiswa = mahasiswaService.getAll();

        // Menampilkan semua Mahasiswa
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa);
        }
    }

    private static void fileReader(File file) {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Halo Rafi");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileInputString(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {

            while (true) {
                int ascii = fis.read();
                if (ascii == -1) {
                    break;
                }
                System.out.print((char) ascii);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileInputOutputStream(File file) {
        String nama = "AkuBete";
//        FileOutputStream fos = null;
//
//        try{
//            fos = new FileOutputStream(file);
//            fos.write(nama.getBytes(StandardCharsets.UTF_8));
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Try with resource
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(nama.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}

