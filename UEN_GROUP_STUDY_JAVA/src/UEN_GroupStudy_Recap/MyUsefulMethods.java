package UEN_GroupStudy_Recap;

import java.util.ArrayList;
import java.util.*;


public class MyUsefulMethods {

	public static void main(String[] args) {
	
	
	//   for(int i=0, j=0; i<a.length(), b.length(); i++,  j++;) {
		
	}
	
	
			
				
	
	
	public static String CapitilizeMethod(String str) {
		return str.substring(0, 1).toUpperCase()+str.substring(1).toLowerCase();
	}
	
	public static String ReversedString(String a) {
		StringBuilder b=new StringBuilder(a);
		return b.reverse().toString();
	}
	
	 public static void Sorting2DimentionalArrays(int[][] a){
		 for(int i=0; i < a.length; i++) {
				Arrays.sort(a[i]);
			}
	 }
	 public static void Sorting2DimentionalArrays(Integer[][] a){
		 for(int i=0; i < a.length; i++) {
				Arrays.sort(a[i]);
			}
	 }
	 public static void Sorting2DimentionalArrays(String[][] a){
		 for(int i=0; i < a.length; i++) {
				Arrays.sort(a[i]);
			}
	 }
	 public static void Sorting2DimentionalArrays(double[][] a){
		 for(int i=0; i < a.length; i++) {
				Arrays.sort(a[i]);
			}
	 }
	 
	 public static void Sorting2DimentionalArrays(Double[][] a){
		 for(int i=0; i < a.length; i++) {
				Arrays.sort(a[i]);
			}
	 }
	 
	 public static ArrayList<Integer> ConvertingArraysToList(Integer[] a){
		 return new ArrayList<>( Arrays.asList(a));
	 }
	 
	 public static ArrayList<Double> ConvertingArraysToList(Double[] a){
		 return new ArrayList<>( Arrays.asList(a));
	 }
	 public static ArrayList<String> ConvertingArraysToList(String[] a){
		 return new ArrayList<>( Arrays.asList(a));
	 }
	 
	 
	 public static ArrayList<Integer> ConvertingArraysToList(int[] a){
		 Integer[] myarr=new Integer[a.length];
		 
		 for(int i=0; i<a.length; i++) {
			 myarr[i] =a[i];
		 }
		 
		return ConvertingArraysToList(myarr); 
	 }
	 
	 public static ArrayList<Double> ConvertingArraysToList(double[] a){
		 Double[] myarr=new Double[a.length];
		 
		 for(int i=0; i<a.length; i++) {
			 myarr[i] =a[i];
		 }
		 
		return ConvertingArraysToList(myarr); 
	 }
	 
	 
	 
	 

}
