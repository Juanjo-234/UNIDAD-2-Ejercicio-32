public class CalculadoraPrecios {
    PoliticasDescuento politicasDescuento;

    public CalculadoraPrecios(PoliticasDescuento politicasDescuento){
        this.politicasDescuento = politicasDescuento;
    }

    public void setPoliticasDescuento(PoliticasDescuento politicasDescuento) {
        this.politicasDescuento = politicasDescuento;
    }

    void procesarCompra(double montoOriginal){
        double descuento = politicasDescuento.calcularDescuento(montoOriginal);
        double totalFinal = montoOriginal - descuento;

        System.out.println("--- Desglose de Compra ---");
        System.out.println("Monto Original: $" + montoOriginal);
        System.out.println("Política aplicada: " + politicasDescuento.getClass().getSimpleName());
        System.out.println("Ahorro obtenido: $" + descuento);
        System.out.println("Total a Pagar:  $" + totalFinal);
        System.out.println("--------------------------\n");
    }
}



