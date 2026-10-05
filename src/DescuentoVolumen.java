public abstract class DescuentoVolumen extends PoliticasDescuento{
    @Override
    public double calcularDescuento(double montoOriginal) {
        if (montoOriginal > 500.0) {
            return montoOriginal * 0.20;
        }
        return 0.0;
    }
}

