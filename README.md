# Integracja projekt

## Założenia

 - Zestawienie danych na temat współczynnika dzietności z danymi:
 	- gospodarczymi
 	- politycznymi
 - Aplikacja przedstawia wykres współczynnika dzietności
 - Na wykres można nanieść dodatkowo wypisane wyżej dane
 - Zakładamy dane na ostatnie 10 lat, zobaczymy jakie faktycznie znajdziemy

## Wymagane funkcjonalności

 - eksport/import z bazy danych
 - wykorzystanie ORM w celu dostępu do bazy danych
 - wykorzystanie usług typu REST
 - wykorzystanie mechanizmów uwierzytelnienia i autoryzacji przy użyciu tokenów
 JWT 
 - wykorzystanie poziomów izolacji w bazie danych

## Przydatne linki

[### Dzietnosc](https://ec.europa.eu/eurostat/web/population-demography/demography-population-stock-balance/database)

### Dane gospodarcze

 - [Inflacja](https://ec.europa.eu/eurostat/web/products-datasets/-/tec00118)
 - [Bezrobocie](https://ec.europa.eu/eurostat/web/products-datasets/-/tipsun20)
 - [Dlug publiczny](https://ec.europa.eu/eurostat/web/products-datasets/-/gov_10q_ggdebt)
 - [Wynagrodzenie minimalne](https://ec.europa.eu/eurostat/databrowser/view/tps00155/default/table?lang=en)

### Dane polityczne

 - [Akty prawne - Swagger API doc](http://api.sejm.gov.pl/eli/openapi/ui/#/)
 - [Mozliwe keywordy po ktorych mozna szukac aktow prawnych](http://api.sejm.gov.pl/eli/keywords)
 - [Przykladowe zapytanie dla 10 najnowszych aktow prawnych pasujacych do keyworda 'wynagrodzenia minimalne'](https://api.sejm.gov.pl/eli/acts/search?keyword=wynagrodzenia%20minimalne&limit=10)

## DB

 - MongoDB

 [Google Charts API](https://developers.google.com/chart/interactive/docs/gallery/combochart?hl=pl)