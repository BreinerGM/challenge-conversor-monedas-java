package challenge.datos.com;

public class Conversion {
    private String monedaBase;
    private String monedaDeDestino;
    private float tasaDeConversion;
    private float resultadoConversion;

    public Conversion(String monedaBase, String monedaDeDestino, float tasaDeConversion, float resultadoConversion) {
        this.monedaBase = monedaBase;
        this.monedaDeDestino = monedaDeDestino;
        this.tasaDeConversion = tasaDeConversion;
        this.resultadoConversion = resultadoConversion;
    }

    public Conversion(ConversionER conversion) {
        this.monedaBase = conversion.base_code();
        this.monedaDeDestino = conversion.target_code();
        this.tasaDeConversion = Float.valueOf(conversion.conversion_rate());
        this.resultadoConversion = Float.valueOf(conversion.conversion_result());
    }

    @Override
    public String toString() {
        return "Conversion: " +
                "monedaBase='" + monedaBase + '\'' +
                ", monedaDeDestino='" + monedaDeDestino + '\'' +
                ", tasaDeConversion=" + tasaDeConversion +
                ", resultadoConversion=" + resultadoConversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaDeDestino() {
        return monedaDeDestino;
    }

    public void setMonedaDeDestino(String monedaDeDestino) {
        this.monedaDeDestino = monedaDeDestino;
    }

    public float getTasaDeConversion() {
        return tasaDeConversion;
    }

    public void setTasaDeConversion(float tasaDeConversion) {
        this.tasaDeConversion = tasaDeConversion;
    }

    public float getResultadoConversion() {
        return resultadoConversion;
    }

    public void setResultadoConversion(float resultadoConversion) {
        this.resultadoConversion = resultadoConversion;
    }
}
