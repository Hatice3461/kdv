package KDV;

import java.util.Scanner;

public class kdvHesap{

        public static void main(String[] args) {
            double tutar =0, kdv = 0;

            Scanner input = new Scanner(System.in);
            System.out.println(" ücret tutarını griniz");
            tutar = input.nextDouble();

            kdv =tutar;
            if (tutar<=1000 && tutar>0) {
                kdv += (tutar * 0.18);
                System.out.println("fiyat: " + tutar);
                System.out.println("KDV oranı: % 18");
                System.out.println("kdvli tutarı:" +kdv);

            }

            else {
                kdv += (tutar * 0.8);
                System.out.println("fiyat:" + tutar + " KDV %8: " + kdv);
                System.out.println("KDV: % 8");
                System.out.println("kdvli tutar:" +kdv);
            }
        }
    }


