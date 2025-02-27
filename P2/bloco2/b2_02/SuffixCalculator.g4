grammar SuffixCalculator;
program:
    stat * EOF;     //zero or more repetitions of stat
stat:
    expr ? NEWLINE;     //operative EXPR followed by a NEWLINE
expr:
    expr expr op = ('*' | '/' | '+' | '-')  #ExprSuffix
    | Number                                #ExprNumber
    ;
Number: [0-9]+('.'[0-9]+)?;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;