
public class Product implements IProduct {
	private Lens lens;
	private Body body;
	private Arc arc;
	public Product() {
		
	}

	@Override
	public void installFirstPart(IProductPart productPart) {
		System.out.println("Body is being installed");		
	}

	@Override
	public void installSecondPart(IProductPart productPart) {		
		System.out.println("Lens is being installed");
	}

	@Override
	public void installThirdPart(IProductPart productPart) {		
		System.out.println("Arc is being installed");
	}
	
}
