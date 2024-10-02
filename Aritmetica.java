
public class Aritmetica implements CalculoMedia{
	@Override
	public double calcular(double p1, double p2) {
		return (p1 + p2) / 2.0;
	}

	@Override
	public boolean estaAprovado(double media) {
		return media >= 5.0;
	}
}
