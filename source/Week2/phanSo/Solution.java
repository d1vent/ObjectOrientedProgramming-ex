package Week2.phanSo;

/**
 * lop xay dung tu so va mau so.
 */
public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Constructor 1.
     */
    public Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * khai bao lop Sol.
     * @param numerator tu so
     * @param denominator mau so
     */
    public Solution(int numerator, int denominator) {
        if (denominator == 0) {
            this.numerator = numerator;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * set the numerator.
     * @param numerator ts
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * get the numerator.
     * @return ts
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * set the denominator.
     * @param denominator ms
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            denominator = this.denominator;
        }
        this.denominator = denominator;
    }

    /**
     * get the denominator.
     * @return ms
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * ham tim uoc chung lon nhat.
     * @param a num 1
     * @param b num 2
     * @return gcd
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Reduce to the lowest terms.
     * @return reduced fraction
     */
    public Solution reduce() {
        int temp = gcd(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / temp);
        this.setDenominator(this.getDenominator() / temp);
        return this;
    }

    /**
     * add two fractions.
     * @param fraction other fraction
     * @return new fraction
     */
    public Solution add(Solution fraction) {
        fraction.reduce();
        int newNumerator = this.numerator * fraction.denominator
                + fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * subtract two fractions.
     * @param fraction other fraction
     * @return diff of two fration
     */
    public Solution subtract(Solution fraction) {
        fraction.reduce();
        int newNumerator = this.numerator * fraction.denominator
                - fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * multiply two fractions.
     * @param fraction others
     * @return product
     */
    public Solution multiply(Solution fraction) {
        fraction.reduce();
        int newNumerator = this.numerator * fraction.numerator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * divide two fractions.
     * @param fraction others
     * @return quotient
     */
    public Solution divide(Solution fraction) {
        fraction.reduce();
        int newNumerator = this.numerator * fraction.denominator;
        int newDenominator = this.denominator * fraction.numerator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * so sanh 2 phan so xem chung co bang nhau hay khong.
     * @param obj to compare
     * @return true if equal otherwise false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other.reduce();
            this.reduce();
            if (other.getNumerator() == this.getNumerator()) {
                return other.getDenominator() == this.getDenominator();
            }
        }
        return false;
    }
}
