package br.com.fiap.winery;

import jakarta.jws.WebService;

import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")

public class WineStockServiceImplementation implements WineStockService {
    List<String> vinhos = Arrays.asList("Cabernet", "Merlot", "Chardonnay");

    @Override
    public String getMenu() {
        String menu = "";
        for (int i = 0; i < vinhos.size(); i++) {
            menu += vinhos.get(i);
            if (i < vinhos.size() - 1) {
                menu += ", ";
            }
        }
        return menu;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }

}
