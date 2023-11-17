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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        //TODO write your implementation code here:
        if(usuario.equals("Evelyn")&&contrasena.equals("Evelyn123")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Suma")
    public Float Suma(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1+num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Resta")
    public Float Resta(@WebParam(name = "num1") float num1, @WebParam(name = "num2")float num2) {
        //TODO write your implementation code here:
        float total= num1-num2;
        return total;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiplicacion")
    public Float Multiplicacion(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1*num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Division")
    public Float Division(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1/num2;
    }
    
     
}
