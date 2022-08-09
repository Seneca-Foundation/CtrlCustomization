public class NflTeam implements FootballTeam {
    private String logo;
    private String slogan;
    private List<String> accomplishments;

    public NflTeam (
        String name,
        String city,
        String mascot,
        String logo,
        String slogan,
        List<string> accomplishments
    ) { base 
        name,
        city,
        mascot
    };
    {
        this.logo = logo;
        this.slogan = slogan;
        this.accomplishments = List<String> accomplishments;
    }
       
    void GatheringAccomplishments()
    {
        Console.WriteLine("Please enter a list of accomplishments, followed by the word Done when complete.");
        bool donePrompt = false;
        while(!donePrompt)
        {
            string accomplishment = Console.ReadLine();
            if (accomplishment == "Done") {
                donePrompt = true;
            }
            else {
                accomplishments.Add(accomplishment);
            }
        }
    }
}

