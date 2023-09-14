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

    }
}