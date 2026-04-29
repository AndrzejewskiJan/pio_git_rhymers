package edu.kis.vh.nursery;

/**
 * Klasa bazowa reprezentująca rymowankę opartą na stosie liczb całkowitych.
 * Przechowuje liczby na stosie tablicowym o stałej pojemności {@value #SIZE}.
 * Służy jako podstawa dla innych implementacji rymowanek (FIFO, Hanoi itp.).
 *
 * @author edu.kis.vh
 * @version 1.0
 */
public class defaultCountingOutRhymer {

    /** Maksymalna liczba elementów stosu. */
    public static final int SIZE = 12;

    /** Wartość zwracana gdy stos jest pusty (indeks "poniżej dna"). */
    public static final int TOTAL = -1;

    private int[] NUMBERS = new int[SIZE];

    private int total = TOTAL;

    /**
     * Zwraca aktualny indeks wierzchołka stosu.
     *
     * @return indeks wierzchołka; {@value #TOTAL} gdy stos jest pusty
     */
    public int getTotal() {
        return total;
    }

    /**
     * Wkłada wartość na stos, jeżeli stos nie jest pełny.
     * Jeśli stos jest pełny, operacja jest ignorowana.
     *
     * @param in wartość do dodania na stos
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Sprawdza czy stos jest pusty.
     *
     * @return {@code true} jeśli stos jest pusty, {@code false} w przeciwnym razie
     */
    public boolean callCheck() {
        return total == TOTAL;
    }

    /**
     * Sprawdza czy stos jest pełny.
     *
     * @return {@code true} jeśli stos zawiera {@value #SIZE} elementów
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Zwraca wartość z wierzchołka stosu bez jej usuwania.
     * Jeśli stos jest pusty, zwraca {@value #TOTAL}.
     *
     * @return wartość na wierzchołku stosu lub {@value #TOTAL} gdy pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total];
    }

    /**
     * Zdejmuje i zwraca wartość z wierzchołka stosu.
     * Jeśli stos jest pusty, zwraca {@value #TOTAL}.
     *
     * @return zdjęta wartość z wierzchołka lub {@value #TOTAL} gdy pusty
     */
    public int countOut() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total--];
    }
}