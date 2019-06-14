
Pasii de rulare:

1.Se urmeaza toti pasii de instalare precedenti.
2.Se urmeaza pasii de creare si importare a unei baze de date
3.In Eclipse se importeaza proiectul folosind File -> Import Projects from File System
4.Se executa urmatoarea comanda pentru a converti proiectul la un proiect Eclipse: (Dupa ce intram in Command Prompt, la locatia proiectului)->  %cale_proiect% > mvn eclipse:eclipse 
5.Se da Click-Dreapta pe clasa Main si se selecteaza Run As -> Java Application
6.Dupa ce apare meniul  se va introduce de la tastatura sirul de caractere corespunzator optiunii alese.

Pasii de creare si importare a bazelor de date:

1.Se deschide pgAdmin 4.
2.Se deschide Command Prompt ca administrator.
3.Se navigheaza in directorul bin din PostgreSQL folosind comanda cd.
Exemplu: cd "C:\Program Files\PostgreSQL\11\bin"
4.Se executa urmatoarele comenzi:
psql --command="CREATE DATABASE Cat" --username="postgres"
psql --command="CREATE DATABASE Dog" --username="postgres"
psql --command="CREATE DATABASE Parrot" --username="postgres"
psql Cat < "%cale_fisier%\cat.sql" postgres
psql Dog < "%cale_fisier%\dog.sql" postgres
psql Parrot < "%cale_fisier%\parrot.sql" postgres
5.Pentru verificare, in PgAdmin 4 se selecteaza o baza de date -> click-dreapta -> refresh

6. Ulterior, se adauga datele aferente in fiecare baza de date.

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

1. Se acceseaza site-ul web https://maven.apache.org/download.cgi si se descarca arhiva 'apache-maven-3.6.1-bin.zip' si se dezarhiveaza intr-o locatie aleasa.
2. Se da click pe iconita de search si se intra in "edit the system environment variables"
3. Dupa ce se deschide System Properties (Tab-ul Advanced) se da click pe Environment Varibles.
4. Se adauga o noua variabila de sistem accesand butonul New cu numele 'MAVEN_HOME' si cu valoarea pathului unde a fost extrasa arhiva.
5. In variabilele de sistem se cauta 'Path' si se acceseaza butonul 'Edit' -> 'New' si se adauga pathul catre folderul bin: %MAVEN_HOME%\bin
6. Pentru verificare se ruleaza Command Prompt si se executa comanda : mvn -version 
	-Outupul ar trebui sa fie asemanator cu:
Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T22:00:29+03:00)
Maven home: D:\Programs\apache-maven-3.6.1\bin\..
Java version: 1.8.0_211, vendor: Oracle Corporation, runtime: D:\App\Progra~1\Java\jdk1.8.0_211\jre
Default locale: en_US, platform encoding: Cp1250
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

Versiuni:
- Java 1.8
- Eclipse Jee 2019-03
- PostgreSQL 11 
- PgAdmin 4
- Apache Maven 3.6.1
- PostgreSQL JDBC Driver 42.2.5