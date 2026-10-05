public class DescuentoEstacional extends  PoliticasDescuento {
    @Override
    public double calcularDescuento(double montoOriginal) {
        double descuento = montoOriginal * 0.15;
        return Math.min(descuento, 50.0);
    }
}

