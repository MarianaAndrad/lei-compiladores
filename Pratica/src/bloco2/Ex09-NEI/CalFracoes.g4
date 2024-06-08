grammar CalFracoes ;
    program :
        stat* EOF
        ;
    //aceita expressoes ou atribuições
    stat :
        ((assignment | expressao )';')? (ONELINECOMMENT|NEWLINE)
        ;
    //atribuição de um valor para uma variavel
    assignment: 
        expr '->' ID                                #ExprAtribution
        ; 

    expressao:
        'print' expr;

    expr :
        '(' expr ')' '^' neg= '-' ? Integer         #ExprPotencia
        | '(' expr ')'                              #ExprParent 
        | op=( '+' | '-') expr                      #ExprPosNeg
        | Integer '/' Integer                       #ExprFraction
        | expr op=( '*' | ':' ) expr                #ExprMultDiv
        | expr op=( '+' | '-' ) expr                #ExprAddSub
        
        | 'reduce' expr                             #ExprReducao
        | 'read' STRING                             #ExprRead
        | var                                       #ExprVariable
        ;


    STRING: '"' (. | ESCAPE )*? '"';
    fragment ESCAPE: '\\"' | '\\\\';


    var:(ID | Integer);
    ID:[a-zA-Z_]+;
    Integer : [0-9]+;

    NEWLINE : '\r' ? '\n' ;
    WS: [ \t]+ -> skip ;
    COMMENT: '#' .*? '\n' -> skip ;
    ONELINECOMMENT: '//' .*? '\n';
    MULTILINECOMMENT: '/*' .*? '*/' -> skip;
   