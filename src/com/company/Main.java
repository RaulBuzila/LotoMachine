package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * Created by raulbuzila on 11/20/2015.
 */

public class Main {
    private static final int MAXVALUE = 49;
    private static final int MAXEXTRASE = 6;

    public static void main(String[] args) {

            //functie random pentru generare numere
            Random extragere = new Random();

            //declarare array de 49 de numere pentru numerelele mele
            int[] NumereleMele = new int[MAXEXTRASE];

            //declarare array pentru numerele generate de calculator
            int [] NumereCalculator= new int[MAXEXTRASE];


            //afisare data
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();



            //generarea seriei mele de numere
        for (int i=0; i<MAXEXTRASE; i++){
            NumereleMele[i] = extragere.nextInt(MAXVALUE) + 1;


            //eliminarea duplicatelor
            for (int j=0; j<NumereleMele.length; j++){
                if (NumereleMele[j]== NumereleMele[i]){
                    NumereleMele[i]=NumereleMele[j];
                }
            }


        }

        //afisarea numerelor extrase pentru mine
        System.out.println("Acestea sunt numerele mele: ");
        for (int i=0; i<MAXEXTRASE; i++){

            System.out.print(NumereleMele[i]+ " |");

        }


        //generarea seriei de numere extrase de calculator
        for (int i=0; i<MAXEXTRASE; i++){
            NumereCalculator[i]= extragere.nextInt(MAXVALUE)+1;

            //eliminarea duplicatelor
            for (int j=0; j<NumereCalculator.length; j++){
                if (NumereCalculator[j]== NumereCalculator[i]){
                    NumereCalculator[i]=NumereCalculator[j];
                }
            }

        }

        //sa mai fie putin aerisite si compilatorul
        System.out.println();
        System.out.println();

        //afisarea numerelor generate de calculator
        System.out.println("Numerele extrase azi," +dateFormat.format(date) + " sunt: " );
        for (int i=0; i<MAXEXTRASE; i++){

            System.out.print(NumereCalculator[i]+ " |");

        }

        //comparare numerelor din cele 2 array-uri
        int NumereGhicite=0;
        for (int i=0; i<NumereleMele.length; i++){
            for (int j=0;j<NumereCalculator.length; j++){

                NumereGhicite++;

            }

        }


        //sa mai fie putin aerisite si compilatorul
        System.out.println();
        System.out.println();


        switch (NumereGhicite){
            case 4:
                System.out.println("Felicitari! Ati castigat la categoria 4");
                break;
            case 5:
                System.out.println("Felicitari! Ati castigat la categoria 5");
                break;
            case 6:
                System.out.println("Bravooo! Ati castigat potul cel mare! Acum nu va mai trebui sa lucrezi toata viata :)) ");
                break;
            default:
                System.out.println("Ne pare rau, dar nu ai avut suficient noroc de data asta. Te mai asteptam!");
        }

        //afisare numere castigatoare
      /*  System.out.println("Numerele castigatoare sunt: ");
        for (int i=0; i<MAXEXTRASE;i++){
            if (NumereCastigatoare[i] !=0){
                System.out.print(NumereCastigatoare + " |" );
            }


        }

        */







    }
}






