package self.programs;

class MaxNoWithoutRelationOpr {

    public static void main(String[] args) {
        int a = 20;
        int b =20;
       while(true){
           if (a ==0  && b==0){
               System.out.println("Equal");
               break;
           }
           else if(a != 0 && b==0){
               System.out.println("a");
               break;
           }
           else if(a == 0){
               System.out.println("b");
               break;
           }
           a--;
           b--;
       }
    }
}
