grammar listNum;

program: (stat? ';')* EOF;

stat: print
    | assignment
    | while_
    ;

print: 'print' expr ('|' expr)* ;

assignment: ID ':=' expr;

//while_: 'while' ID ':'  (stat? ';')* 'endWhile';

while_: 'while' expr ':'  (stat? ';')* 'endWhile';

expr: list                                  #exprlist
    |op=('head'|'tail'|'sum'|'avg') expr    #exprOpcao
    |expr op=('+'|'-') expr                 #exprAddSub
    |'read'                                 #exprRead
    |ID                                     #exprID;


list : '[' ( expr (',' expr)*)? ']'     #listList
        |NUM                            #listNUM
        ;



ID:[a-zA-Z][a-zA-Z0-9]*;
NUM:[0-9]+;
Comment: '#' .*? '\n'->skip;
WS: [ \n\t\r]+->skip;
Error:.;
