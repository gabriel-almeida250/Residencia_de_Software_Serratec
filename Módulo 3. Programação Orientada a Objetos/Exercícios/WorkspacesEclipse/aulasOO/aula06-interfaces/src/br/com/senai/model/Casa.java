package br.com.senai.model;

public class Casa extends Imovel {
		private boolean garagem;

		public Casa(String local, double valor, boolean garagem) {
			super(local, valor);
			this.garagem = garagem;
		}
		@Override
		public String toString() {
			return super.toString()+ " " + (garagem?" Casa tem garagem":"Não tem garagem");
		}

		@Override
		public String getLocal() {
			// TODO Auto-generated method stub
			return super.getLocal();
		}
		@Override
		public double getValor() {
			// TODO Auto-generated method stub
			return super.getValor();
		}



		public boolean isGaragem() {
			return garagem;
		}

		public void setGaragem(boolean garagem) {
			this.garagem = garagem;
		}

}
