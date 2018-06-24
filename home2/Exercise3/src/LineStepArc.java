
public class LineStepArc implements ILineStep {
	Arc arc;

	@Override
	public IProductPart buildProductPart() {
		arc = new Arc();
		System.out.println("Arc is being built");
		return arc;
	}
		
}
