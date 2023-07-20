SELECT
     cliente.`IDcliente` AS cliente_IDcliente,
     cliente.`nome` AS cliente_nome,
     cliente.`celular` AS cliente_celular,
     cliente.`numero` AS cliente_numero,
     cliente.`obs` AS cliente_obs,
     cidade.`CEP` AS cidade_CEP,
     cidade.`Estado` AS cidade_Estado,
     cidade.`Rua` AS cidade_Rua,
     cidade.`bairro` AS cidade_bairro,
     cidade.`cidade` AS cidade_cidade
FROM
     `cidade` cidade INNER JOIN `cliente` cliente ON cidade.`IDcidade` = cliente.`IDcidade`