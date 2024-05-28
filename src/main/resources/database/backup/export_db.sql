--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3
-- Dumped by pg_dump version 16.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: persoane; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.persoane (
    idpersoana integer NOT NULL,
    nume text,
    prenume text,
    adresa text,
    oras text,
    datanasterii date,
    gen text
);


ALTER TABLE public.persoane OWNER TO postgres;

--
-- Name: persoane_idpersoana_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.persoane_idpersoana_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.persoane_idpersoana_seq OWNER TO postgres;

--
-- Name: persoane_idpersoana_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.persoane_idpersoana_seq OWNED BY public.persoane.idpersoana;


--
-- Name: persoane idpersoana; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.persoane ALTER COLUMN idpersoana SET DEFAULT nextval('public.persoane_idpersoana_seq'::regclass);


--
-- Data for Name: persoane; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.persoane (idpersoana, nume, prenume, adresa, oras, datanasterii, gen) FROM stdin;
1	Filip	Ion	Strada Libertatii, nr. 10	Bucuresti	2007-01-13	F
3	Georgescu	Goran	Strada Unirii, nr. 5	Timisoara	2002-07-19	F
5	Petrescu	Petre	Strada Sperantei, nr. 20	Brasov	1954-01-15	F
6	Radu	George	\N	Dorohoi	1976-07-30	M
4	Dumitru	Vasile	Bld. Independentei, nr. 12A	Iasi	2009-06-05	F
\.


--
-- Name: persoane_idpersoana_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.persoane_idpersoana_seq', 6, true);


--
-- Name: persoane persoane_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.persoane
    ADD CONSTRAINT persoane_pkey PRIMARY KEY (idpersoana);


--
-- PostgreSQL database dump complete
--

