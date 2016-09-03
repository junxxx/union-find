/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package union_find;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author junxxx
 */


public class test {
    
    private int[] data;
    private int count;

    public test(int N)
    {   
        count = N;
        data = new int[N];
        for(int i = 0; i < N; i++)
        {
            data[i] = i;
//            StdOut.println(data[i]);   
        }
            
        
       
    }
    
    
    
    
    public static  void main(String[] args){
        int N = StdIn.readInt();
        StdOut.println(N);
        
        test testdata = new test(N);
                      
        for(int i = 0; i < N; i++)            
            StdOut.println(testdata.data[i]);   
                
    
    }
    
}
