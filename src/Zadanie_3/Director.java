package Zadanie_3;

public class Director implements JobTitle {
    public String nameJob;

//    public Zadanie_3.Director(String s) {
//        this.nameJob = nameJob;
//    }


    @Override
    public void printJobTitle() {
        System.out.println("Должность " + nameJob);
    }
}
