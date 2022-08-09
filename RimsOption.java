public class RimsOption {
    //pr
    private String chosenRims;

    public String getChosenRims() {
        return chosenRims;
    }

    public void setChosenRims(String chosenRims) {
        this.chosenRims = chosenRims;
    }

    //methods

    public void ChooseRims; {
        Console.WriteLine("Okay, choose your custom rims.");
        Console.WriteLine("Here are your rims to choose from: \n(A) Steel \n(B) Alloy \n(C) Chrome");
        ChosenRims = Console.ReadLine().ToUpper();
        switch(ChosenRims){
            case "A":
            Console.WriteLine("Nice!");
            chosenRims = "Steel Rims";
            break;

            case "B":
            Console.WriteLine("Excellent!");sxss
            chosenRims = "Alloy Rims";
            break;

            case "C":
            Console.WriteLine("Shiny!");
            chosenRims = "Chrome Rims";
            break;

            default:
            Console.WriteLine("Invaild Choice: Please choose again.");
            StartingOptions newStartingOptions = new StartingOptions();
            newStartingOptions.ListStartingOptions();
            break;
        }
    }    
}
