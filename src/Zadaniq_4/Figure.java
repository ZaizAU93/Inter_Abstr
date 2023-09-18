package Zadaniq_4;
  abstract public class Figure {
    public int DeterminantClass;

    public int getDeterminantClass() {
      return DeterminantClass;
    }

    protected double perimetr;
    protected double square;
    public boolean ExaminationCondition = false;

    public boolean isExaminationCondition() {
      return ExaminationCondition;
    }

    public abstract double square();

    public abstract double perimeter();

    public abstract void examination();

  }
