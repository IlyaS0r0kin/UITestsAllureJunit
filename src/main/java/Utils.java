public class Utils {
    public static String generateEmail() {
        StringBuilder Username = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            Username.append((char) ((int) (97 + Math.random() * 26)));
        }
        Username.append("@gmail.com");
        return Username.toString();
    }

    public static String generatePassword() {
        StringBuilder Password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            Password.append((char) ((int) (97 + Math.random() * 26)));
        }
        return Password.toString();
    }
}