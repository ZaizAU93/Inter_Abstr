package Zadaniq_4;

public class Rectangle extends Figure {
    double height;
    double width;
    final public int DeterminantClass = 2;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int getDeterminantClass() {
        return DeterminantClass;
    }

    public void examination(){
        if ( height <= 0 || width <= 0){
            System.out.println("Введены некоректные условия сторон прямоугольника");
        } else {
            ExaminationCondition = true;
        }
    }
    @Override
   public double square() {
        square = height * width;
        System.out.println("Площадь прямоугольника со сторонами " + width + " " + height + " = " + square );
        return square;
    }

    @Override
    public double perimeter() {
        perimetr = 2 * (width + height);
        System.out.println("Периметр прямоугольника со сторонами " + width + " " + height + " = " + perimetr );
        return perimetr;
    }


}
