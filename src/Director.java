public class Director implements JobTitle {
    public String nameJob;

//    public Director(String s) {
//        this.nameJob = nameJob;
//    }


    @Override
    public void printJobTitle() {
        System.out.println("Должность " + nameJob);
    }
}
