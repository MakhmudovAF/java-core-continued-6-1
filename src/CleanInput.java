public class CleanInput {
    public String fixString(String str) {
        if (str.isBlank()) return "Вы ничего не ввели!";

        return str.trim();
    }
}