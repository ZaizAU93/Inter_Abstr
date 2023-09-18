package Zadanie_3;

public class Accountant implements JobTitle{
    public String nameJob;

//    public Zadanie_3.Accountant(String s) {
//        this.nameJob = nameJob;
//    }


    @Override
    public void printJobTitle() {
        System.out.println("Должность " + nameJob);
    }
}
