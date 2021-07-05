insert into tb_user (name, email, password, profile, status) values ('francisco', 'francisco@adentis.pt', 'password', 'Administrador', true), ('jerameel', 'jerameel@adentis.pt', 'password', 'Administrador', true), ('ana', 'ana@adentis.pt', 'password','Anônimo', true);
insert into tb_authority (email, role) values ('francisco@adentis.pt', 'ROLE_ADMIN'), ('jerameel@adentis.pt', 'ROLE_ADMIN'), ('ana@adentis.pt', 'ROLE_ANONIM');
insert into tb_book (title, copies, available) values ('A Lei do Triúnfo e do Sucesso', 100, true), ('7 Hábitos de Pessoas Altamente Eficazes', 100, true), ('A Bíblia Sagrada', 100, true);
insert into tb_category (description) values ('Romance'), ('Drama'), ('Religioso'), ('Erôtico'), ('Desenvolvimento pessoal'), ('Terror');
insert into tb_book_categories (tb_book_id, categories_id) values (1,2), (3,1);
-- insert into tb_campo (id_regra, nome) values (1, 'campo_1', 'padrao'), (1, 'campo_1', 'padrao 1'), (3, 'campo_1', 'padrao2');