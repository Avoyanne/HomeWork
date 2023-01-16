package homework7;

public class Calculator {

    double plus(double a, double b) {
        return a + b;
    }

    double minus(double a, double b) {
        return a - b;
    }

    double divide(double a, double b){
        if (a / b == 0) {
            return -1;
        }
            return a / b;
    }
double multply(double a, double b){
        return a * b;
}
}
