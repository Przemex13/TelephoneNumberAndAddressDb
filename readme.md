
English version at bottom

Projekt prostej bazy danych teleadresowych, która przy pomocy zapytań http oraz wykorzystując
REST API i JSONa daje możliwość transakcji typu CRUD. Baza danych znajduje się w kontenerze.
Daje to możliwość uruchomienia bazy w bardziej izolowanym i przenoszalnym środowisku. 
Projekt wykorzystuje infrastrukturę Controller-Service-Repository. 
Do powiązania aplikacji z plikami html użyłem podstawowych funkcjonalności biblioteki Bootstrap oraz silnika szablonów Thymeleaf.

W bazie znajduje się jedna tabela, która posiada następujące kolumny:\
-ID	\
-First Name	\
-Last Name	\
-PESEL	\
-Phone Number \	
-Email	\
-Street	\
-City	\
-Postcode


Wykorzystano następujące technologie i biblioteki:\
-Java\
-Spring\
-Maven\
-MySQL\
-Docker\
-Lombok\
-Html\
-Thymeleaf\
-Bootstrap\
-Hibernate\


Jak uruchomić kontener?

należy posiadać zainstalowanego dockera, a następnie ściągnąć obraz kontenera z
platformy DockerHub. Aby to wykonać należy uruchomić Terminal oraz wpisać komendę:



docker pull przemex13/telephoneandaddressdatabase:latest



następnie należy uruchomić kontener uwzględniając następujące parametry z pliku
application.properties projektu:

spring.datasource.url=jdbc:mysql://localhost:3307/BookSet?useSSL=false \
spring.datasource.username=root \
spring.datasource.password=Przemek123

należy zatem wpisać polecenie:

docker run --name TelephoneNumberAndAddressContainer -e MYSQL_ROOT_PASSWORD=Przemek123 -e MYSQL_DATABASE=telephoneAndAddressDB -d -p 3307:3306 przemex13/telephoneandaddressdatabase \
W razie pytań, sugestii i problemów, służe pomocą 

przemyslaw.poskrobko@gmail.com

--------------------------------
English version
--------------------------------
This is a simple telephone and address details database, which using http queries and REST API and JSON gives opportunity of CRUD transaction. The database is located in docker container. It gives th posibility to run the database in more isolated  and more-remote environment. The project utilizes controller-service-repository infrastructure.
To bind the application with html files I used basic features of Bootstrap library and Thymeleaves templates engine.

The database comprise of one table which has following columns:

-ID	\
-First Name	\
-Last Name	\
-PESEL	\
-Phone Number \
-Email	\
-Street	\
-City	\
-Postcode

I used following technologies and libraries:\
-Java\
-Spring\
-Maven\
-MySQL\
-Docker\
-Lombok\
-Html\
-Thymeleaf\
-Bootstrap\
-Hibernate
-Spring Data JPA

How to run the container?

Firstly, it is necessary to have instaled Docker, and then you have download container image from DocerHub platform. To do this it is required to run Terminal ( This instructions are for Windows terminal) and type in the command:

docker pull przemex13/telephoneandaddressdatabase:latest

Afterwards it is necessary to run the container taking into account properties form  application.propeties file of the project:

spring.datasource.url=jdbc:mysql://localhost:3307/BookSet?useSSL=false \
spring.datasource.username=root \
spring.datasource.password=Przemek123

Thus is needed following command:

docker run --name TelephoneNumberAndAddressContainer -e MYSQL_ROOT_PASSWORD=Przemek123 -e MYSQL_DATABASE=telephoneAndAddressDB -d -p 3307:3306 przemex13/telephoneandaddressdatabase

If You have any questions, suggestions etc., please contact me.
przemyslaw.poskrobko@gmail.com
