// 1. Write a program in java to create a class Complex having data members real and imaginary and perform following operations using functions
// A. Add two complex number
// B. Subtract two complex numbers

class Complex {
    int rl, img;

    Complex() {
    }

    Complex(int tmprl, int tmpimg) {
        rl = tmprl;
        img = tmpimg;
    }

    Complex addComp(Complex C1, Complex C2) {
        Complex tmp = new Complex();
        tmp.rl = C1.rl + C2.rl;
        tmp.img = C1.img + C2.img;
        return tmp;
    }

    Complex subtractComp(Complex C1, Complex C2) {
        Complex tmp = new Complex();

        tmp.rl = C1.rl - C2.rl;
        tmp.img = C1.img - C2.img;
        return tmp;
    }

    void printComplexNumber() {
        System.out.println("Complex number: " + rl + " + " + img + "i");
    }
}

public class Q1 {
    public static void main(String[] args) {

        Complex C1 = new Complex(5, 6);
        C1.printComplexNumber();

        Complex C2 = new Complex(7, 8);
        C2.printComplexNumber();

        Complex C3 = new Complex();

        C3 = C3.addComp(C1, C2);
        System.out.print("Sum of ");
        C3.printComplexNumber();

        C3 = C3.subtractComp(C1, C2);
        System.out.print("Difference of ");
        C3.printComplexNumber();
    }
}