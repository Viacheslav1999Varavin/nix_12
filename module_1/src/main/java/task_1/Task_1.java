package task_1;

/* 1.Дан массив чисел. Вернуть число уникальных символов
Пример: для 1 4 5 1 1 3 ответ 4.*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task_1 {

    public void runTask1() throws IOException {
        System.out.println("Можете ввести символы");
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));

        String str = line.readLine();
        char[] chars = str.toCharArray();


        List<Integer> myList = new ArrayList<>();

        for (int x : chars) {
            if (!myList.contains(x))
                myList.add(x);
        }

        System.out.println("Число уникальных символов" + " " + myList.size());

    }


    }

