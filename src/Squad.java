public class Squad {
   AbstractMilitary [] abstractMilitaries = new AbstractMilitary[5];
   private int count = 0;

   public void add(AbstractMilitary abstractMilitary){
       if (count< abstractMilitaries.length){
           abstractMilitaries[count] = abstractMilitary;
           count++;
       }
   }


   public void printInfo(){
       for (int i = 0; i < abstractMilitaries.length; i++) {
           if (abstractMilitaries[i] != null){
               System.out.println(abstractMilitaries[i]);
           }
       };
   }
}
