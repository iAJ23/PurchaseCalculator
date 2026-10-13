# Purchase Calculator

## Descripción
Aplicación en Java que calcula el subtotal de una compra, valida los datos, aplica descuentos y obtiene el precio final.

## Requisitos
- Java 21
- IntelliJ IDEA
- JUnit 5
- No utiliza Maven ni Gradle.

## Métodos implementados
- `calculateSubtotal(price, quantity)`: calcula precio por cantidad.
- `isValidPurchase(price, quantity)`: valida que ambos valores sean mayores que cero.
- `calculateDiscount(subtotal)`: aplica un descuento del 10% cuando el subtotal es igual o superior a 1000.
- `calculateFinalPrice(subtotal)`: resta el descuento al subtotal.

## Pruebas
Se implementaron 13 pruebas unitarias para comprobar los cálculos, la validación de compras, los límites del descuento y el precio final.

**Resultado:** 13 pruebas pasadas.

## Reflexión
Las pruebas unitarias permiten detectar errores en la lógica del programa. Por ejemplo, probar un subtotal de exactamente 1000 permite comprobar que el descuento se aplique en el límite establecido. Si ese caso fallara, el cliente podría recibir un precio final incorrecto.
