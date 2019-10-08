package com.rizkykhapidsyah.switchcase;

import com.rizkykhapidsyah.switchcase.model.Data;
import com.rizkykhapidsyah.switchcase.model.Judul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inputAngka;
        String inputKalimat;
        Scanner inputUser = new Scanner(System.in);
        Judul JudulBagian = new Judul();
        Data Pertanyaan = new Data();

        JudulBagian.CetakJudul1();
        Pertanyaan.CetakPertanyaan1();

        inputKalimat = inputUser.next();

        switch (inputKalimat) {
            case "Dede":
                System.out.println("Nama Siswa: Dede. Hadir!");
                break;
            case "Risma":
                System.out.println("Nama Siswa: Risma. Hadir!");
                break;
            default:
                System.out.println("Tidak Hadir!");
                break;
        }
    }


}
