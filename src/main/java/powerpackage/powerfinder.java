package powerpackage;

public class PowerFinder {

    public static float power(int base, int exponent) {
        boolean isNegativeExponent = exponent < 0;
        exponent = Math.abs(exponent);
        float result = 1f;
        while (exponent>0) {
            result *= base;
            exponent--;
        }
        if(isNegativeExponent)
            return 1/result;
        return result;
    }
}
