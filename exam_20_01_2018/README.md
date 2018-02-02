# Exam on 20.01.2018

Theoretical part can be found below, sources in separate directories :)


1. Jaka jest semantyka słowa kluczowego final dla klas, metod i zmiennych(pól/właściwości)
https://pl.m.wikipedia.org/wiki/Final_(Java)

* ~~final dla klasy  – nie pozwala na dziedziczenie klasy~~
* ~~final dla metody – nie pozwala na reimplementację metody w klasach dziedziczących~~
* ~~final dla zmiennej(pola/właściwosci) – nie pozwala na modyfikowanie wartości zmiennej(stała klasowa)~~



6. Wyjaśnij znaczenie słowa kluczowego **static**. W jaki sposób możemy zliczać wszystkie
utoworzone obiekty danej klasy?
```
Pola/właściwości oraz metody statyczne są powiązane z klasą a nie z obiektami tej klasy
(oraz istnieją w kontekście tej klasy a nie jej obiektów).
Zliczanie obiektów można zaimplementować na wiele sposobów, np. poprzez statyczny licznik inkrementowany w konstruktorze klasy.
```
