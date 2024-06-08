grammar Calculator ;
    program :
        stat* EOF //imprimir o resultado 
        ;
    stat :
        expr? NEWLINE
        ;
    expr :
        op=( '+' | '-') expr #ExprPosNeg
        | expr op=( '*' | '/' | '%' ) expr   #ExprMultDivMod
        | expr op=( '+' | '-' ) expr  #ExprAddSub
        | Integer #ExprInteger
        | '(' expr ')' #ExprParent
        ;



    Integer : [0-9]+; // implement w i t h l o n g i n t e g e r s
    NEWLINE : '\r' ? '\n' ;
    WS: [ \t]+ -> skip ;
    COMMENT: '#' .*? '\n' -> skip ;