package com.zekartTi.shild_chapter_two;

import java.io.IOException;

public class CycleFor {

    public static void cycleForWithManyArg(){
        int i,j;
        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i and j:" + i +" "+ j);
        }
    }

    public static void cycleForWithReadCmd() throws IOException {
        int i;
        System.out.println("To stop cycle enter char");
        for (i = 0;(char) System.in.read() !='S'; i++){
            System.out.println("Wait entering: " + i);
        }
    }

    public static void cycleForWithoutBody(){
        int i;
        int sum = 0;
        for (i = 1; i <=5;sum += i++);
        System.out.println("Sum i: " + sum);
    }

    public static void cycleForWCalculated(){
        int e;
        int result;

        for (int i = 0; i < 10;i++){
            result = 1;
            e = i;
            while (e>0){
                result *= 2;
                e --;
            }
            System.out.println("2 in " + i + " = " + result);
        }
    }

    public static void cycleForWithMarker(){
        endPoint:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==5){
                    System.out.println("Breake point");
                    break endPoint;
                }
            }
        }
    }

    public static void cycleForWithContinue(){
        for (int i = 0; i < 10; i++) {
            if (i!=5){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void cycleForWithDecrement(){
        int i = 1000;
        int j = 2;
        for (;i >= 0; i-=j) {
            System.out.println(i);
        }
    }

    public static void cycleForWithGeomethric(){
        for (int i = 1; i < 130; i+=i) {
            System.out.println(i);
        }
    }

}
