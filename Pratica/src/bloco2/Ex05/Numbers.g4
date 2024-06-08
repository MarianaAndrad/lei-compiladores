grammar Numbers;
    file: 
        line* EOF;
    line: 
        NUMBER '-' WORD NEWLINE;

    NUMBER : [0-9]+;
    WORD: [a-z]+;
    NEWLINE: '\r' ? '\n';
    WS: [ \t]+ ->skip;