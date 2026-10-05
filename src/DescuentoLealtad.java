public class DescuentoLealtad extends  PoliticasDescuento {

    @Override
    public double calcularDescuento(double montoOriginal) {
        return montoOriginal * 0.10;
    }
}
