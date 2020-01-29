Spring MVC REST
======

# Instalación nueva:

Ejecutar:

~~~bash
sudo apt install openjdk-11-jdk openjdk-11-jre maven postgresql-server postgresql-contrib

~~~
Crear base de datos Postgresql

~~~sql
psql -U postgres -h localhost -W
CREATE USER convenio PASSWORD 'convenio';
ALTER ROLE convenio WITH SUPERUSER;
CREATE DATABASE demo_springboot_mvc_rest WITH OWNER convenio;
GRANT ALL PRIVILEGES ON DATABASE bd_convenio TO convenio;
~~~


# Actualización de módulos:

Hacer git pull a todos al proyecto

Ejecutar sólo por unica vez:

~~~bash
mvn flyway:clean
mvn flyway:migrate
~~~

Ejecutar:

~~~bash
mvn spring-boot:run
~~~