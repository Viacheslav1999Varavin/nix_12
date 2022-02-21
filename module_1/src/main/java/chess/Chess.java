package chess;

/*2.Ход коня по бесконечной шахматной доске. Вводится текущее положение
коня и клетка в которую пробуют его передвинуть за 1 ход. Программа должна
проверить, возможно ли это сделать.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {
    public void runChess() throws IOException {

        char[] charArraySymb = new char[]{' ',' ','A',' ','B',' ','C',' ','D',' ','E',' ','F',' ','G',' ','H'};
        char[] charArray8 = new char[]{'8',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#'};
        char[] charArray7 = new char[]{'7',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0'};
        char[] charArray6 = new char[]{'6',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#'};
        char[] charArray5 = new char[]{'5',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0'};
        char[] charArray4 = new char[]{'4',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#'};
        char[] charArray3 = new char[]{'3',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0'};
        char[] charArray2 = new char[]{'2',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#'};
        char[] charArray1 = new char[]{'1',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0',' ','#',' ','0'};

        System.out.println("Пожалуйста, введите текущее положение коня, например (1A): ");
            BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
            String str = line.readLine();
            char[] chars = str.toCharArray();
            if (chars[0] == '1') {
                switch (chars[1]) {
                    case 'A' -> charArray1[2] = 'K';
                    case 'B' -> charArray1[4] = 'K';
                    case 'C' -> charArray1[6] = 'K';
                    case 'D' -> charArray1[8] = 'K';
                    case 'E' -> charArray1[10] = 'K';
                    case 'F' -> charArray1[12] = 'K';
                    case 'G' -> charArray1[14] = 'K';
                    case 'H' -> charArray1[16] = 'K';
                }
            }
            if (chars[0] == '2') {
                switch (chars[1]) {
                    case 'A' -> charArray2[2] = 'K';
                    case 'B' -> charArray2[4] = 'K';
                    case 'C' -> charArray2[6] = 'K';
                    case 'D' -> charArray2[8] = 'K';
                    case 'E' -> charArray2[10] = 'K';
                    case 'F' -> charArray2[12] = 'K';
                    case 'G' -> charArray2[14] = 'K';
                    case 'H' -> charArray2[16] = 'K';
                }

            }
            if (chars[0] == '3') {
                switch (chars[1]){
                    case 'A': charArray3[2] = 'K'; break;
                    case 'B': charArray3[4] = 'K'; break;
                    case 'C': charArray3[6] = 'K'; break;
                    case 'D': charArray3[8] = 'K'; break;
                    case 'E': charArray3[10] = 'K'; break;
                    case 'F': charArray3[12] = 'K'; break;
                    case 'G': charArray3[14] = 'K'; break;
                    case 'H': charArray3[16] = 'K'; break;
                }
            }
            if (chars[0] == '4') {
                switch (chars[1]){
                    case 'A': charArray4[2] = 'K'; break;
                    case 'B': charArray4[4] = 'K'; break;
                    case 'C': charArray4[6] = 'K'; break;
                    case 'D': charArray4[8] = 'K'; break;
                    case 'E': charArray4[10] = 'K'; break;
                    case 'F': charArray4[12] = 'K'; break;
                    case 'G': charArray4[14] = 'K'; break;
                    case 'H': charArray4[16] = 'K'; break;
                }
            }
            if (chars[0] == '5') {
                switch (chars[1]){
                    case 'A': charArray5[2] = 'K'; break;
                    case 'B': charArray5[4] = 'K'; break;
                    case 'C': charArray5[6] = 'K'; break;
                    case 'D': charArray5[8] = 'K'; break;
                    case 'E': charArray5[10] = 'K'; break;
                    case 'F': charArray5[12] = 'K'; break;
                    case 'G': charArray5[14] = 'K'; break;
                    case 'H': charArray5[16] = 'K'; break;
                }
            }

            if (chars[0] == '6') {
                switch (chars[1]){
                    case 'A': charArray6[2] = 'K'; break;
                    case 'B': charArray6[4] = 'K'; break;
                    case 'C': charArray6[6] = 'K'; break;
                    case 'D': charArray6[8] = 'K'; break;
                    case 'E': charArray6[10] = 'K'; break;
                    case 'F': charArray6[12] = 'K'; break;
                    case 'G': charArray6[14] = 'K'; break;
                    case 'H': charArray6[16] = 'K'; break;
                }
            }
            if (chars[0] == '7') {
                switch (chars[1]){
                    case 'A': charArray7[2] = 'K'; break;
                    case 'B': charArray7[4] = 'K'; break;
                    case 'C': charArray7[6] = 'K'; break;
                    case 'D': charArray7[8] = 'K'; break;
                    case 'E': charArray7[10] = 'K'; break;
                    case 'F': charArray7[12] = 'K'; break;
                    case 'G': charArray7[14] = 'K'; break;
                    case 'H': charArray7[16] = 'K'; break;
                }
            }
            if (chars[0] == '8') {
                switch (chars[1]){
                    case 'A': charArray8[2] = 'K'; break;
                    case 'B': charArray8[4] = 'K'; break;
                    case 'C': charArray8[6] = 'K'; break;
                    case 'D': charArray8[8] = 'K'; break;
                    case 'E': charArray8[10] = 'K'; break;
                    case 'F': charArray8[12] = 'K'; break;
                    case 'G': charArray8[14] = 'K'; break;
                    case 'H': charArray8[16] = 'K'; break;
                }
            }

            System.out.println(charArraySymb);
            System.out.println(charArray8);
            System.out.println(charArray7);
            System.out.println(charArray6);
            System.out.println(charArray5);
            System.out.println(charArray4);
            System.out.println(charArray3);
            System.out.println(charArray2);
            System.out.println(charArray1);
        System.out.println();
        System.out.println("Пожалуйста, введите ваш ход, например (1A): ");
        String strWalk = line.readLine();
        char[] charsWalk = strWalk.toCharArray();

        //1A

        if(chars[0] == '1') {
            if (chars[1] == 'A'){
                if (charsWalk[0] == '3'){
                    if (charsWalk[1] == 'B'){
                        charArray3[4] = 'K';
                        charArray1[2] = '#';
                        System.out.println(charArraySymb);
                        System.out.println(charArray8);
                        System.out.println(charArray7);
                        System.out.println(charArray6);
                        System.out.println(charArray5);
                        System.out.println(charArray4);
                        System.out.println(charArray3);
                        System.out.println(charArray2);
                        System.out.println(charArray1);
                        System.out.println("Конь пошёл");
                    }
                }else if (charsWalk[0] == '2'){
                    if (charsWalk[1] == 'C'){
                        charArray2[6] = 'K';
                        charArray1[2] = '#';
                        System.out.println(charArraySymb);
                        System.out.println(charArray8);
                        System.out.println(charArray7);
                        System.out.println(charArray6);
                        System.out.println(charArray5);
                        System.out.println(charArray4);
                        System.out.println(charArray3);
                        System.out.println(charArray2);
                        System.out.println(charArray1);
                        System.out.println("Конь пошёл");
                    }
                }else {
                    System.out.println("Это не допустимый ход");
                }
            }
        }

        //2A
        if(chars[0] == '2') {
            if (chars[1] == 'A'){
                if (charsWalk[0] == '3'){
                    if (charsWalk[1] == 'A'){
                        charArray3[2] = 'K';
                        charArray1[4] = '0';
                        System.out.println(charArraySymb);
                        System.out.println(charArray8);
                        System.out.println(charArray7);
                        System.out.println(charArray6);
                        System.out.println(charArray5);
                        System.out.println(charArray4);
                        System.out.println(charArray3);
                        System.out.println(charArray2);
                        System.out.println(charArray1);
                        System.out.println("Конь пошёл");
                    }
                }else if (charsWalk[0] == '3'){
                    if (charsWalk[1] == 'C'){
                        charArray3[6] = 'K';
                        charArray1[4] = '0';
                        System.out.println(charArraySymb);
                        System.out.println(charArray8);
                        System.out.println(charArray7);
                        System.out.println(charArray6);
                        System.out.println(charArray5);
                        System.out.println(charArray4);
                        System.out.println(charArray3);
                        System.out.println(charArray2);
                        System.out.println(charArray1);
                        System.out.println("Конь пошёл");
                    }
                }else {
                    System.out.println("Это не допустимый ход");
                }
            }
        }

        }


//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++)
//                if ((i + j) % 2 == 0)
//                    System.out.print("0 ");
//                else
//                    System.out.print("# ");
//            System.out.println();
//        }
        }


