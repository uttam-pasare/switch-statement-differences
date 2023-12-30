package cases;

public class SwitchMainRunner {
    public static void main(String[] args) {
        DAYS day = DAYS.MONDAY;

        System.out.println("Case 1: Java 8");
        switch (day){
            case SATURDAY:
            case SUNDAY:
                System.out.println("Holiday today");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Working day today");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        System.out.println("Case 2: Java 14");
        switch (day) {
            case SATURDAY, SUNDAY -> System.out.println("Holiday today");
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->System.out.println("Working day today");
            default -> System.out.println("Default case");
        }

        System.out.println("Case 3: Java 14 with yield to return the response");
        String response = switch (day) {
            case SATURDAY, SUNDAY -> {
                System.out.println("Holiday today");
                yield "holiday";
            }
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->{
                System.out.println("Working day today");
                yield "working day";
            }
            default -> {
                System.out.println("Default case");
                yield "default";
            }
        };
        System.out.println("Response with yield: "+ response);
    }
}
