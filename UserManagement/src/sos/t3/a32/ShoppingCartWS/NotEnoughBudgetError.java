
/**
 * NotEnoughBudgetError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package sos.t3.a32.ShoppingCartWS;

public class NotEnoughBudgetError extends java.lang.Exception{

    private static final long serialVersionUID = 1494345056763L;
    
    private es.upm.fi.sos.t3.shoppingcart.ErrorMessage faultMessage;

    
        public NotEnoughBudgetError() {
            super("NotEnoughBudgetError");
        }

        public NotEnoughBudgetError(java.lang.String s) {
           super(s);
        }

        public NotEnoughBudgetError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotEnoughBudgetError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.shoppingcart.ErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.shoppingcart.ErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    