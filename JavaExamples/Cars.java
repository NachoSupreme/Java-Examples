class Cars{
	public static void main(String[] args){
		String[] cars  = {"BMW", "Lambo"}; //cars[0] = BMW cars[1]=Lambo
		for (int numOfCars = cars.length; numOfCars>0; numOfCars--) { // carType = BMW & Lambo
			Cars.cleanCar(carType);
		}



	}

	public static void cleanCar(String carName){
		System.out.println(carName +" is cleaned");
	}
}

