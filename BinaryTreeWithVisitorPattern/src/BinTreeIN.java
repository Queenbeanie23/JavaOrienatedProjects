
public interface BinTreeIN<X> {
	//Purpose: Returns the value of the root of the leaf
		public X getRootval();
		
		//Purpose: Determines if what is given is a leaf
		public Boolean isLeaf();
		
		//Purpose: Gets the left leaf of the interior node
		public BinTreeIN<X> getleftbt() throws Exception;

		//Purpose: Gets the right leaf of the interior node
		public BinTreeIN<X> getrightbt() throws Exception;
		
		//Purpose: Determines if two leaf/interior nodes are equal to each other
		public Boolean equals(BinTreeIN<X> t);
		
		//Purpose: Turns the tree into a string
		public String inorderString();
		
		//Purpose: Applies a function to a given binary tree
		public <Y> BinTreeIN<Y> btMap(IBTreeF<X, Y> f);
		// purpose: creating a visitor for the binary tree to implement new method max and traversal.
		public <Y> Y visit(AVistorBinTree<X,Y> V);
}
