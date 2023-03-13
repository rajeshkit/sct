public class FunctionsDemo {
	public float calculateEmi(int t,int a,float r) { //called fn
		float emi = a * r / t * 12; // logic
		return emi;
	}
	public int sum(int[] v) {
		//sum of numbers
		return 0;
	}
	public static void main(String[] args) {
		int tenure=2;int amount=20000;float roi=5.6f;
		FunctionsDemo fd=new FunctionsDemo();
		float calculatedEmi=fd.calculateEmi(tenure,amount,roi); // calling function
		float finalAmount=calculatedEmi + 5000;
		System.out.println(finalAmount);
		int[] values= {56,67,45,98,78};
		fd.sum(values);
	}
}
