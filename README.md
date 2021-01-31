# INTRODUCTION TO COMPLEX SYSTEMS, JAVA, MVN, AND GIT

Este proyecto busca implementar la media y la desviación estándar haciendo uso de LinkedList, en particular esta debe ser creada por nosotros, y debe ser compatible con la interface List. Para ello hacemos uso de estructura de datos para manejar los nodos correctamente y poder implementar la lista. [Aquí](Design.pdf) puede encontrar el informe con mayor detalle.

Nota: Mas adelante cuando corras el empaquetado o las pruebas puede que no pasen las pruebas, debes volver a correr esos comandos y veras que después pasara correctamente, esto sucede ya que la lista no está guardando los datos permanentemente y estos se borran cuando iteras por primera vez, por esa razón cuando corre las pruebas puede que no pasen al primer intento ya que se pueden cursar los arreglos y no los este generando bien.

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

### Pre-requisitos 📋

Para poder hacer uso de este proyecto se debe tener instalado:
 
  * MVN
  * Git
  * Java

### Instalación 🔧

Lo primero que debe hacer es descargar el proyecto, lo pude hacer directamente descargando el .zip, o puede clonar el archivo con el siguiente comando.

```
git clone https://github.com/sebastianNietoMolina/AREP-lab1.git
```

Entramos al directorio del proyecto con el comando

```
cd lab1
```

Luego debe ingresar el siguiente comando para que se ejectue hasta la fase de empaquetamiento, debe asegurar que antes de ingresar este comando, exista en la carpeta que esta, el archivo llamado pom.xml

```
mvn package
```

Tambien me gustaria aclarar que puedes descargar el javaDoc, este quedara guardado en una carpeta target, esta se genera una vez echo el comando anterior, y con el siguiente comando se creara la carpeta site, la ruta sera target/site.

```
mvn javadoc:javadoc
```

## Ejecutando las pruebas ⚙️

El anterior comando ya ejecuta las pruebas, pero si desea verlas por aparte puede ejecutar el siguiente comando.

```
mvn test.
```

### Analice las pruebas end-to-end 🔩

Me gustaría aclarar que mi lista no esta del todo perfecta ya que cuando se ejecutan las pruebas no reconoce del todo los arreglos y puede que las pruebas no pasen a la primera, posteriormente se dará cuenta que si funciona hasta pasar todas las pruebas. Las pruebas son en total 6, 3 son pruebas de media y 3 son de desviación estandar.

![](https://github.com/sebastianNietoMolina/AREP-lab1/blob/main/fotos-documentos/pruebas.PNG)

## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Sebas Nieto** - *Trabajo Inicial* - [sebNieto](https://github.com/sebastianNietoMolina)

## Licencia 📄

Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE.md](LICENSE.md) para detalles

## Expresiones de Gratitud 🎁

Reconocimientos a:
---
[Villanuevand](https://github.com/Villanuevand), use su estructura para mi readme.md.
