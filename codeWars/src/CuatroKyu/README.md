Construct a function that, when given a string containing an expression in infix notation, will return an identical expression in postfix notation.

The operators used will be +, -, *, /, and ^ with standard precedence rules and left-associativity of all operators but ^.

The operands will be single-digit integers between 0 and 9, inclusive.

Parentheses may be included in the input, and are guaranteed to be in correct pairs.
````
**toPostfix("2+7*5");** // Should return "275*+"

**toPostfix("3*3/(7+1)");** // Should return "33*71+/"

**toPostfix("5+(6-2)*9+3^(7-1)");** // Should return "562-9*+371-^+"
````
You may read more about postfix notation, also called Reverse Polish notation, here: http://en.wikipedia.org/wiki/Reverse_Polish_notation
