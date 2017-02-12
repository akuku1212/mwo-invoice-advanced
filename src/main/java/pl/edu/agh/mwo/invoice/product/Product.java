package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {
		this.name = name;
		if (name == null || name == ""){
			throw new IllegalArgumentException("Product without name");
		}
		this.price = price;
		if (price == null || price.signum() <0 ){
			throw new IllegalArgumentException("Product without name");
		}
		this.taxPercent = tax;
	}

	public String getName() {
		return this.name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		return price.add(price.multiply(taxPercent));
	}
}
