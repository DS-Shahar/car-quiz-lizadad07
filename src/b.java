
	
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


    public static int legalCities(CameraInfo[] cameras) {
    	int countLegal = 0;
        int[] uniqueCities = new int[cameras.length];
        int count = 0;

        for (int i = 0; i < cameras.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < count; j++) {
                isUnique = isUnique && (cameras[i].getCity() != uniqueCities[j]);
            }
            if (isUnique) {
                uniqueCities[count++] = cameras[i].getCity();
                if (cameras[i].allGood()) {
                    countLegal++;
                }
            }
        }
        return countLegal;
    }

