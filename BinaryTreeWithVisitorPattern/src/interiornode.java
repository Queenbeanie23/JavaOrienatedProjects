public class interiornode<X> extends ABinTree<X>
{
	//CONSTRUCTOR
	
	private BinTreeIN<X> l, r;
	
	public interiornode(X v, BinTreeIN<X> left, BinTreeIN<X> right)		//From abstract
	{
		super(v);		// <-- asking parent for permission to use
		l = left;
		r = right;
	}
	
	//INTERFACE

	public Boolean isLeaf() 
	{
		return false;
	}

	public BinTreeIN<X> getleftbt() throws Exception 
	{
		return this.l;
	}

	public BinTreeIN<X> getrightbt() throws Exception 
	{
		return this.r;
	}

	public Boolean equals(BinTreeIN<X> t) 
	{
		try
		{
			return (!t.isLeaf() &&
					this.getRootval().equals(t.getRootval()) &&
					this.getleftbt().equals(t.getleftbt()) &&
					this.getrightbt().equals(t.getrightbt())
					);
		}
		catch(Exception e)
		{
			System.out.println("Error equals in interior node: " + e.getMessage());
			return false;
		}
	}

	public String inorderString() 
	{
		try
		{
			return (this.getleftbt().inorderString() + " " +
					this.getRootval().toString() + " " +
					this.getrightbt().inorderString());
		}
		catch(Exception e)
		{
			System.out.println("Error inorderString in interiornode: " + e.getMessage());
			return null;
		}
	}

	public <Y> BinTreeIN<Y> btMap(IBTreeF<X, Y> f) 
	{
		try
		{
			return (new interiornode<Y>(f.f(this.getRootval()),
					this.getleftbt().btMap(f),
					this.getrightbt().btMap(f)));
		}
		catch(Exception e)
		{
			System.out.println("Error map in interiornode: " + e.getMessage());
			return null;
		}
	}

	@Override
	public <Y> Y visit(AVistorBinTree<X, Y> V) {
			return V.interiornode(val, l.visit(V), r.visit(V));
	}

	

	
	
	
}
