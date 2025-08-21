import java.util.Scanner;

class EmailCheck {
    public static void main(String[] args) {
        System.out.println("2024503543 Risah Ruth R");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the email address:");
        String email = sc.nextLine();
        int atPos = email.indexOf('@');
        int atLastPos = email.lastIndexOf('@');

        if (atPos == -1 || atPos != atLastPos) {
            System.out.println("Invalid email: Must contain exactly one @");
            return;
        }
        String username = email.substring(0, atPos);
        String domain = email.substring(atPos + 1);
        if (username.length() == 0 || username.length() > 25) {
            System.out.println("Invalid email: Username length must be 1-25 characters");
            return;
        }
        if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
            System.out.println("Invalid email: Domain must end with .com, .in, or .edu");
            return;
        }
        boolean validUser = true;
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == '_' || ch == '-' || ch == '+')) {
                validUser = false;
                break;
            }
        }

        if (!validUser) {
            System.out.println("Invalid email: Username has invalid characters");
            return;
        }
        System.out.println("Valid Email");
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
}

