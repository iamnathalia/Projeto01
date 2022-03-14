package GenMusic;

public class FormPlayer {
	

	public class FormPlayer implements Player {

		private int iniciar = 0;
		
		@Override
		public void iniciar() { // Polimorfismo

			System.out.println("\nâ�® â–¶ï¸� â�¸ï¸� â�¹ï¸� â�­ï¸�");
		
		}

		public int getIniciar() { //Encapsulamento 
			return iniciar;
		}

		public void setIniciar(int iniciar) {
			this.iniciar = iniciar;
		}

	}
}
