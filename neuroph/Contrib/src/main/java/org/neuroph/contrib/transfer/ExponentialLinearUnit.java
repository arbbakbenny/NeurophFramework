
package org.neuroph.contrib.transfer;

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
    
    @Override
    public double getOutput(double net) {
        if (net < 0d) {
            return alpha * (Math.exp(net) - 1);
        }
        return net;
    }

    @Override
    public double getDerivative(double net) {
        if (net > 0d) {
            return 1d;
        }
        return getOutput(net) + alpha;
    }
}
