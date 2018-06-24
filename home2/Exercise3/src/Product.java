
public class Product implements IProduct {
	Lens lens;
	Body body;
	Arc arc;
	public Product() {
		
	}

	@Override
	public void installFirstPart(IProductPart productPart) {
		System.out.println("Body is being installed");
		
	}

	@Override
	public void installSecondPart(IProductPart productPart) {
		// TODO Auto-generated method stub
		System.out.println("Lens is being installed");
	}

	@Override
	public void installThirdPart(IProductPart productPart) {
		// TODO Auto-generated method stub
		System.out.println("Arc is being installed");
	}
	
}
