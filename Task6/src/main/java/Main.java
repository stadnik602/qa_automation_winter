import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

//Создать статический метод который принимает на вход три параметра: login, password и confirPassword.
//        2.Login :
//        Должен содержать знак подчеркивания.
//        Длина login должна быть меньше 20 символов.
//        Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//        3.Password:
//        Должен содержать знак подчеркивания и !.
//        Длина password должна быть меньше 20 символов.
//        Также password и confirmPassword должны быть равны.
//        Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//        WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один сылается на родительский класс,
//        второй принимает сообщение исключения и передает его в конструктор вашего класса Exception(доп поля можно создать).
//        Обработка исключений проводится внутри нашего мейн метода.
//        Используем multi-catch block.
//        Метод возвращает true, если значения верны или false в другом случае.

public class Main {
    public static void main(String[] args) {
        try {
            if (registration("dfsfsdfsdf_", "2343454!_", "2344!_")){
                System.out.println("All right!");
            }
        } catch (WrongLoginException e) {
            System.out.println("Invalid login");
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Invalid password");
            System.out.println(e.getMessage());
        }
    }

    public static boolean registration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        return isLoginValid(login) && isPasswordValid(password, confirmPassword);
    }

    public static boolean isLoginValid(String login) throws WrongLoginException {
        if (login.isEmpty()) {
            throw new WrongLoginException();
        } else if (!login.contains("_")) {
            throw new WrongLoginException("Your login should contain '_' symbol");
        } else if (login.length() >= 20) {
            throw new WrongLoginException("Your login length should be less then 20 symbols");
        }
        System.out.println("Login is valid");
        return true;
    }

    public static boolean isPasswordValid(String password, String confirmPassword) throws WrongPasswordException {
        if (password.isEmpty()) {
            throw new WrongPasswordException();
        } else if (!password.contains("_") && !password.contains("!")) {
            throw new WrongPasswordException("Your password should contain '_' and '!' symbols");
        } else if (password.length() >= 20) {
            throw new WrongPasswordException("Your password length should be less then 20 symbols");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("The confirm password should be equal to the password");
        }
        System.out.println("Password is valid");
        return true;
    }
}
