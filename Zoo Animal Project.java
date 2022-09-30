class ZooAnimal {

   protected String name;
   protected String species;
   protected int age;


   public ZooAnimal() {    

   }

   public ZooAnimal(String name, String species, int age) {

      this.name = name;
      this.species = species;
      this.age = age;      

   } 

   public void setName(String name) {

      this.name = name; 	   	   	   	   	   	   	 

   }

   public void setSpecies(String species) {

      this.species = species; 	   	   	   	   	       	 	   	   	   	   	   

   }


   public void setAge(int age) {

      this.age = age; 	   	

   }


   public String getName() {

      return name; 

   }

   public String getSpecies() {

      return species; 

   }

   public int getAge() {

      return age; 

   }

   public String toString() {

      return "Name: "+name+"\nSpecies: "+species+"\nAge: "+age;
} 

} 

 class Bird extends ZooAnimal {

   private boolean canFly;
   private int wingSpan;

   public Bird() {    

   }
   public Bird(String name, String species, int age, boolean canFly, int wingSpan) {

      super(name,species,age);
      this.canFly = canFly;
      this.wingSpan = wingSpan; 	   	   	   

   } 
   public void setCanFly(boolean canFly) {

      this.canFly = canFly; 	   	   	   	   	       	 

} 
   public void setWingSpan(int wingSpan) {

      this.wingSpan = wingSpan; 	   	   	

   }
   public boolean isCanFly() {

      return canFly; 

} 
   public int getWingSpan() {

      return wingSpan; 

} 

   public String toString() {

      return super.toString()+"\nCan Fly: "+canFly+"\nWing Span: "+wingSpan+" feet";            	   	       	 

} 

} 



 class Mammal extends ZooAnimal {

   private boolean hasFur;
   private int numLegs;

public Mammal() {    

   }

   public Mammal(String name, String species, int age, boolean hasFur, int numLegs) {

      super(name,species,age);
      this.hasFur = hasFur;
      this.numLegs = numLegs; 	   	   	   

   } 

   public void setHasFur(boolean hasFur) {

      this.hasFur = hasFur; 	   	   	   	       	 

} 

   public void setNumLegs(int numLegs) {

      this.numLegs = numLegs; 	   	   	

   }

   public boolean isHasFur() {

      return hasFur; 

} 
   public int getNumLegs() {

      return numLegs; 

} 

   public String toString() {

      return super.toString()+"\nHas Fur: "+hasFur+"\nNumber of Legs: "+numLegs;            	   	       	 

} 

} 

 class Reptile extends ZooAnimal {

   private boolean isVenomous;
   private int length;

public Reptile() {    

   }

   public Reptile(String name, String species, int age, boolean isVenomous, int length) {

      super(name,species,age);
      this.isVenomous = isVenomous;
      this.length = length; 	   	   	       	 

   } 

   public void setIsVenomous(boolean isVenomous) {

      this.isVenomous = isVenomous; 	   	   	        

} 

   public void setLength(int length) {

      this.length = length; 	   	      

} 
   public boolean getIsVenomous() {

      return isVenomous; 

   }


   public int getLength() {

      return length; 

} 

   public String toString() {

      return super.toString()+"\nIs Venomous: "+isVenomous+"\nLength: "+length+" feet";            	   	       	 

} 

}

public class Main {

   public static void main(String[] args) {      


      Bird bird1 = new Bird("Tweety", "Budgie", 2, true, 1);
      Mammal mammal1 = new Mammal("Jumbo", "Elephant", 25, true, 4);
      Reptile reptile1 = new Reptile("Nemo", "Clown Fish", 1, false, 2);               


      System.out.println(bird1);
      System.out.println(mammal1);
      System.out.println(reptile1); 	   	   

   } 

} //Created by Alex Obodo