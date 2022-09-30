import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Main {

    public static void main(String[] args){
        Fraction f = new Fraction(2,3);
        assert f.numerateur == 1 : "1";

        assert f.double_Value() < 1 : "2/3 < 1";
        System.out.println(f.double_Value());

        Fraction m = new Fraction(1,5);
        Fraction n = new Fraction(2,4);
        assert m.add(n).double_Value() < 1: "Erreur Addition";
        Fraction o = m.add(n);
        System.out.println(o.numerateur + "/" + o.denominateur);
    }

    @Test
    public void initialisation(){
        Fraction i = new Fraction();
        assertEquals(i.getNumerateur(),0);
        assertEquals(i.getDenominateur(),1);
    }

    @Test
    public void zero_un(){
        Fraction z = Fraction.ZERO;
        assertEquals(z.getNumerateur(),0);
    }

}
