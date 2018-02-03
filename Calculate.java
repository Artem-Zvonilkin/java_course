public class Calculate {
       public static void main(String[] args) throws IOException {
        System.out.println("Calculate...");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double first = Double.parseDouble(in.readLine());
        double second = Double.parseDouble(in.readLine());
        String operator = in.readLine();
        double rez=0;
        switch (operator) {
            case ("+"):
                rez = first + second;
                System.out.println("Результат = "+rez);
                break;
            case ("-"):
                rez = first - second;
                System.out.println("Результат = "+rez);
                break;
            case ("*"):
                rez = first * second;
                System.out.println("Результат = "+rez);
                break;
            case ("/"):
                if (second == 0) System.out.println("Деление на 0!");
                else {
                    rez = first / second;
                    System.out.println("Результат = " + rez);
                }
                break;
            case ("^"):
                rez = Math.pow(first, second);
                System.out.println("Результат = " + rez);
                break;
            default: System.out.println("Данного действия нет");
        }
    }
}
