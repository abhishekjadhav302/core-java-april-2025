package abtraction_interface_practice;

public class Test {

	public static void main(String[] args) {

//		CarCompany_abstraction cc = new CarCompany_abstraction() {
//
//			@Override
//			void subBrand_Jaguar() {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			protected void subBrand_RangRover() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};

		Harrier_abstraction Ha;
		Ha = new Harrier_abstraction();

		System.out.println("car name: " + Ha.carName);
		System.out.println("features: " + Ha.features());

		Ha.subBrand_Jaguar();
		Ha.subBrand_RangRover();

		Ha.wheelsCount = 23;
		System.out.println("Static variable in main parent class" + Ha.check);
		System.out.println("Wheele count: " + Ha.wheelsCount);
		System.out.println("Engine name: " + Ha.engine);
//		System.out.println("Vehical Type: " + Ha.vehicalType(""));
		System.out.println("Vehical Type: " + Ha.getDangerous(""));

	}

}
