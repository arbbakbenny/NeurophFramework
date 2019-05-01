
package org.neuroph.contrib.transfer;

import org.junit.*;

public class ExponentialLinearUnitTest {
    
    @Test
    public void testDerivative() {
        double eluAlpha = 2;
        ExponentialLinearUnit elu = new ExponentialLinearUnit(eluAlpha);
        double testValue = 20d;
        Assert.assertEquals(
                "ELU should have constant derivative equal to 1 for "
                        + "positive values", 
                1d,
                elu.getDerivative(testValue),
                0.01
        );
        
        testValue = -1d;
        double expectedValue = eluAlpha * (Math.exp(testValue) - 1) + eluAlpha;
        Assert.assertEquals(
                "ELU should have constant derivative equal to 1 for "
                        + "positive values", 
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
        
        testValue = -1d;
        Assert.assertEquals(-0.6321, elu.getOutput(testValue), 0.01);
        
    }
    
}
