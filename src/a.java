
	
	public boolean illegal (int maxSpeed) {
		if (this.privateCar==true || this.speed>maxSpeed)
			return true;
		return false;
	}


	public boolean allGood() {
		for (int i=0; i<cars.length; i++) {
			if (cars[i].illegal(maxSpeed)==true)
				return false;
		}
		return true;
	}




	public static int legalCities(cameraInfo[] cameras) {
		int countLegal=0;
		cameraInfo [] arrCitys = new cameraInfo[100];
		int count=100;
		
		for (int i=0; i<cameras.length; i++) {
			int count2 = 0;
			for (int j=i+1; j<cameras.length; j++) {
				if (cameras[i].getCity()==cameras[j].getCity())
					count2++;
			}
			if (count2==0)
				arrCitys[--count] = cameras[i];
			
		}
		for (int u=0; u<arrCitys.length; u++) {
			if ((arrCitys[u]).allGood()==false)
				countLegal++;
		}
		return countLegal;
	}
