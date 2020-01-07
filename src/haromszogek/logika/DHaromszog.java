
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

    public void setaOldal(double aOldal) {
        if(aOldal > 0){
            this.aOldal = aOldal;
        }
    }

    public void setbOldal(double bOldal) {
        if(bOldal >0){
            this.bOldal = bOldal;
        }
    }

    public void setcOldal(double cOldal) {
        if(cOldal > 0){
            this.cOldal = cOldal;
        }
    }
    
    
}
