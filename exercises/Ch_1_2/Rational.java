/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Rational {
    private static final String OVERFLOW_MESSAGE = "Overflow";
    private long numerator;
    private long denominator;

    public Rational(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        long gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    private static void assertOverflow(long p) {
        assert p < Integer.MAX_VALUE && p > Integer.MIN_VALUE : OVERFLOW_MESSAGE;
    }

    private static int gcd(long p, long q) {
        if (q == 0) {
            return (int) p;
        }
        long r = p % q;
        return gcd(q, r);
    }

    public Rational plus(Rational b) {
        long num = this.numerator * b.denominator + this.denominator * b.numerator;
        long den = this.denominator * b.denominator;

        assertOverflow(num);
        assertOverflow(den);

        long gcd = gcd(num, den);
        return new Rational(num / gcd, den / gcd);
    }

    public Rational minus(Rational b) {
        long num = this.numerator * b.denominator - this.denominator * b.numerator;
        long den = this.denominator * b.denominator;

        assertOverflow(num);
        assertOverflow(den);

        long gcd = gcd(num, den);
        return new Rational(num / gcd, den / gcd);
    }

    public Rational times(Rational b) {
        long num = this.numerator * b.numerator;
        long den = this.denominator * b.denominator;

        assertOverflow(num);
        assertOverflow(den);

        long gcd = gcd(num, den);
        return new Rational(num / gcd, den / gcd);
    }

    public Rational divides(Rational b) {
        long num = this.numerator * b.denominator;
        long den = this.denominator * b.numerator;

        assertOverflow(num);
        assertOverflow(den);

        long gcd = gcd(num, den);
        return new Rational(num / gcd, den / gcd);
    }

    public boolean equals(Rational that) {
        return this.numerator == that.numerator && this.denominator == that.denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);
    }
}
