public class Calculator {
    protected double rezultat;

    public Calculator() {
        rezultat = 0;
    }

    public Calculator(double x) {
        rezultat = x;
    }

    public Calculator adunare(double x) {
        rezultat += x;
        return this;
    }

    public Calculator scadere(double x) {
        rezultat -= x;
        return this;
    }

    public Calculator inmultire(double x) {
        rezultat *= x;
        return this;
    }

    public Calculator impartire(double x) {
        if (x == 0) {
            throw new RuntimeException("Impartire la 0!!!!!");
        } else {
            rezultat /= x;
            return this;
        }
    }

    public Calculator radical() {
        if (rezultat < 0) {
            throw new RuntimeException("Nu se poate");
        } else {
            rezultat = Math.sqrt(rezultat);
            return this;
        }
    }

    public Calculator exponent() {
        rezultat = Math.exp(rezultat);
        return this;
    }

    public double getRezultat() {
        return rezultat;
    }

}
