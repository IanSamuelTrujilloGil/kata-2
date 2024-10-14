package software.ulpgc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TsvFilmIndustryPersonReader implements FilmIndustryPersonReader{
    private final File file;

    public TsvFilmIndustryPersonReader(File file) {
        this.file = file;
    }

    @Override
    public List<FilmIndustryPerson> read() {
        try(BufferedReader reader = new BufferedReader( new FileReader(file))){
            reader.readLine();
            return readWith(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<FilmIndustryPerson> readWith(BufferedReader reader) throws IOException {
        TsvFilmIndustryPersonDeserializer deserializer = new TsvFilmIndustryPersonDeserializer();
        List<FilmIndustryPerson> filmIndustryPeople = new ArrayList<>();
        while (true){
            String field = reader.readLine();
            if(field == null) break;
            filmIndustryPeople.add(deserializer.deserialize(field));
        }
        return filmIndustryPeople;
    }
}
