public class Accountant implements JobTitle{
    public String nameJob;

//    public Accountant(String s) {
//        this.nameJob = nameJob;
//    }


    @Override
    public void printJobTitle() {
        System.out.println("Должность " + nameJob);
    }
}
