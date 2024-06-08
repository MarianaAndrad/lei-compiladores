grammar Hello;
    action:(greetings | bye)* EOF;
    greetings : 'hello' ID+;
    bye : 'bye' ID+;
    ID : [A-Za-z]+;
    WS : [ \t\r\n]+ -> skip;

