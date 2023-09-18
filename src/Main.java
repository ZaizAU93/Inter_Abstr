import java.util.Scanner;
import Zadanie_2.Computer;
import Zadanie_2.Hp;
import Zadanie_2.Mac;
import Zadanie_3.Accountant;
import Zadanie_3.Director;
import Zadanie_3.Worker;
import Zadaniq_1.Cat;
import Zadaniq_1.Dog;
import Zadaniq_1.Voice;
import Zadaniq_4.Circle;
import Zadaniq_4.Figure;
import Zadaniq_4.Rectangle;
import Zadaniq_4.Triangle;


public class Main {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);

        //Задача 1:
        //1.1 Создать классы Zadaniq_1.Dog, Zadaniq_1.Cat, Main и интерфейс Zadaniq_1.Voice c методом doVoice().
        //1.2 В Zadaniq_1.Dog и Zadaniq_1.Cat имплементировать данный интерфейс и реализовать метод doVoice().
        //1.3 В классе Main создать объекты Zadaniq_1.Dog, Zadaniq_1.Cat и вызвать метод doVoice().
        Voice dog = new Dog();
        Voice cat = new Cat();
        cat.doVoice();
        dog.doVoice();

        //Задача 2:
        //Создать абстрактный класс Zadanie_2.Computer и абстрактный метод getClassName(). Создать
        //классы Zadanie_2.Hp и Zadanie_2.Mac и отнаследоваться от Zadanie_2.Computer. Переопределить метод getClassName()
        //в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Zadanie_2.Mac». В
        //методе main класса Main создать объекты классов Zadanie_2.Hp Zadanie_2.Mac и вызвать методы для каждого
        //из этих объектов.

        Computer hp = new Hp();
        Computer mac = new Mac();

        hp.getClassName();
        mac.getClassName();

        //Задача 1:
        //Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        //который печатает название должности и имплементировать этот метод в созданные
        //классы.


        Director Dir = new Director();
        Worker wor = new Worker();
        Accountant acc = new Accountant();

        Dir.nameJob = "Директор";
        wor.nameJob = "Рабочий";
        acc.nameJob = "Бухгалтер";
        Dir.printJobTitle();
        wor.printJobTitle();
        acc.printJobTitle();

        //Задача 2:
        //Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        //функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        //абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        //периметра всех фигур в массиве

        System.out.println("4 задание");
        Figure[] fig = new Figure[5];

        //boolean exet = false;


        int i = 0;
        int number = 0;

        while (i < 5){
            System.out.println("Выберите фигуру для подсчета периметра и площади \t");
            System.out.println("1 - круг \t");
            System.out.println("2 - Треугольник  \t");
            System.out.println("3 - прямоугольник \t");
            number = line.nextInt();
        if (number == 1) {
            System.out.println("Введите радиус круга :");
            double radius = line.nextDouble();
            fig[i] = new Circle(radius);
            fig[i].examination();
            i++;
        } else if (number == 2) {
            System.out.println("Введите размеры квадрата :");
            double heigt = line.nextDouble();
            double weith = line.nextDouble();
            fig[i] = new Rectangle(heigt, weith);
            fig[i].examination();
            i++;
        } else if (number == 3) {
            System.out.println("Введите величину сторон треугольника :");
            double a = line.nextDouble();
            double b = line.nextDouble();
            double c = line.nextDouble();
            fig[i] = new Triangle(a, b, c);
            fig[i].examination();
            i++;
        }
    }

            for (int j = 0; j < fig.length; j++) {
                   System.out.println( fig[j].perimeter());
                   System.out.println(  fig[j].square());
            }





        }
    }

