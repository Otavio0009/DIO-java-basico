package POO;

public interface Pcotes {
    /*Pacotes linguagem Java é composta pormilhares de classes com as finalidades de,
    por exemplo: Classes de tipo de dados, representação de texto, números, datas, arquivose diretórios,
    conexão a banco de dados,entre outras. Imagina todas estas classes exitirem em um único nível de documentação?
    E as classes desvolvidas por nós. meros desenvolvedores de aplicações de vários os gêneros? imagina como ficaria este diretório em?
    
    Para prevenir este acontecimento, a linguegem dispõe de um recurso que organiza as classes padrão e criadas por nós,
    que conhecemos como pacote (packge). Os pacotes são subdiretórios a partir da pasta src do nosso projeto onde estão localizadas as
    classes da linguagem e novas que forem criadas para o projeto. Exixtem algumas convenções para criação de pacotes já utilizados no mercado.
    
    Nomenclatura
    Vamos imaginar que sua empresa se chama Power Soft e ela está desenvolvendo sftwares comercial, governamental e um software livre ou de
    código aberto. Abaixo teríamos os pacotes sugeridos conforma tabela abaixo:
    
    Comercial: com.powersoft
    Governamental: gov.powersoft
    Código aberto: org.powersoft
    
    Bem, acima já podemos perceber que existe uma definição para o uso do nome dos pacotes, porém podemos organizar ainda mais um pouco as nossas
    classes mediante a proposta de existêcia:
    
    model: Classes que representam a camada e modelo da aplicação:
    Cliente, Pedido, NotaFiscal, Usuario.
    repository: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de bados: ClienteRepository
    service: Classes que contémrwgras de negócios do sistema: ClienteService
    possui o métpodo validar o CPF do cliente cadastrado.
    controller: Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP.
    view: Classes que possuem alguma interação com a interface gráfica acessada pelo usuário.
    util: Pacote que contém classes utilitárias dos sistemas: FormatadorNumeroUtil, ValidadorUtil.
    
    Indentificação
    Uma das características de uma classe é a sua identificação, Cliente, NotaFiscal, TituloPagar,
    porém quando esta classe é organizada por pacotes, ela passa a ter duas identifiacções. O nome simples (prótprio nome) e agora o nome 
    qualificado (enudereçamento do pacote + nome), exemplo: Considere a classe Usuario que está endereçada no pacote com.controle.acesso.model,
    o nome qualificado desta classe é com.controle.acesso.model.Usuario.
    
    Package versus Import
    A localização de uma classe é definida pela palavra reser vada packge, logo, uma classe só contém uma definição de package no arquivo, sempre na primeira linha do código.
    Para a utilização de uma classe existentes em outros pacotes, nwecessitamos relaizar a importação das mesmas. 
    Exemplo:

    package
    
    import ...
    import ...

    public class MinhaClasse {
        ...
    }
    */
}
