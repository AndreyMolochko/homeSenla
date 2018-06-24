
public class Conveyor implements IAssemblyLine {
	LineStepArc creatingArc;
	LineStepBody creatingBody;
	LineStepLens creatingLens;
	
	public Conveyor() {		
		creatingArc = new LineStepArc();
		creatingBody = new LineStepBody();
		creatingLens = new LineStepLens();		
	}

	@Override
	public IProduct assembleProduct(IProduct product) {
		System.out.println("We are beginning to assemle a product");
		product.installFirstPart(creatingBody.buildProductPart());
		product.installSecondPart(creatingLens.buildProductPart());
		product.installThirdPart(creatingArc.buildProductPart());
		System.out.println("We finished to assemle the product");
		return product;
	}
}
