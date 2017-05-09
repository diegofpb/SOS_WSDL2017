

/**
 * ShoppingCartWSMessageReceiverRobustInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package sos.t3.a32.ShoppingCartWS;

        /**
        *  ShoppingCartWSMessageReceiverRobustInOnly message receiver
        */

        public class ShoppingCartWSMessageReceiverRobustInOnly extends org.apache.axis2.receivers.AbstractMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ShoppingCartWSSkeleton skel = (ShoppingCartWSSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){
     
        
            if("logout".equals(methodName)){
            
            
                            //doc style
                            
                                             skel.logout();
                                        

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.ErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.ProductName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.Budget param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.Budget.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.Login param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.Login.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.LoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.LoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.CostOfCart param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.CostOfCart.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.ProductsList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductsList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.ProductAmount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductAmount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.ProductAvailable param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductAvailable.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.shoppingcart.ProductPrice param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductPrice.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList wrapproductsInCart(){
                                es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList wrappedElement = new es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits wrapgetProductAvailableUnits(){
                                es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits wrappedElement = new es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.shoppingcart.Budget param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.shoppingcart.Budget.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.shoppingcart.Budget wrapbudget(){
                                es.upm.fi.sos.t3.shoppingcart.Budget wrappedElement = new es.upm.fi.sos.t3.shoppingcart.Budget();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.shoppingcart.LoginResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.shoppingcart.LoginResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.shoppingcart.LoginResponse wraplogin(){
                                es.upm.fi.sos.t3.shoppingcart.LoginResponse wrappedElement = new es.upm.fi.sos.t3.shoppingcart.LoginResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.shoppingcart.CostOfCart param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.shoppingcart.CostOfCart.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.shoppingcart.CostOfCart wrapcostOfCart(){
                                es.upm.fi.sos.t3.shoppingcart.CostOfCart wrappedElement = new es.upm.fi.sos.t3.shoppingcart.CostOfCart();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.shoppingcart.ProductsList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductsList.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.shoppingcart.ProductsList wrapgetProductsList(){
                                es.upm.fi.sos.t3.shoppingcart.ProductsList wrappedElement = new es.upm.fi.sos.t3.shoppingcart.ProductsList();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.shoppingcart.ProductAvailable param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductAvailable.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.shoppingcart.ProductAvailable wrapcheckProductAvailability(){
                                es.upm.fi.sos.t3.shoppingcart.ProductAvailable wrappedElement = new es.upm.fi.sos.t3.shoppingcart.ProductAvailable();
                                return wrappedElement;
                         }
                    
                         private es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits wrapaddToCart(){
                                es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits wrappedElement = new es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits();
                                return wrappedElement;
                         }
                    
                         private es.upm.fi.sos.t3.shoppingcart.Budget wrapbuy(){
                                es.upm.fi.sos.t3.shoppingcart.Budget wrappedElement = new es.upm.fi.sos.t3.shoppingcart.Budget();
                                return wrappedElement;
                         }
                    
                         private es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits wrapremoveFromCart(){
                                es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits wrappedElement = new es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.shoppingcart.ProductPrice param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.shoppingcart.ProductPrice.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.shoppingcart.ProductPrice wrapgetProductPrice(){
                                es.upm.fi.sos.t3.shoppingcart.ProductPrice wrappedElement = new es.upm.fi.sos.t3.shoppingcart.ProductPrice();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductsAmountsList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductName.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.Budget.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.Budget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.Login.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.Login.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.LoginResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.LoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.CostOfCart.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.CostOfCart.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductsList.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductsList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductAmount.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductAmount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductAvailable.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductAvailable.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductAmount.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductAmount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.Budget.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.Budget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductAmount.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductAmount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductAvailableUnits.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductName.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ProductPrice.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ProductPrice.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.shoppingcart.ErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.shoppingcart.ErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    