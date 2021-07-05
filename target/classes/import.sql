insert into tb_regra (nome) values ('produto'), ('ingesta_origin'), ('package');
insert into tb_depara_cosif_cargabal (padrao, cosif, cargabal) values ('padrao', '2222', '3333'), ('padrao 1', '44444', '555555'), ('padrao2', '6666', '7777');
insert into tb_campo (id_regra, nome, conta_padrao, conta_resultado) values (1, 'campo_1', 'padrao', 'padrao2'), (1, 'campo_1', 'padrao', 'padrao2'), (3, 'campo_1', 'padrao', 'padrao2');
-- insert into tb_campo (id_regra, nome) values (1, 'campo_1', 'padrao'), (1, 'campo_1', 'padrao 1'), (3, 'campo_1', 'padrao2');