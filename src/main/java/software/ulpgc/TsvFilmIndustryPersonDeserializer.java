package software.ulpgc;

import java.util.ArrayList;
import java.util.List;

public class TsvFilmIndustryPersonDeserializer implements FilmIndustryPersonDeserializer {

    @Override
    public FilmIndustryPerson deserialize(String field) {
        return deserialize(field.split("\t"));
    }

    private FilmIndustryPerson deserialize(String[] fields) {
        return new FilmIndustryPerson(fields[0],
                fields[1],
                toInteger(fields[2]),
                toInteger(fields[3]),
                toProfession(fields[4]),
                toTitle(fields[5]));
    }

    private String[] toTitle(String field) {
        if(checkEmpty(field)) return  new String[0];
        return field.split(",");
    }

    private FilmIndustryPerson.Profession[] toProfession(String field) {
        if(checkEmpty(field)) return  new FilmIndustryPerson.Profession[0];
        List<FilmIndustryPerson.Profession> professions = new ArrayList<>();
        for(String profession: field.split(",")){
            professions.add(FilmIndustryPerson.Profession.valueOf(profession.toUpperCase()));
        }
        return professions.toArray(new FilmIndustryPerson.Profession[0]);
    }

    private Integer toInteger(String field) {
        if(checkEmpty(field)) return null;
        return Integer.parseInt(field);
    }

    private boolean checkEmpty(String field) {
        return field.equals("\\N");
    }
}
