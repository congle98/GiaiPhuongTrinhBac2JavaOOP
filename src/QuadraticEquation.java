public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public void setA(double newA){
        this.a=newA;
    }
    public void setB(double newB){
        this.b=newB;
    }
    public void setC(double newC){
        this.c=newC;
    }
    public void getDiscriminant(){
        this.delta = (this.b*this.b)-(4*this.a*this.c);
    }
    public void findX(){
        this.getDiscriminant();
        if(this.delta < 0){
            System.out.println("Phương trình vô nhiệm!!!");
        }
        else if(this.delta==0){
            double x1=(-this.b)/(2*this.a);
            System.out.println("Phương trình có 2 nghiệm kép: "+x1);
        }
        else{
            double x1 = ((-this.b)+(Math.sqrt(this.delta)))/(2*this.a);
            double x2 = ((-this.b)-(Math.sqrt(this.delta)))/(2*this.a);
            System.out.println("Phương trình có 2 nghiệm x1: "+x1+" và x2: "+x2);
        }
    }

}
