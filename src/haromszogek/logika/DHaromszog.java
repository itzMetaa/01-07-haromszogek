
package haromszogek.logika;

public class DHaromszog {
    private double aOldal;
    private double bOldal;
    private double cOldal;
    private int sorSzama;
    
    public DHaromszog(String sor, int sorSzama) throws Exception{
        this.setSorSzama(sorSzama);
        
        String[] adatok = sor.replace(',', '.').split(" ");
        
        this.setaOldal(Double.parseDouble(adatok[0]));
        this.setbOldal(Double.parseDouble(adatok[1]));
        this.setcOldal(Double.parseDouble(adatok[2]));
        
        this.EllNovekvoSorrend();
        this.EllMegszerkesztheto();
        this.EllDerekszogu();
    }

    public int getSorSzama() {
        return sorSzama;
    }

    public void setSorSzama(int sorSzama) {
        this.sorSzama = sorSzama;
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
            throw new Exception(
                    String.format("%d. sor: A háromszög nem derékszögű!", this.getSorSzama())
            );
        }
        return derekszogu;
    }
    
    private boolean EllMegszerkesztheto() throws Exception{
        boolean szerkesztheto = aOldal + bOldal > cOldal;
        if (!szerkesztheto)
        {
            throw new Exception(
                    String.format("%d. sor: A háromszöget nem lehet megszerkeszteni", this.getSorSzama())
            );
        }
        return szerkesztheto;
    }
    
    private boolean EllNovekvoSorrend() throws Exception{
        boolean novekvoSorrend = aOldal < bOldal && bOldal <= cOldal;
        if (!novekvoSorrend)
        {
            throw new Exception(
                    String.format("%d. sor: Az adatok nincsenek megfelelő sorrendben!", this.getSorSzama())
            );
        }
        return novekvoSorrend;
    }
    
    public double kerulet(){
        return this.aOldal + this.bOldal + this.cOldal;
    }
    
    public double terulet(){
        return this.aOldal*this.bOldal/2;
    }
    
    @Override
    public String toString(){
        return String.format("%d. sor: a=%f b=%f c=%f",
                this.sorSzama,
                this.aOldal,
                this.bOldal,
                this.cOldal);
    }
    
}
