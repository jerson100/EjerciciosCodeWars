# Te dan un árbol binario:

```java
public class Node {
  public Node left;
  public Node right;
  public int value;

  public Node(Node l, Node r, int v) {
    left = l;
    right = r;
    value = v;
  }
}
```
Su tarea es devolver la lista con elementos del árbol ordenados por niveles,
lo que significa que el elemento raíz va primero, luego los hijos raíz (de izquierda a derecha)
son el segundo y el tercero, y así sucesivamente.

Devolver la lista vacía es la raíz es 'nula'.

**Ejemplo 1** - siguiente árbol:

                 2
            8        9
          1  3     4   5
          
Debe devolver la siguiente lista:
[2,8,9,1,3,4,5]

**Ejemplo 2** - siguiente árbol:

                 1
            8        4
              3        5
                         7
                         
Debe devolver la siguiente lista:
[1,8,4,3,5,7]
