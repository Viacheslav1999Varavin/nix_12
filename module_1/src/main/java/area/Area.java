package area;

/*3.Даны точки A,B,C на плоскости. Вычислить площадь треугольника ABC.*/

import java.util.Scanner;

public class Area {
    public void runArea() {
        System.out.println("Пожалуйста, введите координаты вершин треугольника (Ax,Ay;Bx,By;Cx,Cy) :");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        double result = (double) 1/2 * Math.abs((array[2] - array[0]) * (array[5] - array[1]) - (array[4] - array[0]) * (array[3] - array[1]));
        System.out.println("Площадь треугольника равна:" + " " + result);
        }
    }

