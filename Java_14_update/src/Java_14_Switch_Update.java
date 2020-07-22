public class Java_14_Switch_Update {
    public static void main(String[] args) {
        String sport="football";
        String player= switch (sport){
            case "football"-> "Football";
            case "Cricket" -> "Cricket";
            case "Hokey" ->"Hokey";
            default -> "None";
        };
        System.out.println(player);
    }
}
