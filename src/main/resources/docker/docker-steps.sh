#!/bin/sh

# Navigam la locatia unde se afla proiectul
cd C:\_LEARN_\ft-algo-data-structures

# Construim imaginea Docker cu comanda build, cu -f specificam locul unde se afla fisierul Dockerfile
# cu -t ii dam un tag/nume la imaginea
docker build -f src\main\resources\docker\Dockerfile -t hello-from-filipdocker .

# Rulam containerul cu tag-ul hello-from-filipdocker, ne folosim de --rm ca sa eliminam container-ul dupa ce procesul se incheie
docker run --rm hello-from-filipdocker
