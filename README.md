# BibliotekaXML
Ćwiczenie ze Springa
Stwórz program zawierający dwie klasy: Książka i Wypożyczający. Książka ma posiadać następujące pola:
*nazwa
*autor
*dostepnosc (czy mozna ja wyporzyczyc, czy juz ktos zrobil to wczesniej)
Ma również zawierać odpowiednie gettery i settery oraz metodę toString.
Klasa Wypożyczający musi posiadać następujące pola:
*imie
*nazwisko
*ksiazka (typu Ksiazka)
*timeZone (z klasy util, zawiera w sobie informacje o strefie czasowej w jakiej znajduje się wypożyczający)
Klasa ta ma również zawierać konstruktor, metode wypozyczKsiazke, która sprawdza czy dana książka została już wypożyczone i jeśli tak to zwraca o tym odpowiednią informacje, a jeśli nie to ustawia dostępnosc na false i ustawia pole ksiazka. Oprócz tego powinna też posiadać metodę zwroc w ktorej ksiazki sa zwracane ( dostepnosc ustawiona na true) oraz metodę toString.
Należy stworzyć do tego odpowiednią konfiguracje XML. Wszystkie książki (tytul, autor i dostepnosc) mają być zczytane z pliku konfiguracyjnego setting.propierties. Scieżkę do pliku należy podać jako argument do maszyny wirtualnej javy. Propierties do książki mają być podawane za pomocą przestrzeni nazw p. Time Zone ma być ściągnięte do wypożyczjącego za pomocą stałej z przestrzeni util. 
