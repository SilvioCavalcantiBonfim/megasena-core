# Projeto Mega Sena

Este projeto é uma aplicação Java que simula a loteria Mega Sena, usando conceitos avançados de POO, princípios SOLID e padrão MVC. O código segue boas práticas e é extensível. Primeiro, usei arrays para manipular os dados, devido a limitações impostas ao desafio [(Código da versão entregue do desafio)](https://github.com/SilvioCavalcantiBonfim/Estudo-Java/tree/0.1.0/Atividades%20do%20Vai%20na%20Web/MEGA-SENA%20EM%20JAVA), mas depois mudei para listas e conjuntos, que são mais flexíveis e rápidos.

## Funcionalidades

- Geração de números aleatórios para simular o sorteio da Mega Sena.
- Interação com o usuário para escolha dos números desejados.
- Apresentação dos números sorteados e resultados da simulação.

## Diagrama de classes

[![](https://mermaid.ink/img/pako:eNrtWW1P4zgQ_itRPrFqi0rpUqgQUrewe0gUVi23d7rraWUSt7U2sSvb4WVZ_vs5dprYid2ksLefrh-g8Uzm9ZkZ2332AxJCf-gHEWDsHIElBfEce-ITIgoDjgj2rqZqxRut1xEKgFzsdH6ceRO4BDOIwZhgTkkUQao4q-ve6Y9Ox7J-Ga8j1zspzdTzBcGH5tz1nOcUPGCTLVVhGpuuVM3crCpBNwlfJ_x8dKOY8kclKX-sE3OJdSmbJyVk81TI0Fcyf-ACJBGXBBePRtTZK0TDaN1LJzkTp3MZehShKmoTCzPshZ8yS4oovxaUKcAhia-T-A7STxBDCjhUjDZKSWJhuI1ZMRaguUILGDwFEfyNkG9MKXFRC0XbOJRuraZmHFCeB22nV8cRYXCHV2UAlMNsFIZIlnT2eYuMjwgjtmou43ZFycPFYwDXugXap6mgzyJ0KEBrgLkyaQpB-DNkZB41lTGFTCB9Vz_qu6Psz3rGn-d5uFqeQI6w3LsnKPRigPDeO0V9meMNGwYxZGsQQM0ITYaSX7VAY_G801OEOaQLIeXsTCdIxTTJ9aoPU1ZZhsFdgqIQUp39pd6WNBqGPR1P2ONNRn9-nY6uP11YSJfXLtLtze3o6uv175MPF1OTmrej2JgjZbIcFHFlMG3YVNMKiwGzITgxsBJ_5wZzyxHYjlpnab8wo5jTlpBX4OxilKa6iArQVupCloY1iVbgpUFyQq5ErAPbHzAKSAwnkDGwhKZ5aXqpKN1xQim0Oy9lhIitI_Ck3J9BfnopFC4hPVNpc74wXolma74QpEvOF7IYshWhqWXpg5P3glJC94qWaJEapM1-a6lJbNqLbFv8ZRsrVVixlSntcTYM-S7F3LwYCN6WrVaTfLV2z1hr95x1RCOlCC-9BaEx4IL7lqiVvYzA4SPfoqUu0a0dUt1yJLtaY0WFTcRmXsugmWE9s47ikhpBGF5iFa80M_cgSnTLCh6VBhuPHgDddiP-ts5TZpBmGBx3hEQQYA-xMRFwhRx-RFGkc5RqIa-D1NAY4bbEWwwe1RdOOIjeWfqWGTxbaVTRtIVumQSZQV_S4Fko4NFBkSZboFKTOJPPnby8vwsCCsVW2CwbBrmKnE2-K_Fyk1KXfBtTFQApVx0IKmlU09gogEtbAQi__v7Hw6LKi_iYCMnxpUS6wFVjShlOHe8KMc1zKk8kMxipI7jOmGk6N_GUY6aybj0jUbzU949N3M5AIWY-H0VRuUm_lDacRU8SEyF31IxEPjnqG1NqUGqeCNBeuReJDRSgH5LFwhwa9u6ZJU8deSsTspIs4_hs5Cs3HhVH5mKcWWxtbbXW3u0r9hTTuGEzX4uxxTfTK2bLaigKkbZwWJWXNuIZeHOydh3ymZJ7JGSyiqdOwzSfy95bobwbeNLvdyTBYTUQVun1EHHdNJhwUVyWuttimbumFiCK7kDwrTTpzXsWTf_siXEY7xMTqLV5sMiWsDc8mwUAC689Fvx3RaD9K4LA1ujZWq-_rp9YC-StlVlBWPmKqKECgssvaoZ7ThXyKuk1Ksal2HiWuVe6LmqsxvayrBgs15ygdV5RvUqzetXcDpUNKHltXnA11qqOBvVVab2yaqzF-rY1rF4DtTsGdouMnSKszlyN1WZHNHXmNA5oZp8pd5v0dqbUbl03OT-hPndP0c6lUo-1BjF7czZfW2cNGlA-2J03bvXDfduF7_P_-fyl-dzUp9_2Y0hjgEJ_6MskzH2-gjGc-0PxNVQblbk_xykrSDiZPeHAH4pNE4NtP1mnZ9rsp858VTj6FyHimdNEPfrDZ__RH3b3T47fD_pH73vHB4eDbr932Paf_OFg_-SgNzjpHnZPBv1ev3_80va_SwEH-93jk16_ezTo9rr9g6PeUduHIm2ETrKfWtN_L_8CsJkxEQ?type=png)](https://mermaid.live/edit#pako:eNrtWW1P4zgQ_itRPrFqi0rpUqgQUrewe0gUVi23d7rraWUSt7U2sSvb4WVZ_vs5dprYid2ksLefrh-g8Uzm9ZkZ2332AxJCf-gHEWDsHIElBfEce-ITIgoDjgj2rqZqxRut1xEKgFzsdH6ceRO4BDOIwZhgTkkUQao4q-ve6Y9Ox7J-Ga8j1zspzdTzBcGH5tz1nOcUPGCTLVVhGpuuVM3crCpBNwlfJ_x8dKOY8kclKX-sE3OJdSmbJyVk81TI0Fcyf-ACJBGXBBePRtTZK0TDaN1LJzkTp3MZehShKmoTCzPshZ8yS4oovxaUKcAhia-T-A7STxBDCjhUjDZKSWJhuI1ZMRaguUILGDwFEfyNkG9MKXFRC0XbOJRuraZmHFCeB22nV8cRYXCHV2UAlMNsFIZIlnT2eYuMjwgjtmou43ZFycPFYwDXugXap6mgzyJ0KEBrgLkyaQpB-DNkZB41lTGFTCB9Vz_qu6Psz3rGn-d5uFqeQI6w3LsnKPRigPDeO0V9meMNGwYxZGsQQM0ITYaSX7VAY_G801OEOaQLIeXsTCdIxTTJ9aoPU1ZZhsFdgqIQUp39pd6WNBqGPR1P2ONNRn9-nY6uP11YSJfXLtLtze3o6uv175MPF1OTmrej2JgjZbIcFHFlMG3YVNMKiwGzITgxsBJ_5wZzyxHYjlpnab8wo5jTlpBX4OxilKa6iArQVupCloY1iVbgpUFyQq5ErAPbHzAKSAwnkDGwhKZ5aXqpKN1xQim0Oy9lhIitI_Ck3J9BfnopFC4hPVNpc74wXolma74QpEvOF7IYshWhqWXpg5P3glJC94qWaJEapM1-a6lJbNqLbFv8ZRsrVVixlSntcTYM-S7F3LwYCN6WrVaTfLV2z1hr95x1RCOlCC-9BaEx4IL7lqiVvYzA4SPfoqUu0a0dUt1yJLtaY0WFTcRmXsugmWE9s47ikhpBGF5iFa80M_cgSnTLCh6VBhuPHgDddiP-ts5TZpBmGBx3hEQQYA-xMRFwhRx-RFGkc5RqIa-D1NAY4bbEWwwe1RdOOIjeWfqWGTxbaVTRtIVumQSZQV_S4Fko4NFBkSZboFKTOJPPnby8vwsCCsVW2CwbBrmKnE2-K_Fyk1KXfBtTFQApVx0IKmlU09gogEtbAQi__v7Hw6LKi_iYCMnxpUS6wFVjShlOHe8KMc1zKk8kMxipI7jOmGk6N_GUY6aybj0jUbzU949N3M5AIWY-H0VRuUm_lDacRU8SEyF31IxEPjnqG1NqUGqeCNBeuReJDRSgH5LFwhwa9u6ZJU8deSsTspIs4_hs5Cs3HhVH5mKcWWxtbbXW3u0r9hTTuGEzX4uxxTfTK2bLaigKkbZwWJWXNuIZeHOydh3ymZJ7JGSyiqdOwzSfy95bobwbeNLvdyTBYTUQVun1EHHdNJhwUVyWuttimbumFiCK7kDwrTTpzXsWTf_siXEY7xMTqLV5sMiWsDc8mwUAC689Fvx3RaD9K4LA1ujZWq-_rp9YC-StlVlBWPmKqKECgssvaoZ7ThXyKuk1Ksal2HiWuVe6LmqsxvayrBgs15ygdV5RvUqzetXcDpUNKHltXnA11qqOBvVVab2yaqzF-rY1rF4DtTsGdouMnSKszlyN1WZHNHXmNA5oZp8pd5v0dqbUbl03OT-hPndP0c6lUo-1BjF7czZfW2cNGlA-2J03bvXDfduF7_P_-fyl-dzUp9_2Y0hjgEJ_6MskzH2-gjGc-0PxNVQblbk_xykrSDiZPeHAH4pNE4NtP1mnZ9rsp858VTj6FyHimdNEPfrDZ__RH3b3T47fD_pH73vHB4eDbr932Paf_OFg_-SgNzjpHnZPBv1ev3_80va_SwEH-93jk16_ezTo9rr9g6PeUduHIm2ETrKfWtN_L_8CsJkxEQ)

## Estrutura do Projeto

O projeto está estruturado utilizando o padrão de arquitetura MVC:

#### Model: Contém as classes relacionadas à lógica de negócios da aplicação.

- `MegaSena`: Define as funcionalidades para manipulação dos números escolhidos e sorteados.
- `Drawn`: Interface para geração dos números sorteados.

#### View: Responsável pela interação com o usuário.

- `MegaSenaView`: Interface para exibição das mensagens e resultados.
- `MegaSenaViewImpl`: Implementação da interface para interação com o usuário.

#### Controller: Controla o fluxo da aplicação.
- `MegaSenaController`: Define as operações disponíveis no controller.
- `MegaSenaControllerImpl`: Implementação das operações do controller.

#### DAO (Data Access Object): Classes relacionadas à obtenção de dados.

- `InputDAO` e `OutputDAO`: Interfaces para entrada e saída de dados.
- Implementações correspondentes (`InputDAOImpl` e `OutputDAOImpl`).

#### Fallback e SPI

- `DefaultInput` e `DefaultOutput`: Implementações padrão para entrada e saída de dados.
- `Input` e `Output`: Interfaces SPI (Service Provider Interface) para entrada e saída de dados personalizáveis.
- Classes relacionadas às extensões do `ControllerLifecycleHooks`.

#### Hooks e Service Loader API
- `ControllerLifecycleHooks`: Define os pontos de extensão do ciclo de vida do controller.
- Implementação (`ControllerLifecycleHooksImpl`) e classes SPI associadas.


## Extensibilidade com Service Loader API

O projeto foi arquitetado levando em consideração a extensibilidade, empregando a **API Service Loader** do Java para ampliar o Princípio Aberto-Fechado (OCP). As interfaces foram utilizadas para definir os Hooks de ciclo de vida do controlador, possibilitando a adição de novos comportamentos sem a necessidade de alterar o código já existente. Adicionalmente, a substituição de I/O pode ser realizada sem qualquer modificação no código-fonte, reforçando a flexibilidade e adaptabilidade do projeto.

## Agradecimentos

Gostaria de expressar minha gratidão ao Vai na Web, e aos professores [Samuel](https://www.linkedin.com/in/samuel-silveriom/) e [Leno](https://www.linkedin.com/in/leno-rafael-85a2ab1ba/), cujo as orientações contribuiu significativamente para o desenvolvimento deste projeto. Além disso, a inspiração e base de conhecimento para a aplicação dos princípios SOLID foram obtidas através do livro *Desbravando SOLID: Práticas avançadas para códigos de qualidade em Java moderno*.

Este projeto visa demonstrar boas práticas de desenvolvimento em Java e serve como base para aplicações futuras, promovendo a manutenibilidade, extensibilidade e qualidade do código.