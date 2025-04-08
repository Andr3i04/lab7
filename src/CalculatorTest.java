import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void adunare() {
        Calculator calculator = new Calculator(3);
        calculator.adunare(3);
        Assertions.assertEquals(6, calculator.getRezultat());
    }

    @Test
    void scadere() {
        Calculator calculator = new Calculator(3);
        calculator.scadere(3);
        Assertions.assertEquals(0, calculator.getRezultat());
    }

    @Test
    void inmultire() {
        Calculator calculator = new Calculator(3);
        calculator.inmultire(2);
        Assertions.assertEquals(6, calculator.getRezultat());
    }

    @Test
    void impartire() {
        Calculator calculator = new Calculator(6);
        calculator.impartire(2);
        Assertions.assertEquals(3, calculator.getRezultat());
    }

    @Test
    void radical() {
        Calculator calculator = new Calculator(144);
        calculator.radical();
        Assertions.assertEquals(12, calculator.getRezultat());
    }

    @Test
    void exponent() {
        Calculator calculator = new Calculator(2);
        calculator.exponent();
        Assertions.assertEquals(7.38905609893065, calculator.getRezultat());

    }

    @Test
    void adunareCuNegatic() {
        Calculator calculator = new Calculator(6);
        calculator.adunare(-2);
        Assertions.assertEquals(4, calculator.getRezultat());

    }

    @Test
    void inmultireCuNegatic() {
        Calculator calculator = new Calculator(6);
        calculator.inmultire(-2);
        Assertions.assertEquals(-12, calculator.getRezultat());

    }

    @Test
    void impartireCuNegatic() {
        Calculator calculator = new Calculator(6);
        calculator.impartire(-2);
        Assertions.assertEquals(-3, calculator.getRezultat());

    }

    @Test
    void inmultireCuZero() {
        Calculator calculator = new Calculator(6);
        calculator.inmultire(0);
        Assertions.assertEquals(0, calculator.getRezultat());

    }
/*
    @Test
    void impartireCuZero() {
        Calculator calculator = new Calculator(6);
        calculator.impartire(0);
        Exception e = assertThrows(IllegalArgumentException.class, () -> calculator.impartire(0));
        assertTrue(e.getMessage().contains("impartire"));
    }
*/
    @Test
    void impartireCuNrNegRezPozitiv() {
        Calculator calculator = new Calculator(6);
        calculator.impartire(-2);
        Assertions.assertEquals(-3, calculator.getRezultat());

    }

    @Test
    void exponentCuZero() {
        Calculator calculator = new Calculator(0);
        calculator.exponent();
        Assertions.assertEquals(1, calculator.getRezultat());

    }

    @Test
    void redicalCuZero() {
        Calculator calculator = new Calculator(0);
        calculator.radical();
        Assertions.assertEquals(0, calculator.getRezultat());

    }
}