
public class BInaryVisitorMax implements AVistorBinTree<Integer,Integer> {
	
	
	//purpose: to return the max value of a binary tree using the visitor pattern

	@Override
	public Integer interiornode(Integer v, Integer left, Integer right) {
		
		return Math.max(v,Math.max(left,right) );
	}

	@Override
	public Integer leafnode(Integer y) {

		return y;
	}


	




	



}
