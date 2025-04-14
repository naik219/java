class Calculator {
    protected double a, b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

class Addition extends Calculator {
    public Addition(double a, double b) {
        super(a, b);
    }

    public double add() {
        return a + b;
    }
}

class Subtraction extends Addition {
    public Subtraction(double a, double b) {
        super(a, b);
    }

    public double subtract() {
        return a - b;
    }
}

class Multiplication extends Subtraction {
    public Multiplication(double a, double b) {
        super(a, b);
    }

    public double multiply() {
        return a * b;
    }
}

class Division extends Multiplication {
    public Division(double a, double b) {
        super(a, b);
    }

    public double divide() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }
}

class FinalCalculator extends Division {
    public FinalCalculator(double a, double b) {
        super(a, b);
    }

    public void displayResults() {
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Division: " + divide());
    }

    public static void main(String[] args) {
        FinalCalculator calc = new FinalCalculator(10, 5);
        calc.displayResults();
    }
}
