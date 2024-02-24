package org.example;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class ProgramDataDiri {
    public static void main(String[] args) {

        String nama, kelamin, umur;

        Scanner ObjectInput = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = ObjectInput.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        kelamin = ObjectInput.nextLine();

        switch (kelamin){
            case "L","l":
                kelamin = "Laki-laki";
                break;
            case "P","p":
                kelamin = "Perempuan";
                break;
            default:
                kelamin ="Tidak Valid";
                break;

        }

        System.out.print("Tanggal lahir (yyyy-mm-dd): ");
        umur = ObjectInput.nextLine();
        ObjectInput.close();

        LocalDate tanggal = LocalDate.parse(umur);
        LocalDate hari = LocalDate.now();
        Period usia = Period.between(tanggal, hari);

        System.out.println("Nama : "+ nama);
        System.out.println("Jenis Kelamin : "+ kelamin);
        System.out.println("Umur Anda : " + usia.getYears() + " tahun " + usia.getMonths() + " bulan");

    }
}
