grammar PreffixCalculator;
program:
    stat * EOF;     //zero or more repetitions of stat
stat:
    expr ? NEWLINE;     //operative EXPR followed by a NEWLINE
expr:
    op = ('*' | '/' | '+' | '-') expr expr  #ExprPreffix
    | Number                                #ExprNumber
    ;
Number: [0-9]+('.'[0-9]+)?;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;