
package haromszogek.logika;

public class DHaromszog {
    private double aOldal;
    private double bOldal;
    private double cOldal;
    
    public DHaromszog(String sor, int sorSzama){
    
    }

    public double getaOldal() {
        return this.aOldal;
    }

    public double getbOldal() {
        return this.bOldal;
    }

    public double getcOldal() {
        return this.cOldal;
    }

    public void setaOldal(double aOldal) throws Exception{
        if(aOldal > 0){
            this.aOldal = aOldal;
        }else{
            throw new Exception("A(z) \'a\' oldal nem lehet nulla vagy negatív!");
        }
    }

    public void setbOldal(double bOldal) throws Exception{
        if(bOldal >0){
            this.bOldal = bOldal;
        }else{
            throw new Exception("A(z) \'b\' oldal nem lehet nulla vagy negatív!");
        }
    }

    public void setcOldal(double cOldal) throws Exception{
        if(cOldal > 0){
            this.cOldal = cOldal;
        }else{
            throw new Exception("A(z) \'c\' oldal nem lehet nulla vagy negatív!");
        }
    }
    
    private boolean EllDerekszogu() throws Exception{
        boolean derekszogu = Math.pow(aOldal, 2) + Math.pow(bOldal, 2) == Math.pow(cOldal, 2);
        if (!derekszogu)
        {
            throw new Exception("A háromszög nem derékszögű!");
        }
        return derekszogu;
    }
    
    private boolean EllMegszerkesztheto() throws Exception{
        boolean szerkesztheto = aOldal + bOldal > cOldal;
        if (!szerkesztheto)
        {
            throw new Exception("A háromszöget nem lehet megszerkeszteni!");
        }
        return szerkesztheto;
    }
    
    private boolean EllNovekvoSorrend() throws Exception{
        boolean novekvoSorrend = aOldal < bOldal && bOldal <= cOldal;
        if (!novekvoSorrend)
        {
            throw new Exception("Az adatok nincsenek megfelelő sorrendben!");
        }
        return novekvoSorrend;
    }
    
}
