package SEMANA7;

public class NumeroComplexo implements Comparable<NumeroComplexo> {

		
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

		//Implementando comparaçao para permitir ordenaçao
		@Override
		public int compareTo(NumeroComplexo complexNumber) {
			double diferencaA = this.a - complexNumber.a;
			if (diferencaA == 0){
				double diferencaB = this.b - complexNumber.b;
				return diferencaB == 0 ? 0 : (diferencaB > 0 ? 1 : -1);
			}
			return diferencaA > 0 ? 1 : -1;
		}
		
		
		
	
}