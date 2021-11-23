
public class BinaryVisitorPostTransveral implements AVistorBinTree<String,String>{
	
	//The purpose of this class is to write the binary in post traversal order implementing the visitor pattern

	@Override
	public String interiornode(String v, String left, String right) {
		return left + " " + right+ " " + v ;

		
	}

	@Override
	public String leafnode(String y) {
		
		return y;
	}




}
