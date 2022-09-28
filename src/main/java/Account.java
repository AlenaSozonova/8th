public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        boolean ok = true;

        if (name.length() < 3) {
            ok = false;
        }
        if (name.length() > 19) {
            ok = false;
        }
        if (name.endsWith(" ")) {
            ok = false;
        }
        if (name.startsWith (" ")) {
            ok = false;
        }
        if (!name.contains(" ")) {
            ok = false;
        }

        if (name.indexOf(" ", name.indexOf(" ")+1) != -1) {
            ok = false;
        }


        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        return ok;

    }

}