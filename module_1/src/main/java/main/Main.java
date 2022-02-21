package main;

import unique.Unique;
import chess.Chess;
import area.Area;
import check.Check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Пожалуйста, введите номер задания, например - 1: ");
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        String str = line.readLine();
        char[] chars = str.toCharArray();

            if (chars[0] == '1') {
                new Unique().runUnique();
            }
            //в процессе
            if (chars[0] == '2') {
                new Chess().runChess();
            }
            if (chars[0] == '3') {
                new Area().runArea();
            }
            if (chars[0] == '4') {
                new Check().runCheck();
            }
}
}
