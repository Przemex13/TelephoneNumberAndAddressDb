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
-Hibernate
-Spring Data JPA


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

docker run --name TelephoneNumberAndAddressContainer -e MYSQL_ROOT_PASSWORD=Przemek123 -e MYSQL_DATABASE=telephoneAndAddressDB -d -p 3307:3306 przemex13/telephoneandaddressdatabase
W razie pytań, sugestii i problemów, służe pomocą \
przemyslaw.poskrobko@gmail.com