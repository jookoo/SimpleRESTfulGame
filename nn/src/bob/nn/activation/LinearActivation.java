package bob.nn.activation;

public class LinearActivation extends Activation {

	public LinearActivation() {
		super("LINEAR");
	}

	@Override
	public double computeFunction(double value) {
		return value;
	}

}
