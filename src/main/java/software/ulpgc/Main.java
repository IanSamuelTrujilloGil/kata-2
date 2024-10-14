package software.ulpgc;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Ian\\IdeaProjects\\kata2\\src\\main\\resources\\name.basics.tsv");
        List<FilmIndustryPerson> filmIndustryPeople = new TsvFilmIndustryPersonReader(file).read();
        HashMap<FilmIndustryPerson.Profession, Integer> histogram = new HashMap<>();
        for(FilmIndustryPerson filmIndustryPerson: filmIndustryPeople){
            for(FilmIndustryPerson.Profession profession: filmIndustryPerson.getPrimaryProfession()){
                histogram.put(profession, histogram.getOrDefault(profession,0) +1);
            }
        }

        for(FilmIndustryPerson.Profession profession: histogram.keySet()){
            System.out.println(profession + " " + histogram.get(profession));

        }
    }
}
