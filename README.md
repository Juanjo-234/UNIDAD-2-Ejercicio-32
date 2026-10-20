Este programa está diseñado para modelar y calcular de manera flexible diferentes políticas o reglas comerciales de rebajas aplicadas a un importe de compra mediante el uso de polimorfismo, una interfaz común de descuento y una clase calculadora centralizada utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la interfaz PoliticaDescuento: Establece el contrato modular estándar que todas las reglas de bonificación deben cumplir, declarando el método abstracto fundamental double calcularDescuento(double montoOriginal).

Implementa clases concretas (DescuentoLealtad, DescuentoEstacional, DescuentoVolumen): Heredan y ejecutan la interfaz incorporando sus propias fórmulas de cálculo específicas (por ejemplo, 15% fijo por categoría de socio para lealtad, 20% con tope máximo de rebaja por temporada festiva, o descuentos escalonados basados en el volumen de unidades adquiridas).

Diseña la clase CalculadoraPrecios: Actúa como el orquestador que mantiene una referencia a la interfaz abstracta de la política, permitiendo calcular el monto final a pagar y cambiar de estrategia comercial de forma dinámica.

Ejecuta la prueba polimórfica (main): Instancia un monto de compra base, aplica de manera sucesiva las diferentes políticas de descuento a través de la calculadora y muestra por consola el desglose detallado de los ahorros y los totales resultantes.
