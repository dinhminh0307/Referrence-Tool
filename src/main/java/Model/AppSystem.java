package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppSystem {
    public String formatAuthorName(String authors) {
        List<String> authorList = new ArrayList<String>(Arrays.asList(authors.split(" , ")));
        String finalResult = "";
        String oneNameFormat = "";
        if(authorList.size() == 1) {
            int index = 0;
            List<String> nameList = new ArrayList<String>(Arrays.asList(authorList.get(0).split(" ")));
            String lastName = nameList.get(nameList.size() - 1);
            if(nameList.size() ==1) {
                return lastName;
            }
            else {
                for (String nameTMP : nameList) {
                    if (nameTMP.equals(nameList.get(nameList.size() - 1))) {
                        break;
                    }
                    lastName = lastName + "." + nameTMP.charAt(index);
                    index++;
                }
            }
            finalResult = finalResult + "," + lastName;
        }
        for(String tmp : authorList) {
            if(tmp.equals(authorList.get(authorList.size()-1))) {
                break;
            }
            int index = 0;
            List<String> nameList = new ArrayList<String>(Arrays.asList(tmp.split(" ")));
            String lastName = nameList.get(nameList.size() - 1);
            if(nameList.size() ==1) {
                continue;
            }
            else {
                for (String nameTMP : nameList) {
                    if (nameTMP.equals(nameList.get(nameList.size() - 1))) {
                        break;
                    }
                    lastName = lastName + "." + nameTMP.charAt(index);
                    index++;
                }
            }
            finalResult = finalResult + "," + lastName;
        }
        return finalResult;
    }
    public String websiteReference(String authorName, String year, String title, String website, String accessedDate, String URL) {
        return authorName + "(" + year + ")" + " " + title + "," + website + "," + accessedDate + "," + URL;
    }
}
