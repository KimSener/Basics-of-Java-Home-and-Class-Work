import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Доступ предоставлен");
    }

    public static User[] getUsers() {
        User user = new User("JonMan", "jhon@gmail.com", "1111", 24);
        User userTwo = new User("PollyMolly", "lacky@gmail.com", "2222", 45);
        User userThree = new User("OldDad", "crazymonkey@gmail.com", "3333", 16);
        return new User[]{user, userTwo, userThree};
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Вы не достигли возраста 18 лет");
        } else {
            System.out.println("Возраст прошел проверку");
        }
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users)
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        throw new UserNotFoundException("User not found");
    }
}
