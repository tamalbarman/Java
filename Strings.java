//Compare 2 strings
public class Strings {
    public static void main(String args[]){
        String name1 = "Tamal";
        String name2 = "Tamal";

        if(name1.equals(name2)){
            System.out.println("They are the same string");
        }
        else{
            System.out.println("They are different string");
        }
        //do not use == to check for string equality
        //give corrent answer
        if(name1 == name2){
            System.out.println("The are same string");
        }
        else{
            System.out.println("They are not different strings");
        }
        //give incorrect answer
        if(new String("Tamal") ==  new String("Tamal")){
            System.out.println("They are same string");
        }
        else{
            System.out.println("They are different strings");
        }
    }
}
