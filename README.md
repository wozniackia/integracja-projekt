# Zestawienie danych na temat współczynnika dzietności z danymi gospodarczymi i politycznymi

## Skład grupy projektowej

 - Piotr Wójtowicz
 - Antoni Woźniacki

## Stack technologiczny
 - MongoDB
 - SpringBoot
 - Thymeleaf
 - [Google Charts API](https://developers.google.com/chart/interactive/docs/gallery/combochart?hl=pl)
 - Kod przeskanowany narzędziem SonarLint (No issues found)

## Opis projektu

 - Zestawienie danych na temat współczynnika dzietności z danymi:
 	- gospodarczymi
 	- politycznymi
 - Aplikacja przedstawia wykres współczynnika dzietności oraz danych gospodarczych
 - Na wykres nanieść można dodatkowo dane polityczne
 - Dane nt. współczynnika dzietności posiadamy dla lat 2011-2021

## Zrealizowane funkcjonalności

 - import do bazy danych
 - eksport do pliku JSON
 - eksport do pliku XML
 - wykorzystanie ORM w celu dostępu do bazy danych
 - wykorzystanie usług typu REST

## Dane

### [Dzietnosc](https://ec.europa.eu/eurostat/web/population-demography/demography-population-stock-balance/database)

### Dane gospodarcze

 - [Inflacja](https://ec.europa.eu/eurostat/web/products-datasets/-/tec00118)
 - [Bezrobocie](https://ec.europa.eu/eurostat/web/products-datasets/-/tipsun20)
 - [Dlug publiczny](https://ec.europa.eu/eurostat/web/products-datasets/-/gov_10q_ggdebt)
 - [Wynagrodzenie minimalne](https://ec.europa.eu/eurostat/databrowser/view/tps00155/default/table?lang=en)

### Dane polityczne (ilosc aktow prawnych, zawierających dane wyrazenie, które weszły w zycie w danym roku)

 - [Akty prawne - Swagger API doc](http://api.sejm.gov.pl/eli/openapi/ui/#/)
 - [Mozliwe keywordy po ktorych mozna szukac aktow prawnych](http://api.sejm.gov.pl/eli/keywords)
 - [Przykladowe zapytanie dla 10 najnowszych aktow prawnych pasujacych do keyworda 'wynagrodzenia minimalne'](https://api.sejm.gov.pl/eli/acts/search?keyword=wynagrodzenia%20minimalne&limit=10)
