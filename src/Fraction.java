public class Fraction{

    int numerateur;
    int denominateur;

    public static Fraction ZERO = new Fraction();
    public static Fraction UN = new Fraction(1);

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur){
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Fraction(){
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public double double_Value(){
        double x = this.numerateur;
        double y = this.denominateur;
        double z = x/y;
        return z;
    }
    //Ajoutez une méthode permettant l'addition de deux fractions (la méthode add prend en paramètre une fraction et retourne la somme de la fraction courante et du paramètre),

    public Fraction add(Fraction f) {
        Fraction n = new Fraction();
        if(f.denominateur == this.denominateur){
            n.numerateur = this.numerateur + f.numerateur;
            n.denominateur = this.denominateur;
            return n;
        }
        n.numerateur = (this.numerateur * f.denominateur) + (f.numerateur * this.denominateur);
        n.denominateur = this.denominateur*f.denominateur;
        return n;
    }

    @Override
    public String toString() {
        return "Je suis une fraction.";
    }
}
