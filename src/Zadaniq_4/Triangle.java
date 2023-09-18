package Zadaniq_4;

public class Triangle extends Figure{
    //�� ���� ��������: S = ?p � (p � a)(p � b)(p � c),
    // ��� a, b � c ��� ������� ������������ � p � �������� ��������� ������������.
    double a, b,c;
    final public int DeterminantClass = 3;

    @Override
    public int getDeterminantClass() {
        return DeterminantClass;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public void examination(){
        if (a + b < c || a + c < b || b + c < a || a <= 0 || b <= 0 || c <= 0 ){
            System.out.println("������� ����������� ������� ������ ������������");
         } else {
            ExaminationCondition = true;
        }
    }

    @Override
    public double square() {
        square = Math.sqrt(perimetr/2 * (perimetr/2 - a)*(perimetr/2 - b)*(perimetr/2 - c));
        System.out.println("������� ������������ �� ��������� " + a + " " + b + " " + c + " = " + square );
        return square;
    }

    @Override
   public double perimeter() {
        perimetr = a + b + c;
        System.out.println("������� ������������ �� ��������� " + a + " " + b + " " + c + " = " + perimetr );
    return perimetr;
    }
}
