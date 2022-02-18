package main;

import task_1.Task_1;
import task_2.Task_2;
import task_3.Task_3;
import task_4.Task_4;

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
                new Task_1().runTask1();
            }
            //в процессе
            if (chars[0] == '2') {
                new Task_2().runTask2();
            }
            if (chars[0] == '3') {
                new Task_3().runTask3();
            }
            if (chars[0] == '4') {
                new Task_4().runTask4();
            }


}
}
