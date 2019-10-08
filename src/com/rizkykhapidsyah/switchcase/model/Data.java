package com.rizkykhapidsyah.switchcase.model;

public class Data {
    int i;

    String Pertanyaan1[] = {
            "Panggil Nama : ",
            "Masukkan Angka : ",
    };

    String NamaSiswa[] = {
            "Dede",
            "Rukmini",
            "Maisyarah"
    };

    public void CetakPertanyaan1() {
        do {
            switch (i) {
                case 0:
                    System.out.print(Pertanyaan1[0]);
                    break;
                case 1:
                    System.out.print(Pertanyaan1[1]);
                    break;
            }
            break;
        } while (i <= 1);
    }
}
