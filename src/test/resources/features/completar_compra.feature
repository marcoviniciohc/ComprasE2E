# language: es
@Suite @CheckOut

Característica: Completar el formulario de compra
  Yo como analista de negocio necesito Completar el formulario de compra.

  Escenario: Completar el formulario

    Dado que el usuario navega a la página de inicio de sesión
    Cuando ingresa las credenciales de acceso correctas

    Y que el usuario selecciona productos
    Y agrega producto
    Y ver productos
    Y check out
    Y completar formulario
    Y finalizar compra
    Entonces THANK YOU FOR YOUR ORDER


