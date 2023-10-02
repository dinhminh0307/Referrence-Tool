package Model;

import Model.Constant.VietnamDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppSystem {
    public String formatAuthorName(String authors) {
        List<String> authorList = new ArrayList<String>(Arrays.asList(authors.split(",")));
        String finalResult = "";
        if(authorList.size() == 1) { // for only one author
            int index = 0;
            List<String> nameList = new ArrayList<String>(Arrays.asList(authorList.get(0).split(" ")));
            String lastName = nameList.get(nameList.size() - 1);
            if(nameList.size() ==1) { // if this author name have 1 word
                return lastName;
            }
            else {
                for (String nameTMP : nameList) {
                    if (nameTMP.equals(nameList.get(nameList.size() - 1))) {
                        break;
                    }
                    lastName = lastName + "." + nameTMP.charAt(0);
                    index++;
                }
            }
            if (index == nameList.size() - 1) {
                finalResult = finalResult + lastName;
            }
        }
        else if(authorList.size() > 1) { // There are more authors
            for(String tmp : authorList) {
                int index = 0;
                List<String> nameList = new ArrayList<String>(Arrays.asList(tmp.split(" ")));
                String lastName = nameList.get(nameList.size() - 1);
                if(tmp.equals(authorList.get(authorList.size()-1))) {
                    System.out.println(tmp);
                    continue;
                }
                System.out.println(tmp);
                if(nameList.size() ==1) {
                    finalResult += nameList.get(0);
                    continue;
                }
                else {
                    for (String nameTMP : nameList) {
                        if (nameTMP.equals(nameList.get(nameList.size() - 1))) {
                            break;
                        }
                        lastName = lastName + "." + nameTMP.charAt(0);
                        index++;
                    }
                }
                if (index == nameList.size() - 1) {
                    finalResult = finalResult + lastName+ ", ";
                }
            }
        }
        return finalResult;
    }

    String formatAccessedDate() {
        return "Accessed " + new VietnamDate().getCurrentDate() + " " + new VietnamDate().getCurrentMonth() + " " + new VietnamDate().getCurrentYear();
    }
    public String websiteReference(String authorName, String year, String title, String website, String URL) {
        return authorName + "(" + year + ")" + " " + title + ", " + website + ", " + formatAccessedDate() + ". " + URL;
    }
}
