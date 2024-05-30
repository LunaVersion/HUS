package hus.oop.lab4.themycomplexclass;

public class MyComplexTry {
        private double real = 0.0;
        private double imag = 0.0;

        public MyComplexTry(){

        }
        public MyComplexTry(double real, double imag ){
            this.real = real;
            this.imag = imag;
        }

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
        public void setValue(double real, double imag){
            this.real = real;
            this.imag = imag;
        }
        public String toString() {
            return  real + "+" + imag + 'i';
        }
        public boolean isReal(){
            if(this.imag == 0){
                return true;
            }
            return false;
        }

        public boolean isImaginary(){
            if(this.real == 0){
                return true;
            }
            return false;
        }

        public boolean equals(double real, double imag){
            if(this.real==real && this.imag==imag){
                return true;
            }
            return false;
        }

        public boolean equals(MyComplexTry another){
            if(this.real==another.getReal() && this.imag==another.getImag()){
                return true;
            }
            return false;
        }
        public double magnitude(){
            return Math.sqrt(real * real + imag * imag);
        }
        public double argument() {
            return Math.atan(imag/real);
        }
        public MyComplexTry add(MyComplexTry right){
            this.real = this.real + right.getReal();
            this.imag = this.imag + right.getImag();
            return this;
        }
        public MyComplexTry addNew(MyComplexTry right){
            double newReal = this.real + right.getReal();
            double newImag = this.imag + right.getImag();
            return new MyComplexTry(newReal, newImag);
        }
        public MyComplexTry subtract(MyComplexTry right){
            this.real = this.real - right.getReal();
            this.imag = this.imag - right.getImag();
            return this;
        }
        public MyComplexTry subtractNew(MyComplexTry right){
            double newReal = this.real - right.getReal();
            double newImag = this.imag - right.getImag();
            return new MyComplexTry(newReal, newImag);
        }
        public MyComplexTry multiply(MyComplexTry right){
            this.real = this.real * right.getReal();
            this.imag = this.imag * right.getImag();
            return this;
        }
        public MyComplexTry devide(MyComplexTry right){
            this.real = this.real / right.getReal();
            this.imag = this.imag / right.getImag();
            return this;
        }

}
