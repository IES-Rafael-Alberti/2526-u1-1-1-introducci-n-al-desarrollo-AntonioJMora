[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/F4zkDqTW)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=21094739&assignment_repo_type=AssignmentRepo)
# Práctica 2: Introducción al desarrollo. Ponlo en práctica.

Apoyate en los siguientes recursos para realizar la práctica:

[Descripción de la práctica](https://revilofe.github.io/section3/u01/practica/EDES-U1.-Practica011/)


---

# Ponlo en practica - Evaluable

## Identificación de la Actividad
- **ID de la Actividad:** P1.2
- **Módulo:** EDES
- **Unidad de Trabajo:** P1.2
- **Fecha de Creación:** 15/10/2025
- **Fecha de Entrega:** 16/10/2025
- **Alumno(s):** 
  - **Nombre y Apellidos:** Antonio Jesús Mora Cabeza
  - **Correo electrónico:** nmorcab2106@g.educaand.es
  - **Iniciales del Alumno/Grupo:** AJMC

## Descripción de la Actividad
El objetivo de la actividad es evaluar la relación entre el software y el hardware, clasificar lenguajes de programación y comprender los diferentes procesos de ejecución. Para ello se han creado 3 códigos diferentes en los lenguajes python (programa.py), en c (programa.c) y en el lenguaje de java (programa.java), cada uno con sus imágenes de haber sido ejecutado.

## Instrucciones de Compilación y Ejecución
1. **Requisitos Previos:**
   - Lenguajes utilizados
      - Python 
      - C
      - Java
   - Entorno de desarrollo: Git Bash con el editor de nano (además de un poco de ChatGPT para los códigos de C y de Java porque no tengo ni idea de esos lenguajes.), y también la terminal de Windows ya que Git se quedaba muchas veces pillado para ejecutar el código.
   - Compiladores online, ya que encontré unos que al darle el código me los compilaban sin necesidad de instalarlos.
   - [Entorno de desarrollo o dependencias necesarias]

2. **Pasos para Compilar el Código:**
   ```bash
   - Python: es un lenguaje interpretado, es decir, el codigo fuente es interpretado por un programa llamado intérprete, que lo lee linea a linea y lo ejecuta al instante, sin necesidad de ser compilado.

   - C: es un lenguaje compilado, es decir, el codigo fuente escrito es compilado a un código máquina de una plataforma anets de ser ejecutado. Una vez compilado, se crea un ejecutable que el procesador entiende y ejecuta directamente. Este es más rápido en ejecución ya que el código es traducido en lenguaje máquina. En caso de haber sido ejecutado en un sistema con un compilador (como puede ser GCC) el comando a ejecutar sería: gcc programa.c -o programa

   - Java: Es un lenguaje intermedio, diseñado para ser entendido por humanos, este también debe de ser compilado. En caso de ser en una máquina con un compilador (como JDK), sería: javac programa.java
   ```

3. **Pasos para Ejecutar el Código:**
   ```bash
   - Para python sería python programa.py
   - Para C, en caso de ser en tu propia terminal con un compilador, sería: ./programa
   - Para Java, en caso de ser también en tu propia máquina, sería: java Programa
   ```

4. **Ejecución de Pruebas:**
   ```bash
   He añadido unas capturas donde se ven como se ejecutan.
   ```

## Desarrollo de la Actividad
### Descripción del Desarrollo
Lo que he hecho ha sido crear los programas pedidos en el editor de nano, aunque para los programas de C y de JAVA me he tenido que ayudar de ChatGPT porque no tenia ni idea. La ejecución de los códigos está en las capturas adjuntadas en la tarea.

### Código Fuente
Los archivos se encuentran aquí:
- [programa.py](programa.py)
- [programa.c](programa.c)
- [programa.java](programa.java)

### Ejemplos de Ejecución
Lo que haremos es que en la entrada se pedirán tanto el nombre como la fecha de nacimiento
   - Entrada:
      ¿Cuál es su nombre? Antonio
      ¿Cuál es su año de nacimiento? 2006
Y la salida lo que hará será calcular los años que tiene restandole a 2025 el año en que nació
   - Salida: 
      Hola Antonio, tienes 19 años. Este lenguaje está hecho en el lenguaje de programación: Python.
### Resultados de Pruebas
- Ejecución de Python
[Ejecución de python](Ejecución%20de%20programa%20python.png)
- Ejecución de C 
[Ejecución de c](Ejecución%20de%20programa%20c.png)
- Ejecución de Java 
[Ejecución de java](Ejecución%20de%20programa%20java.png)

## Documentación Adicional
- **Manual de Usuario:** [Enlace a la documentación del usuario, si existe]
- **Autorización de Permisos:** Verificar que el profesor tenga permisos de lectura en el repositorio para revisar el código.

## Conclusiones
Al hacer la practica he visto como trabaja cada cosa, aunque sea más tedioso tener que compilar todo, puede llegar a ser más rápido ya que al ejecutarlo ya sabe lo que tiene que hacer, y no tiene que ir leyendo línea a línea, aunque es más complicado de probar ya que cada vez que lo quieras probar hay que compilarlo, cosa que en lenguajes como python no hace falta hacer.

## Referencias y Fuentes
[Aquí se listarán las fuentes consultadas para el desarrollo de la actividad, tales como documentación oficial, artículos, o cualquier recurso externo relevante.]
- Para cosas de java: [Java](https://revilofe.github.io/section3/u01/teoria/EDES-U1.3.-CodigoIntermedio/)
- Para cosas de Python y C: [Lenguajes](https://revilofe.github.io/section3/u01/teoria/EDES-U1.5.-Lenguajes/#212-lenguajes-interpretados)
- ChatGPT para los lenguajes que no sabía.

### Preguntas para Evaluar cada Criterio de evaluacion

### Notas Adicionales:
1. **Nombres de Archivos y Repositorios:**
   - Asegúrate de que el nombre del archivo o repositorio siga la estructura definida: `XXX-idActividad-Iniciales`.
2. **Permisos:**
   - Verifica que el profesor tenga los permisos necesarios para acceder al repositorio o documento.
3. **Formato:**
   - Si se entrega en formato PDF o Google Docs, asegúrate de cumplir con el mínimo y máximo de folios establecidos.
4. **Compilación y Ejecución:**
   - Detalla claramente cómo compilar y ejecutar el código, incluyendo las instrucciones en el archivo `README.md`.


[def]: Ejecuci