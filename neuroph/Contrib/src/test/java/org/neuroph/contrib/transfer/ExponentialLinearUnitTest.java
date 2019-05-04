
package org.neuroph.contrib.transfer;

import org.junit.*;

public class ExponentialLinearUnitTest {
    
    @Test
    public void testDerivative() {
        double eluAlpha = 2;
        ExponentialLinearUnit elu = new ExponentialLinearUnit(eluAlpha);
        double testValue = 20d;
        elu.getOutput(testValue);
        Assert.assertEquals(
                "ELU should have constant derivative equal to 1 for "
                        + "positive values", 
                1d,
                elu.getDerivative(testValue),
                0.01
        );
        
        elu = new ExponentialLinearUnit(eluAlpha);
        testValue = -1d;
        elu.getOutput(testValue);
        double expectedValue = eluAlpha * Math.exp(testValue);
        Assert.assertEquals(
                "ELU should have derivative equal to it's output value + alpha "
                        + "when input is less or equal to 0", 
                expectedValue,
                elu.getDerivative(testValue),
                0.01
        );
    }
    
    @Test
    public void testOutput() {
        ExponentialLinearUnit elu = new ExponentialLinearUnit();
        double testValue = 20d;
        Assert.assertEquals(testValue, elu.getOutput(testValue), 0.01);
        
        elu = new ExponentialLinearUnit();
        testValue = -1d;
        Assert.assertEquals(-0.6321, elu.getOutput(testValue), 0.01);
        
    }
    
}
