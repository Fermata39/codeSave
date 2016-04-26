public class callBack {
	public static void main(String[] args) {
		    ifcallback ifc = null;
			    implCallback ic = new implCallback(ifc);
				    ic.testCallFunc();
					}
}

class implCallback implements ifcallback {

	ifcallback ifc;

	    public implCallback(ifcallback ifc) {
			// TODO Auto-generated constructor stub
			this.ifc = new ifcallback() {
					
					@Override
							public void testCallback() {
									    // TODO Auto-generated method stub
									    System.out.println("impl testCallback");
											}
						};

			    }

		public void testCallFunc() {
			    ifc.testCallback();
				}

		    @Override
			    public void testCallback() {
					// TODO Auto-generated method stub
					
				    }

}

interface ifcallback {

	public void testCallback();

}
