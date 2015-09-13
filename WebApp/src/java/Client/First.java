/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.util.Scanner;

/**
 *
 * @author raz
 */
public class First {
    public static void main (String []args)
    {
    
        
        Scanner sc=new Scanner(System.in);
        server.Calculator_Service service = new server.Calculator_Service();
        server.Calculator port = service.getCalculatorPort();
        System.out.print("First Value");
        int First = sc.nextInt();
        System.out.print("Second Value");
        int Second = sc.nextInt();
        System.out.print("Operator");
        String opr=sc.next();
        char Operation=opr.charAt(0);
        System.out.println(port.operation(First, Second, Operation));
    
    }
  
}
