Construya una función que, cuando se le asigne una cadena que contenga una expresión en notación de infijo, devolverá una expresión idéntica en notación de postfijo.

Los operadores utilizados serán +, -, *, /, y ^con reglas de prioridad estándar y asociatividad izquierda de todos los operadores, pero ^.

Los operandos serán enteros de un solo dígito entre 0 y 9, inclusive.

Los paréntesis pueden incluirse en la entrada y se garantiza que están en pares correctos.

````
**toPostfix("2+7*5");** // Should return "275*+"

**toPostfix("3*3/(7+1)");** // Should return "33*71+/"

**toPostfix("5+(6-2)*9+3^(7-1)");** // Should return "562-9*+371-^+"
````

Puede leer más sobre la notación postfix, también llamada notación polaca inversa, aquí: http://en.wikipedia.org/wiki/Reverse_Polish_notation
