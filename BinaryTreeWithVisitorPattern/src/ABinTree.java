
public abstract class ABinTree<X> implements BinTreeIN<X> {

	//Protected values need the "super" key word to access them
	
		protected X val;		// <-- sheilding the value from outside (like a parent)
		
		protected ABinTree(X v) // Used for leaf/interior node constructors
		{
			val = v;
		}
		
		public X getRootval()	// Method that is inherited by leafnode and interiornode
		{
			return val;
		}
	}


