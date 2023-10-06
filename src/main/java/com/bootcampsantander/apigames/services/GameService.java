package com.bootcampsantander.apigames.services;

    // O service é um componente respondavel por implementar logica de negocio.

    /*uma logica de negocio é uma regra que ira ter que acontecer, como por exemplo:
    estamos fazendo um sistema de comércio e iremos registrar um pedido,
    quando a pessoa preenche o carrinho de compras e registra o pedido
    temos que verificar o estoque, dar baixa no estoque, registrar o pedido
    tambem, enviar um email avisando do pedido, processar o cartao de credito da pessoa e etc,
    ou seja temos ali uma regra de negocio complexa quando registramos o pedido.

    e onde ficara toda esta logica de negocio ?

    ira ficar na camada de serviço e não no repository
    o repository apenas ira fazer consulta no banco e acessar os dados
    mas quem orquestra essas operaçoes é a camada de serviço

    * */

    //registraremos o componente no spring boot

    /* O @Service Ira registrar o GameService como sendo um componente do sistema,
    podemos utilizar ele agora em outros componentes ou seja injetar um componente no outro
    este principio nada mais é doque INJEÇÃO DE DEPENDENCIAS
    */

//import org.springframework.stereotype.Component;
import com.bootcampsantander.apigames.dto.GameMinDTO;
import com.bootcampsantander.apigames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//@Component ou
@Service
public class GameService {

    //IRIEMOS INJETAR O GameRepository no GameService
    @Autowired
    private GameRepository gameRepository;

    //operação que chamara o repository e ira buscar dados banco de dados ou DTO
    public List<GameMinDTO> findAll(){ // metodo que retorna uma lista do tipoGameMinDTO

        //iremos fazer uma consulta no banco de dados para buscar os games aqui
        var result = gameRepository.findAll();
        //List<GameMinDTO> dto =result.stream().map(x -> new GameMinDTO(x)).toList();

        /*
        * strem é uma lib do java que permite fazer operações com sequencia de dados exemplo map
          que tranforma objetos de uma coisa para outra.
        */

        return result.stream().map(x -> new GameMinDTO(x)).toList(); // aqui estamos usando o clean code, em uma linha podemos resumir oq foi feito la em cima

        /*Esta parte do código está transformando uma lista de objetos Game em uma lista de objetos GameMinDTO usando uma operação de mapeamento (mapping).
        Em seguida, retorna a lista resultante.

        Nessa parte do código, stream().map(x -> new GameMinDTO(x)), estamos usando um stream para percorrer cada elemento da lista (result) e, para cada elemento (x), estamos criando um novo objeto GameMinDTO com x como argumento do construtor new GameMinDTO(x). Isso efetivamente mapeia cada objeto da lista original para um objeto GameMinDTO correspondente.

        */

    }


}
