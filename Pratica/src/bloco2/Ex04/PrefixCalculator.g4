grammar PrefixCalculator;
    program:
        stat* EOF; //Zero or more repetitions of stat

    stat:
        expr? NEWLINE; //Optative expr
    expr:
        op = ('*'|'/'|'+'|'-') expr expr #ExprPrefix

        |Number #ExprNUmber
        ;

    Number : [0-9]+('.'[0-9]+)?;
    NEWLINE: '\r' ? '\n';
    WS: [ \t]+ ->skip;
