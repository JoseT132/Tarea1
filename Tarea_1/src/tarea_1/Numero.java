package tarea_1;

/**
 *
 * @author angel
 */
public class Numero {

    private String Numero;

    public Numero() {
        this.Numero = "";

    }

    public Numero(String Numero) {
        this.Numero = Numero;

    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getNumero() {
        return Numero;
    }

    @Override
    public String toString() {
        return "Numero = " + Numero;

    }
}
