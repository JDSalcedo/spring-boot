CREATE TABLE public.customer(
	id serial NOT NULL,
	first_name varchar(50),
	last_name varchar(50),
	CONSTRAINT customer_pk PRIMARY KEY (id)
);