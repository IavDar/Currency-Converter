package example32;

enum MoonPhases {
    NEW_MOON ("\uD83C\uDF11" ),
    WAXING_CRESCENT("\uD83C\uDF12" ),
    FIRST_QUARTER( "\uD83C\uDF13" ),
    WAXING_GIBBOUS( "\uD83C\uDF14" ),
    FULL_MOON( "\uD83C\uDF15"),
    WANING_GIBBOUS("\uD83C\uDF16" ),
    LAST_QUARTER( "\uD83C\uDF17" ),
    WANING_CRESCENT( "\uD83C\uDF18");

    private final String description;

    MoonPhases(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

}
