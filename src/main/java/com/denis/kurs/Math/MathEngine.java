package com.denis.kurs.Math;

import java.util.regex.Pattern;

/**
 *
 * Created by Denis on 25.10.2015.
 */
public class MathEngine {

    private double result;
    private int[] C;
    private int[][] A = new int[2][2];
    private double alfa_1;
    private double alfa_2;
    private int[] b1;
    private int[] b2;

    public void parseData (String args){
        String[] parsed = args.split("#");
        for (String current : parsed){
            if (  current.substring(0, current.indexOf('=')).equals("C") ){
                current = current.substring(current.indexOf('(') + 1, current.indexOf(')'));
                String[] mass = current.split(" ");
                this.C = new int[mass.length];
                for (int i = 0; i < mass.length; ++i){
                    this.C[i] = Integer.valueOf(mass[i]);
                }
            } else if (current.substring(0, current.indexOf('=')).equals("A")){
                current = current.substring(current.indexOf('(') + 1, current.indexOf(')'));
                String[] mass = current.split(Pattern.quote("|"));
                String[][] greed = new String[2][];
                greed[0] = mass[0].split(" ");
                greed[1] = mass[1].split(" ");
                for (int i = 0; i < 2; ++i){
                    for (int j = 0; j < 2; ++j){
                        this.A[i][j] = Integer.valueOf(greed[i][j]);
                    }
                }
            } else if (current.substring(0, current.indexOf('=')).equals("alfa")){
                current = current.substring(current.indexOf('(') + 1, current.indexOf(')'));
                String[] mass = current.split(" ");
                this.alfa_1 = Double.valueOf(mass[0]);
                this.alfa_2 = Double.valueOf(mass[1]);
            } else if (current.substring(0, current.indexOf('=')).equals("b1")){
                current = current.substring(current.indexOf('(') + 1, current.indexOf(')'));
                String[] mass = current.split(" ");
                this.b1 = new int[mass.length];
                for (int i = 0; i < mass.length; ++i){
                    this.b1[i] = Integer.valueOf(mass[i]);
                }
            } else if (current.substring(0, current.indexOf('=')).equals("b2")) {
                current = current.substring(current.indexOf('(') + 1, current.indexOf(')'));
                String[] mass = current.split(" ");
                this.b2 = new int[mass.length];
                for (int i = 0; i < mass.length; ++i) {
                    this.b2[i] = Integer.valueOf(mass[i]);
                }
            }
        }
    }

    public void resetData(){
        for (int i = 0; i < 2; ++i){
            this.C[i] = 0;
        }
        for (int i = 0; i < 2; ++i){
            for (int j = 0; j < 2; ++j){
                this.A[i][j] = 0;
            }
        }
        for (int i = 0; i < 2; ++i){
            this.b1[i] = 0;
        }
        for (int i = 0; i < 2; ++i){
            this.b2[i] = 0;
        }
        this.alfa_1 = 0;
        this.alfa_2 = 0;
        System.out.println("The data has been reset.");
    }

    public void showData(){
        System.out.print("A = ");
        for(int i = 0; i < 2; ++i){
            System.out.print("( " + this.A[i][0] + " " + this.A[i][1] + " ) ");
        }
        System.out.println();

        System.out.print("C = ");
        for(Integer dat: this.C){
            System.out.print(dat + " ");
        }
        System.out.println();

        System.out.println("alfa1 = " + this.alfa_1 + ", alfa2 = " + alfa_2);

        System.out.println("b1 = " + this.b1[0] + " " + this.b1[1]);
        System.out.println("b2 = " + this.b2[0] + " " + this.b2[1]);
    }

    public double fiIntegrate(double alf){
        double result = 0;
        result = (1 / Math.cbrt(Math.PI * 2));
        return result;
    }

}
