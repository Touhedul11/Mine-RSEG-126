package com.touhedul.assignment6;

import java.util.Scanner;

public class SiveOfEratos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int N;
   
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the primer number: ");
   N = sc.nextInt();
   sc.close();
   
   
   boolean[] isPrime = new boolean[N];
   isPrime[0] = false;
   for(int a =1; a < N; a++) {
	   isPrime[a] = true;
   }
   
   for(int i =2; i <= N; i++) {
	   if(isPrime[i-1]) {
		   System.out.println(i);
		   
		   for(int j = i*i;j <=N; j+= i){
			   isPrime[j-1] = false;
	   }
   }
   }
   }
	}


