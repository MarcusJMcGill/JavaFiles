public class Formatcsv {
    String item;
    int copiesOfLabel;
    int totalLabels;
    int digits;
    String formattedLabels = "";

    public Formatcsv(String item, int copiesOfLabel, int totalLabels) {
        String str = "" + totalLabels;
        this.item = item;
        this.copiesOfLabel = copiesOfLabel;
        this. totalLabels = totalLabels;
        digits = str.length();
        getFormattedLabels();
    }

    public String getFormattedLabels() {
        for(int i = 1; i <= totalLabels; i++){
            for (int j = 1; j <= copiesOfLabel; j++){
                formattedLabels += item + "-" + String.format("%0" + copiesOfLabel + "d", i) + "\n";
            }

        }

        System.out.println(formattedLabels);
        return formattedLabels;
    }
}
