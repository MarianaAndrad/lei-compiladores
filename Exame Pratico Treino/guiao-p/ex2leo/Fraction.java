public class Fraction {
    private int num;
    private int den;
    
    public static boolean valid(String frac){
        boolean res= true;

        for(int i=0; i<frac.length(); i++){
            char c= frac.charAt(i);
            res = Character.isDigit(c) || c=='/';
        }
        if (res){
            String[ ] parts = frac.split("/");
            res = parts.length<=2;
        }

        return res;
    }

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int num() {
        return this.num;
    }

    public int den() {
        return this.den;
    }

    public Fraction reduce(){
        int gcd = gcd(this.num, this.den);
        return new Fraction(this.num/gcd, this.den/gcd);
    }

    private int gcd(int a, int b) {
        int res = a;
        if (b !=0)
            res = gcd(b, a % b);
        return res;
    }

    public Fraction(String frac){
        if (valid(frac)){
            String[ ] parts = frac.split("/");
            this.num = Integer.parseInt(parts[0]);
            this.den = parts.length==2 ? Integer.parseInt(parts[1]) : 1;
        }
    }

    public Fraction symmetric(){
        return new Fraction(-this.num, this.den);
    }

    public Fraction mult(Fraction f){
        return new Fraction(this.num * f.num, this.den * f.den);
    }

    public Fraction div(Fraction f){
        return new Fraction(this.num * f.den, this.den * f.num);
    }

    public Fraction add(Fraction f){
        return new Fraction(this.num * f.den + this.den * f.num, this.den * f.den);
    }

    public Fraction sub(Fraction f){
        return new Fraction(this.num * f.den - this.den * f.num, this.den * f.den);
    }

    @Override
    public String toString() {
        return ""+ num +(den == 1? "": "/" +den);
    }
}
