package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mahasiswa();
    }

    private static void mahasiswa() {
        HashMap<String, String> data = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String cari;

        data.put("201810370311152", "Nama : Augie Winanda F\nAlamat : Mojokerto\nUsia : 19 Tahun");
        data.put("201810370311151", "Nama : Tomy Lasandy\nAlamat : Jambi\nUsia : 20 Tahun");
        data.put("201810370311153", "Nama : Dimas Man Taufik\nAlamat : Probolinggo\nUsia : 21 Tahun");

        System.out.print("Masukkan NIM : ");
        cari = sc.next();

        if (data.keySet().contains(cari)) {
            System.out.println(data.get(cari));
        } else {
            System.out.println("Data Kosong!!!");
        }

        System.out.print("\nCari lagi ? (y/n) : ");
        char pilih = sc.next().charAt(0);
        if (pilih == 'y' || pilih == 'Y') {
            mahasiswa();
        } else {
            return;
        }
    }
}
