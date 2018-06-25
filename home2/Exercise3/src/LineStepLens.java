
public class LineStepLens implements ILineStep {
	private Lens lens;

	@Override
	public IProductPart buildProductPart() {
		lens = new Lens();
		System.out.println("Lens is being built");
		return lens;
	}	

}
