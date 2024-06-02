[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/VHZURYy6)
------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: CifradoCesar
PURPOSE OF PROJECT: Proyecto que define mensajes, como secuencias de 
líneas, todas en formato ASCII, y clases para cifrar y descifrar mensajes
utilizando una variante de Cifrado César con clave múltiple. Este proyecto
es un trabajo práctico de una materia introductoria de algorítmica 
(Introducción a los Algoritmos, UNRC, 2024).
VERSION or DATE: 0.1
HOW TO START THIS PROJECT: -
AUTHORS: N. Aguirre, Nahuel Galeano, Luciano Mattiauda, Angelino Blas, Yair Quiroga, Leila Cerrudo
USER INSTRUCTIONS: -

### MENSAJE ###
- Una vez dentro del proyecto en blueJ utilizaremos la clase
    "Mensaje" en la cual podremos escribir el mensaje que querramos
    cifrar.
- Podemos insertar el mensaje en una linea por defecto o en una 
    linea válida para el mensaje. Ademas de poder borrar lineas y
    saber cuantas lineas o renglones posee nuestro mensaje.
- A su vez contamos con métodos que nos permiten ver si un Mensaje
    es igual a otro y obtener el mensaje de una linea en especifico.

### CODIFICADOR ###
- Como anteriormente se nombra, para cifrar utilizamos un Algoritmo
    de cifrado cesar.
- Lo que necesita es el mensaje que creamos anteriormente.
        !!! Aclaración !!!
    * El mensaje no puede ser vacío.
- Una vez tengamos el mensaje, lo que haremos es crear un codificador. Este codificador lo
    que hará es cifrar el mensaje y nos regresará el mensaje cifrado y además un código con el
    que fue cifrado.
    Ese código es muy importante ya que es la unica manera de luego decodificarlo.
- ¿Que pasa si nos equivocamos con el mensaje o decidimos cambiarlo o editar una linea en
ultima instancia?
    Este no sería un problema ya que este codificador cuenta con métodos los cuales te 
    permiten cambiar el mensaje para volver a codificarlo, obteniendo así un nuevo mensaje
    cifrado además de una nueva clave.

### DECODIFICADOR ###
- Esta clase lo que nos permite es decodifcar un mensaje a través de un código, obteniendo
    asi el mensaje original. Obviamente este código debe ser el que fue proporcionado por
    el codificador.
-¿Como funciona?
    Es muy sencillo, creamos un decodificador y pasamos como argumento un mensaje y el código
    con el que fue cifrado.
- El decodificador solo cuenta con dos métodos, Decodificar mensaje y obtener el mensaje
    decodificado.
- Si ingresamos el código correcto el mensaje volverá a su forma original y podremos saber 
    que hay en su contenido.