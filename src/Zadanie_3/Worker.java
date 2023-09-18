package Zadanie_3;

public class Worker implements JobTitle {
    public String nameJob;

//    public Zadanie_3.Worker(String s) {
//        this.nameJob = nameJob;
//    }


    @Override
    public void printJobTitle() {
        System.out.println("Должность " + nameJob);
    }
}
