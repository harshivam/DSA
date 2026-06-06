class ParkingSystem {
    int big;
    int small;
    int medium;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
       this.small = small;
         this.medium =medium;
    }

    public boolean addCar(int carType) {
        if((carType == 1 && big==0) || (carType == 2 && medium==0) || (carType == 3 && small==0)) return false;
        else if(carType == 1){
             big--;
             return true;
        }
        else if(carType == 2){
             medium--;
             return true;
        }
        else{
            small--;
            return true;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */