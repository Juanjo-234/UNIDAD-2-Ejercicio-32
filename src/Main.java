//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
CalculadoraPrecios calculadoraPrecios = new CalculadoraPrecios(new DescuentoLealtad());
calculadoraPrecios.procesarCompra(1000);

calculadoraPrecios.setPoliticasDescuento(new DescuentoEstacional());
calculadoraPrecios.procesarCompra(1000);

calculadoraPrecios.setPoliticasDescuento(new DescuentoVolumen() {
    @Override
    public double calcularDescuento(double montoOriginal) {
        return super.calcularDescuento(montoOriginal);
    }
});
calculadoraPrecios.procesarCompra(1000);
}


