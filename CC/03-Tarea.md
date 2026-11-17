# UD03 — Servicios Cloud: Búsqueda de Thin Client para escritorio virtual

**Asignatura:** Fundamentos de Computación en la Nube  
**Alumno:** Iván Villarrubia Moreno  
**Trabajo:** UD03 — Búsqueda de Thin Client para escritorio virtual

## Índice

- [Enunciado](#enunciado)
- [Introducción](#introducción)
- [1. ¿Qué ha pasado con VMware Horizon?](#1-qué-ha-pasado-con-vmware-horizon)
- [2. Alternativas para realizar la tarea](#2-alternativas-para-realizar-la-tarea)
- [3. Instalación de Omnissa Horizon Client](#3-instalación-de-omnissa-horizon-client)
- [4. Búsqueda de Thin Clients compatibles](#4-búsqueda-de-thin-clients-compatibles)
- [5. Análisis de las características de los dispositivos](#5-análisis-de-las-características-de-los-dispositivos)
  - [5.1. HP t240 Thin Client](#51-hp-t240-thin-client)
  - [5.2. HP t430 Thin Client](#52-hp-t430-thin-client)
  - [5.3. Comparativa del resto de dispositivos](#53-comparativa-del-resto-de-dispositivos)
- [6. Conclusiones](#6-conclusiones)
- [7. Bibliografía](#7-bibliografía)

---

## Enunciado

Tomando como referencia la aplicación guía de VMware https://www.vmware.com/resources/compatibility/search.php?deviceCategory=vdm para la selección de thin client compatibles, debes seleccionar el o los thin client adecuados para evitar que tras una inversión en el software, los dispositivos sean compatibles y no dé problemas de arranque o de integración con la herramienta Horizon.

Los parámetros serán:

- Horizon client versión: Horizon client 5.1.

- OS Versión: HP ThinPro/Smart Zero Core (x64).

- Versión Plataforma: Horizon 7.9.

Debes entregar en un documento las características obtenidas en los dispositivos que presente la aplicación como compatibles con los parámetros seleccionados, si admiten Multi Monitor y redirección de escáner, así como el modelo o modelos exactos y el fabricante.

**NOTA:** Los parámetros se obtienen una vez filtrados los resultados, pulsando sobre el campo modelo, que te llevará a una página donde se indican todos los parámetros disponibles en el thin client.*

## Introducción

Los escritorios virtuales (VDI) permiten trabajar con un sistema operativo y sus aplicaciones desde diferentes equipos, aunque realmente se estén ejecutando en un servidor.

Para acceder a estos escritorios se pueden utilizar dispositivos llamados Thin Client o clientes ligeros, que suelen necesitar menos recursos que un ordenador convencional.

Una de las herramientas para gestionar estos escritorios es **VMware Horizon**. Antes de elegir los dispositivos que vamos a utilizar, es importante comprobar que sean compatibles con la versión del programa y con las funciones que necesitamos.

En esta tarea vamos a buscar diferentes modelos de Thin Client compatibles con **VMware Horizon** y comprobar algunas de sus características.

## 1. ¿Qué ha pasado con VMware Horizon?

Al comenzar la tarea he intentado utilizar la guía de compatibilidad de VMware indicada en el enunciado, pero he encontrado un problema: la versión Horizon 7.9 ya no aparece en la herramienta actual.

Investigando un poco he descubierto que VMware Horizon ha pasado por varios cambios desde que se publicó esa versión.

**Evolución de VMware Horizon**

| Año | Acontecimiento |
|---|---|
| 2019     | Vmware publica Horizon 7.9 junto con Horizon Client 5.1, que son las versiones solicitadas en esta tarea.                                        |
| 2020     | Aparece Horizon 7.13, una de las últimas versiones de la familia Horizon 7.                                                                      |
| 2021     | Finaliza el soporte general de las versiones anteriores de Horizon 7, excepto la rama 7.13.                                                      |
| 2023     | El 30 de abril termina el soporte general de Horizon 7.13.                                                                                       |
| 2024     | La división de informática de usuario final de vmware es adquirida por KKR y pasa a funcionar como empresa independiente bajo el nombre Omnissa. |
| 2025     | El 30 de abril finaliza también la fase de asistencia técnica limitada de Horizon 7.13.                                                          |
| **2026** | La guía actual de Omnissa ya no permite seleccionar Horizon 7.9. La versión más antigua que aparece en sus filtros es **Horizon 7.13**.          |

Por tanto, el principal problema no está en el funcionamiento de la herramienta, sino en que el ejercicio utiliza versiones antiguas que ya no aparecen en la guía actual.

Para poder continuar con la tarea he decidido utilizar una combinación de versiones que sí esté disponible, intentando respetar al máximo los requisitos originales.

![Captura de la tarea](images/image1.png)

## 2. Alternativas para realizar la tarea

Una vez comprobado que no puedo utilizar las versiones originales, he buscado otras combinaciones que permitan realizar el ejercicio.

Primero he intentado utilizar Horizon 2606, una versión reciente que aparece en la guía, pero con los filtros seleccionados no he obtenido dispositivos HP compatibles.

Después he revisado los resultados exportados en formato CSV y he encontrado dos alternativas:

| **Parámetro**       | **Opción A**                     | **Opción B**                     |
|---------------------|----------------------------------|----------------------------------|
| Fabricante          | HP Inc                           | HP Inc                           |
| Plataforma          | Horizon 7.13                     | Horizon 2412                     |
| Horizon Client      | 2006                             | 2412                             |
| Sistema operativo   | HP ThinPro/Smart Zero Core (x64) | HP ThinPro/Smart Zero Core (x64) |
| Modelos encontrados | 11                               | 5                                |

### Alternativa seleccionada

He decidido utilizar la opción A, con Horizon 7.13 y Horizon Client 2006.

Aunque no son exactamente las versiones del enunciado, Horizon 7.13 es la versión más cercana a Horizon 7.9 que aparece en la guía actual.

Además, esta combinación permite mantener el sistema operativo HP ThinPro/Smart Zero Core (x64), que es otro de los requisitos importantes.

Con estos filtros he encontrado once registros de dispositivos que podré analizar para comprobar sus características, especialmente la compatibilidad con varios monitores y la redirección de escáner.

## 3. Instalación de Omnissa Horizon Client

Antes de realizar la búsqueda de dispositivos compatibles, he descargado e instalado Omnissa Horizon Client para macOS (<https://customerconnect.omnissa.com/downloads/info/slug/virtual_desktop_and_apps/omnissa_horizon_clients/8> ), con el objetivo de conocer la aplicación utilizada para conectarse a los escritorios virtuales.

La descarga la he realizado desde la web oficial de Omnissa y posteriormente he instalado la aplicación en mi Mac.

Durante la instalación he realizado varias capturas para documentar el proceso.

Una vez abierta la aplicación, he comprobado que solicita la dirección de un servidor de conexión (Connection Server).

Como no dispongo de un servidor Horizon configurado, no puedo establecer una conexión real, pero sí he podido comprobar cómo se instala y cuál es su función.

Esta instalación no es necesaria para consultar la compatibilidad de los Thin Clients, pero me ha servido para conocer mejor el funcionamiento de Horizon Client.

![Captura de la tarea](images/image2.png)


**Proceso de instalación:**

#### ![Captura de la tarea](images/image3.png)

#### ![Captura de la tarea](images/image4.png)

#### ![Captura de la tarea](images/image5.png)

#### ![Captura de la tarea](images/image6.png)

## 4. Búsqueda de Thin Clients compatibles

Para localizar los dispositivos he utilizado la guía de compatibilidad de Omnissa y aplicado los filtros correspondientes a la alternativa seleccionada anteriormente.

He mantenido el fabricante HP y el sistema operativo solicitado en el ejercicio, utilizando Horizon 7.13 y Horizon Client 2006 como versiones alternativas.

Una vez aplicados los filtros, revisaré los modelos que aparecen en la tabla de resultados y accederé a sus fichas individuales para comprobar las características de cada dispositivo.

**Filtros utilizados**

| Parámetro         | Selección                        |
|-------------------|----------------------------------|
| Fabricante        | HP Inc                           |
| Plataforma        | Horizon 7.13                     |
| Cliente           | Horizon Client 2006              |
| Sistema operativo | HP ThinPro/Smart Zero Core (x64) |


### Modelos encontrados

![Captura de la tarea](images/image7.png)

![Captura de la tarea](images/image8.png)

*Figura 2. Resultados de la búsqueda de dispositivos HP compatibles con Horizon 7.13.*

### Los 11 modelos encontrados

| **N.º** | **Fabricante** | **Modelo**                 |
|---------|----------------|----------------------------|
| **1**   | HP Inc         | HP mt22 Mobile Thin Client |
| **2**   | HP Inc         | HP mt32 Mobile Thin Client |
| **3**   | HP Inc         | HP mt45 Mobile Thin Client |
| **4**   | HP Inc         | HP mt46 Mobile Thin Client |
| **5**   | HP Inc         | HP t240 Thin Client        |
| **6**   | HP Inc         | HP t430 Thin Client        |
| **7**   | HP Inc         | HP t530 Thin Client        |
| **8**   | HP Inc         | HP t540 Thin Client        |
| **9**   | HP Inc         | HP t638 Thin Client        |
| **10**  | HP Inc         | HP t640 Thin Client        |
| **11**  | HP Inc         | HP t740 Thin Client        |

*Los once registros incluyen Horizon 7.13 en las versiones de plataforma compatibles.*

En los siguientes apartados revisaré las características de cada dispositivo, especialmente si admiten varios monitores y la redirección de escáner, tal como solicita el ejercicio.

## 5. Análisis de las características de los dispositivos

Para comprobar las características de los modelos encontrados, he accedido a la opción **«View Features»** que aparece junto a cada dispositivo.

Esta sección muestra las funcionalidades disponibles según el protocolo de conexión utilizado: Blast Extreme, PCoIP y RDP.

He comenzado revisando el modelo HP t240 Thin Client, que utiliza el sistema operativo HP ThinPro/Smart Zero Core (x64).

La herramienta muestra 25 funcionalidades para Blast Extreme, 18 para PCoIP y 6 para RDP.

Para completar el análisis comprobaré especialmente las funciones **Multi Monitor y Scanner Redirection**, que son las solicitadas en el ejercicio.


### 5.1. HP t240 Thin Client

El primer dispositivo que he analizado es el HP t240 Thin Client, fabricado por HP y compatible con el sistema operativo HP ThinPro/Smart Zero Core (x64).

Al consultar su ficha de compatibilidad en Omnissa, aparecen tres protocolos de conexión: Blast Extreme, PCoIP y RDP.

En el protocolo Blast Extreme he comprobado que admite las dos funcionalidades solicitadas en la tarea:

- **Multi Monitor:** permite utilizar varios monitores con un mismo escritorio virtual.  
  ![Captura de la tarea](images/image9.png)

- **Scanner Redirection:** permite acceder desde el escritorio virtual a un escáner conectado al dispositivo local.  
  ![Captura de la tarea](images/image10.png)

Las dos funciones aparecen marcadas como *Supported* (compatible).

También he observado que las características disponibles cambian según el protocolo utilizado, por lo que es importante comprobarlas individualmente.

Por tanto, el HP t240 es uno de los modelos que podemos considerar adecuados para la configuración alternativa seleccionada, utilizando Blast Extreme.  
  
<https://interopmatrix.omnissa.com/Compatibility/thinclients/features/246>

![Captura de la tarea](images/image11.png)


### 5.2. HP t430 Thin Client

El HP t430 Thin Client es otro de los dispositivos encontrados en la guía de compatibilidad de Omnissa.

Según su ficha, utiliza el sistema operativo HP ThinPro/Smart Zero Core (x64) y es compatible con Horizon 7.13 y Horizon Client 2006.

Al consultar las características disponibles, he comprobado que mediante el protocolo Blast Extreme admite tanto Multi Monitor como Scanner Redirection.  
![Captura de la tarea](images/image12.png)

Esto significa que permite utilizar varios monitores con un mismo escritorio virtual y acceder a un escáner conectado al equipo local.

Además, también aparecen otras funciones compatibles, como la redirección de dispositivos USB y de impresoras.

Por tanto, el HP t430 es otro de los modelos que cumple las características solicitadas, utilizando la configuración alternativa seleccionada.

<https://interopmatrix.omnissa.com/Compatibility/thinclients/features/253>  
  
![Captura de la tarea](images/image13.png)


### 5.3. Comparativa del resto de dispositivos

Además de los dos modelos analizados anteriormente, la búsqueda ha devuelto otros nueve dispositivos compatibles con la configuración seleccionada.

Para evitar extender demasiado el documento con información repetitiva, he decidido mostrar sus resultados en una tabla comparativa.

De esta manera se pueden consultar los fabricantes, modelos y las dos características principales solicitadas en el ejercicio: Multi Monitor y Scanner Redirection.

Los dos dispositivos anteriores se han utilizado como ejemplos detallados del procedimiento de comprobación en la guía de Omnissa.

**Tabla de los siguientes modelos:**

| Modelo HP               | Compatible con Horizon | Multi Monitor           | Scanner Redirection     |
|-------------------------|------------------------|-------------------------|-------------------------|
| t240 Thin Client        | ✅                     | ✅                      | ✅                      |
| t430 Thin Client        | ✅                     | ✅                      | ✅                      |
| mt22 Mobile Thin Client | ✅                     | ✅                      | ✅                      |
| mt32 Mobile Thin Client | ✅                     | ✅                      | ✅                      |
| mt45 Mobile Thin Client | ✅                     | Will be updated shortly | Will be updated shortly |
| mt46 Mobile Thin Client | ✅                     | Will be updated shortly | Will be updated shortly |
| t530 Thin Client        | ✅                     | ✅                      | ✅                      |
| t540 Thin Client        | ✅                     | ✅                      | ✅                      |
| t638 Thin Client        | ✅                     | ✅                      | ✅                      |
| t640 Thin Client        | ✅                     | ✅                      | ✅                      |
| t740 Thin Client        | ✅                     | ✅                      | ✅                      |

✅ Compatibilidad confirmada en la configuración analizada.

*Nota: «Will be updated shortly» se conserva tal como figura en el documento original; no indica compatibilidad confirmada para esas dos funciones.*

## 6. Conclusiones

Durante esta tarea he aprendido qué son los Thin Clients y cómo comprobar su compatibilidad con un sistema de escritorios virtuales como VMware Horizon.

La principal dificultad ha sido encontrar las versiones indicadas en el enunciado, ya que la guía original ha cambiado y actualmente pertenece a Omnissa.

Para poder continuar, he utilizado Horizon 7.13 y Horizon Client 2006, manteniendo el sistema operativo HP ThinPro/Smart Zero Core (x64).

Con esta configuración he encontrado 11 modelos de HP compatibles. De ellos, he analizado con más detalle los modelos HP t240 y HP t430, comprobando que ambos admiten Multi Monitor y Scanner Redirection mediante el protocolo Blast Extreme.

**Mi elección sería el HP t430**, ya que cumple las características que necesitábamos comprobar. Aunque el HP t240 también es válido, para decidir definitivamente entre ambos habría que comparar otros aspectos, como el rendimiento, las conexiones disponibles y el precio.

En general, considero importante comprobar estas compatibilidades antes de comprar los equipos, porque evitaríamos posibles problemas de funcionamiento o gastos innecesarios.

También he podido comprobar que en informática las herramientas y versiones cambian con frecuencia, por lo que a veces es necesario buscar alternativas para poder realizar un trabajo.

## 7. Bibliografía

- **CESUR.** Unidad Didáctica 3: Servicios Cloud. Apuntes de la asignatura Fundamentos de Computación en la Nube.

- **CESUR.** Tarea 1 – UD03: Búsqueda de Thin Client para escritorio virtual.

- **Omnissa.** Guía de compatibilidad de Thin Clients. <https://interopmatrix.omnissa.com/Compatibility/thinclients>

- **Omnissa.** Página oficial de Horizon. <https://www.omnissa.com/products/horizon/>

- **HP.** Página oficial de productos y soporte. <https://support.hp.com/es-es>

- **ChatGPT (OpenAI).** Utilizado como apoyo para comprender los conceptos, investigar alternativas y revisar la redacción del documento.
