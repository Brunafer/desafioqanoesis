package desafio3noesis;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolucaoLojistaNoesis {
	
	private PurchasePriceModel model = new PurchasePriceModel();

    // Sem desconto - abaixo de 100 reais
    @Test
    public void shoppingCartNoDiscount() {
        Integer movies[] = new Integer[1];
        movies[0] = 1;
        Double expected = 45.0;
        Double actual = model.getPurchasePrice(movies);
        assertEquals(expected, actual, 2);
    }

    // Com 10% de desconto - entre 100 e 200 reais
    @Test
    public void shoppingCart10Discount() {
        Integer movies[] = new Integer[2];
        movies[0] = 1;
        movies[1] = 5;
        model.getPurchasePrice(movies);
        Double expected = 130.50;
        Double actual = model.getPurchasePrice(movies);
        assertEquals(expected, actual, 2);
    }

    // Com 20% de desconto - entre 200 e 300
    @Test
    public void shoppingCart20Discount() {
        Integer movies[] = new Integer[2];
        movies[0] = 1;
        movies[1] = 6;
        model.getPurchasePrice(movies);
        Double expected = 220.5;
        Double actual = model.getPurchasePrice(movies);
        assertEquals(expected, actual, 2);
    }

    // Com 25% de desconto - entre 300 e 400
    @Test
    public void shoppingCart25Discount() {
        Integer movies[] = new Integer[3];
        movies[0] = 1;
        movies[1] = 2;
        movies[2] = 5;
        movier[3] = 5;
        model.getPurchasePrice(movies);
        Double expected = 248.0;
        Double actual = model.getPurchasePrice(movies);
        assertEquals(expected, actual, 2);
    }

    // Com 30% de desconto - mais de 400
    @Test
    public void shoppingCartAction30Discount() {
        Integer movies[] = new Integer[5];
        movies[0] = 1;
        movies[1] = 2;
        movies[2] = 5;
        movies[3] = 1;
        movies[4] = 2;
        model.getPurchasePrice(movies);
        Double expected = 318.5;
        Double actual = model.getPurchasePrice(movies);
        assertEquals(expected, actual, 2);
    }

   
    // Com 10% de desconto mais 5% por alugar filme de ação
    @Test
    public void shoppingCartActionWithMore5Discount() {
        Integer movies[] = new Integer[2];
        movies[0] = 1;
        movies[1] = 3;
        model.getPurchasePrice(movies);
        Double expected = 123.25;
        Double actual = model.getPurchasePrice(movies);
        assertEquals(expected, actual, 2);
    }

    // Testando carrinho vazio
    @Test
    public void emptyShoppingCartAction() {
        Integer movies[] = new Integer[];
        model.getPurchasePrice(movies);
        Double expected = 0.0;
        Double actual = model.getPurchasePrice(movies);
        assertEquals(expected, actual, 2);
    }

    // Testando carrinho nulo
    @Test
    public void nullShoppingCartAction() {
        Integer movies[] = null;
        model.getPurchasePrice(movies);
        Double expected = 0.0;
        Double actual = model.getPurchasePrice(movies);
        assertEquals(expected, actual, 2);
    }
}

}
