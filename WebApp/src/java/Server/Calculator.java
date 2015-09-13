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
    
    
    public Double Sum(int First ,int Second){
        double Result = First + Second;
            return Result;
    }
    
     public Double Minus(int First ,int Second){
        double Result = First - Second;
            return Result;
    }
     
     public Double Div(int First ,int Second){
        double Result = First%Second;
            return Result;
    } 
     
      public Double Multi(int First ,int Second){
        double Result = First*Second;
            return Result;
    }  

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
                answer=Sum(First,Second);
                return answer;
            }
            
            case '-': 
            {
                double answer;
                answer=Minus(First,Second);
                return answer;
            }
            
              case '*': 
            {
                double answer;
                answer=Multi(First,Second);
                return answer;
            }
              
                 case '/': 
            {
                double answer;
                answer=Div(First,Second);
                return answer;
            }
       
                 default:
                 {
                     return null;
                 }
        
        }}
}
