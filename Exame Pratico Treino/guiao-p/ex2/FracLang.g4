grammar FracLang;
program : (stat? ';')* EOF; //termina em pontos em virgula

stat: 'display' expr    #statDisplay
    |ID '<=' expr       #statAtribuicao
;

expr:
    op=('+'|'-') expr       #exprPosNeg
    |expr op=('*'|':') expr #exprMultDiv
    |expr op=('+'|'-') expr #exprAddSub
    |'reduce' expr          #exprReduce
    |'(' expr ')'           #exprPar
    |'read' STR             #exprStr
    |franction              #exprFranction
    |ID                     #exprID
;

franction : num=INT ('/' den = INT)?;
/* franction :NUM '/' NUM  #francComDen
            |NUM #francSemDen
            ;
            */

INT:[0-9]+;
ID:[a-z]+; //nota 2- variaveis contem apenas minusculas
STR : '"' .*? '"';
Comment: '--' .*? '\n' -> skip;
WS: [ \t\r\n]+ ->skip;
Error: .; //transforma erros lexicos em erros sintaticos