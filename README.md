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
- La aplicación de notebooklm con tus apuntes.

### Preguntas para Evaluar cada Criterio de evaluacion
5.1 Criterio de Evaluación 1.a: Relación entre Software y Hardware
   1. Describe cómo el software que has creado se ha relacionado con los componentes físicos del dispositivo (memoria RAM, procesador, periféricos, etc.) durante la ejecución de los tres lenguajes (interpretado, compilado y en máquina virtual).

      Durante la ejecución de un programa, los datos necesarios se cargan en la memoria RAM. El procesador se encarga de leer y ejecutar las instrucciones una por una. Los periféricos, como el teclado o la pantalla permiten la entrada y salida de datos.
      - Python: Es un lenguaje interpretado, la ejecución se hace línea a línea, en tiempo real a través del programa intermedio intérprete. Al no compilarse, el interprete de python se ejecuta en el sistema. El codigo fuente de python se almacena en el disco duro, y para su ejecución el intérprete de python se carga en memoria RAM. El procesador se encarga de ejecutar las instrucciones del intérprete.

      - C: El código C se traduce por un compilador a código ejecutable para la arquitectura de la máquina.El programa final se almacena en el disco duro, cuando el programa se ejecuta, el código ejecutable se almacena en la memoria RAM y el procesador toma esas instrucciones y las ejecuta.

      - Java: Utiliza un enfoque híbrido que depende de la máquina virtual de java. El código fuente de Java se compila al código intermedio bytecode, diseñado para ser ejecutado por una VM. El bytecode se almacena en el disco. La JVM actúa como un intérprete entre el bytecode y el hardware específico. Cuando se ejecuta el programa, JVM se carga en la RAM y el procesador ejecuta las instrucciones de la JVM.

5.2. Criterio de Evaluación 1.c: Diferenciación entre Código Fuente, Código Objeto y Ejecutable
   1. Explica cómo el código fuente que escribiste se transformó en código objeto y ejecutable en el caso de los lenguajes compilados. ¿Generaste archivos intermedios (código objeto)? ¿Qué nombres tomaron estos archivos?
         El proceso comienza con el código fuente, en un lenguaje que no puede ser ejecutado directamente por la máquina ya que el ordenador solo entiende el lenguaje de máquina. El compilador es la herramienta que pasa el código fuente y lo pása a código objeto (que contiene las instrucciones traducidas al lenguaje de mñaquina pero aún está incompleto.). Y una vez que el código objeto ha sido generado, viene el enlazador que es una herramienta que toma los archivos y los une en un solo archivo. El resultado final es el código ejecutable
         Al no haberlo compilado en mi propio ordenador, no sé si se generaron archivos intermedios.
   
   2. Para los lenguajes interpretados, describe cómo el código fuente se ejecutó directamente, sin generar archivos de código objeto o ejecutable.
         Se ejecuta de manera directa a través del intérprete, sin requerir la compilacion  que de el archivo binario o el código objeto. El intérprete procesa el código fuente línea a línea y lo ejecuta al instante.

   3. Para el lenguaje que genera código intermedio (Java, C#), explica cómo el código fuente se transformó en código intermedio (bytecode) y cómo este fue ejecutado por la máquina virtual.
         Genera un código intermedio para lograr la portabilidad y ejecución en diversas plataformas.El código fuente se compila con el compilador de java, creando un código intermedio. El bytecode se almacena en archivos con la extensión .class. Para que el programa se ejecute se requiere la intervención de una VM que actúa de intermediario entre el bytecode y el hardware específico (como JVM)

5.3. Criterio de Evaluación 1.d: Generación de Código Intermedio para Máquinas Virtuales
   1.Describe el proceso de generación de código intermedio (bytecode) en el lenguaje que utilizaste que emplea una máquina virtual (por ejemplo, Java o C#).
         Lo primero es generar el código fuente entendido que es legible para los humanos. Luego se compila, este no genera un código máquina específico para una plataforma, sino que genera el código intermedio. En caso de java ese código es el bytecode y para C# es el CIL.

   2.Explica qué rol juega la máquina virtual en la ejecución del código y cómo difiere de la ejecución directa en un sistema operativo como ocurre con los lenguajes compilados e interpretados.
       Su rol es actuar como mediador entre el código del programa y el hardware. Permite a los lenguajes que usan el código intermedio poder tener portabilidad y seguridad. Los lenguajes compilados utilizan la compilación anticipada para generar código ejecutable directamente, haciendo un código que el procesador ejecuta directamente, sin necesidad de una VM. Además, si un programa C se compila en windows, no podrá ser ejecutado en Linux o Mac, en cambio la VM si.

5.4. Criterio de Evaluación 1.e: Clasificación de Lenguajes de Programación
      1.Clasifica los tres lenguajes utilizados (interpretado, compilado y en máquina virtual) según su:
      - Modo de ejecución (interpretado vs compilado vs máquina virtual).
      - Nivel de abstracción (alto nivel vs bajo nivel).
      - Paradigma de programación (imperativo, orientado a objetos, funcional,...).
         - Python: es un lenguaje interpretado, con un alto nivel de abstracción y soporta múltilples paradigmas (imperativo, orientado a objetos, funcional)
       - C: es un lenguaje compilado (AOT), con un bajo nivel de abstracción y tiene el paradigma de progamación imperativo.
       - Java: es un lenguaje de programación que está compilado a bytecode y ejecutado en la JVM, tiene un alto nivel de abstracción y su paradigma es orientado a objetos.

   2.Explica qué características de estos lenguajes influyeron en su clasificación. Es decir, ahonde en las razones por las que cada lenguaje pertenece a una categoría específica.
   - Python: es interpretado ya que el código se ejecuta línea a línea sin necesidad de ser compilado, eso hace que sea más fácil de probar y depurar pero más lento que los lenguajes compilados. Su nivel de abstracción es alto ya que permite centrarse en la lógica del programa y no en como se manejan los registros. Soporta diferentes metodos de programación, haciendolo flexible para los distintos estilos de desarrollo.
   - C: para ejecutarse necesita que el compilador compile el código fuente en un lenguaje que entienda la máquina, ofreciendo eficacia y velocidad, su nivel de abstracción es bajo ya que se centra en la eficiencia y el control directo del hardware, además, se clasifica como imperativo ya que el programador especifica instrucciones detalladas sobre como el programa debe ehecutar la tareas.
   - Java: se clasifica como un código intermedio ejecutado por una máquina virtual, fue diseñado para lograr la portabilidad entre sistemas. Es de alto nivel de abstracción ya que está diseñado para ser fácil de entender para los humanos. Está orientado a objetos, que son instancias de clases que almacenan datos y comportamientos, es útil cuando se desea modelar elementos en la vida real y es utilizado en el desarrollo empresarial.

5.5. Criterio de Evaluación 1.f: Evaluación de Herramientas Utilizadas en el Desarrollo
   1.Para cada uno de los tres lenguajes (interpretado, compilado y en máquina virtual), describe las herramientas que utilizaste en el proceso de desarrollo:
      - Python:
            - Sistema operativo: Windows
            - Editor de texto o IDE: nano
            - Compilador o intérprete: desde python
            - Depurador: no se ha usado.
            - Sistema de gestión de versiones: git para guardar los cambios
            - Otras herramientas: git bash y el cmd para la ejecución del código.
      - C:
            - Sistema operativo: Windows
            - Editor de texto o IDE: nano
            - Compilador o intérprete: desde compilador online
            - Depurador: no se ha usado.
            - Sistema de gestión de versiones: git para guardar los cambios
            - Otras herramientas: gitbash para el nano
      - Java:
            - Sistema operativo: Windows
            - Editor de texto o IDE: nano
            - Compilador o intérprete: desde compilador online
            - Depurador: no se ha usado.
            - Sistema de gestión de versiones: git para guardar los cambios
            - Otras herramientas: gitbash para el nano

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