/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author EVELYN
 */
@WebService(serviceName = "ConversionSW")
public class ConversionSW {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroAadolar")
    public Double euroAadolar(@WebParam(name = "euros") double euros) {
        //TODO write your implementation code here:
        return euros *1.15;
    }
}
