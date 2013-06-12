/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ucebnice;

/**
 *
 * @author matejka
 */
public class Ucebnice 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Karta k1 = new Karta(10,"kule");
    Karta k2 = new Karta(7,"zalud");
    Karta k3 = new Karta(8,"list");
        
    System.out.println("Karta 1, barva " + k1.barva + " hodnota " + k1.hodnota);
    System.out.println("Karta 2, barva " + k2.barva + " hodnota " + k2.hodnota);
    System.out.println("Karta 3, barva " + k3.barva + " hodnota " + k3.hodnota);
    
    Balicek b = new Balicek(k1);
    
    System.out.println("Balicek -> " + b.karty[0].barva + b.karty[0].hodnota);
    
    }
}

class Karta 
{
    int hodnota;
    String barva;
    
    public Karta(int hodnota, String barva)
    {
        this.hodnota = hodnota;
        this.barva =  barva;
    }
}

class Balicek
{
    Karta[] karty;
    static int pocet_karet = 0;
    
    public Balicek(Karta karta)
    {
        karty[pocet_karet] = karta;
        pocet_karet++;
    }
}