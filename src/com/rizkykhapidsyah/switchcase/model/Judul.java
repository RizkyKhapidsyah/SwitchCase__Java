package com.rizkykhapidsyah.switchcase.model;

public class Judul {

    final String ENTER = "\n";
    String garisMinus = "-";
    int X;

    String namaJudul[] = {
            "BAGIAN 1: STRING",
            "BAGIAN 2",
            "BAGIAN 3",
    };

    protected void CetakGaris() {
        for (X = 0; X <= 50; X++) {
            System.out.print(garisMinus);
        }
        System.out.print(ENTER);
    }

    public void CetakJudul1() {
        CetakGaris();
        System.out.println(namaJudul[0]);
        CetakGaris();
    }

    public void CetakJudul2() {
        CetakGaris();
        System.out.println(namaJudul[1]);
        CetakGaris();
    }

    public void CetakJudul3() {
        CetakGaris();
        System.out.println(namaJudul[2]);
        CetakGaris();
    }
}
