# Proyecto de Conversión de Monedas

Este proyecto es una aplicación en Java que permite convertir diferentes monedas a dólares estadounidenses (USD) utilizando una API de tipo `Exchange Rate API`. La aplicación se ejecuta en la consola y permite al usuario seleccionar entre varias monedas para realizar la conversión.

## Estructura del Proyecto

El proyecto consta de los siguientes archivos principales:

- `Convertidor.java`: Define un registro (`record`) que almacena la moneda y la cantidad convertida.
- `Main.java`: Contiene el punto de entrada de la aplicación. Permite al usuario seleccionar la moneda y la cantidad a convertir, y muestra el resultado de la conversión.
- `ConsultaConversion.java`: Se encarga de realizar la consulta a la API de conversión de monedas y devolver el resultado de la conversión.

## Funcionamiento

1. El usuario ejecuta la aplicación y se le presenta un menú para seleccionar la moneda que desea convertir a dólares.
2. El usuario ingresa la cantidad de la moneda seleccionada.
3. La aplicación realiza una consulta a la API de `Exchange Rate API` para obtener la tasa de conversión y calcula la cantidad en dólares.
4. El resultado de la conversión se muestra en la consola.

## Dependencias

- `Gson`: Utilizado para parsear las respuestas JSON de la API.
- `HttpClient`: Utilizado para realizar las solicitudes HTTP a la API de conversión de monedas.

## Ejecución

Para ejecutar la aplicación, compile los archivos `.java` y ejecute el archivo `Main.java`. Siga las instrucciones en la consola para seleccionar la moneda y la cantidad a convertir.

## API Utilizada

La aplicación utiliza la API de `Exchange Rate API` para obtener las tasas de conversión. La URL de la API se construye dinámicamente en el archivo `ConsultaConversion.java` utilizando el código de la moneda y la cantidad a convertir.

## Manejo de Errores

La aplicación maneja posibles errores durante la conversión, como entradas inválidas del usuario o problemas de conexión con la API, mostrando mensajes de error apropiados en la consola.