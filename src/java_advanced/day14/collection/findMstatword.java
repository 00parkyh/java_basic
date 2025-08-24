package java_advanced.day14.collection;

public class findMstatword {
    public static void main(String[] args) {
        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };

        Integer count = 0;
//        아래 for문은 이름에 있는 M까지 검사한다
//        for (Integer item = 0; item<dataset.length;item++) {
//            if (dataset[item].indexOf("M")>=0) {
//                count++;
//            }
//        }

        String b[][] = new String[dataset.length][dataset.length];
        for (Integer item = 0; item< dataset.length;item++) {
            b[item] = dataset[item].split(",");
            if (b[item][0].indexOf("M")>=0) {
                count++;
            }
        }
        System.out.println(count);

//        Integer [] [] data_list1 = {{1,2,3,},{5,6,7}};
//        System.out.println(data_list1[1][2]);
//        System.out.println(data_list1[0][1]);
//        System.out.println(data_list1[0][2]);
//        System.out.println(data_list1[1][0]);
//        System.out.println(data_list1[1][1]);
    }
}
