package Zadaniq_4;

public class Circle extends Figure{
    double Radius;
    final public int DeterminantClass = 1;
    public Circle(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public int getDeterminantClass() {
        return DeterminantClass;
    }

    public void examination(){
        if ( Radius < 0 ){
            System.out.println("������� ��������� �������� �������");
        } else {
            ExaminationCondition = true;
        }
    }
    @Override
    public double perimeter() {
        perimetr = 2 * 3.14 * Radius;
        System.out.println("�������� ����� � �������� " + Radius+ " = " + perimetr );
        return perimetr;
    }

    @Override
    public double square() {
        square = Math.pow(3.14,2) * Radius;
        System.out.println("������� ����� � �������� " + Radius+ " = " + square );
        return square;
    }
}
