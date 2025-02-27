grammar Hello;           // Define a grammar called Hello
greetings : 'hello' ID+ |'bye' ID+;  // match keyword hello/bye followed by an identifier
ID : [a-zA-Z]+;          // match lower-case identifiers
WS : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines