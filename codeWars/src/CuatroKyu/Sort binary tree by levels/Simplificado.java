package CuatroKyu;

import java.util.Arrays;

public class Simplificado {
	
	static class Monomio implements Comparable<Monomio>{		
		private String signo;
		private int coeficiente;
		private String variable;
		
		public Monomio(String signo,int coeficiente,String variable) {
			this.signo = signo;
			this.coeficiente = coeficiente;
			this.variable = Monomio.order(variable);
		}
		
		public Monomio() {}
		
		private static String order(String monomio) {
			String aux = "",rspt = "";
			String dat[] = monomio.split("");
			for (int i = 0; i < dat.length; i++) {
				for (int j = i+1; j < dat.length; j++) {
					if(dat[i].compareTo(dat[j])>0) {
						aux = dat[j];
						dat[j] = dat[i];
						dat[i] = aux;
					}
				}
				rspt+= dat[i];
			}
			return rspt;
		}
		
		public Monomio sumar(Monomio m) {
			Monomio mR = new Monomio();
			int coeficiente = Integer.parseInt(m.signo+""+m.coeficiente) +
							  Integer.parseInt(this.signo+""+this.coeficiente);
			String signo  = "+",variable = m.variable;
			if(coeficiente==0) {
				variable = "";
			}else if(coeficiente>0){
				signo = "+";
			}else {
				signo = "-";
			}
			mR.signo = signo;
			mR.coeficiente = Integer
							.parseInt(String
							.valueOf(coeficiente)
							.replaceAll("\\+|\\-",""));
			mR.variable = variable;
			return mR;
		}
		
		@Override
		public int compareTo(Monomio o) {
			if(o.variable.length()>variable.length()) {
				return -1;
			}
			return variable.compareTo(o.variable);
		}
		
		public String toString() {
			return signo+(coeficiente==1?"":coeficiente)+variable;
		}
		
	}
	
	public static String simplify(String polinomio){
		
		int longitud = polinomio.replaceAll("(?=[\\+|\\-])"," ")
															.trim()
															.split(" ")
															.length;
		String var="",coe="",signo="",rspt="";
		char c;
		Monomio []monomios = new Monomio[longitud];
		int fil = 0;
		for (int i = 0; i < polinomio.length(); i++) {
			c = polinomio.charAt(i);
			if(Character.isDigit(c)) {
				coe+=c;
			}else if(c=='-'||c=='+'){
				if(i!=0) {
					Monomio m = new Monomio((signo.equals("")?"+":signo),
							((coe.equals(""))?1:Integer.parseInt(coe)), var);
					monomios[fil] = m;
					fil++;
				}
				signo = ""+c;
				var = "";
				coe = "";
			}else {
				var+= c;
				if(i==polinomio.length()-1) {
					Monomio m = new Monomio((signo.equals("")?"+":signo),
							(coe.equals(""))?1:Integer.parseInt(coe), var);
					monomios[fil] = m;
					fil++;
				}
			}
		}
		Arrays.sort(monomios);
		for (int i = 0; i < monomios.length; i++) {
			if(monomios[i]==null) continue;
			for (int j = i+1; j < monomios.length; j++) {
				if(monomios[j]!=null) {
					if(monomios[i].variable.equals(monomios[j].variable)) {
						Monomio m = monomios[i].sumar(monomios[j]);
						if(m.variable.equals("")) {
							monomios[i] = null;
							monomios[j] = null;
							break;
						}else {
							monomios[i] = m;
							monomios[j] = null;
						}
					}
				}
			}
			if(monomios[i]!=null) {
				rspt += monomios[i];
			}
		}
		return rspt.replaceAll("^[\\+\\|-]", "");
	}
	
}
