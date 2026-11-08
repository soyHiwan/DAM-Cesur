# Tarea 02: Instalación de un sistema operativo en una máquina virtual

**Asignatura:** Sistemas Informáticos  
**Autor:** Iván Villarrubia Moreno

## Índice

- [Enunciado](#enunciado)
- [Introducción](#introducción)
- [1. Instalación del software de virtualización](#1-instalación-del-software-de-virtualización)
- [2. Instalación de Debian en una máquina virtual](#2-instalación-de-debian-en-una-máquina-virtual)
- [3. Alternativas de virtualización](#3-alternativas-de-virtualización)
- [Conclusiones](#conclusiones)
- [Bibliografía y recursos consultados](#bibliografía-y-recursos-consultados)

## Enunciado

Enunciado: Trabajas como responsable de informática en una multinacional. Tu tarea principal es dar soporte y actualizar los equipos informáticos de la sucursal en la que trabajas, la cual cuenta con más de 100

trabajadores.

La empresa siempre ha trabajado con sistemas operativos Windows en sus equipos, pero se están planteando migrar alguno de ellos a Linux. Antes de hacerlo, quieren probar varias distribuciones para ver

cuál resulta más cómoda para trabajar. Te encargarás de llevar a cabo esta tarea, y testear previamente

para comprobar si es viable ese cambio.

Cuestiones para resolver

1. Debes instalar en un equipo un software de virtualización. Para ello, puedes usar VirtualBox.

## 2. Instalación de Debian en una máquina virtual

Sobre una máquina virtual, instala la versión más moderna de la distribución Debian de Linux.

Realiza capturas de pantalla del proceso y de los pasos más destacados de la instalación, e

indica si ha surgido algún problema a lo largo de la instalación.

3. Investiga y analiza otras alternativas de software de virtualización, indicando las principales

características de cada una de ellas.

## Introducción

La empresa está valorando instalar Linux en algunos ordenadores de la sucursal, que actualmente utilizan Windows. Antes de realizar el cambio, se llevará a cabo una primera prueba instalando Debian en una máquina virtual. Esto permitirá conocer su funcionamiento, familiarizarse con su entorno y realizar comprobaciones básicas sin sustituir el sistema operativo habitual.

La práctica se realizará en un Mac con procesador Apple M1 Max, por lo que se utilizará Debian para arquitectura ARM64. Esta prueba no reproduce necesariamente las características de los equipos de la sucursal ni garantiza su compatibilidad, ya que la máquina virtual utiliza dispositivos virtuales.

Para valorar una migración real, sería necesario conocer el hardware de esos ordenadores y comprobar las aplicaciones y los periféricos que necesitan los trabajadores. Por tanto, esta instalación se plantea como una evaluación inicial, que debería completarse con una prueba piloto en un equipo representativo de la sucursal.

## 1. Instalación del software de virtualización

Se usará el software recomendado por el enunciado, VirtualBox, ya que es válido tanto para Windows como para mac, y en este caso el sistema operativo desde el que trabajo es macOS.

### 1.1. Descarga e instalación de VirtualBox

La url desde donde podemos descargarnos el programa es: https://www.virtualbox.org/, según nuestro sistema operativo base: MacOs / Apple Silicon hosts.

![Captura 01](images/captura-01.png)

A continuación, mostramos una serie de capturas del proceso de instalación:

a. Descarga e instalación e inicio de la app de instalación:

![Captura 02](images/captura-02.png)

b.  Inicio instalación:

![Captura 03](images/captura-03.png)

c. instalación:

![Captura 04](images/captura-04.png)

d. finalización:

![Captura 05](images/captura-05.png)

## 2. Instalación de Debian en una máquina virtual

Sobre una máquina virtual, instala la versión más moderna de la distribución Debian de Linux. Realiza capturas de pantalla del proceso y de los pasos más destacados de la instalación, e indica si ha surgido algún problema a lo largo de la instalación.

A continuación se irá mostrando el proceso que se ha llevado, mediante capturas de pantalla:

### 2.1. Descarga de Debian y creación de la máquina virtual

a. Se ha descargado la imagen del sistema operativo Linux Debian 13 ARM64, desde el enlace: https://www.debian.org/releases/stable/, https://www.debian.org/distrib/netinst

![Captura 06](images/captura-06.png)

b. Se ha abierto VirtualBox y comprobamos que el programa funciona sin ningún error ni impedimento. Procedemos a crear la máquina virtual:

b.1. Proceso:

1. Se pulsa Nueva.

![Captura 07](images/captura-07.png)

2. Se escribe Debian-DAM-UD2 y selecciona la ISO de Debian.

![Captura 08](images/captura-08.png)

3. Se asigna 8192 MB de RAM, equivalentes a 8 GB y 4 procesadores virtuales.

![Captura 09](images/captura-09.png)

4. Crea un disco virtual nuevo de 40 GB.

![Captura 10](images/captura-10.png)

5. Finaliza la creación.

![Captura 11](images/captura-11.png)

### 2.2. Inicio de la máquina e incidencias encontradas

a. damos a iniciar y nos saltan mensajes de accesos de mac para el uso del programa La solución es ir a la configuración de macOS y dar los privilegios adecuados a VirtualBox

![Captura 12](images/captura-12.png)

Errores que han surgido:

- Selección de una imagen ISO de arquitectura incorrecta: Al iniciar la máquina virtual apareció el mensaje «No bootable option or device was found». Al revisar la configuración, se identificó que la imagen seleccionada correspondía a AMD64, mientras que la máquina virtual estaba configurada para ARM64. Para corregirlo, se sustituyó la ISO por la imagen de Debian ARM64. 

- **Ausencia de unidad óptica virtual:** al iniciar la máquina apareció el mensaje «No bootable option or device was found». Al revisar el almacenamiento, se comprobó que únicamente estaba conectado el disco duro virtual, todavía sin sistema operativo, y que faltaba la unidad óptica desde la que cargar el instalador. Se solucionó añadiendo una unidad óptica al controlador VirtioSCSI y se conectó la imagen ISO de Debian ARM64. Después de guardar los cambios y reiniciar la máquina, apareció el menú de instalación de Debian, confirmando que el problema estaba resuelto.

![Captura 13](images/captura-13.png)

### 2.3. Instalación y configuración de Debian

Tras solucionar los errores, podemos iniciar la instalación mediante “Graphical install”

![Captura 14](images/captura-14.png)

![Captura 15](images/captura-15.png)

![Captura 16](images/captura-16.png)

![Captura 17](images/captura-17.png)

![Captura 18](images/captura-18.png)

Se ha dejado el nombre de dominio vacío, ya que la máquina virtual se utilizará como equipo de pruebas y no se integrará en un dominio corporativo.

![Captura 19](images/captura-19.png)

Se ha dejado vacía la contraseña de root para deshabilitar su acceso directo mediante contraseña. La administración se realizará desde el usuario inicial mediante sudo.

![Captura 20](images/captura-20.png)

Se ha creado una cuenta personal con el nombre de usuario «ivan» para utilizar el sistema y realizar tareas administrativas mediante sudo.

Se muestran los pasos principales de la instalación, omitiendo las pantallas repetitivas para facilitar el seguimiento del proceso.

### 2.4. Particionado y selección de programas

![Captura 21](images/captura-21.png)

Se ha seleccionado el particionado guiado para distribuir automáticamente el espacio del disco virtual. Se utilizará una partición independiente para /home, separando los archivos personales de los archivos del sistema.

![Captura 22](images/captura-22.png)

Se ha seleccionado Xfce como entorno de escritorio por su sencillez y consumo moderado de recursos, junto con las utilidades estándar del sistema. No se han instalado servicios web ni SSH, al no ser necesarios para las pruebas previstas.

![Captura 23](images/captura-23.png)

### 2.5. Finalización y primer inicio

![Captura 24](images/captura-24.png)

![Captura 25](images/captura-25.png)

![Captura 26](images/captura-26.png)

La instalación ha finalizado correctamente y se ha iniciado sesión en Debian con el entorno gráfico Xfce. Se comprueba así que el sistema operativo arranca desde el disco virtual y permite acceder al escritorio.

## 3. Alternativas de virtualización

Además de VirtualBox, existen otras herramientas que permiten crear máquinas virtuales. Se han seleccionado tres alternativas para comparar sus características y su utilidad tanto en el Mac empleado en esta práctica como en los equipos Windows de la sucursal.

| Herramienta | Características principales | Ventaja | Limitación | URL |
|---|---|---|---|---|
| UTM | Herramienta de código abierto para Mac, basada en QEMU. Permite virtualizar sistemas compatibles y emular otras arquitecturas. | Flexibilidad para probar distintos sistemas y arquitecturas. | La emulación de una arquitectura diferente suele ofrecer menor rendimiento que la virtualización. | [Web oficial](https://getutm.app/) |
| Parallels Desktop | Solución comercial para Mac que permite ejecutar sistemas como Windows y Linux, según su compatibilidad. | Orientación a la facilidad de uso y la integración con macOS. | Requiere una licencia comercial y comprobar la compatibilidad del sistema invitado. | [Web oficial](https://www.parallels.com/products/desktop/) |
| Hyper-V | Tecnología de virtualización de Microsoft disponible en Windows Server y ediciones compatibles de Windows, como Pro y Enterprise. | Permite evaluar Linux en los equipos Windows de la empresa que cumplan sus requisitos. | No está disponible en Windows Home ni se instala directamente en macOS. | [Documentación oficial](https://learn.microsoft.com/es-es/windows-server/virtualization/hyper-v/overview) |

### Imagen de referencia: UTM

![Captura 27](images/captura-27.png)

### Imagen de referencia: Parallels Desktop

![Captura 28](images/captura-28.png)

### Imagen de referencia: Hyper-V

![Captura 29](images/captura-29.png)

## Conclusiones

La práctica ha permitido instalar y arrancar Debian ARM64 en una máquina virtual con VirtualBox, manteniendo macOS como sistema anfitrión. Durante la instalación de Debian aparecieron opciones que desconocía y en algunos pasos me sentí inseguro al continuar. Trabajar con una máquina virtual me ha permitido probar sin sustituir mi sistema habitual y entender mejor las decisiones de instalación.

La virtualización resulta útil para conocer Debian y realizar pruebas antes de plantear una migración. Sin embargo, su funcionamiento en este entorno no garantiza la compatibilidad con los ordenadores de la sucursal. Para valorar el cambio sería necesario comprobar su hardware, las aplicaciones corporativas y los periféricos, y realizar una prueba piloto en un equipo representativo.

La comparación con UTM, Parallels Desktop e Hyper-V muestra que existen alternativas cuya elección dependerá del sistema anfitrión, las necesidades de administración y el presupuesto disponible.

He de admitirá que a la hora de la instalación de debian se nos ha pedido ciertos datos o la selección de cierta configuración que desconocíamos y me he sentido inseguros a la hora de avanzar. Lo bueno que tiene es que se puede hacer más instalaciones por lo que podemos ir haciendo prueba/error y ver cuál es la mejor configuración.

## Bibliografía y recursos consultados


- CESUR. Unidad didáctica 2: Instalación de sistemas operativos. Material docente de Sistemas Informáticos. 
- Proyecto Debian. Guía de instalación de Debian para ARM64. https://www.debian.org/releases/stable/arm64/ 
- Oracle. VirtualBox: descargas y documentación. https://www.virtualbox.org/wiki/Downloads https://www.virtualbox.org/wiki/Documentation 
- UTM. Características y documentación oficial. https://getutm.app/ https://docs.getutm.app/ 
- Parallels. Parallels Desktop para Mac. https://www.parallels.com/products/desktop/ 
- Microsoft Learn. Información general sobre Hyper-V. https://learn.microsoft.com/es-es/windows-server/virtualization/hyper-v/overview 
- Microsoft Learn. Uso de puntos de control en Hyper-V. Fuente de la captura incluida. https://learn.microsoft.com/en-us/windows-server/virtualization/hyper-v/checkpoints 
- OpenAI. ChatGPT. Utilizado como apoyo para comprender el enunciado, organizar el trabajo, interpretar los errores de instalación y revisar la redacción. La instalación y las capturas de la práctica se realizaron personalmente. https://chatgpt.com/
