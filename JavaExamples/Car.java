class Car{
	public static void main(String[] args){
		String[] cars  = {"BMW", "Lambo"}; //cars[0] = BMW cars[1]=Lambo
		int numOfCars = cars.length;
		for (String carType : cars) { // carType = BMW & Lambo
			Car.cleanCar(carType);
		}



	}

	public static void cleanCar(String carName){
		System.out.println(carName +" is cleaned");
	}
}

