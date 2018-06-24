
public class LineStepBody implements ILineStep{
	Body body;

	@Override
	public IProductPart buildProductPart() {
		body = new Body();
		System.out.println("Body is being built");
		return body;
	}
}
