# API CALCULADORA

Proyecto de una calculadora en spring boot con capacidad para sumar y restar dos numeros

### Pre-requisitos

* Java 1.8 o superior
* Maven


### Instalación

Descargar el repositorio 

* git clone https://github.com/fjvica8/Calculator.git
* cd calculator

Ejecutar maven validate para instalar la dependencia tracer


* mvn validate
* mvn clean install

O usar los comandos del wrapper de maven

* mvnw validate
* mvnw clean install



### Construido con

* spring-boot-starter 2.6.4
* spring-boot-starter-test 2.6.4
* spring-boot-starter-web 2.6.4
* tracer 1.0.0


### ENDPOINTS

* Endpoint para sumar
`	http://localhost:8080/operation/sum?number1=1&number2=1`
	
* Endpoint para restar
	`http://localhost:8080/operation/subtract?number1=1&number2=1`
