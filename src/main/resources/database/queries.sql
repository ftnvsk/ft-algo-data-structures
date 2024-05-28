-- a) cream o noua db cu numele 'heiDB', dar daca deja exista o stergem
DROP DATABASE IF EXISTS "heiDB";

CREATE DATABASE "heiDB";

-- connect to heiDB
\c "heiDB";

-- b) Cream tabelul 'Persoane', daca deja exista il stergem
DROP TABLE IF EXISTS Persoane;
CREATE TABLE Persoane (
    IDPersoana SERIAL PRIMARY KEY,
    Nume TEXT,
    Prenume TEXT,
    Adresa TEXT,
    Oras TEXT
);

-- Populam tabelul 'Persoane'
INSERT INTO Persoane (Nume, Prenume, Adresa, Oras) VALUES ('Filip', 'Ion', 'Strada Libertatii, nr. 10', 'Bucuresti');
INSERT INTO Persoane (Nume, Prenume, Adresa, Oras) VALUES ('Ionescu', 'Ion', 'Strada Victoriei, nr. 15', 'Cluj-Napoca');
INSERT INTO Persoane (Nume, Prenume, Adresa, Oras) VALUES ('Georgescu', 'Goran', 'Strada Unirii, nr. 5', 'Timisoara');
INSERT INTO Persoane (Nume, Prenume, Adresa, Oras) VALUES ('Dumitru', 'Vasile', NULL, 'Iasi'); -- Adresa este NULL
INSERT INTO Persoane (Nume, Prenume, Adresa, Oras) VALUES ('Petrescu', 'Petre', 'Strada Sperantei, nr. 20', 'Brasov');

-- c) Comenzi SQL rulate pe o tabela:
-- Selectarea tuturor persoanelor
SELECT * FROM Persoane;

-- Inserarea unei noi persoane
INSERT INTO Persoane (Nume, Prenume, Adresa, Oras) VALUES ('Radu', 'George', NULL, 'Dorohoi');

-- Selectarea tuturor persoanelor
SELECT * FROM Persoane;

-- Actualizarea adresei unei persoane cu IDPersoana = 4
UPDATE Persoane SET Adresa = 'Bld. Independentei, nr. 12A' WHERE IDPersoana = 4;

-- Selectarea tuturor persoanelor
SELECT * FROM Persoane;

-- Ștergerea unei persoane cu IDPersoana = 2
DELETE FROM Persoane WHERE IDPersoana = 2;

-- Selectarea tuturor persoanelor
SELECT * FROM Persoane;

---------------------------------- UPDATE 2 : ---------------------------------------

-- 1. Mai jos avem un ALTER TABLE, care modifica tabelul adaugand o coloana noua numita DataNasterii si cu si tipul de data ca fiind DATE
ALTER TABLE Persoane ADD COLUMN DataNasterii DATE;
SELECT * FROM Persoane;

-- 1.1. Populam tabela cu date in DataNasterii pentru fiecare rand unde e gol, folosind RANDOM
UPDATE Persoane SET DataNasterii = DATE '1940-01-01' + CAST((RANDOM() * (DATE '2024-05-21' - DATE '1940-01-01')) AS INTEGER);

-- 2. Mai jos avem ALTER TABLE, pentru a adauga coloana Gen de tip TEXT
ALTER TABLE Persoane ADD COLUMN Gen TEXT;
SELECT * FROM Persoane;

-- 2.1. Populam tabela cu Gen pentru fiecare rand unde e gol, folosind RANDOM care genereaza cifre random,
-- si daca cifra e para atunci M, daca e impara atunci F
UPDATE Persoane SET Gen = CASE
                          WHEN (CAST(RANDOM() as INTEGER) < 1) THEN 'M'
                          ELSE 'F'
END
WHERE Gen IS NULL;
SELECT * FROM Persoane;

-- 3. Cu query-ul de mai jos facem un select care ne ia toate randurile unde avem Adresa = NULL, si cand ni le afiseaza,
-- folosim COALESCE sa inlocuium acel NULL cu ce dorim sa vedem noi
SELECT Nume, Prenume, COALESCE(Adresa, 'FaraAdresa') AS Adresa
FROM persoane;

-- 4. Selectam 2 cele mai tinere persoane intai prin sortarea lor de la cel mai mic la cel mai mare, si cu LIMIT luam primele 2 persoane
SELECT Nume, Prenume, DataNasterii
FROM persoane
ORDER BY DataNasterii DESC
LIMIT 2;

-- 5. Cu query-ul de mai jos selectam toate randurile unde numele se termina cu 'escu', folosindu-ne de LIKE
-- folosim '%escu', unde % este 'wildcard', adica ne spune orice s-ar afla inainte de 'escu'
SELECT Nume, Prenume FROM Persoane WHERE Nume LIKE '%escu';

-- 6. Folosind WHERE facem o filtrare la un tabel. In cazul nostru facem o filtrare intrun anumit range
SELECT Nume, Prenume, DataNasterii FROM Persoane WHERE DataNasterii BETWEEN '1940-01-01' AND '2000-12-31';

-- 7. Folosind ORDER cerem ca informatia din tabel sa ne fie afisata sortata dupa o anume coloana si cum dorim sa o
-- sortam ( de la mic la mare sau invers)
SELECT Nume, Prenume FROM Persoane ORDER BY Prenume ASC;


-- 8. Ca sa afisam genurile grupate si numarul de persoane per gen, folosim GROUP BY impreuna cu COUNT
-- cea ce facem mai jos este sa afisam doar coloana Gen din tabelul Persoane, unde numaram de cate ori apar valorile din
-- coloana Gen si le afisam sub numele 'totalPerGen' si la final grupam/asezam rezultatele pe baza valorile din coloana Gen
SELECT Gen, COUNT(*) AS totalPerGen FROM Persoane GROUP BY Gen;
