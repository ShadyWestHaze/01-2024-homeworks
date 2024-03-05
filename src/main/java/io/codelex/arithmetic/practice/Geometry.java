package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {                                                //Area = π × r2
    static BigDecimal areaOfCircle(BigDecimal radius) {
        if (radius.signum() <= 0) {
            throw new ArithmeticException("Radius of circle has to be positive");
        }
        BigDecimal pi = new BigDecimal(Math.PI);
        return pi.multiply(radius).multiply(radius);
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        if (length.signum() <= 0 ||width.signum() <= 0) {
            throw new ArithmeticException("Size of length and width have to be positive");
        }
        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        if (base.signum() <= 0 ||h.signum() <= 0 ) {
            throw new ArithmeticException("Size of base and height have to be positive");
        }


        return base.multiply(h).divide(BigDecimal.valueOf(2));
    }
}
