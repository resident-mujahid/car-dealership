class Vehicle {


   private int mYear;
   private String mBrand;
   private String mModel;
   private int mKilometers;
   private int mPrice;

   public Vehicle(int year, String brand, String model, int kilometers, int price) {
                mYear = year;
                mBrand = brand;
                mModel = model;
                mKilometers = kilometers;
                mPrice = price;
              }

   public boolean worthBuying(int maxPrice) {
     return (mPrice < maxPrice);
   }

   public int getPrice() {
     return mPrice;
   }

   public int getYear() {
     return mYear;
   }

   public String getBrand() {
     return mBrand;
   }

   public String getModel() {
     return mModel;
   }

   public int getKilometers() {
     return mKilometers;
   }
}
