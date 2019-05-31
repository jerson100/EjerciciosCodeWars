Cuando asistíamos a la escuela intermedia, se nos pedía que simplificaran expresiones matemáticas como **"3x-yx + 2xy-x"** (o generalmente más grandes), y eso era fácil de usar **("2x + xy")**. ¡Pero díselo a tu pc y ya veremos!

Escriba una función:, simplifyque toma una cadena en la entrada, que representa un polinomio no constante multilineal en coeficientes de enteros (como **"3x-zx+2xy-x"**), y devuelve otra cadena como resultado donde la misma expresión se ha simplificado de la siguiente manera ( ->significa aplicación de simplify):

Se han realizado todas las sumas y restas posibles de monomios equivalentes **("xy == yx")**, por ejemplo:
````
"cb+cba" -> "bc+abc", "2xy-yx" -> "xy","-a+5ab+3a-c-2a" -> "-c+5ab" 
````
Todos los monomios aparecen en orden creciente de variables, por ejemplo:
````
"-abc+3a+2ac" -> "3a+2ac-abc", "xyz-xz" -> "-xz+xyz" 
````
Si dos monomios tienen el mismo número de variables, aparecen en orden lexicográfico , por ejemplo:
````
"a+ca-ab" -> "a-ab+ac", "xzy+zby" ->"byz+xyz" 
````

No hay ningún +signo principal si el primer coeficiente es positivo, por ejemplo:
"-y+x" -> "x-y", pero no hay restricciones para -: "**y-x**" ->"**-x+y**"

NB: para mantenerlo más simple, la cadena de entrada está restringida para representar solo polinomios multilineales no constantes , por lo que no encontrará algo como `-3 + yx ^ 2 '. Medio multilineal en este contexto: de grado 1 en cada variable .

Advertencia : **_la cadena en la entrada puede contener variables arbitrarias representadas por caracteres en minúscula en el alfabeto inglés._**

Buen trabajo :)
