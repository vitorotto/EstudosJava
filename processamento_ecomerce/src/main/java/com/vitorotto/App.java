package com.vitorotto;

import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vitorotto.dto.OrderItemDTO;
import com.vitorotto.model.OrderItemModel;
import com.vitorotto.model.ProductModel;

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
    }

}
