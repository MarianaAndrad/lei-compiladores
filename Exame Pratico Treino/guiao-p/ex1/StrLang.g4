grammar StrLang;
    program: stat* EOF; //Zero or more repetitions of stat

    stat: 'print' expr  #StatPrint
        | ID ':' expr  #StatAssign
        ;


    expr:'input' '(' expr ')'       #ExprInput
        |expr '+' expr              #ExprAdd
        |expr '-' expr              #ExprSub
        |'trim' expr                #ExprTrim
        |'firstespace' expr         #ExprEspaco
        |'firstdigito' expr         #ExprDigito
        |'firstletra' expr          #ExprLetra
        |'(' expr ')'               #ExprParen
        | expr '/' expr '/' expr    #exprSubstituir
        |STRING                     #ExprString
        |ID                         #ExprID
     ;

    //Lexical rules
    STRING :'"'.*? '"';
    ID: [a-zA-Z_][a-zA-Z0-9_]*;
    WS: [ \t\n\r]+ -> skip;
    Comment : '//' .*? '\n' ->skip;

