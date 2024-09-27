// 12S24024 - Yesika Nadia Saragih
// 12S24027 - Grasia Gayatri Simanullang

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBuku, kualitas, bestPick, mustRead, recommend, average, low;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatBuku = input.nextLine();
        hargaPembelian = Double.parseDouble(input.nextLine());
        minimumMargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        kualitas = "";
        if (rating >= 4.7 && rating < 5.0) {
            kualitas = "BestPick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                kualitas = "MustRead";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    kualitas = "Recommend";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        kualitas = "Average";
                    } else {
                        if (rating < 3.0 && rating > 0.0) {
                            kualitas = "Low";
                        } else {
                            kualitas = "Error";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kualitas);
    }
}
