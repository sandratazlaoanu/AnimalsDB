
Pasii de rulare:

1.Se urmeaza toti pasii de instalare precedenti.
2.Se urmeaza pasii de creare si importare a unei baze de date
3.In Eclipse IDE se importeaza proiectul folosind File -> Import  Projects from File System or Archive
4.Se da Click-Dreapta pe clasa Main si se selecteaza Run As -> Java Application
5.Dupa ce apare meniul  se va introduce de la tastatura sirul de caractere corespunzator optiunii alese.

Pasii de creare si importare a bazelor de date:

1.Se deschide pgAdmin 4.
2.Se deschide Command Prompt ca administrator.
3.Se navigheaza in directorul bin din PostgreSQL folosind comanda cd.
Exemplu: cd "C:\Program Files\PostgreSQL\11\bin"
4.Se executa urmatoarele comenzi:
psql --command="CREATE DATABASE Cat" --username="postgres"
psql --command="CREATE DATABASE Dog" --username="postgres"
psql --command="CREATE DATABASE Parrot" --username="postgres"
psql par < "%cale_fisier%\cat.sql" postgres
psql impar < "%cale_fisier%\dog.sql" postgres
psql prim < "%cale_fisier%\parrot.sql" postgres
5.Pentru verificare, in PgAdmin se selecteaza o baza de date -> click-dreapta -> Refresh

SAU

Pasii de creare a bazelor de date si a tabelelor:

1.Se deschide pgAdmin 4.
2.Click Dreapta pe Database -> Create Database -> Click Dreapta pe Tables -> Create Table 
3.Ulterior, introducem datele, fiecare in campul corespunzator.

Pasii de instalare Java:

1. Se va descarca Java de la urmatorul link: https://www.java.com/en/download/win10.jsp
2. Se ruleaza installerul descarcat si se urmeaza pasii din wizard.

Pasii de instalare Eclipse IDE for Java EE Developers:

1. Se va descarca installerul de la urmatorul link: https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2019-03/R/eclipse-inst-win64.exe
2. Se ruleaza instalerul downloadat in pasul anterior.
3. Vom da click pe optiunea Eclipse IDE for Enterprise Java Developers.
4. Se apasa butonul de install.
5. Se finalizeaza setup-ul.

Pasii de instalare PostgreSQL:

1. Se va descarca PostgreSQL de la urmatorul link: https://www.postgresql.org/download/.
2. Se urmaresc pasii din wizard si se instaleaza componentele necesare: 
	-PostgreSQL Server
	-pgAdmin 4
	-Stack Builder
	-Command Line tools
3. Se continua instalarea.

Pasii de instalare Maven:

1. Se acceseaza site-ul web https://maven.apache.org/download.cgi si se descarca arhiva 	'apache-maven-3.6.1-src.zip' si se dezarhiveaza intr-o locatie aleasa.
2. Se da click pe iconita de search si se intra in "edit the system environment variables"
3. Dupa ce se deschide System Properties (Tabul Advanced) se da click pe Environment Varibles.
4. Se adauga o noua variabila de system accesand butonul New cu numele 'Maven_Home' si cu valoarea pathului unde a fost extractata arhiva.
5. In Variabilele de sistem se cauta 'Path' si se acceseaza butonul 'Edit' -> 'New' si se adauga pathul catre folderul bin: %Maven_Home%\bin
6. Pentru verificare se ruleaza Command Prompt si se executa comanda : mvn -v
Daca totul este in regula in consola ar trebui sa se afiseze un output asemanator acestuia:
 Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T21:00:29+02:00)
 Maven home: /opt/apache-maven-3.6.1
 Java version: 1.8.0_45, vendor: Oracle Corporation
 Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
 Default locale: en_US, platform encoding: UTF-8
 OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"

Versiuni:
- Eclipse Jee 2019-03
- PostgreSql 11 
- PgAdmin 4
- Apache Maven 3.6.1
- PostgreSQL JDBC Driver 42.2.5