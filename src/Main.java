import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumber {
        /*
         Параллелепипедтин площадь жана объёмун эсептеген бир программа жазабыз.
        Фигуранын параметрлерин(длина, ширина, высота) берип жатканда туура эмес маалымат
        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
        Мумкун болгон каталар:
        1) берилген маалымат терс сан болсо
        2) берилген маалымат сан эмес тамга болсо
        3) берилген сандар 20 дан чон болсо
        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
        - Фигуранын коломун эсептеген формула: (length*width*height);
        -Формулалар Parallelepiped классында жазылуусу керек
         */
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);


        Parallelepiped1 parallelepiped1  = new Parallelepiped1();

            System.out.println("Узнать площадь Паралеллепипеда нажмите на '1' " +
                "\nУзнать объом Паралеллепипеда нажмите на '2' ");
            int n = scanner1.nextInt();
            if (n == 1) {
                System.out.println("Площадь. " + "Введите длину, ширину, высоту: ");
                try {
                    parallelepiped1.ploshad(scanner1.nextDouble(), scanner2.nextDouble(), scanner3.nextDouble());
                } catch (InputMismatchException e) {
                    System.out.println("Нельзя писать букву.");
                }
            } else if (n == 2) {
                System.out.println("Объом. " + "Введите длину, ширину, высоту: ");
                try {
                    parallelepiped1.obom(scanner1.nextDouble(), scanner2.nextDouble(), scanner3.nextDouble());
                } catch (InputMismatchException e) {
                    System.out.println("Нельзя писать букву.");
                }
            }else {
                System.out.println("Вы ввели не правильно!!!");
            }

    }

}