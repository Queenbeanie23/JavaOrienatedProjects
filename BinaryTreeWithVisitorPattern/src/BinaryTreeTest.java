import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

		BinTreeIN<Integer> L = new leafnode<Integer>(2);  
		BinTreeIN<Integer> R = new leafnode<Integer>(3);  
		BinTreeIN<Integer> T = new interiornode<Integer>(1,L,R); 
		
		BinTreeIN<Integer> A = new leafnode<Integer>(100);  
		BinTreeIN<Integer> B = new leafnode<Integer>(3);  
		BinTreeIN<Integer> C = new interiornode<Integer>(1,A,B);
		
		BinTreeIN<String> A1 = new leafnode<String>("100");  
		BinTreeIN<String> B1 = new leafnode<String>("3");  
		BinTreeIN<String> C1 = new interiornode<String>("1",A1,B1);
		
		
		BinTreeIN<Integer> L1 = new leafnode<Integer>(2);  
		BinTreeIN<Integer> R1 = new leafnode<Integer>(3);  
		BinTreeIN<Integer> T1 = new interiornode<Integer>(1,L1,R1);		//same as T
		
		BinTreeIN<Integer> DL = new leafnode<Integer>(4);  
		BinTreeIN<Integer> DR = new leafnode<Integer>(6);  
		BinTreeIN<Integer> DT = new interiornode<Integer>(2,DL,DR);		//2 * T
		AVistorBinTree<Integer,Integer> V = new BInaryVisitorMax();
		AVistorBinTree<String,String> X = new BinaryVisitorPostTransveral();
		@Test
		void test() 
		{
			try
			{
				assertEquals(L.getRootval().intValue(),2);  
				assertEquals(T.getRootval().intValue(),1);  
				
				assertEquals(T.getleftbt(), L);  
				assertEquals(T.getrightbt(), R);  
				
				assertEquals(R.equals(R1), true);  
				assertEquals(T.equals(T1), true);  
				
				assertEquals(L1.inorderString(), "2");
				assertEquals(T.inorderString(), "2 1 3");
				
				assertEquals(R1.btMap(x -> 2 * x).equals(DR), true);  
				assertEquals(T.btMap(x -> 2 * x).equals(DT), true);
				
				// Testing for the Max 
				assertEquals(L1.visit(V),2);
				assertEquals(R1.visit(V),3);
				assertEquals(T1.visit(V),3);
				
				assertEquals(DL.visit(V),4);
				assertEquals(DT.visit(V),6);
				assertEquals(DR.visit(V),6);
				assertEquals(C.visit(V),100);
				// Returning the binary tree is post traversal
				assertEquals(C1.visit(X),"100 3 1");
				assertEquals(B1.visit(X), "3");
				assertEquals(A1.visit(X), "100");
				//Max Test
				assertEquals(C.visit(V),100);
				assertEquals(B.visit(V), 3);
				assertEquals(A.visit(V), 100);
			}
			catch(Exception e)
			{
				System.out.println("Error in tests: " + e.getMessage());
			}
		}

	}




