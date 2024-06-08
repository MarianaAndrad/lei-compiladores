import javax.print.DocFlavor.INPUT_STREAM;

public class Fraction {

    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        assert denominator >= 0; //denominador nao pode ser negativa
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override 
    public String toString(){
        return ""+ numerator + (denominator == 1 ? "" : "/" + denominator);
    }

    public Fraction simetrico(){
        return new Fraction(-numerator, denominator);
    }

    public Fraction Mult(Fraction other){
        return new Fraction(numerator * other.numerator, denominator * other.denominator);
    }

    public Fraction Div(Fraction other){
        return new Fraction(numerator * other.denominator, denominator *other.numerator);
    }

    public Fraction SUM(Fraction other){
        return new Fraction(numerator * other.denominator + denominator * other.numerator, denominator *other.denominator);
    }

    public Fraction SUB(Fraction other){
        return new Fraction(numerator * other.denominator - denominator * other.numerator, denominator *other.denominator);
    }

    public Fraction(String frac){
        assert frac != null;
        assert valid(frac);

        String[] parts = frac.split("/");
        numerator = Integer.parseInt(parts[0]);
        denominator = parts.length==2 ? Integer.parseInt(parts[1]) : 1;
    }

    public static boolean valid(String frac){
        assert frac != null;

        boolean res = true;
        for (int i = 0; res && i<frac.length();i++){
            char c = frac.charAt(i);
            res = Character.isDigit(c) || c == '/';
        }
        if(res){
            int parts = frac.split("/").length;
            res = (parts >= 1 && parts<=2);
        }
        return res;
    }

    public static int mdc(int a, int b){
        int res = a;
        if (b!=0){
            res = mdc(b, a%b);
        }
        return res;
    }

    public Fraction reduce(){
        int mdc =mdc(numerator, denominator);
        return new Fraction(numerator/mdc , denominator/mdc);    
    }

}
