package Elements;

import Movement.ElementAttack;

abstract public  class Element {




   private String name = new String();
   private String weaponType;
   private ElementAttack attack;

   public Element(String name, String weaponType){
      this.name = name;
      this.weaponType = weaponType;

   }



   public String getName(){
      return name;
   }
   public void setName(String name){
      this.name = name;
   }
   public void weaponCheck(){
   }



}
