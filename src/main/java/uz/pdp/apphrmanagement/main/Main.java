package uz.pdp.apphrmanagement.main;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.next;
import static java.time.temporal.TemporalAdjusters.previous;

//Svetofor ranglarini ifodalovchi enum yarating. Svetoforni 3 minutgacha
// to’xtamaydigan qilib dastur yozing. Bunda svetofor qizil chirog’i
// yonganda 4 sekund “Stop”, sariq chiroq yonganda 3 sekund “Wait”, yashil chiroq yonganda
// 5 sekund “Go” degan xabar ekranda tursin. Eslatma: Thread classining sleep() methodini ishlatish mum

public class Main {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.print(" a = ");
        int a = enter.nextInt();
        System.out.print(" b = ");
        int b = enter.nextInt();
        System.out.print(" c = ");
        int c = enter.nextInt();
        System.out.print(" d = ");
        int d = enter.nextInt();
        System.out.print(" e = ");
        int e = enter.nextInt();

        int max = a;
        int min = e;

        if (max < b) { max = b; }
        if (max < c) { max = c; }
        if (max < d) { max = d; }
        if (max < e) { max = e; }
        if (min > a) { min = a; }
        if (min > b) { min = b; }
        if (min > c) { min = c; }
        if (min > d) { min = d; }

        System.out.println(" Kattasi : " + max);
        System.out.println(" Kichigi : " + min);
    }
}

