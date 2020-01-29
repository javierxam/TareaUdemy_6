/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamtastic.tareaudemy_6;

/**
 *
 * @author Xavi
 */
public class Tarea6 {
    public static void main(String[] args) {
        
        int a = 2, b = 3;
        
      //int res = -3 + 6 / ++a * 4 - b-- + b;  
        
        ++a;
        System.out.println(a);
        int z = 6 / a;
        System.out.println(z);
        int x = z *4;
        System.out.println(x);
        int w = -3+x - b;
        b--;
        System.out.println(b);
        int r = w + b;
        System.out.println(r);
      
    }
}
