-- a) cream o noua db cu numele 'heiDB', dar daca deja exista o stergem
DROP DATABASE IF EXISTS heiDB;

CREATE DATABASE heiDB;

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
INSERT INTO Persoane (Nume, Prenume, Adresa, Oras) VALUES ('Radu', 'George', 'Strada Strazilor, nr. 99', 'Dorohoi');

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