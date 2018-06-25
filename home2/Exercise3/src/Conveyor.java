
public class Conveyor implements IAssemblyLine {
	private LineStepArc lineStepArc;
	private LineStepBody lineStepBody;
	private LineStepLens lineStepLens;
	
	public Conveyor(LineStepArc lineStepArc, LineStepBody lineStepBody, LineStepLens lineStepLens) {
		this.lineStepArc=lineStepArc;
		this.lineStepBody=lineStepBody;
		this.lineStepLens=lineStepLens;
	}

	@Override
	public IProduct assembleProduct(IProduct product) {
		System.out.println("We are beginning to assemle a product");
		product.installFirstPart(lineStepBody.buildProductPart());
		product.installSecondPart(lineStepLens.buildProductPart());
		product.installThirdPart(lineStepArc.buildProductPart());
		System.out.println("We finished to assemle the product");
		return product;
	}
}
