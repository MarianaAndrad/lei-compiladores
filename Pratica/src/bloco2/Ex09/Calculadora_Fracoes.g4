grammar Calculadora_Fracoes;
    program :
        (assignment |linha)* EOF
    ;

    assignment:
        expr '->' Var ';'           #ExprAtribution
    ;

    linha:
        'print' expr ';' 
    ;
    
    operando:
        Frac                        #ExprFraction //inha expressão é um fracao
        |Var                        #ExprVariable //minha expressão é uma variavel
        |Num                        #ExprNumber //minha expressão é um numero
    ;

    expr:
        op= ('+' | '-') expr        #ExprPosNeg
        |operando                   #ExprOperativo
    ;

    Num:[0-9]+;
    Var:[a-zA-Z_]+;
    Frac:Num '/' Num ;

    WS: [ \t\n\r]+ ->skip; //ignore os espaços, tabs, mudanças de linhas
    COMMENT: '//' .*? '\n'->skip; //comentario avança
    MULTILINECOMMENT: '/*' .*? '*/' -> skip; //comentario multiplo avança
   