package CuatroKyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PinObservado {
	
	public static void main(String[] args) {
		/*List<String> d = getPINs("11");
		System.out.println(d.toString());*/
	}
	
	public static List<String> getPINs(String observed) {
		List<String> d = new ArrayList<>();
		int k = 0;
		Integer[][] dat = new Integer[observed.length()][];
	  	Integer[][] matriz = new Integer[][] 
	  		{ 
	  			{-1,-1,-1,-1,-1},
	  			{-1,1,2,3,-1}, 
	  			{-1,4,5,6,-1},
	  			{-1,7,8,9,-1},
	  			{-1,-1,0,-1,-1}
	  		};
	  	for (char c : observed.toCharArray()) {
	  		for (int i = 0; i < matriz.length; i++) {
	  			for (int j = 0; j < matriz[i].length; j++) {
	  				if (matriz[i][j] == Integer.parseInt("" + c)) {
	  					dat[k++] = obtenerAdyacentes6(matriz, i, j).
	  										toArray(new Integer[]{});
	  				}
	  			}
	  		}
	  	}
	  	getCode(dat,"",d);
	  	return d;
	}

	public static void getCode(Integer[][] m,
							   String s,
							   List<String> s2) {
		if (m.length==0) {
			s2.add(s);
	  	} else {
	  		for (int i = 0; i < m[0].length; i++) {
	  			getCode(reducir(m, 0), s + m[0][i], s2);
	  		}
	    }
	}

	public static List<Integer> obtenerAdyacentes6(Integer[][] matriz,
	  											   int fila, int columna) {
		List<Integer> list = new ArrayList<>();
		list.add(matriz[fila][columna]);
		if(matriz[fila][columna]==0) {
			list.add(8);
			return list;
		}
	  	if(matriz[fila-1][columna]!=-1) {list.add(matriz[fila-1][columna]);}
	  	if(matriz[fila][columna-1]!=-1) {list.add(matriz[fila][columna-1]);}
	  	if(matriz[fila][columna+1]!=-1) {list.add(matriz[fila][columna+1]);}
	  	if(matriz[fila+1][columna]!=-1) {list.add(matriz[fila+1][columna]);}
	  	Collections.sort(list);
	  	return list;
	 }
	  
	 public static Integer[][] reducir(Integer[][] m, int f) {
	  	Integer[][] m2 = new Integer[m.length - 1][];
	  	int k = 0;
	  	for (int i = 0; i < m.length; i++) {
	  		if (i != f) {
	  			m2[k] = m[i];
	  			k++;
	  		}
	  	}
	  	return m2;
	 }
	
}
