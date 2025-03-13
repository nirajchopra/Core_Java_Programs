package com.rays.oop;

public class Complex {
    int real;
    int imag; // Renamed 'image' to 'imag' for clarity

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public Complex(Complex c, Complex d) {
        // Not sure what this constructor is for. You can remove it if it's not needed.
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real * b.real) - (a.imag * b.imag), (a.real * b.imag) + (a.imag * b.real));
    }
    public static Complex divide(Complex a, Complex b) {
        return new Complex((a.real / b.real) - (a.imag / b.imag), (a.real / b.imag) + (a.imag / b.real));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + " + " + imag + "i");
        }
    }

    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 2);

        Complex e = Complex.add(c, d); 
        Complex f = Complex.diff(c, d); 
        Complex g = Complex.product(c, d); 
        Complex h = Complex.divide(c, d); 

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
