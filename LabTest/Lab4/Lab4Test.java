package oot.lab4.test;
import java.util.Scanner;
import java.util.Random;
public class Lab4Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Input a size of array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
       
        for(int i = 0; i < size; i++){
            arr1[i] = rand.nextInt(10)+1;
            arr2[i] = rand.nextInt(10)+1;
        }
        
        printArray(arr1);
        printArray(arr2);
        sumArray(arr1,arr2);
    }
    
    public static void printArray(int[] arr1){
        int j = 0;
        for(int a : arr1){
            System.out.print((j++) + ":" + a + " ");
        }
        System.out.println("");
        }
    public static void sumArray(int[] arr1,int[] arr2){
        int[] sum = new int[arr1.length];
        for (int i = 0; i < arr1.length;i++){
            if( i<arr1.length - 1){
                sum[i] = arr1[i] + arr2[i + 1];
            }
            else{
                sum[i] = arr1[i] + arr2[0];
            }
        }
        printArray(sum);
    }   
  }

