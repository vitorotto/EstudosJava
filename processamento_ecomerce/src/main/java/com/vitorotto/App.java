package com.vitorotto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vitorotto.dto.OrderItemDTO;
import com.vitorotto.dto.RootDTO;
import com.vitorotto.mapper.ClientMapper;
import com.vitorotto.model.ClientModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");
        
        System.out.println("Testes de conversão de double para BigDecimal\n");

        double valDouble = 249.90;
        BigDecimal valBigDecimal = new BigDecimal(valDouble);
        BigDecimal valBigDecimal2 = BigDecimal.valueOf(valDouble);

        System.out.println(valBigDecimal);
        System.out.println(valBigDecimal2);

        System.out.println("\nTeste de JSON");
        String strJson = "{\"produtoId\":12312, \"quantidade\":2}";
        ObjectMapper mapper = new ObjectMapper();        
        OrderItemDTO orderItemDTO;
        try {
            orderItemDTO = mapper.readValue(strJson,OrderItemDTO.class);
            System.out.println("ID:" + orderItemDTO.getProductId() + ", Quantidade: " + orderItemDTO.getQuantity());
        } catch (JsonMappingException e) {
            System.err.println("Erro ao ler o JSON");
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            System.err.println("Erro ao processar o JSON recebido");
            e.printStackTrace();
        }

        System.out.println("\nTeste do ClientMapper");
        strJson = "{\"clientes\": [{ \"id\": 1, \"nome\": \"Ana Beatriz Souza\", \"tipo\": \"VIP\", \"cidade\": \"Porto Alegre\", \"estado\": \"RS\", \"dataCadastro\": \"2022-03-14\" }, { \"id\": 2, \"nome\": \"Carlos Eduardo Lima\", \"tipo\": \"COMUM\", \"cidade\": \"Novo Hamburgo\", \"estado\": \"RS\", \"dataCadastro\": \"2023-07-01\" }],\"produtos\":[],\"pedidos\":[]}";
        try {            
            RootDTO rootDTO = mapper.readValue(strJson, RootDTO.class); // Read the json file
            ClientMapper clientMapper = new ClientMapper(rootDTO.getClientList()); // Creates a clientMapper using the client list from root dto
            List<ClientModel> clientList = clientMapper.mapAll().getSuccessItemsList(); // Create a list os client models with the success items list that can be returned by the MappingResult
            for (ClientModel clientModel : clientList) {
                System.out.println(clientModel.toString());
            }      
        } catch (JsonMappingException e) {
            System.err.println("Erro ao ler o JSON");
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            System.err.println("Erro ao processar o JSON recebido");
            e.printStackTrace();
        }
        
    }

}
