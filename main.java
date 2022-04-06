//Sharlton Shepeluk

import java.util.Random;

public class main {

	public static void main(String[] args)
	{
	    Random rand = new Random();

	    int[] arr = new int[200000000];

	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = rand.nextInt(10) + 1; 
	    }

	    long start = System.currentTimeMillis();

	    Sum.sum(arr);

	    System.out.println("Single thread: " + (System.currentTimeMillis() - start) + "ms"); 

	    start = System.currentTimeMillis();

	    Sum.parallelSum(arr);

	    System.out.println("Parallel thread: " + (System.currentTimeMillis() - start) + "ms"); 
	}
}
