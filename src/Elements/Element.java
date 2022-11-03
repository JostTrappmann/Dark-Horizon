package Elements;
abstract public  class Element {



   private String name = new String();
   private Attack specialMove;


   public Element(){
   }
   public String getName(){
      return name;
   }
   public void setName(String name){
      this.name = name;
   }

   public static class Attack {
   }
}
