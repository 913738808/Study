package com.zey.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigInteger01 {
    
    public static void main(String[] args) {
        
        BigInteger bInteger = new BigInteger("123456789745634564564654564654654654");

        System.out.println(bInteger);

        BigDecimal bDecimal1 = new BigDecimal("0.1123422222564684698641531313");
        BigDecimal bDecimal2 = new BigDecimal("3");
        
        BigDecimal bDecimal3 = bDecimal1.divide(bDecimal2,RoundingMode.CEILING);

        System.out.println(bDecimal3);

    }

}
