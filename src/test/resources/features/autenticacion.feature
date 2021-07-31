#language: es

Característica: Autenticación de usuario en el sitio de sauce demo

  Esquema del escenario: : Autenticacion exitosa
    Dado un usuario en la pagina inicial de souce demo
    Cuando el usuario ingresa un "<usuario>" y "<clave>" correctos
    Entonces se puede autenticar correctamente

    Ejemplos:
      | usuario       | clave        |
      | standard_user | secret_sauce |