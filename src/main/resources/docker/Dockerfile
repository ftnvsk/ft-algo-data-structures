# Aici folosim imaginea oficială OpenJDK 11 ca baza
FROM openjdk:11

# Setam WORKDIR, unde o sa lucram practic cu Docker
WORKDIR /app

# Cream structura de foldere/fisere pentru pachetul meu
RUN mkdir -p com/algodatastructures/ft

# Copiam toate fisierele java cu cod executabil in container
COPY src/main/java/com/algodatastructures/ft/ com/algodatastructures/ft/

# Compilam fisierele Java
RUN javac com/algodatastructures/ft/*.java

# Mia jos specificam comanda care o sa fie rulata atunci cand containerul e pornit
CMD ["java", "com.algodatastructures.ft.Main"]
