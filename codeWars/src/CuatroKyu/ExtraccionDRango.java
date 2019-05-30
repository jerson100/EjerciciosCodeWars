package CuatroKyu;

import java.util.ArrayList;
import java.util.List;

public class ExtraccionDRango {

	public static void main(String[] args) {
		
		System.out.println(rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
		
	}
	
	public static String rangeExtraction(int[] arr) {
		String c = "";
		int i=0;
		while(i < arr.length) {	
			int nextIndex = next(i, arr);//nos devuelve el índice siguiente
			if(nextIndex - i < 2) {
				for (int j = i; j < nextIndex+1; j++) {
					c+= arr[j]+",";
				}
			}else {
				c+=arr[i]+"-"+arr[nextIndex]+",";
			}
			i = nextIndex + 1;	
		}
		return c.replaceAll("[\\,]$", "");
	}
	
	public static int next(int i,int []arr) {
		for (int j = i+1; j < arr.length; j++,i++) {
			if(arr[j-1]+1 != arr[j]) {
				return i;
			}
		}
		return i;
	}
	
}
