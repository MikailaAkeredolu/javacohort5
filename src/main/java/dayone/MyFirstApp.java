package dayone;

public class MyFirstApp {

    public static void main(String[] args) {

        //Create an Array
        String[] fruits = {"Apples","Grapes","Oranges"};

        //Call method and print out results
        System.out.println(hyphenateStringArray(fruits));
    }









    public static String hyphenateStringArray(String[] arrayOfStrings) {
        int counter = 0;
        String buildString = "";
        for (int x = 0; x < arrayOfStrings.length; x++) {
            if(counter < x){
                buildString += "-";
            }
                buildString += arrayOfStrings[x];
        }
        return buildString;
    }


}


//Notes
//                System.out.println("counter => "+ counter);
//                System.out.println("x => " + x);