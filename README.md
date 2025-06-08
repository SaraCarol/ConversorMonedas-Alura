# 💱 Conversor de Monedas con API para el curso Backend con JAVA de Oracle Next Education y Alura Latam

Este es un proyecto en Java que permite convertir valores entre distintas monedas utilizando la API de [ExchangeRate API](https://app.exchangerate-api.com/). Además, guarda un historial de conversiones realizadas en un archivo `.json`.

## 🚀 Tecnologías utilizadas

- Java 17+
- Maven
- [Gson](https://github.com/google/gson) (para serializar a JSON)
- [HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html) (para hacer peticiones HTTP)
- ExchangeRate API (para obtener tasas de cambio en tiempo real)

## 🧠 Funcionalidades

- Conversión entre las siguientes monedas:
  - USD ↔️ COP
  - EUR ↔️ COP
- Entrada de cantidad a convertir por parte del usuario
- Peticiones a la API para obtener la tasa de cambio actual
- Resultado con formato de dos decimales
- Historial de conversiones guardado opcionalmente en formato JSON

- 
## 📦 Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/conversor-monedas-java.git
   cd conversor-monedas-java
   
2. Asegúrate de tener Java y Maven instalados. Luego, compila el proyecto:
   ```bash
   mvn clean install

3. Ejecuta el programa:
   ```bash
   mvn exec:java -Dexec.mainClass="Main"

4. Interactúa con el menú desde consola:

 🔑 API Key
Este proyecto requiere una API key gratuita de ExchangeRate API.
Colócala en la clase ObtenerTasa.java:
```bash
String API_KEY = "AQUÍ_TU_API_KEY";
```
----
📝 Ejemplo de historial guardado
```bash
[
  {
    "monedaOrigen": "USD",
    "monedaDestino": "COP",
    "cantidad": 100,
    "tasaCambio": 3975.48,
    "resultado": 397548.0
  },
  ...
]

```
✅ Posibles mejoras futuras
- Interfaz gráfica 
- Más monedas disponibles dinámicamente desde la API
- Validaciones de entrada
- Integración de logging con Log4j

👩‍💻 Autora
Sara Carolina Mendoza
💡 Actualmente aprendiendo Java, Spring, React y todo lo que impulse mi crecimiento como desarrolladora.
📍 Bogotá, Colombia
📫 Contacto:
    correo: mendoza.saracarolina@gmail.com
    LinkedIn: https://www.linkedin.com/in/saramendozaremolina/
