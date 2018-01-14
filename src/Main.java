import model.IngredienteBuilder;
import model.Ingrediente;

public class Main {
	
    public static void main(String[] args) {
       Ingrediente ingrediente = new IngredienteBuilder()
                .setNome("Café Pelé")
                .setQuantidade(1)
                .build();

       Ingrediente ingrediente2 = new IngredienteBuilder("Café José", 1)
                                    .build();

        System.out.println(ingrediente.getNome());
        System.out.println(ingrediente2.getNome());
    }

	public void aparelho() {
		
	}	
}
