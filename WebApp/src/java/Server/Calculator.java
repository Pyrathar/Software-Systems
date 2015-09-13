/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author raz
 */
@WebService(serviceName = "Calculator")
public class Calculator {
    
    
    

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
    @WebMethod(operationName = "operation")
    public Double operation(@WebParam(name = "First") int First, @WebParam(name = "Second") int Second, @WebParam(name = "Operation") char Operation) {
        //TODO write your implementation code here:
       
        switch(Operation){
            
            case '+': 
            {
                double answer;
                answer=First+Second;
                return answer;
            }
            
            case '-': 
            {
                double answer;
                answer=First-Second;
                return answer;
            }
            
              case 'x': 
            {
                double answer;
                answer=First*Second;
                return answer;
            }
              
                 case '/': 
            {
                double answer;
                answer=First/Second;
                return answer;
            }
       
                 default:
                 {
                     return null;
                 }
        
        }}
}
