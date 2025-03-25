package teste;


public class linkedlist {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.adiciona("Marques");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Lala");
		System.out.println(lista);
		
		lista.adiciona(1, "Mio");
		System.out.println(lista);
		
		lista.removeDoComeco(0);
		System.out.println(lista);
		
		Object ret = lista.pega(1);
		System.out.println(ret);
		
		System.out.println(lista.tamanho());
		

	}
}
