# Conversor de Monedas BigMoney
<h2>Tabla de Contenidos</h2>
<ul>
    <li><a href="#descripción">Descripción</a></li>
    <li><a href="#características">Características</a></li>
    <li><a href="#requisitos-previos">Requisitos Previos</a></li>
    <li><a href="#instalación">Instalación</a></li>
    <li><a href="#estructuradelproyecto">Estructura del Proyecto</a></li>
    <li><a href="#licencia">Licencia</a></li>
    <li><a href="#autores">Autores</a></li>
    <li><a href="#agradecimientos">Agradecimientos</a></li>
</ul>
<h2 id="descripción">Descripción del proyecto</h2>
<p>
  Este proyecto utiliza la API ExchangeRate-API, que proporciona información sobre más de 150 monedas mundiales en circulación. Con esta API, he desarrollado un conversor de monedas que ofrece múltiples opciones, como convertir dólares a pesos colombianos y viceversa. La aplicación es muy ágil y fácil de usar: simplemente se elige la moneda a convertir y se ingresa la cantidad deseada. Además, las conversiones realizadas se guardan en un archivo JSON, lo que facilita al usuario gestionar y almacenar múltiples conversiones de manera eficiente.
</p>
<h2 id="características">Características</h2>
<ul>
    <li>Conversion de multiples monedas propuestos en el menú</li>
    <li>Guardado de conversiones en un JSON</li>
    <li>Historial de conversiones</li>
</ul>
<h2 id="requisitos-previos">Requisitos Previos</h2>
<ul>
    <li>Java 16+</li>
    <li>API Key de ExchangeRate-API</li>
    <li>Gson JAR para manipulación de JSON(En el proyecto se utilizo el gson-2.10.1.jar)</li>
</ul>
<h2 id="instalación">Instalación</h2>
<pre><code># Para clonar el repositorio
git clone https://github.com/BreinerGM/challenge-conversor-monedas-java.git</code></pre>
  
<h2 id="estructuradelproyecto">Estructura Del Proyecto</h2>
<p>
Este proyecto fue desarrollado en IntelliJ IDEA y contiene 5 clases distribuidas en 4 paquetes: challenge.conversor.com, challenge.datos.com, challenge.generador.com y challenge.principal.com.
En challenge.conversor.com se encuentra una clase llamada Conversor, que se encarga de hacer solicitudes a la API y, mediante la librería Gson, retorna una clase Record que almacena los datos de la conversión.
En challenge.datos.com se encuentran un objeto llamado Conversion y una clase record llamada ConversionER. El objeto Conversion se utiliza para registrar la conversión realizada, con atributos como monedaBase o monedaDeDestino. La clase record ConversionER se utiliza en la clase Conversor para tomar los datos obtenidos de la API y transferirlos al objeto Conversion.
En challenge.generador.com se encuentra una clase llamada GeneradorDeArchivo, que sirve para generar un archivo JSON con todas las conversiones realizadas durante la ejecución del programa.
En challenge.principal.com se encuentra una clase llamada Principal, en la cual se desarrolló todo el proceso del menú, la instanciación de las clases y las diferentes operaciones para integrar todas las clases y asegurar su correcto funcionamiento.
</p>

<h2 id="licencia">Licencia</h2>

<pre><code>MIT License

Copyright (c) 2024-2025

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
</code></pre>

<h2 id="autores">Autores</h2>
<ul>
    <li><strong>Breiner Gonzalez Machado</strong> - <a href="https://github.com/BreinerGM">GitHub</a></li>
</ul>

<h2 id="agradecimientos">Agradecimientos</h2>
<p>Quiero expresar mi más profundo agradecimiento a mis padres y a mi hermano, quienes han sido una constante fuente de motivación en mi camino de aprendizaje. Su apoyo incondicional y aliento constante me han impulsado a seguir creciendo y aprendiendo cada día.
También quiero extender mi gratitud a la plataforma Alura Latam, la cual ha sido fundamental en mi desarrollo profesional. Los múltiples cursos ofrecidos por Alura Latam han fortalecido mis conocimientos y habilidades, brindándome las herramientas necesarias para alcanzar mis metas y desafíos en el mundo del desarrollo.
</p>

