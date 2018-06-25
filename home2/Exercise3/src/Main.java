
public class Main {
	
	static Product product;
	static Conveyor conveyour;
	public static void main(String[] args) {
		System.out.println("Run assemby line");
		conveyour = new Conveyor(new LineStepArc(),new LineStepBody(),new LineStepLens());
		product = new Product();
		product = (Product) conveyour.assembleProduct(product);
		System.out.println("Product is created");
	}

}
