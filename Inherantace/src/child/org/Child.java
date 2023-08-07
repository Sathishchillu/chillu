package child.org;

public class Child implements GrandParent,Parent{
	int k = 8000;
	private void kumar() {
	 System.out.println(k);
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
	
		obj.kumar();
		obj.sathish();
		obj.chillu();
				

	}

	@Override
	public void sathish() {
		System.out.println(m);
		
		
	}

	@Override
	public void chillu() {
		System.out.println(s);
		
	}

}
