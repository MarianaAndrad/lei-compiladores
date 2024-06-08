grammar FracLang;

main: 
    (stat? ';')* EOF;

stat:
      display
    | assignment
    ;

display:
    'display' expr;

assignment: 
    ID '<=' expr;

expr:
      op=('+'|'-') expr         #ExprUnary
    | expr op=('*'|':') expr    #ExprMultDiv
    | expr op=('+'|'-') expr    #ExprAddSub
    | 'reduce' expr             #ExprReduce 
    | '(' expr ')'              #ExprPar
    | 'read' String             #ExprRead
    | fraction                  #ExprFraction
    | ID                        #ExprID
    ;

fraction: 
    num=Integer ('/' den=Integer)?;

ID: [a-z]+;
Integer: [0-9]+;
String: '"' .*? '"';
WS: [ \n\r\t]+ -> skip; // o + é importante
Comment: '--' .*? '\n' -> skip;
Error: .; 
