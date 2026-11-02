package tugasargo;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) throws Exception {
        Scanner inputx = new Scanner (System.in);
        int Balance = 2000000;
        ArrayList<Integer> transactions = new ArrayList<>();
        int nav;
        do { 
            /// maaf pak saya bedain biar enak dilihatnya maksud saya hehe
            System.out.println("Pilih Menu");
            System.out.println("1. Penarikan");
            System.out.println("2. Menyimpan");
            System.out.println("3. Lihat Saldo");
            System.out.println("4. Total Uang Masuk");
            System.out.println("5. Total Uang Keluar");
            System.out.println("0. Keluar");
            nav = inputx.nextInt();

            if ((nav == 1 || nav == 2) && transactions.size() == 5) {
                System.out.println("Data Transaksi sudah Penuh");
                continue;
            }
                if (nav == 0) break;
                if (nav == 1) {
                    System.out.println("Jumlah yang ditarik: ");
                    int amount = inputx.nextInt();

                    if (amount > Balance) {
                        System.out.println("Uang anda kurang, Tersisa: " + Balance);
                        continue;
                    }   transactions.add(-amount);
                        Balance -= amount;
                }else if (nav == 2) {
                    System.out.println("Jumlah yang disimpan");
                    int amount = inputx.nextInt();

                    if (amount <= 0) {
                        System.out.println("Jumlah tidak Valid");
                        continue;
                    }   transactions.add(amount);
                        Balance += amount;

                }else if (nav == 3) {
                        System.out.println("Saldo anda " + Balance);
                }else if (nav == 4) {
                    int total = 0;
                    for (int data : transactions) {
                        if (data > 0) {
                            total += data;
                        }
                    }
                    System.out.println("Total Uang Masuk: " + total);
                }else if (nav == 5) {
                    int total = 0;
                    for (int data : transactions) {
                        if (data < 0) {
                            total += data;
                        }
                    }
                    System.out.println("Total Uang Keluar: " + (total*-1));
                }

        } while (true);
            inputx.close();
    }
}
