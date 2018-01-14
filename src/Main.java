import model.IngredienteBuilder;
import model.Ingrediente;

public class Main {
	
    public static void main(String[] args) {
       Ingrediente ingrediente = new IngredienteBuilder()
                .setNome("Café Pelé")
                .setQuantidade(1)
                .build();

       Ingrediente ingrediente2 = new IngredienteBuilder("Café José", 6)
                                    .build();

       System.out.println(ingrediente2.descricao());
       System.out.println(ingrediente.descricao());
	}

	public void aparelho() {

	}
}
