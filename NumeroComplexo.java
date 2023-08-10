package br.edu.ifsp.spo.edda.exercicio.semana3;

public class NumeroComplexo {

		float a;
		float b;
		
		public NumeroComplexo() {
			
		}
		
		public NumeroComplexo(float a, float b) {
			this.a = a;
			this.b = b;
		}
		
		public void incrementalA() {
			a++;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(a);
			builder.append(" + ");
			builder.append(b);
			builder.append("i");
			
			return builder.toString();
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			} else {
				if (obj instanceof NumeroComplexo) {
					NumeroComplexo n = (NumeroComplexo) obj;
					if (this.a == n.a && this.b == n.b) {
						return true;
					}
				}
			}
			return false;
		}
		
	
}
