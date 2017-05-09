
/**
 * ProductUnknownError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package sos.t3.a32.ShoppingCartWS;

public class ProductUnknownError extends java.lang.Exception{

    private static final long serialVersionUID = 1494345056782L;
    
    private es.upm.fi.sos.t3.shoppingcart.ErrorMessage faultMessage;

    
        public ProductUnknownError() {
            super("ProductUnknownError");
        }

        public ProductUnknownError(java.lang.String s) {
           super(s);
        }

        public ProductUnknownError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProductUnknownError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.shoppingcart.ErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.shoppingcart.ErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    