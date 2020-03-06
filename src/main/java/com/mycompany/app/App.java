package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{


    public int i = 0;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int add(int a, int b) {
	i = i+1;
	return a + b;
    }
}
