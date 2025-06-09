class array {
    public static void main(String[] args) {
        
        String one = "Song01";
        String two = "Song02";
        String three = "Song03";
        String four = "Song04";
        String five = "Song05";

        // Create an array of strings
        String[] songs = {one, two, three, four, five};
        // Loop through each element in the array
        for (int i = 0; i < songs.length; i++) {
            // Print the current element
            System.out.println("Song " + (i + 1) + ": " + songs[i]);
        }
    }
}