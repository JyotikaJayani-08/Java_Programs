// UPDATED VERSION OF JAVA SWITCH CASE

public class newswitch {
    public static void main(String[] args) {
        String day="Monday";
        String result = "";
        switch(day){
            case "Saturday","Sunday"-> result ="6am";
            // case "Saturday","Sunday"->System.out.println("6am");
            //no need of break when u use ->
            //  case "Saturday","Sunday":
            // System.out.println("6am");
            // break;
            case "Monday"->result="8am";
            default -> result="7am";
        
        }
          System.out.println(result);
    }
    
}
//ANOTHER METHOD 2
// result =switch(day){
//     case "Saturday","Sunday"->"6am";
//     case "Monday"->"8am";
//     default ->"7am";
// };
// ANOTHER MATHOD 3
// result =switch(day){
//     case "Saturday","Sunday": yeild "6am";
//     case "Monday": yield "8am";
//     default :yeild "7am";

