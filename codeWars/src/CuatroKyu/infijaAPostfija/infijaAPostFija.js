function toPostfix (exInfija) {
		
		let c;
		
		let stack = [];
		
		let posfija = "";
		
		for (let i = 0; i < exInfija.length; i++) {
			
			c = exInfija.charAt(i);
			
			if(/^([0-9])*$/.test(""+c)) {//si es un dígito
				
				posfija += c;
				
			}else {//de lo contrario
				
				// + - / * ^
				
				if(stack.isEmpty() || c=='(') {
					
					stack.push(""+c);
					
				}else if(c==')'){
					
					//debemos ir desapilando hasta encontrar un 
					//paréntesis que abre.
					
					while(stack.last().localeCompare("(")!=0) {
						
						posfija += stack.pop();
						
					}
					
					stack.pop();//eliminamos ese paréntesis que abre
					
				}else {
					
					//String cima = stack.peek();//observamos el valor de la cima de la pila
					
					let prioridadExp = obtenerPrioridadExpresion(""+c);
					
					//int prioridadPila = obtenerPrioridadPila(cima);
					
					while(!stack.isEmpty() && prioridadExp<=obtenerPrioridadPila(stack.first())) {
						
						posfija+=stack.pop();//sacamos el elemnto de la cima de la píla
					
					}
					
					stack.push(""+c);//metemos a la pila el operador
					
				}
				
			}
			console.log(stack);
		}
		
		while(!stack.isEmpty()) {
			
			posfija+=stack.pop();
			
		}
		
		return posfija;
		
	}

	const obtenerPrioridadExpresion = (valueOf)=> {
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
	
	const obtenerPrioridadPila=(valueOf)=> {
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