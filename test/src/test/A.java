package test;



public class A implements AutoCloseable{
	
	
		
		
		
		
	
	
	// int x;
//	    A(int x){this.x=x;
//	        
//	    }
//	    public String toString(){
//	        return Integer.toString(x);
//	    }
//	    public boolean equals(Object object) {
//	    	return true;
//	    }
//	    public int HashCode () {
//			 return 0;
//		    }



	     @SuppressWarnings("static-access")
		public static void main(String []args) throws Exception{
	    	 try (A a = new A()){
	    		 a.m();
	    	 } catch(Error e) {
	    		 System.err.println(e);
	    		 System.err.println(e.getCause());
	    	 }
	    		
	    	// A a = null;
	    	 //A b = null;
//			A a = null;

// a.m();
//	    	 System.err.println(b.getClass()==B.class);
	        // HashMap<A, String> map = new HashMap<>();
//	         map.put(new A(1) ,"1");
//	         map.put(new A(2) ,"2" );
//	         A key1 = new A(1);
//	         A key2 = new A(2);
//	        System.out.println(map.get(key1));
//	         System.out.println(map.get(key2));
	     }




	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		throw new Error("1");
	}
	void m() {
		throw new Error ("2");
	}
	
	}