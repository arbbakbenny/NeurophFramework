
package org.neuroph.contrib.transfer;

import org.neuroph.util.Properties;
import org.neuroph.core.transfer.TransferFunction;

/**
 * 
 * @see https://arxiv.org/pdf/1511.07289.pdf
 */
public class ExponentialLinearUnit extends TransferFunction {

    double alpha = 1d; 
    
    public ExponentialLinearUnit() {
    
    }
    
    public ExponentialLinearUnit(double alpha) {
        this.alpha = alpha;
    }
    
    public ExponentialLinearUnit(Properties properties) {
        this.alpha = (double) properties.getProperty("transferFunctionAlpha");
    }
    
    @Override
    public double getOutput(double net) {
        if (net > 0d) {
            return net;
        }
        return alpha * (Math.exp(net) - 1);
    }

    @Override
    public double getDerivative(double net) {
        if (net > 0d) {
            return 1d;
        }
        return alpha * Math.exp(net);
    }
}
