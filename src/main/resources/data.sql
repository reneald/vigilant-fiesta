CREATE TABLE type
(
    type_id number(3) NOT NULL,
    type_name varchar(24) NOT NULL,
    might_pool number(2) NOT NULL,
    speed_pool number(2) NOT NULL,
    intellect_pool number(2) NOT NULL,
    effort number(1) NOT NULL
    PRIMARY KEY (type_id)
);
insert into type (type_id, type_name, might_pool, speed_pool, intellect_pool, effort)
values (1, 'Warrior', 10, 10, 8, 1);
insert into type (type_id, type_name, might_pool, speed_pool, intellect_pool, effort)
values (2, 'Adept', 7, 9, 12, 1);
insert into type (type_id, type_name, might_pool, speed_pool, intellect_pool, effort)
values (3, 'Explorer', 10, 9, 9, 1);
insert into type (type_id, type_name, might_pool, speed_pool, intellect_pool, effort)
values (4, 'Speaker', 8, 9, 11, 1);