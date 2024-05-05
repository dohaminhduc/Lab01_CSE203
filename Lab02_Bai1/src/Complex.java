import java.util.Scanner;

public class Complex {

    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex() {}

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void getNum() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter real: ");
        real = sc.nextDouble();
        System.out.println("Enter imaginary: ");
        imag = sc.nextDouble();
    }
    public Complex AddNum(Complex complex){
        Complex c = new Complex();
        c.setReal(this.real + complex.getReal());
        c.setImag(this.imag + complex.getImag());
        return c;

    }
    public Complex SubsNum(Complex complex){
        Complex c = new Complex();
        c.setReal(this.real - complex.getReal());
        c.setImag(this.imag - complex.getImag());
        return c;
    }
    public Complex MultiNum(Complex complex){
        Complex c = new Complex();
        double real_c = this.real * complex.getReal() - this.imag * complex.getImag();
        double imag_c = this.real * complex.getImag() + this.imag * complex.getReal();
        c.setReal(real_c);
        c.setImag(imag_c);
        return c;
    }
    public Complex DivNum(Complex complex){
        Complex c = new Complex();
        double real_c = (this.real*complex.getReal()+this.imag*complex.getImag())/(this.real*this.real+this.imag*this.imag);
        double imag_c = (this.real*getImag()-this.imag*complex.getReal())/(this.real*this.real+this.imag*this.imag);
        c.setReal(real_c);
        c.setImag(imag_c);
        return c;
    }


    public void print() {
            System.out.println(real+" "+"+"+imag+"i" );

    }
}
