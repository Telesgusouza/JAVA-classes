package entitites;

public class OutsourceEmployee extends Employee {
	private Double additionalCharge;

	public OutsourceEmployee(Double additionalCharge) {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + (additionalCharge + ((additionalCharge * 10) / 100));
	}
	
}
