public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //1.1 Создать классы Dog, Cat, Main и интерфейс Voice c методом doVoice().
        //1.2 В Dog и Cat имплементировать данный интерфейс и реализовать метод doVoice().
        //1.3 В классе Main создать объекты Dog, Cat и вызвать метод doVoice().
        Voice dog = new Dog();
        Voice cat = new Cat();
        cat.doVoice();
        dog.doVoice();

        //Задача 2:
        //Создать абстрактный класс Computer и абстрактный метод getClassName(). Создать
        //классы Hp и Mac и отнаследоваться от Computer. Переопределить метод getClassName()
        //в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Mac». В
        //методе main класса Main создать объекты классов Hp Mac и вызвать методы для каждого
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


    }
}