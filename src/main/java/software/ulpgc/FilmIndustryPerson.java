package software.ulpgc;

import java.util.Arrays;

public class FilmIndustryPerson {
    private final String id;
    private final String primaryName;
    private final Integer birthYear;
    private final Integer deathYear;
    private Profession[] primaryProfession;
    private String[] knownForTitles;

    public FilmIndustryPerson(String id, String primaryName, Integer birthYear, Integer deathYear, Profession[] primaryProfession, String[] knownForTitles) {
        this.id = id;
        this.primaryName = primaryName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
        this.primaryProfession = primaryProfession;
        this.knownForTitles = knownForTitles;
    }

    public String getId() {
        return id;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public Profession[] getPrimaryProfession() {
        return primaryProfession;
    }

    public void setPrimaryProfession(Profession[] primaryProfession) {
        this.primaryProfession = primaryProfession;
    }

    public String[] getKnownForTitles() {
        return knownForTitles;
    }

    public void setKnownForTitles(String[] knownForTitles) {
        this.knownForTitles = knownForTitles;
    }

    @Override
    public String toString() {
        return "FilmIndustryPerson{" +
                "id='" + id + '\'' +
                ", primaryName='" + primaryName + '\'' +
                ", birthYear=" + birthYear +
                ", deathYear=" + deathYear +
                ", primaryProfession=" + Arrays.toString(primaryProfession) +
                ", knownForTitles=" + Arrays.toString(knownForTitles) +
                '}';
    }
    public enum Profession{
        SPECIAL_EFFECTS,
        CASTING_DIRECTOR,
        PRODUCTION_DEPARTMENT,
        MISCELLANEOUS,
        ACCOUNTANT,
        CHOREOGRAPHER,
        ANIMATION_DEPARTMENT,
        ASSISTANT_DIRECTOR,
        CINEMATOGRAPHER,
        ARCHIVE_SOUND,
        MUSIC_DEPARTMENT,
        PODCASTER,
        EXECUTIVE,
        SET_DECORATOR,
        COSTUME_DESIGNER,
        ART_DIRECTOR,
        LEGAL,
        CAMERA_DEPARTMENT,
        MUSIC_ARTIST,
        ELECTRICAL_DEPARTMENT,
        ACTRESS,
        SOUNDTRACK,
        EDITOR,
        ART_DEPARTMENT,
        SCRIPT_DEPARTMENT,
        MANAGER,
        PRIMARYPROFESSION,
        DIRECTOR,
        COMPOSER,
        SOUND_DEPARTMENT,
        TRANSPORTATION_DEPARTMENT,
        ASSISTANT,
        TALENT_AGENT,
        CASTING_DEPARTMENT,
        EDITORIAL_DEPARTMENT,
        STUNTS,
        ACTOR,
        MAKE_UP_DEPARTMENT,
        ARCHIVE_FOOTAGE,
        PRODUCTION_DESIGNER,
        LOCATION_MANAGEMENT,
        PRODUCER,
        WRITER,
        VISUAL_EFFECTS,
        PRODUCTION_MANAGER,
        COSTUME_DEPARTMENT,
        PUBLICIST
    }
}
