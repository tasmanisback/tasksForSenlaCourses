/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Dubovik 
{

   
   public static void main(String[] args)
   {
       int num;
       boolean b;
       b = false;
      
        System.out.println("Введите целое число");
        Scanner number=new Scanner(System.in);
        if(number.hasNextInt())
        {
	    num = number.nextInt();
	    for(int i=1; i<=Math.sqrt(num); i++) 
            {
		if(num%i==0&&i>1) 
                    {
			b = true;
			break;
		    }
	    }
		if(b) 
                {
		    System.out.println("Число "+num+" не простое ");
		} else 
                {
		     System.out.println("Число "+num+" простое");
		}
        
        
            if(num%2==0)
            {
                System.out.println("Число "+num+" четное");
            }
            else System.out.println("Число "+num+" не четное");
        }
        else System.out.println("Ошибка. Вы ввели не целое число");
    
    }
    
}
