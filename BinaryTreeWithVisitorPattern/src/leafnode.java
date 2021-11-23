public class leafnode<X> extends ABinTree<X>
{
	//CONSTRUCTOR
	
	public leafnode(X v)			//From Abstract
	{
		super(v);			// <-- asking parent for permission to use
	}

	//INTERFACE
	
	public Boolean isLeaf()
	{
		return true;
	}
	
	public BinTreeIN<X> getrightbt() throws Exception
	{
		throw new Exception("getrightbt: A leaf doesn't have a right subtree.");
	}

	public BinTreeIN<X> getleftbt() throws Exception 
	{
		throw new Exception("getleftbt: A leaf doesn't have a left subtree.");
	}

	public Boolean equals(BinTreeIN<X> t)
	{
		return (t.isLeaf() && t.getRootval() == this.val);
	}

	public String inorderString() 
	{
		return this.getRootval().toString();
	}

	public <Y> BinTreeIN<Y> btMap(IBTreeF<X, Y> f) 
	{
		return new leafnode<Y>(f.f(this.getRootval()));
	}

	@Override
	public <Y> Y visit(AVistorBinTree<X, Y> V) {
		return V.leafnode(val);
	}



	
}
