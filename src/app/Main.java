package app;

import java.util.Scanner;

public class Main {
    static String TaxValue;

    public static void main(String[] args) {
        double dohid;
        double taxValue;
        String Output;

        //Ввід суми доходу
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть значення доходу ");
        dohid = sc.nextDouble();
        sc.close();

        //Ініціалізація суми податку
        taxValue = 0.00;

        if (dohid < 0)
            //Якщо дохід <0
            Output = "Від\'ємний дохід (збитки) не оподатковуються";
        else {
            //Якщо дохід >=0
            if (dohid >= 0 && dohid <= 10000.00)
                taxValue = dohid * 2.5 / 100;
            else if (dohid > 10000.00 && dohid <= 25000.00)
                taxValue = dohid * 4.3 / 100;
            else taxValue = dohid * 6.7 / 100;
            Output = "Сума податку %.2f";
        }

        //Вивід повідомлення про суму податку
        System.out.printf(Output, taxValue);
    }
}