class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char taxType;

	//TODO constructor
	public Item(int id, String name, double price, char taxType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	//TODO setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTaxType() {
		return taxType;
	}

	public void setTaxType(char taxType) {
		this.taxType = taxType;
	}

	double taxReturn () {
		//TODO
		double tax = 0.0;

		if(taxType=='A'){
			tax = price*0.18;
		}else if(taxType=='B'){
			tax = price*0.05;
		}

		return tax*0.15;
	}
}