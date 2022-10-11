package comunicacion;

import java.util.Arrays;

public class Alfabeto extends Pictograma {

    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        String str = Arrays.asList(letras).stream().reduce("",(partialString, letter) -> partialString + letter + ", ");
        return str.substring(0,str.length()-2);
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}