public class ComplexNumber {

    private final double re;
    private final double im;

    ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (!(other instanceof ComplexNumber)) {
            return false;
        }

        ComplexNumber otherComplexNumber = (ComplexNumber) other;
        return this.re == otherComplexNumber.re && this.im == otherComplexNumber.im;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(re);
        result = 31 * result + Double.hashCode(im);

        return result;
    }
}