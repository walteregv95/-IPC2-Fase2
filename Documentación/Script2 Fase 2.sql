CREATE DATABASE BANCO
USE BANCO
CREATE TABLE cambios (
    idcambios    INTEGER NOT NULL,
    idproducto   INTEGER NOT NULL,
    idcliente    INTEGER NOT NULL
);

ALTER TABLE cambios ADD CONSTRAINT cambios_pk PRIMARY KEY ( idcambios );

CREATE TABLE cheques (
    idcheque    INTEGER NOT NULL,
    nombre      VARCHAR(100),
    monto       DECIMAL(8,2),
    idcliente   INTEGER NOT NULL
);

ALTER TABLE cheques ADD CONSTRAINT cheques_pk PRIMARY KEY ( idcheque );

CREATE TABLE clientes (
    idcliente    INTEGER NOT NULL,
    cui          DECIMAL(15) NOT NULL,
    nombre       VARCHAR(100),
    fecha_nac    DATE NOT NULL,
    usuario      VARCHAR(100),
    contraseña   VARCHAR(100),
    puntos       INTEGER,
    idtipo       INTEGER NOT NULL
);

ALTER TABLE clientes ADD CONSTRAINT clientes_pk PRIMARY KEY ( idcliente );

CREATE TABLE cuentanomina (
    idcuentanomina   INTEGER NOT NULL,
    saldo            DECIMAL(8,2),
    estado           VARCHAR(100),
   
);

CREATE UNIQUE INDEX cuentanomina__idx ON
    cuentanomina ( idnomina ASC );

ALTER TABLE cuentanomina ADD CONSTRAINT cuentanomina_pk PRIMARY KEY ( idcuentanomina );

CREATE TABLE cuentas (
    nocuenta         INTEGER NOT NULL,
    estado           VARCHAR(100),
    saldo            DECIMAL(8,2),
    interesmensual   INTEGER,
    plazo            INTEGER,
    idcliente        INTEGER NOT NULL,
    idtipocuenta     INTEGER NOT NULL
);

ALTER TABLE cuentas ADD CONSTRAINT cuentas_pk PRIMARY KEY ( nocuenta );

CREATE TABLE depositos (
    iddepositos   INTEGER NOT NULL,
    monto         DECIMAL(8,2),
    nocuenta      INTEGER NOT NULL
);

ALTER TABLE depositos ADD CONSTRAINT depositos_pk PRIMARY KEY ( iddepositos );

CREATE TABLE empleados (
    idempleado   INTEGER NOT NULL,
    idcliente    INTEGER NOT NULL,
    idnomina     INTEGER NOT NULL
);

CREATE UNIQUE INDEX empleados__idx ON
    empleados ( idcliente ASC );

ALTER TABLE empleados ADD CONSTRAINT empleados_pk PRIMARY KEY ( idempleado );

CREATE TABLE modalidades (
    idmodalidad   INTEGER NOT NULL,
    nombre        VARCHAR(100)
);

ALTER TABLE modalidades ADD CONSTRAINT modalidades_pk PRIMARY KEY ( idmodalidad );

CREATE TABLE nominas (
    idnomina    INTEGER NOT NULL,
    empresa     VARCHAR(100),
    idcliente   INTEGER NOT NULL
);

CREATE UNIQUE INDEX nominas__idx ON
    nominas ( idcliente ASC );

ALTER TABLE nominas ADD CONSTRAINT nominas_pk PRIMARY KEY ( idnomina );

CREATE TABLE operaciones (
    idoperacion   INTEGER NOT NULL,
    operacion     VARCHAR(100),
    idoperario    INTEGER NOT NULL,
    nocuenta      INTEGER NOT NULL
);

ALTER TABLE operaciones ADD CONSTRAINT operaciones_pk PRIMARY KEY ( idoperacion );

CREATE TABLE operarios (
    idoperario       INTEGER NOT NULL,
    sueldo           DECIMAL(8,2),
    usuario          VARCHAR(100),
    contraseña       VARCHAR(100),
    idtipooperario   INTEGER NOT NULL
);

ALTER TABLE operarios ADD CONSTRAINT operarios_pk PRIMARY KEY ( idoperario );

CREATE TABLE patrocinadores (
    idpatrocinador   INTEGER NOT NULL,
    nombre           VARCHAR(100)
);

ALTER TABLE patrocinadores ADD CONSTRAINT patrocinadores_pk PRIMARY KEY ( idpatrocinador );

CREATE TABLE prestamos (
    idprestamo    INTEGER NOT NULL,
    monto         DECIMAL(8,2),
    nocuenta      INTEGER NOT NULL,
    idmodalidad   INTEGER NOT NULL
);

ALTER TABLE prestamos ADD CONSTRAINT prestamos_pk PRIMARY KEY ( idprestamo );

CREATE TABLE productos (
    idproducto       INTEGER NOT NULL,
    descripcion      VARCHAR(100),
    valor            INTEGER,
    patrocinador     VARCHAR(100),
    idpatrocinador   INTEGER NOT NULL
);

ALTER TABLE productos ADD CONSTRAINT productos_pk PRIMARY KEY ( idproducto );

CREATE TABLE retiros (
    idretiro   INTEGER NOT NULL,
    monto      DECIMAL(8,2),
    nocuenta   INTEGER NOT NULL
);

ALTER TABLE retiros ADD CONSTRAINT retiros_pk PRIMARY KEY ( idretiro );

CREATE TABLE tipocuentas (
    idtipocuenta   INTEGER NOT NULL,
    nombre         VARCHAR(100)
);

ALTER TABLE tipocuentas ADD CONSTRAINT tipocuentas_pk PRIMARY KEY ( idtipocuenta );

CREATE TABLE tipooperarios (
    idtipooperario   INTEGER NOT NULL,
    nombre           VARCHAR(100)
);

ALTER TABLE tipooperarios ADD CONSTRAINT tipooperarios_pk PRIMARY KEY ( idtipooperario );

CREATE TABLE tipos (
    idtipo   INTEGER NOT NULL,
    nombre   VARCHAR(100)
);

ALTER TABLE tipos ADD CONSTRAINT tipos_pk PRIMARY KEY ( idtipo );

ALTER TABLE cambios ADD CONSTRAINT cambios_clientes_fk FOREIGN KEY ( idcliente )
    REFERENCES clientes ( idcliente );

ALTER TABLE cambios ADD CONSTRAINT cambios_productos_fk FOREIGN KEY ( idproducto )
    REFERENCES productos ( idproducto );

ALTER TABLE cheques ADD CONSTRAINT cheques_clientes_fk FOREIGN KEY ( idcliente )
    REFERENCES clientes ( idcliente );

ALTER TABLE clientes ADD CONSTRAINT clientes_tipos_fk FOREIGN KEY ( idtipo )
    REFERENCES tipos ( idtipo );

ALTER TABLE cuentanomina ADD CONSTRAINT cuentanomina_nominas_fk FOREIGN KEY ( idnomina )
    REFERENCES nominas ( idnomina );

ALTER TABLE cuentas ADD CONSTRAINT cuentas_clientes_fk FOREIGN KEY ( idcliente )
    REFERENCES clientes ( idcliente );

ALTER TABLE cuentas ADD CONSTRAINT cuentas_tipocuentas_fk FOREIGN KEY ( idtipocuenta )
    REFERENCES tipocuentas ( idtipocuenta );

ALTER TABLE depositos ADD CONSTRAINT depositos_cuentas_fk FOREIGN KEY ( nocuenta )
    REFERENCES cuentas ( nocuenta );

ALTER TABLE empleados ADD CONSTRAINT empleados_clientes_fk FOREIGN KEY ( idcliente )
    REFERENCES clientes ( idcliente );

ALTER TABLE empleados ADD CONSTRAINT empleados_nominas_fk FOREIGN KEY ( idnomina )
    REFERENCES nominas ( idnomina );

ALTER TABLE nominas ADD CONSTRAINT nominas_clientes_fk FOREIGN KEY ( idcliente )
    REFERENCES clientes ( idcliente );

ALTER TABLE operaciones ADD CONSTRAINT operaciones_cuentas_fk FOREIGN KEY ( nocuenta )
    REFERENCES cuentas ( nocuenta );

ALTER TABLE operaciones ADD CONSTRAINT operaciones_operarios_fk FOREIGN KEY ( idoperario )
    REFERENCES operarios ( idoperario );

ALTER TABLE operarios ADD CONSTRAINT operarios_tipooperarios_fk FOREIGN KEY ( idtipooperario )
    REFERENCES tipooperarios ( idtipooperario );

ALTER TABLE prestamos ADD CONSTRAINT prestamos_cuentas_fk FOREIGN KEY ( nocuenta )
    REFERENCES cuentas ( nocuenta );

ALTER TABLE prestamos ADD CONSTRAINT prestamos_modalidades_fk FOREIGN KEY ( idmodalidad )
    REFERENCES modalidades ( idmodalidad );

ALTER TABLE productos ADD CONSTRAINT productos_patrocinadores_fk FOREIGN KEY ( idpatrocinador )
    REFERENCES patrocinadores ( idpatrocinador );

ALTER TABLE retiros ADD CONSTRAINT retiros_cuentas_fk FOREIGN KEY ( nocuenta )
    REFERENCES cuentas ( nocuenta );
    
    INSERT INTO tipos values (101,'Individual');
INSERT INTO tipos values (102,'Empresarial');

INSERT INTO tipocuentas values (201, 'Ahorro');
INSERT INTO tipocuentas values (202, 'Monetaria');
INSERT INTO tipocuentas values (203, 'Plazo Fijo');

INSERT INTO tipooperarios values (301, 'Cajero');
INSERT INTO tipooperarios values (302, 'Servicio al Cliente');
INSERT INTO tipooperarios values (303, 'Gerente General');
INSERT INTO tipooperarios values (304, 'Gerente de Agencia');

INSERT INTO modalidades values (401, 'Quincenal');
INSERT INTO modalidades values (402, 'Mensual');
INSERT INTO modalidades values (403, 'Trimestral');
INSERT INTO clientes VALUES (201701,2969521410101,'walter garcía','1995-12-28','walteregv95','1234',0,101);
insert into cuentas values (12301,'activo',5000,1,50,201701,201);
select nocuenta,saldo from cuentas where nocuenta = 12301
update cuentas set Saldo = 4900 where nocuenta = 12301
