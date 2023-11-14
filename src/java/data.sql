
create table produit (
    idProduit varchar(50) primary key not null,
    nameProduit varchar(100),
    refProduit varchar(100),
    typeStock int
);

insert into produit values('PR1', 'Riz blanc', 'R001', 1);
insert into produit values('PR2', 'Riz blanc Makalioka', 'R0011', 1);
insert into produit values('PR3', 'Riz blanc Stock', 'R0012', 1);
insert into produit values('PR4', 'Riz rouge', 'R002', 1);
insert into produit values('PR5', 'Riz rouge Gasy', 'R0021', 1);
insert into produit values('PR6', 'Riz rouge Stock', 'R0022', 1);

-- -----------------------------------------------------------------------------------------

create table magasin(
    idMagasin varchar(50) primary key not null,
    nameMagasin varchar(50),
    adress varchar(100)
);

insert into magasin values('M1', 'Economat', 'Andohalo');
insert into magasin values('M2', 'Stockage', 'Betongolo');

-- ----------------------------------------------------------------------------------------

create sequence entree_seq increment by 1 start with 1;

create table entree(
    idEntree varchar(50) primary key not null,
    idProduit varchar(50),
    dateEntree date, 
    quantity numeric,
    unitPriceEntree numeric,
    montantEntree numeric, 
    idMagasin varchar(50),
    availability numeric,
    foreign key(idProduit) references produit(idProduit),
    foreign key(idMagasin) references magasin(idMagasin)
);

-- insertion anah entree
insert into entree values('E1', 'PR1', '2023-10-02', 100, 10, 1000, 'M1', 100);
insert into entree values('E2', 'PR1', '2023-10-04', 50, 15, 750, 'M1', 50);
insert into entree values('E3', 'PR1', '2023-10-06', 70, 10, 700, 'M1', 70);

-- ------------------------------- SORTIE ---------------------------------------------------------

create sequence sortie_seq increment by 1 start with 1;
create sequence detail_sortie_seq increment by 1 start with 1;


create table sortie(
    idSortie varchar(50) primary key not null,
    idProduit varchar(50),
    dateSortie date, 
    quantity numeric,
    montantSortie numeric, 
    idMagasin varchar(50),
    unitPriceSortie numeric,
    foreign key(idProduit) references produit(idProduit),
    foreign key(idMagasin) references magasin(idMagasin)
);

-- insertion anah sortie
insert into sortie values('S1', 'PR1', '2023-10-08', 50, 500, 'M1', 10);

CREATE TABLE detail_sortie (
    idSortie varchar(50),
    idEntree varchar(50),
    quantityDetail numeric,
    unitPriceDetail numeric,
    montantDetail numeric,
    PRIMARY KEY (idSortie, idEntree),
    FOREIGN KEY (idSortie) REFERENCES sortie(idSortie), 
    FOREIGN KEY (idEntree) REFERENCES entree(idEntree) 
);


-- insertion anah detail sortie
insert into detail_sortie values ('S1', 'E1', 50, 10, 500);

-- ----------- REPORT ------------------------------------------------------
create sequence report_seq increment by 1 start with 1;
create table report (
    idReport varchar(50) primary key not null,
    dateReport date,
    idProduit varchar(50),
    qtyReport numeric,
    pumpReport numeric,
    montantReport numeric,
    idMagasin varchar(50),
    foreign key(idProduit) references produit(idProduit),
    foreign key(idMagasin) references magasin(idMagasin)
);




-- -----------------------------------------------------------------------
-- Check the disponibility in the stock
-- somme des entrees - somme des sorties : ALL
-- if non -> Erreur
-- if oui :
-- 

-- ----------------------------------------------------------------------------------------

-- To see initial stock of a certain product 
-- Tsy ampy sortie ree
select (select COALESCE(SUM(quantity), 0) from entree where date_entree < '2023-10-05' and idproduit = 'PR1') -  (select COALESCE(SUM(quantity), 0) from sortie where date_sortie < '2023-10-05' and idproduit = 'PR1') as si;

select (select COALESCE(SUM(quantity), 0) from entree where date_entree < '2023-10-05' and idproduit = 'PR1') -  (select COALESCE(SUM(quantity), 0) from sortie where date_sortie < '2023-10-05' and idproduit = 'PR1') as si;

-- See the final stock

select t1.*, t1.sum_entree - t1.sum_sortie as diff
from(
    SELECT produit.idProduit, COALESCE(SUM(entree.quantity), 0) as sum_entree, COALESCE(SUM(sortie.quantity), 0) as sum_sortie
    FROM produit 
    LEFT JOIN sortie ON sortie.idProduit = produit.idProduit
    LEFT JOIN entree ON entree.idProduit = produit.idProduit
    WHERE entree.date_entree < '2023-10-05' OR entree.date_entree IS NULL
    GROUP BY produit.idProduit ) as t1;

-- ----------------------------------------------------------------------------------------------------

