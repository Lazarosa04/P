grammar Numbers;

file: line+ EOF;

line: number '-' WS word (WS word)*;

number: DIGIT+;

word: LETTER+;

WS: [ \t]+ -> skip;

DIGIT: [0-9];

LETTER: [a-zA-Z];