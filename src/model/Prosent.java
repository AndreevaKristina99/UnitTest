package model;

public class  Prosent {
     int sum=1;
  double koef=15.2;


    public double getProcent() {
        return sum;
    }

    public void setNumber(int sum) {
        this.sum= sum;
    }

    public void setKoef(double koef) {
        this.koef = koef;
    }
    public double getcountPr()

    {
      return (sum+ (sum* koef) / 100.);
    }


}
