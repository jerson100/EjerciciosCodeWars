package CuatroKyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NextNumber {

	public static void main(String[] args) {
		/*
		 * 
		   840611738
			253196925
			1200749686
			1095407963
			1384183129
			1897913471
			2080826699
			622487637
			242683211
			621389783
			1304034367

		 * 
		 * */
		long time = System.currentTimeMillis();
		/*
		System.out.println(nextBiggerNumber(1084203687));
		System.out.println(nextBiggerNumber(1292861771));
		System.out.println(nextBiggerNumber(1667420219));
		System.out.println(nextBiggerNumber(598448554));
		System.out.println(nextBiggerNumber(1020679740));
		
		System.out.println((System.currentTimeMillis()-time)/1000.0);
		
		System.out.println("prueba2: ");*/
		
		time = System.currentTimeMillis();
		/*
		System.out.println(nextBiggerNumber(840611738));
		System.out.println(nextBiggerNumber(253196925));
		System.out.println(nextBiggerNumber(1200749686));
		System.out.println(nextBiggerNumber(1095407963));
		System.out.println(nextBiggerNumber(1384183129));
		System.out.println(nextBiggerNumber(1897913471));
		System.out.println(nextBiggerNumber(2080826699));
		System.out.println(nextBiggerNumber(622487637));
		System.out.println(nextBiggerNumber(242683211));
		System.out.println(nextBiggerNumber(621389783));*/
		System.out.println(nextBiggerNumber2(9876543210l));
		System.out.println((System.currentTimeMillis()-time)/1000.0);
		
	}
	
	public static long nextBiggerNumber2(long n){
		
		String num = n+"";
		String subCadena;
		Set<Long> list;
		Iterator<Long> it;
		
		for (int i = 0; i < num.length(); i++) {
			subCadena = num.substring(num.length()-(i+1), num.length());
			long ne = Long.parseLong(subCadena);
			list = new TreeSet<>();
			permutar("", String.valueOf(ne).split(""),new ArrayList<>(), list, 0);
			it = list.iterator();
			String rs = "";
			
			while(it.hasNext()) {
				long nex = it.next();
				if(Long.parseLong(subCadena)==nex) {
					if(it.hasNext()) {
						rs = ""+it.next();
					}
				}
			}
			
			if(rs.equals(""))continue;
			long rspt = Long.parseLong(num.substring(0,num.length()-(i+1))+rs);
			if(rspt>n) {
				return rspt;
			}
		}
		return -1;
	}

	public static void permutar(String number,String []dat,
									List<Integer> indices,
									Set<Long> rspt,long n) {
		if(number.length()==dat.length) {
			rspt.add(Long.parseLong(number));
		}else {
			for (int i = 0; i < dat.length; i++) {
				if(!indices.contains(i)) {
					indices.add(i);
					permutar(number + dat[i], dat,indices,rspt,n);
					indices.remove(indices.size()-1);
				}
			}
		}
	}
	
	public static int fibo(int n) {
		if(n==1) {
			return 1;
		}
		return fibo(n-1)+ fibo(n-2);
	}
	
}
