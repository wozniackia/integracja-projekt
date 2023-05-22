# Integracja projekt

## Założenia

 - Zestawienie danych na temat współczynnika dzietności z danymi:
 	- gospodarczymi
 	- politycznymi
 	- historycznymi (?)
 - Aplikacja przedstawia wykres współczynnika dzietności
 - Na wykres można nanieść dodatkowo wypisane wyżej dane
 - Zakładamy dane na ostatnie 20 lat, zobaczymy jakie faktycznie znajdziemy

## Wymagane funkcjonalności

 - eksport/import z bazy danych
 - wykorzystanie ORM w celu dostępu do bazy danych
 - wykorzystanie usług typu REST
 - wykorzystanie mechanizmów uwierzytelnienia i autoryzacji przy użyciu tokenów
 JWT 
 - wykorzystanie poziomów izolacji w bazie danych

## Przydatne linki

### Dzietnosc

 - [GUS ludność](https://stat.gov.pl/obszary-tematyczne/ludnosc/ludnosc/)
 - [GUS warunki życia](https://stat.gov.pl/obszary-tematyczne/warunki-zycia/)
 - [GUS ludnosc bilans](https://stat.gov.pl/obszary-tematyczne/ludnosc/ludnosc/ludnosc-bilans-opracowany-w-oparciu-o-wyniki-nsp-2011,1,1.html)
 - [GUS spisy powszechne](https://stat.gov.pl/spisy-powszechne/narodowe-spisy-powszechne/)
 - [GUS spisy powszechne - historyczne](https://stat.gov.pl/spisy-powszechne/narodowe-spisy-powszechne/ludnosc-wedlug-spisow-dane-historyczne/)
 - [GUS prognoza ludności](https://stat.gov.pl/obszary-tematyczne/ludnosc/prognoza-ludnosci/prognoza-ludnosci-gmin-na-lata-2017-2030-opracowanie-eksperymentalne,10,1.html)
 - [Reprodukcja ludności - API](https://dane.gov.pl/pl/dataset/1851,urodzenia-i-zgony-w-gdansku/resource/22331,wspoczynniki-dotyczace-reprodukcji-ludnosci/table)

### Dane gospodarcze

 - Inflacja
 - Wynagrodzenie minimalne
 - Srednie/mediany wynagrodzeń

### Dane polityczne

 - [Akty prawne - Swagger API doc](http://api.sejm.gov.pl/eli/openapi/ui/#/)
 - [Mozliwe keywordy po ktorych mozna szukac aktow prawnych](http://api.sejm.gov.pl/eli/keywords)
 - [Przykladowe zapytanie dla 10 najnowszych aktow prawnych pasujacych do keyworda 'wynagrodzenia minimalne'](https://api.sejm.gov.pl/eli/acts/search?keyword=wynagrodzenia%20minimalne&limit=10)

### Dane historyczne

 - 

## Moja propozycja UI

![ui](/integracje-ui.png)
