grammar Calculator ;
    program :
        stat* EOF //imprimir o resultado 
        ;
    stat :
        (assignment | expr)? NEWLINE
        ;
    assignment: 
        ID '=' expr   #ExprAtribution
        ; 
    expr :
        op=( '+' | '-') expr #ExprPosNeg
        | expr op=( '*' | '/' | '%' ) expr   #ExprMultDivMod
        | expr op=( '+' | '-' ) expr  #ExprAddSub
        | '(' expr ')' #ExprParent        
        | var #ExprInteger
        ;

    var:(ID | Integer);
    ID:[a-zA-Z_]+;
    Integer : [0-9]+; // implement w i t h l o n g i n t e g e r s
    NEWLINE : '\r' ? '\n' ;
    WS: [ \t]+ -> skip ;
    COMMENT: '#' .*? '\n' -> skip ;
    
