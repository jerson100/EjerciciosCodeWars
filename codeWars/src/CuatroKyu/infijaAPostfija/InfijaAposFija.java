package CuatroKyu;

import java.util.Stack;

public class InfijaAposFija {

	public static void main(String[] args) {
		
		String infija = "(5+6)*8-5^(8+5)";
		
		System.out.println(infijaAPostFija(infija));
		
		// 5 6 2 - 9 *
		
		
		// + + 
	}
	
	/**
	 
	 * Este método nos permite pasar de una expresión infija a postfija.
	 * @param exInfija Expresión infija.
	 * @return <b>String</b> Retorna una cadena que es la expresión postFija
	 * @author <p style="text-shadow:0 0 10px red;color:blue;font-size:20px;font-style:italic;text-decoration:underline;">Jerson Ramírez Ortiz<p>
	 
	 */
	
	public static String infijaAPostFija(String exInfija) {
		
		char c;
		
		Stack<String> stack = new Stack<>();
		
		String posfija = "";
		
		for (int i = 0; i < exInfija.length(); i++) {
			
			c = exInfija.charAt(i);
			
			if(Character.isDigit(c)) {//si es un dígito
				
				posfija += c;
				
			}else {//de lo contrario
				
				// + - / * ^
				
				if(stack.isEmpty() || c=='(') {
					
					stack.push(String.valueOf(c));
					
				}else if(c==')'){
					
					//debemos ir desapilando hasta encontrar un 
					//paréntesis que abre.
					
					while(!stack.peek().equals("(")) {
						
						posfija += stack.pop();
						
					}
					
					stack.pop();//eliminamos ese paréntesis que abre
					
				}else {
					
					//String cima = stack.peek();//observamos el valor de la cima de la pila
					
					int prioridadExp = obtenerPrioridadExpresion(String.valueOf(c));
					
					//int prioridadPila = obtenerPrioridadPila(cima);
					
					while(!stack.isEmpty() && prioridadExp<=obtenerPrioridadPila(stack.peek())) {
						
						posfija+=stack.pop();//sacamos el elemnto de la cima de la píla
					
					}
					
					stack.push(String.valueOf(c));//metemos a la pila el operador
					
				}
				
			}
			System.out.println(stack.toString());
		}
		
		while(!stack.isEmpty()) {
			
			posfija+=stack.pop();
			
		}
		
		return posfija;
		
	}

	private static int obtenerPrioridadExpresion(String valueOf) {
		switch(valueOf) {
			case "+":return 1;
			case "-":return 1;
			case "*":return 2;
			case "/":return 2;
			case "^":return 4;
			case "(":return 5;
		}
		return 0;
	}
	
	private static int obtenerPrioridadPila(String valueOf) {
		switch(valueOf) {
			case "+":return 1;
			case "-":return 1;
			case "*":return 2;
			case "/":return 2;
			case "^":return 3;
			case "(":return 0;
		}
		return 0;
	}
	
}
