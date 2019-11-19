import java.util.Date;

public class vehicle {
	private int Vehicle_number;
	private int Price;
	private int Mileage;
	private Date Manufacture_date;
	private String License_plate = new String();
	private int get_make;
	private int get_Category;
	private int get_model;
	private int get_Dm;
	private int get_Transmission;
	private int get_Enginecc;

	//get/////////////////////////////////////////////////
	public int get_Vehicle_number() {
		return Vehicle_number;
	}
	public int get_Price() {
		return Price;
	}
	public int get_Mileage() {
		return Mileage;
	}
	public Date get_Manufacture_date() {
		return Manufacture_date;
	}
	public String get_License_plate() {
		return License_plate;
	}
	public int get_get_make() {
		return get_make;
	}
	public int get_get_Category() {
		return get_Category;
	}
	public int get_get_model() {
		return get_model;
	}
	public int get_get_Dm() {
		return get_Dm;
	}
	public int get_get_Transmission() {
		return get_Transmission;
	}
	public int get_get_Enginecc() {
		return get_Enginecc;
	}

	// set/////////////////////////////////
	public void set_Vehicle_number(int Vehicle_number) {
		this.Vehicle_number = Vehicle_number;
	}
	public void set_Price(int Price) {
		this.Price = Price;
	}
	public void set_Mileage(int Mileage) {
		this.Mileage = Mileage;
	}
	public void set_Manufacture_date(Date Manufacture_date) {
		this.Manufacture_date = Manufacture_date;
	}
	public void set_License_plate(String License_plate) {
		this.License_plate = License_plate;
	}
	public void set_get_make(int get_make) {
		this.get_make = get_make;
	}
	public void set_get_Category(int get_Category) {
		this.get_Category = get_Category;
	}
	public void set_get_model(int get_model) {
		this.get_model = get_model;
	}
	public void set_get_Dm(int get_Dm) {
		this.get_Dm = get_Dm;
	}
	public void set_get_Transmission(int get_Transmission) {
		this.get_Transmission = get_Transmission;
	}
	public void set_get_Enginecc(int get_Enginecc) {
		this.get_Enginecc = get_Enginecc;
	}
}
