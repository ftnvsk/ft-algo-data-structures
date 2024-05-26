# Intai facem conectare la PostgreSQL cu username si parola
# Dupa setam executarea comenzilor din fisierul queries.sql
# La final, facem export la DB
psql -d heiDB -U postgres -W <<EOF

\i queries.sql

postgres=# pg_dump -U postgres -d heiDB -f /backup/export_db.sql
postgres-# pg_dump -U postgres -d heiDB -f C:/_LEARN_/ft-algo-data-structures/src/main/resources/database/backup/export_db.sql
postgres-# pg_dump -U postgres -d heiDB -f C:/_LEARN_/ft-algo-data-structures/src/main/resources/database/backup/export_db.sql

psql -U postgres -h localhost -p 5432 -f queries.sql
pg_dump -U postgres -h localhost -p 5432 "heiDB" > backupDb.sql

EOF

